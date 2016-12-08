/**
 */
package petrinetTrace;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Trace;

import org.eclipse.emf.common.util.EList;

import petrinetTrace.States.State;

import petrinetTrace.States.petrinet.TracedPlace;
import petrinetTrace.States.petrinet.TracedToken;

import petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition;
import petrinetTrace.Steps.Petrinet_Net_InitializeModel;
import petrinetTrace.Steps.Petrinet_Net_Stop;
import petrinetTrace.Steps.Petrinet_Place_AddToken;
import petrinetTrace.Steps.Petrinet_Place_RemoveToken;
import petrinetTrace.Steps.Petrinet_Transition_Fire;
import petrinetTrace.Steps.SpecificStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetTrace.SpecificTrace#getPetrinet_Net_FireEnabledTransition_Sequence <em>Petrinet Net Fire Enabled Transition Sequence</em>}</li>
 *   <li>{@link petrinetTrace.SpecificTrace#getPetrinet_Net_InitializeModel_Sequence <em>Petrinet Net Initialize Model Sequence</em>}</li>
 *   <li>{@link petrinetTrace.SpecificTrace#getPetrinet_Net_Stop_Sequence <em>Petrinet Net Stop Sequence</em>}</li>
 *   <li>{@link petrinetTrace.SpecificTrace#getPetrinet_Place_AddToken_Sequence <em>Petrinet Place Add Token Sequence</em>}</li>
 *   <li>{@link petrinetTrace.SpecificTrace#getPetrinet_Place_RemoveToken_Sequence <em>Petrinet Place Remove Token Sequence</em>}</li>
 *   <li>{@link petrinetTrace.SpecificTrace#getPetrinet_Transition_Fire_Sequence <em>Petrinet Transition Fire Sequence</em>}</li>
 *   <li>{@link petrinetTrace.SpecificTrace#getPetrinet_tracedPlaces <em>Petrinet traced Places</em>}</li>
 *   <li>{@link petrinetTrace.SpecificTrace#getPetrinet_tracedTokens <em>Petrinet traced Tokens</em>}</li>
 *   <li>{@link petrinetTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @see petrinetTrace.PetrinetTracePackage#getSpecificTrace()
 * @model
 * @generated
 */
public interface SpecificTrace extends Trace<SequentialStep<SpecificStep>> {
	/**
	 * Returns the value of the '<em><b>Petrinet Net Fire Enabled Transition Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet Net Fire Enabled Transition Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet Net Fire Enabled Transition Sequence</em>' reference list.
	 * @see petrinetTrace.PetrinetTracePackage#getSpecificTrace_Petrinet_Net_FireEnabledTransition_Sequence()
	 * @model
	 * @generated
	 */
	EList<Petrinet_Net_FireEnabledTransition> getPetrinet_Net_FireEnabledTransition_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinet Net Initialize Model Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetTrace.Steps.Petrinet_Net_InitializeModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet Net Initialize Model Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet Net Initialize Model Sequence</em>' reference list.
	 * @see petrinetTrace.PetrinetTracePackage#getSpecificTrace_Petrinet_Net_InitializeModel_Sequence()
	 * @model
	 * @generated
	 */
	EList<Petrinet_Net_InitializeModel> getPetrinet_Net_InitializeModel_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinet Net Stop Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetTrace.Steps.Petrinet_Net_Stop}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet Net Stop Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet Net Stop Sequence</em>' reference list.
	 * @see petrinetTrace.PetrinetTracePackage#getSpecificTrace_Petrinet_Net_Stop_Sequence()
	 * @model
	 * @generated
	 */
	EList<Petrinet_Net_Stop> getPetrinet_Net_Stop_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinet Place Add Token Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetTrace.Steps.Petrinet_Place_AddToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet Place Add Token Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet Place Add Token Sequence</em>' reference list.
	 * @see petrinetTrace.PetrinetTracePackage#getSpecificTrace_Petrinet_Place_AddToken_Sequence()
	 * @model
	 * @generated
	 */
	EList<Petrinet_Place_AddToken> getPetrinet_Place_AddToken_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinet Place Remove Token Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetTrace.Steps.Petrinet_Place_RemoveToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet Place Remove Token Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet Place Remove Token Sequence</em>' reference list.
	 * @see petrinetTrace.PetrinetTracePackage#getSpecificTrace_Petrinet_Place_RemoveToken_Sequence()
	 * @model
	 * @generated
	 */
	EList<Petrinet_Place_RemoveToken> getPetrinet_Place_RemoveToken_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinet Transition Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetTrace.Steps.Petrinet_Transition_Fire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet Transition Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet Transition Fire Sequence</em>' reference list.
	 * @see petrinetTrace.PetrinetTracePackage#getSpecificTrace_Petrinet_Transition_Fire_Sequence()
	 * @model
	 * @generated
	 */
	EList<Petrinet_Transition_Fire> getPetrinet_Transition_Fire_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinet traced Places</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetTrace.States.petrinet.TracedPlace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet traced Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet traced Places</em>' containment reference list.
	 * @see petrinetTrace.PetrinetTracePackage#getSpecificTrace_Petrinet_tracedPlaces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedPlace> getPetrinet_tracedPlaces();

	/**
	 * Returns the value of the '<em><b>Petrinet traced Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetTrace.States.petrinet.TracedToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet traced Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet traced Tokens</em>' containment reference list.
	 * @see petrinetTrace.PetrinetTracePackage#getSpecificTrace_Petrinet_tracedTokens()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedToken> getPetrinet_tracedTokens();

	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetTrace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see petrinetTrace.PetrinetTracePackage#getSpecificTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

} // SpecificTrace
