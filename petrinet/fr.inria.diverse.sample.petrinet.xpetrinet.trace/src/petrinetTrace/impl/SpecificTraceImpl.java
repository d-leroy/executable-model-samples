/**
 */
package petrinetTrace.impl;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import fr.inria.diverse.trace.commons.model.trace.impl.TraceImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinetTrace.PetrinetTracePackage;
import petrinetTrace.SpecificTrace;

import petrinetTrace.States.State;

import petrinetTrace.States.petrinet.TracedPlace;
import petrinetTrace.States.petrinet.TracedToken;

import petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition;
import petrinetTrace.Steps.Petrinet_Net_InitializeModel;
import petrinetTrace.Steps.Petrinet_Net_Stop;
import petrinetTrace.Steps.Petrinet_Transition_Fire;
import petrinetTrace.Steps.SpecificStep;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetTrace.impl.SpecificTraceImpl#getPetrinet_Net_FireEnabledTransition_Sequence <em>Petrinet Net Fire Enabled Transition Sequence</em>}</li>
 *   <li>{@link petrinetTrace.impl.SpecificTraceImpl#getPetrinet_Net_InitializeModel_Sequence <em>Petrinet Net Initialize Model Sequence</em>}</li>
 *   <li>{@link petrinetTrace.impl.SpecificTraceImpl#getPetrinet_Net_Stop_Sequence <em>Petrinet Net Stop Sequence</em>}</li>
 *   <li>{@link petrinetTrace.impl.SpecificTraceImpl#getPetrinet_Transition_Fire_Sequence <em>Petrinet Transition Fire Sequence</em>}</li>
 *   <li>{@link petrinetTrace.impl.SpecificTraceImpl#getPetrinet_tracedPlaces <em>Petrinet traced Places</em>}</li>
 *   <li>{@link petrinetTrace.impl.SpecificTraceImpl#getPetrinet_tracedTokens <em>Petrinet traced Tokens</em>}</li>
 *   <li>{@link petrinetTrace.impl.SpecificTraceImpl#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificTraceImpl extends TraceImpl<SequentialStep<SpecificStep>> implements SpecificTrace {
	/**
	 * The cached value of the '{@link #getPetrinet_Net_FireEnabledTransition_Sequence() <em>Petrinet Net Fire Enabled Transition Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinet_Net_FireEnabledTransition_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Petrinet_Net_FireEnabledTransition> petrinet_Net_FireEnabledTransition_Sequence;

	/**
	 * The cached value of the '{@link #getPetrinet_Net_InitializeModel_Sequence() <em>Petrinet Net Initialize Model Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinet_Net_InitializeModel_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Petrinet_Net_InitializeModel> petrinet_Net_InitializeModel_Sequence;

	/**
	 * The cached value of the '{@link #getPetrinet_Net_Stop_Sequence() <em>Petrinet Net Stop Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinet_Net_Stop_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Petrinet_Net_Stop> petrinet_Net_Stop_Sequence;

	/**
	 * The cached value of the '{@link #getPetrinet_Transition_Fire_Sequence() <em>Petrinet Transition Fire Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinet_Transition_Fire_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Petrinet_Transition_Fire> petrinet_Transition_Fire_Sequence;

	/**
	 * The cached value of the '{@link #getPetrinet_tracedPlaces() <em>Petrinet traced Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinet_tracedPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedPlace> petrinet_tracedPlaces;

	/**
	 * The cached value of the '{@link #getPetrinet_tracedTokens() <em>Petrinet traced Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinet_tracedTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedToken> petrinet_tracedTokens;

	/**
	 * The cached value of the '{@link #getStatesTrace() <em>States Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<State> statesTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetTracePackage.Literals.SPECIFIC_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRootStep(SequentialStep<SpecificStep> newRootStep, NotificationChain msgs) {
		return super.basicSetRootStep(newRootStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Petrinet_Net_FireEnabledTransition> getPetrinet_Net_FireEnabledTransition_Sequence() {
		if (petrinet_Net_FireEnabledTransition_Sequence == null) {
			petrinet_Net_FireEnabledTransition_Sequence = new EObjectResolvingEList<Petrinet_Net_FireEnabledTransition>(Petrinet_Net_FireEnabledTransition.class, this, PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_NET_FIRE_ENABLED_TRANSITION_SEQUENCE);
		}
		return petrinet_Net_FireEnabledTransition_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Petrinet_Net_InitializeModel> getPetrinet_Net_InitializeModel_Sequence() {
		if (petrinet_Net_InitializeModel_Sequence == null) {
			petrinet_Net_InitializeModel_Sequence = new EObjectResolvingEList<Petrinet_Net_InitializeModel>(Petrinet_Net_InitializeModel.class, this, PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_NET_INITIALIZE_MODEL_SEQUENCE);
		}
		return petrinet_Net_InitializeModel_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Petrinet_Net_Stop> getPetrinet_Net_Stop_Sequence() {
		if (petrinet_Net_Stop_Sequence == null) {
			petrinet_Net_Stop_Sequence = new EObjectResolvingEList<Petrinet_Net_Stop>(Petrinet_Net_Stop.class, this, PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_NET_STOP_SEQUENCE);
		}
		return petrinet_Net_Stop_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Petrinet_Transition_Fire> getPetrinet_Transition_Fire_Sequence() {
		if (petrinet_Transition_Fire_Sequence == null) {
			petrinet_Transition_Fire_Sequence = new EObjectResolvingEList<Petrinet_Transition_Fire>(Petrinet_Transition_Fire.class, this, PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_TRANSITION_FIRE_SEQUENCE);
		}
		return petrinet_Transition_Fire_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedPlace> getPetrinet_tracedPlaces() {
		if (petrinet_tracedPlaces == null) {
			petrinet_tracedPlaces = new EObjectContainmentEList<TracedPlace>(TracedPlace.class, this, PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_TRACED_PLACES);
		}
		return petrinet_tracedPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedToken> getPetrinet_tracedTokens() {
		if (petrinet_tracedTokens == null) {
			petrinet_tracedTokens = new EObjectContainmentEList<TracedToken>(TracedToken.class, this, PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_TRACED_TOKENS);
		}
		return petrinet_tracedTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesTrace() {
		if (statesTrace == null) {
			statesTrace = new EObjectContainmentEList<State>(State.class, this, PetrinetTracePackage.SPECIFIC_TRACE__STATES_TRACE);
		}
		return statesTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_TRACED_PLACES:
				return ((InternalEList<?>)getPetrinet_tracedPlaces()).basicRemove(otherEnd, msgs);
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_TRACED_TOKENS:
				return ((InternalEList<?>)getPetrinet_tracedTokens()).basicRemove(otherEnd, msgs);
			case PetrinetTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return ((InternalEList<?>)getStatesTrace()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_NET_FIRE_ENABLED_TRANSITION_SEQUENCE:
				return getPetrinet_Net_FireEnabledTransition_Sequence();
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_NET_INITIALIZE_MODEL_SEQUENCE:
				return getPetrinet_Net_InitializeModel_Sequence();
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_NET_STOP_SEQUENCE:
				return getPetrinet_Net_Stop_Sequence();
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_TRANSITION_FIRE_SEQUENCE:
				return getPetrinet_Transition_Fire_Sequence();
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_TRACED_PLACES:
				return getPetrinet_tracedPlaces();
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_TRACED_TOKENS:
				return getPetrinet_tracedTokens();
			case PetrinetTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return getStatesTrace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_NET_FIRE_ENABLED_TRANSITION_SEQUENCE:
				getPetrinet_Net_FireEnabledTransition_Sequence().clear();
				getPetrinet_Net_FireEnabledTransition_Sequence().addAll((Collection<? extends Petrinet_Net_FireEnabledTransition>)newValue);
				return;
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_NET_INITIALIZE_MODEL_SEQUENCE:
				getPetrinet_Net_InitializeModel_Sequence().clear();
				getPetrinet_Net_InitializeModel_Sequence().addAll((Collection<? extends Petrinet_Net_InitializeModel>)newValue);
				return;
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_NET_STOP_SEQUENCE:
				getPetrinet_Net_Stop_Sequence().clear();
				getPetrinet_Net_Stop_Sequence().addAll((Collection<? extends Petrinet_Net_Stop>)newValue);
				return;
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_TRANSITION_FIRE_SEQUENCE:
				getPetrinet_Transition_Fire_Sequence().clear();
				getPetrinet_Transition_Fire_Sequence().addAll((Collection<? extends Petrinet_Transition_Fire>)newValue);
				return;
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_TRACED_PLACES:
				getPetrinet_tracedPlaces().clear();
				getPetrinet_tracedPlaces().addAll((Collection<? extends TracedPlace>)newValue);
				return;
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_TRACED_TOKENS:
				getPetrinet_tracedTokens().clear();
				getPetrinet_tracedTokens().addAll((Collection<? extends TracedToken>)newValue);
				return;
			case PetrinetTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				getStatesTrace().addAll((Collection<? extends State>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_NET_FIRE_ENABLED_TRANSITION_SEQUENCE:
				getPetrinet_Net_FireEnabledTransition_Sequence().clear();
				return;
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_NET_INITIALIZE_MODEL_SEQUENCE:
				getPetrinet_Net_InitializeModel_Sequence().clear();
				return;
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_NET_STOP_SEQUENCE:
				getPetrinet_Net_Stop_Sequence().clear();
				return;
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_TRANSITION_FIRE_SEQUENCE:
				getPetrinet_Transition_Fire_Sequence().clear();
				return;
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_TRACED_PLACES:
				getPetrinet_tracedPlaces().clear();
				return;
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_TRACED_TOKENS:
				getPetrinet_tracedTokens().clear();
				return;
			case PetrinetTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_NET_FIRE_ENABLED_TRANSITION_SEQUENCE:
				return petrinet_Net_FireEnabledTransition_Sequence != null && !petrinet_Net_FireEnabledTransition_Sequence.isEmpty();
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_NET_INITIALIZE_MODEL_SEQUENCE:
				return petrinet_Net_InitializeModel_Sequence != null && !petrinet_Net_InitializeModel_Sequence.isEmpty();
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_NET_STOP_SEQUENCE:
				return petrinet_Net_Stop_Sequence != null && !petrinet_Net_Stop_Sequence.isEmpty();
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_TRANSITION_FIRE_SEQUENCE:
				return petrinet_Transition_Fire_Sequence != null && !petrinet_Transition_Fire_Sequence.isEmpty();
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_TRACED_PLACES:
				return petrinet_tracedPlaces != null && !petrinet_tracedPlaces.isEmpty();
			case PetrinetTracePackage.SPECIFIC_TRACE__PETRINET_TRACED_TOKENS:
				return petrinet_tracedTokens != null && !petrinet_tracedTokens.isEmpty();
			case PetrinetTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificTraceImpl
