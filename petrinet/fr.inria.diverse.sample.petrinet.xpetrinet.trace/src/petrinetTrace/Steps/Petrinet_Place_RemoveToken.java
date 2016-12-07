/**
 */
package petrinetTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import petrinetTrace.States.petrinet.TracedPlace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petrinet Place Remove Token</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see petrinetTrace.Steps.StepsPackage#getPetrinet_Place_RemoveToken()
 * @model
 * @generated
 */
public interface Petrinet_Place_RemoveToken extends Petrinet_Place_AddToken_AbstractSubStep, SpecificStep, SequentialStep<Petrinet_Place_RemoveToken_AbstractSubStep>, Petrinet_Place_RemoveToken_AbstractSubStep, Petrinet_Net_Run_AbstractSubStep, Petrinet_Transition_Fire_AbstractSubStep, Petrinet_Net_InitializeModel_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (petrinetTrace.States.petrinet.TracedPlace) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedPlace getCaller();

} // Petrinet_Place_RemoveToken
