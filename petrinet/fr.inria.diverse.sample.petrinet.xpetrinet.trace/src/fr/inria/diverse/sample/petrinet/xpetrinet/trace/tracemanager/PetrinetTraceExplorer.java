package fr.inria.diverse.sample.petrinet.xpetrinet.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.gemoc.executionframework.engine.core.CommandExecution;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Step;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.api.ITraceViewListener;

public class PetrinetTraceExplorer implements ITraceExplorer {
	private petrinetTrace.SpecificTrace traceRoot;
	private Resource modelResource;
	private final Map<EObject, EObject> tracedToExe;

	private int lastJumpIndex = -1;
	private petrinetTrace.States.State currentState = null;
	private final List<Step> callStack = new ArrayList<>();

	private final List<List<? extends petrinetTrace.States.Value>> valueTraces = new ArrayList<>();

	private List<petrinetTrace.States.State> statesTrace;

	private petrinetTrace.Steps.SpecificStep stepIntoResult;
	private petrinetTrace.Steps.SpecificStep stepOverResult;
	private petrinetTrace.Steps.SpecificStep stepReturnResult;

	private petrinetTrace.Steps.SpecificStep stepBackIntoResult;
	private petrinetTrace.Steps.SpecificStep stepBackOverResult;
	private petrinetTrace.Steps.SpecificStep stepBackOutResult;

	private final Map<petrinetTrace.Steps.SpecificStep, Integer> stepToStartingIndex = new HashMap<>();
	private final Map<petrinetTrace.Steps.SpecificStep, Integer> stepToEndingIndex = new HashMap<>();

	private final HashMap<List<? extends petrinetTrace.States.Value>, petrinetTrace.States.Value> backValueCache = new HashMap<>();

	private final Map<ITraceViewListener, Set<TraceViewCommand>> listeners = new HashMap<>();

	public PetrinetTraceExplorer(Map<EObject, EObject> tracedToExe) {
		this.tracedToExe = tracedToExe;
	}

	public PetrinetTraceExplorer() {
		this.tracedToExe = null;
	}

	private List<List<? extends petrinetTrace.States.Value>> getAllValueTraces() {
		final List<List<? extends petrinetTrace.States.Value>> result = new ArrayList<>();
		for (petrinetTrace.States.petrinet.TracedPlace tracedObject : traceRoot.getPetrinet_tracedPlaces()) {
			result.add(tracedObject.getTokensSequence());
		}
		return result;
	}

	private petrinetTrace.States.Value getActiveValue(final List<? extends petrinetTrace.States.Value> valueTrace,
			final petrinetTrace.States.State state) {
		petrinetTrace.States.Value result = null;
		for (petrinetTrace.States.Value value : valueTrace) {
			if (value.getStatesNoOpposite().contains(state)) {
				result = value;
				break;
			}
		}
		return result;
	}

	private petrinetTrace.States.Value getPreviousValue(final List<? extends petrinetTrace.States.Value> valueTrace) {
		int i = getCurrentStateIndex() - 1;
		final petrinetTrace.States.Value value = getActiveValue(valueTrace, statesTrace.get(i + 1));
		petrinetTrace.States.Value previousValue = null;
		while (i > -1 && (previousValue == null || previousValue == value)) {
			previousValue = getActiveValue(valueTrace, statesTrace.get(i));
			i--;
		}
		return previousValue;
	}

	private petrinetTrace.States.Value getNextValue(final List<? extends petrinetTrace.States.Value> valueTrace) {
		int i = getCurrentStateIndex() + 1;
		final petrinetTrace.States.Value value = getActiveValue(valueTrace, statesTrace.get(i - 1));
		petrinetTrace.States.Value nextValue = null;
		final int traceLength = valueTrace.stream().map(v -> v.getStatesNoOpposite().size()).reduce(0, (a, b) -> a + b);
		while (i < traceLength && (nextValue == null || nextValue == value)) {
			nextValue = getActiveValue(valueTrace, statesTrace.get(i));
			i++;
		}
		return nextValue;
	}

	private int getStartingIndex(petrinetTrace.Steps.SpecificStep step) {
		return stepToStartingIndex.computeIfAbsent(step, s -> {
			return statesTrace.indexOf(s.getStartingState());
		});
	}

	private int getEndingIndex(petrinetTrace.Steps.SpecificStep step) {
		if (step.getEndingState() != null) {
			return stepToEndingIndex.computeIfAbsent(step, s -> {
				return statesTrace.indexOf(s.getEndingState());
			});
		}
		return -1;
	}

	@SuppressWarnings("unchecked")
	private petrinetTrace.Steps.SpecificStep findNextStep(final List<petrinetTrace.Steps.SpecificStep> stepPath,
			final petrinetTrace.Steps.SpecificStep previousStep, final int start) {
		final List<petrinetTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		petrinetTrace.Steps.SpecificStep result = null;
		int i = start;
		int depth = stepPath.size();
		petrinetTrace.Steps.SpecificStep previous = previousStep;
		while (result == null && i < depth) {
			final petrinetTrace.Steps.SpecificStep currentStep = stepPath.get(depth - i - 1);
			final List<petrinetTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
			if (currentStep instanceof SequentialStep<?>) {
				currentSubSteps.addAll(((SequentialStep<petrinetTrace.Steps.SpecificStep>) currentStep).getSubSteps());
			}
			if (currentSubSteps.isEmpty()) {
				// No substep to step into, we thus have to explore the substeps
				// of the parent step
				previous = currentStep;
			} else {
				if (previous == null) {
					// First time we step into
					result = currentSubSteps.get(0);
				} else {
					final int idx = currentSubSteps.indexOf(previous) + 1;
					if (idx < currentSubSteps.size()) {
						// We step into the next step
						result = currentSubSteps.get(idx);
					} else {
						previous = currentStep;
					}
				}
			}
			i++;
		}
		if (result == null) {
			final int idx = rootSteps.indexOf(previous) + 1;
			if (idx < rootSteps.size()) {
				result = rootSteps.get(idx);
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private petrinetTrace.Steps.SpecificStep computeBackInto(List<petrinetTrace.Steps.SpecificStep> stepPath) {
		final List<petrinetTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		petrinetTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final petrinetTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final petrinetTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<petrinetTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<petrinetTrace.Steps.SpecificStep>) parentStep;
			final List<? extends petrinetTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast.getSubSteps();
			final int idx = parentSubSteps.indexOf(currentStep);
			if (idx == 0) {
				// If the current step is the first in its parents substeps,
				// return parent step
				result = parentStep;
			} else if (idx > 0) {
				// Otherwise, return the deepest substep in the previous sibling
				// step
				final petrinetTrace.Steps.SpecificStep previousSiblingStep = parentSubSteps.get(idx - 1);
				petrinetTrace.Steps.SpecificStep tmpStep = previousSiblingStep;
				final List<petrinetTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<petrinetTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<petrinetTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<petrinetTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<petrinetTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		} else if (depth == 1) {
			final petrinetTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				petrinetTrace.Steps.SpecificStep tmpStep = rootSteps.get(idx - 1);
				final List<petrinetTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<petrinetTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<petrinetTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<petrinetTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<petrinetTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private petrinetTrace.Steps.SpecificStep computeBackOver(List<petrinetTrace.Steps.SpecificStep> stepPath) {
		final List<petrinetTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		petrinetTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final petrinetTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final petrinetTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<petrinetTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<petrinetTrace.Steps.SpecificStep>) parentStep;
			final List<petrinetTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast.getSubSteps();
			final int idx = parentSubSteps.indexOf(currentStep);
			if (idx == 0) {
				// If the current step is the first in its parents substeps,
				// return parent step
				result = parentStep;
			} else {
				// Otherwise, return the previous sibling step
				result = parentSubSteps.get(idx - 1);
			}
		} else if (depth == 1) {
			final petrinetTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				result = rootSteps.get(idx - 1);
			}
		}
		return result;
	}

	private petrinetTrace.Steps.SpecificStep computeBackOut(List<petrinetTrace.Steps.SpecificStep> stepPath) {
		if (stepPath.size() > 1) {
			return stepPath.get(stepPath.size() - 2);
		}
		return null;
	}

	private petrinetTrace.Steps.SpecificStep computeStepInto(List<petrinetTrace.Steps.SpecificStep> stepPath,
			List<petrinetTrace.Steps.SpecificStep> rootSteps) {
		return findNextStep(stepPath, null, 0);
	}

	private petrinetTrace.Steps.SpecificStep computeStepOver(List<petrinetTrace.Steps.SpecificStep> stepPath,
			List<petrinetTrace.Steps.SpecificStep> rootSteps) {
		if (!stepPath.isEmpty()) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 1), 1);
		}
		return null;
	}

	private petrinetTrace.Steps.SpecificStep computeStepReturn(List<petrinetTrace.Steps.SpecificStep> stepPath,
			List<petrinetTrace.Steps.SpecificStep> rootSteps) {
		if (stepPath.size() > 1) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 2), 2);
		}
		return null;
	}

	private void computeExplorerState(List<petrinetTrace.Steps.SpecificStep> stepPath) {
		final List<petrinetTrace.Steps.SpecificStep> rootSteps = getStepsForStates(0, statesTrace.size());

		final List<petrinetTrace.Steps.SpecificStep> stepPathUnmodifiable = Collections.unmodifiableList(stepPath);

		stepIntoResult = computeStepInto(stepPathUnmodifiable, rootSteps);
		stepOverResult = computeStepOver(stepPathUnmodifiable, rootSteps);
		stepReturnResult = computeStepReturn(stepPathUnmodifiable, rootSteps);

		stepBackIntoResult = computeBackInto(stepPathUnmodifiable);
		stepBackOverResult = computeBackOver(stepPathUnmodifiable);
		stepBackOutResult = computeBackOut(stepPathUnmodifiable);

		callStack.clear();
		callStack.addAll(stepPathUnmodifiable.stream().map(s -> (Step) s).collect(Collectors.toList()));
	}

	private void goTo(EObject eObject) {
		if (eObject instanceof petrinetTrace.States.State) {
			petrinetTrace.States.State stateToGo = (petrinetTrace.States.State) eObject;
			for (petrinetTrace.States.Place_tokens_Value value : stateToGo.getPlace_tokens_Values()) {
				if (value.getParent() instanceof petrinetTrace.States.petrinet.TracedPlace) {
					petrinetTrace.States.petrinet.TracedPlace parent_cast = (petrinetTrace.States.petrinet.TracedPlace) value
							.getParent();
					fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place originalObject = (fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place) parent_cast
							.getOriginalObject();
					originalObject.getTokens().clear();
					originalObject.getTokens()
							.addAll((Collection<? extends fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token>) getTracedToExe(
									value.getTokens()));
				}
			}
			backValueCache.clear();
		} else if (eObject instanceof petrinetTrace.States.Value) {
			goTo(((petrinetTrace.States.Value) eObject).getStatesNoOpposite().get(0));
		}
	}

	private void goTo(int stateNumber) {
		if (modelResource != null) {
			try {
				final TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(modelResource);
				if (ed != null) {
					final RecordingCommand command = new RecordingCommand(ed, "") {
						protected void doExecute() {
							goTo(statesTrace.get(stateNumber));
						}
					};
					CommandExecution.execute(ed, command);
				}
			} catch (Exception e) {
				throw e;
			}
		}
	}

	private Collection<? extends EObject> getTracedToExe(Collection<? extends EObject> tracedObjects) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject tracedObject : tracedObjects) {
			result.add(getTracedToExe(tracedObject));
		}
		return result;
	}

	private EObject getTracedToExe(EObject tracedObject) {
		return tracedToExe.get(tracedObject);
	}

	private void jumpBeforeStep(petrinetTrace.Steps.SpecificStep step) {
		if (step != null) {
			final int i = getStartingIndex(step);
			if (i == statesTrace.size() - 1) {
				lastJumpIndex = -1;
				currentState = statesTrace.get(statesTrace.size() - 1);
			} else {
				lastJumpIndex = i;
				currentState = statesTrace.get(i);
			}
			if (tracedToExe != null) {
				goTo(i);
			}
			updateCallStack(step);
		}
	}

	public void loadTrace(petrinetTrace.SpecificTrace root) {
		traceRoot = root;
		statesTrace = traceRoot.getStatesTrace();
		if (!statesTrace.isEmpty()) {
			currentState = statesTrace.get(0);
		}
		valueTraces.addAll(getAllValueTraces());
	}

	public void loadTrace(Resource modelResource, petrinetTrace.SpecificTrace root) {
		loadTrace(root);
		this.modelResource = modelResource;
	}

	@Override
	public boolean canBackValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			return backValueCache.computeIfAbsent(valueTraces.get(traceIndex),
					valueTrace -> getPreviousValue(valueTrace)) != null;
		}
		return false;
	}

	@Override
	public boolean canStepValue(int traceIndex) {
		return true;
	}

	@Override
	public void backValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final petrinetTrace.States.Value previousValue = backValueCache.get(valueTraces.get(traceIndex));
			if (previousValue != null) {
				jump(previousValue);
			}
		}
	}

	@Override
	public void stepValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final petrinetTrace.States.Value nextValue = getNextValue(valueTraces.get(traceIndex));
			if (nextValue != null) {
				jump(nextValue);
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void jump(int i) {
		final List<petrinetTrace.States.State> states = statesTrace;
		if (i < states.size()) {
			final List<petrinetTrace.Steps.SpecificStep> rootSteps = getStepsForStates(i, i);
			final List<petrinetTrace.Steps.SpecificStep> searchPath = new ArrayList<>();
			petrinetTrace.Steps.SpecificStep firstStepOfState = null;
			if (!rootSteps.isEmpty()) {
				final Predicate<petrinetTrace.Steps.SpecificStep> p = s -> {
					final int stepStartingState = getStartingIndex(s);
					final int stepEndingState = getEndingIndex(s);
					return (stepEndingState == -1 || stepEndingState >= i) && stepStartingState <= i;
				};
				petrinetTrace.Steps.SpecificStep currentStep = rootSteps.get(0);
				final List<petrinetTrace.Steps.SpecificStep> siblingSteps = new ArrayList<>(rootSteps);
				final List<petrinetTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
				if (currentStep instanceof SequentialStep<?>) {
					final SequentialStep<petrinetTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<petrinetTrace.Steps.SpecificStep>) currentStep;
					currentSubSteps
							.addAll(currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
				}
				while (firstStepOfState == null) {
					final int startingIndex = getStartingIndex(currentStep);
					final int endingIndex = getEndingIndex(currentStep);
					if (startingIndex < i && (endingIndex > i || endingIndex == -1)) {
						if (currentSubSteps.isEmpty()) {
							throw new IllegalStateException("Unreachable state");
						} else {
							searchPath.add(0, currentStep);
							siblingSteps.clear();
							siblingSteps.addAll(currentSubSteps);
							currentStep = siblingSteps.get(0);
							currentSubSteps.clear();
							if (currentStep instanceof SequentialStep<?>) {
								final SequentialStep<petrinetTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<petrinetTrace.Steps.SpecificStep>) currentStep;
								currentSubSteps.addAll(
										currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
							}
						}
					} else if (endingIndex == i && startingIndex != i) {
						if (currentSubSteps.isEmpty()) {
							// We need to explore the next sibling step
							petrinetTrace.Steps.SpecificStep tmp = currentStep;
							currentStep = null;
							while (currentStep == null) {
								final int idx = siblingSteps.indexOf(tmp) + 1;
								if (idx < siblingSteps.size()) {
									currentStep = siblingSteps.get(idx);
									if (currentStep instanceof SequentialStep<?>) {
										final SequentialStep<petrinetTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<petrinetTrace.Steps.SpecificStep>) currentStep;
										currentSubSteps.addAll(currentStep_cast.getSubSteps().stream().filter(p)
												.collect(Collectors.toList()));
									}
								} else {
									if (searchPath.isEmpty()) {
										throw new IllegalStateException("Unreachable state");
									} else {
										tmp = searchPath.remove(0);
										siblingSteps.clear();
										if (searchPath.isEmpty()) {
											siblingSteps.addAll(rootSteps);
										} else {
											final petrinetTrace.Steps.SpecificStep s = searchPath.get(0);
											if (s instanceof SequentialStep<?>) {
												final SequentialStep<petrinetTrace.Steps.SpecificStep> s_cast = (SequentialStep<petrinetTrace.Steps.SpecificStep>) s;
												siblingSteps.addAll((s_cast).getSubSteps().stream().filter(p)
														.collect(Collectors.toList()));
											}
										}
									}
								}
							}
						} else {
							// We need to explore the substeps in case one of them starts on i
							searchPath.add(0, currentStep);
							siblingSteps.clear();
							siblingSteps.addAll(currentSubSteps);
							currentStep = siblingSteps.get(0);
							currentSubSteps.clear();
							if (currentStep instanceof SequentialStep<?>) {
								final SequentialStep<petrinetTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<petrinetTrace.Steps.SpecificStep>) currentStep;
								currentSubSteps.addAll(
										currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
							}
						}
					} else if (startingIndex == i) {
						firstStepOfState = currentStep;
					}
				}
			}
			jumpBeforeStep(firstStepOfState);
		}
	}

	@Override
	public boolean canStepBackInto() {
		return stepBackIntoResult != null;
	}

	@Override
	public boolean canStepBackOver() {
		return stepBackOverResult != null;
	}

	@Override
	public boolean canStepBackOut() {
		return stepBackOutResult != null;
	}

	@Override
	public int getCurrentStateIndex() {
		if (lastJumpIndex != -1) {
			return lastJumpIndex;
		}
		return statesTrace.size() - 1;
	}

	@Override
	public List<Step> getCallStack() {
		return callStack;
	}

	private List<petrinetTrace.Steps.SpecificStep> getStepsForStates(int startingState, int endingState) {
		Predicate<petrinetTrace.Steps.SpecificStep> predicate = s -> {
			final int stepStartingState = getStartingIndex(s);
			final int stepEndingState = getEndingIndex(s);
			return (stepEndingState == -1 || stepEndingState >= startingState) && stepStartingState <= endingState;
		};
		return traceRoot.getRootStep().getSubSteps().stream().filter(predicate).collect(Collectors.toList());
	}

	@Override
	public void notifyListeners() {
		for (Map.Entry<ITraceViewListener, Set<TraceViewCommand>> entry : listeners.entrySet()) {
			entry.getValue().forEach(c -> c.execute());
		}
	}

	@Override
	public void registerCommand(ITraceViewListener listener, TraceViewCommand command) {
		if (listener != null) {
			Set<TraceViewCommand> commands = listeners.get(listener);
			if (commands == null) {
				commands = new HashSet<>();
				listeners.put(listener, commands);
			}
			commands.add(command);
		}
	}

	@Override
	public void removeListener(ITraceViewListener listener) {
		if (listener != null) {
			listeners.remove(listener);
		}
	}

	@Override
	public Step getCurrentForwardStep() {
		if (!callStack.isEmpty()) {
			return callStack.get(callStack.size() - 1);
		}
		return null;
	}

	@Override
	public Step getCurrentBackwardStep() {
		return stepBackOverResult;
	}

	@Override
	public Step getCurrentBigStep() {
		return stepBackOutResult;
	}

	@Override
	public void jump(EObject o) {
		int idx = -1;
		if (o instanceof petrinetTrace.States.State) {
			idx = statesTrace.indexOf(o);
		} else if (o instanceof petrinetTrace.States.Value) {
			final petrinetTrace.States.State state = ((petrinetTrace.States.Value) o).getStatesNoOpposite().get(0);
			idx = statesTrace.indexOf(state);
		}
		if (idx != -1) {
			jump(idx);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void loadLastState() {
		final int idx = statesTrace.size() - 1;
		final List<petrinetTrace.Steps.SpecificStep> steps = getStepsForStates(idx, idx);
		petrinetTrace.Steps.SpecificStep lastStep = null;
		while (!steps.isEmpty()) {
			lastStep = steps.get(steps.size() - 1);
			steps.clear();
			if (lastStep instanceof SequentialStep<?>) {
				steps.addAll(((SequentialStep<petrinetTrace.Steps.SpecificStep>) lastStep).getSubSteps());
			}
		}
		final int endingIndex = getEndingIndex(lastStep);
		if (endingIndex == -1 || endingIndex == idx) {
			jumpBeforeStep(lastStep);
		}
	}

	@Override
	public boolean stepInto() {
		if (stepIntoResult != null) {
			jumpBeforeStep(stepIntoResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepOver() {
		if (stepOverResult != null) {
			jumpBeforeStep(stepOverResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepReturn() {
		if (stepReturnResult != null) {
			jumpBeforeStep(stepReturnResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackInto() {
		if (stepBackIntoResult != null) {
			jumpBeforeStep(stepBackIntoResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackOver() {
		if (stepBackOverResult != null) {
			jumpBeforeStep(stepBackOverResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackOut() {
		if (stepBackOutResult != null) {
			jumpBeforeStep(stepBackOutResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean isInReplayMode() {
		return stepIntoResult != null;
	}

	@Override
	public void updateCallStack(Step step) {
		if (step instanceof petrinetTrace.Steps.SpecificStep) {
			petrinetTrace.Steps.SpecificStep step_cast = (petrinetTrace.Steps.SpecificStep) step;
			final List<petrinetTrace.Steps.SpecificStep> newPath = new ArrayList<>();
			newPath.add(step_cast);
			EObject container = step.eContainer();
			while (container != null && container instanceof petrinetTrace.Steps.SpecificStep) {
				newPath.add(0, (petrinetTrace.Steps.SpecificStep) container);
				container = container.eContainer();
			}
			computeExplorerState(newPath);
			notifyListeners();
		} else {
			throw new IllegalArgumentException(
					"PetrinetTraceExplorer expects specific steps and cannot handle this: " + step);
		}
	}

	@Override
	public void statesAdded(List<EObject> state) {
	}

	@Override
	public void valuesAdded(List<EObject> value) {
	}

	@Override
	public void dimensionsAdded(List<List<? extends EObject>> dimensions) {
		valueTraces.clear();
		valueTraces.addAll(getAllValueTraces());
		notifyListeners();
	}

	@Override
	public void stepsStarted(List<EObject> steps) {
	}

	@Override
	public void stepsEnded(List<EObject> steps) {
	}
}
