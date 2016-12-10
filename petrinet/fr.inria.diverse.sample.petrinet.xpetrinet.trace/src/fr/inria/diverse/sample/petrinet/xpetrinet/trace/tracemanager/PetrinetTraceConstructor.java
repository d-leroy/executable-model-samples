package fr.inria.diverse.sample.petrinet.xpetrinet.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.commons.model.trace.LaunchConfiguration;
import fr.inria.diverse.trace.commons.model.trace.MSEModel;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;

public class PetrinetTraceConstructor implements ITraceConstructor {
	private petrinetTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, EObject> exeToTraced;

	private petrinetTrace.States.State lastState;

	private Resource traceResource;
	private final Deque<petrinetTrace.Steps.SpecificStep> context = new LinkedList<petrinetTrace.Steps.SpecificStep>();

	public PetrinetTraceConstructor(Resource exeModel, Resource traceResource, Map<EObject, EObject> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = petrinetTrace.States.StatesFactory.eINSTANCE.createState();
			for (Resource r : allResources) {
				for (TreeIterator< EObject>i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();

					if (o instanceof fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place) {
						fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place o_cast = (fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token) {
						fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token o_cast = (fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStatesTrace().add(lastState);
		}
	}

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place o_cast,
			petrinetTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			petrinetTrace.States.petrinet.TracedPlace tracedObject = petrinetTrace.States.petrinet.PetrinetFactory.eINSTANCE
					.createTracedPlace();
			tracedObject.setOriginalObject((fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getPetrinet_tracedPlaces().add(tracedObject);

			// Creation of the first value of the field tokens
			petrinetTrace.States.Place_tokens_Value firstValue_tokens = petrinetTrace.States.StatesFactory.eINSTANCE
					.createPlace_tokens_Value();

			for (fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token aValue : o_cast.getTokens()) {
				addNewObjectToState((fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token) aValue, newState);
			}

			firstValue_tokens.getTokens().addAll(
					(Collection<? extends petrinetTrace.States.petrinet.TracedToken>) getExeToTraced(o_cast.getTokens(),
							newState));

			tracedObject.getTokensSequence().add(firstValue_tokens);
			newState.getPlace_tokens_Values().add(firstValue_tokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token o_cast,
			petrinetTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			petrinetTrace.States.petrinet.TracedToken tracedObject = petrinetTrace.States.petrinet.PetrinetFactory.eINSTANCE
					.createTracedToken();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getPetrinet_tracedTokens().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean copiedState = false;

	private petrinetTrace.States.State copyState(petrinetTrace.States.State oldState) {
		petrinetTrace.States.State newState = petrinetTrace.States.StatesFactory.eINSTANCE.createState();
		newState.getPlace_tokens_Values().addAll(oldState.getPlace_tokens_Values());
		copiedState = true;
		return newState;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addState(List<org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {
		if (lastState == null) {
			addInitialState();
		}
		if (!changes.isEmpty()) {
			boolean stateChanged = false;
			// We start by a (shallow) copy of the last state
			// But we will have to rollback a little by replacing values that changed
			petrinetTrace.States.State newState = copyState(lastState);
			for (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange modelChange : changes) {
				EObject o = modelChange.getChangedObject();
				// Here we look at collection mutable fields
				// We must first manually find out if the collection changed...
				// If it changed we must rollback the last values from the copied state, and add new values as well
				if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) {
					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();
					if (o instanceof fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place) {
						fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place o_cast = (fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place) o;
						petrinetTrace.States.petrinet.TracedPlace tracedObject = (petrinetTrace.States.petrinet.TracedPlace) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage.eINSTANCE
								.getPlace_Tokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<petrinetTrace.States.Place_tokens_Value> valueSequence = tracedObject
									.getTokensSequence();
							petrinetTrace.States.Place_tokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token aValue : o_cast
									.getTokens()) {
								addNewObjectToState((fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token) aValue,
										newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getTokens().size() == o_cast.getTokens().size()) {
									java.util.Iterator<fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token> it = o_cast
											.getTokens().iterator();
									for (petrinetTrace.States.petrinet.TracedToken aPreviousValue : previousValue
											.getTokens()) {
										fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								petrinetTrace.States.Place_tokens_Value lastValue = tracedObject.getTokensSequence()
										.get(tracedObject.getTokensSequence().size() - 1);
								newState.getPlace_tokens_Values().remove(lastValue);
								// And we create a proper new value							
								petrinetTrace.States.Place_tokens_Value newValue = petrinetTrace.States.StatesFactory.eINSTANCE
										.createPlace_tokens_Value();
								newValue.getTokens()
										.addAll((Collection<? extends petrinetTrace.States.petrinet.TracedToken>) getExeToTraced(
												o_cast.getTokens(), newState));
								tracedObject.getTokensSequence().add(newValue);
								newState.getPlace_tokens_Values().add(newValue);
							}
						}
					}
				}
			}
			if (stateChanged) {
				final petrinetTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof fr.inria.diverse.trace.commons.model.trace.BigStep) {
					final petrinetTrace.States.State startingState = lastState;
					final petrinetTrace.States.State endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStatesTrace().add(lastState);
			} else if (copiedState) {
				newState.getPlace_tokens_Values().clear();
			}
			copiedState = false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		petrinetTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof petrinetTrace.Steps.SpecificStep) {
			step_cast = (petrinetTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			petrinetTrace.States.State state = traceRoot.getStatesTrace().get(traceRoot.getStatesTrace().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<petrinetTrace.Steps.SpecificStep>) context.getFirst()).getSubSteps().add(step_cast);
			} else {
				traceRoot.getRootStep().getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition) {
				petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition petrinet_Net_FireEnabledTransitionInstance = (petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition) step_cast;
				traceRoot.getPetrinet_Net_FireEnabledTransition_Sequence()
						.add(petrinet_Net_FireEnabledTransitionInstance);
			} else if (step_cast instanceof petrinetTrace.Steps.Petrinet_Net_InitializeModel) {
				petrinetTrace.Steps.Petrinet_Net_InitializeModel petrinet_Net_InitializeModelInstance = (petrinetTrace.Steps.Petrinet_Net_InitializeModel) step_cast;
				traceRoot.getPetrinet_Net_InitializeModel_Sequence().add(petrinet_Net_InitializeModelInstance);
			} else if (step_cast instanceof petrinetTrace.Steps.Petrinet_Net_Stop) {
				petrinetTrace.Steps.Petrinet_Net_Stop petrinet_Net_StopInstance = (petrinetTrace.Steps.Petrinet_Net_Stop) step_cast;
				traceRoot.getPetrinet_Net_Stop_Sequence().add(petrinet_Net_StopInstance);
			} else if (step_cast instanceof petrinetTrace.Steps.Petrinet_Transition_Fire) {
				petrinetTrace.Steps.Petrinet_Transition_Fire petrinet_Transition_FireInstance = (petrinetTrace.Steps.Petrinet_Transition_Fire) step_cast;
				traceRoot.getPetrinet_Transition_Fire_Sequence().add(petrinet_Transition_FireInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(petrinetTrace.Steps.SpecificStep currentStep, petrinetTrace.States.State startingState,
			petrinetTrace.States.State endingState) {

		petrinetTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition) {
			implicitStep = petrinetTrace.Steps.StepsFactory.eINSTANCE
					.createPetrinet_Net_FireEnabledTransition_ImplicitStep();
		} else if (currentStep instanceof petrinetTrace.Steps.Petrinet_Net_InitializeModel) {
			implicitStep = petrinetTrace.Steps.StepsFactory.eINSTANCE.createPetrinet_Net_InitializeModel_ImplicitStep();
		} else if (currentStep instanceof petrinetTrace.Steps.Petrinet_Net_Stop) {
			implicitStep = petrinetTrace.Steps.StepsFactory.eINSTANCE.createPetrinet_Net_Stop_ImplicitStep();
		} else if (currentStep instanceof petrinetTrace.Steps.Petrinet_Transition_Fire) {
			implicitStep = petrinetTrace.Steps.StepsFactory.eINSTANCE.createPetrinet_Transition_Fire_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<petrinetTrace.Steps.SpecificStep>) currentStep).getSubSteps().add(implicitStep);

		}
	}

	@Override
	public void endStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		petrinetTrace.Steps.SpecificStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = petrinetTrace.PetrinetTraceFactory.eINSTANCE.createSpecificTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		fr.inria.diverse.trace.commons.model.trace.SequentialStep<petrinetTrace.Steps.SpecificStep> rootStep = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createSequentialStep();
		traceRoot.setRootStep(rootStep);

		// Put in the resource
		traceResource.getContents().add(traceRoot);

		return traceRoot;
	}

	@Override
	public void save() {
		try {
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void save(URI uri) {
		try {
			traceResource.setURI(uri);
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	private Set<Resource> getAllExecutedModelResources() {
		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		allResources.removeIf(r -> r == null);
		return allResources;
	}

	private Collection<? extends EObject> getExeToTraced(Collection<? extends EObject> exeObjects,
			petrinetTrace.States.State newState) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject exeObject : exeObjects) {
			result.add(exeToTraced.get(exeObject));
		}
		return result;
	}

	@Override
	public boolean isPartialTraceConstructor() {
		return false;
	}
}
