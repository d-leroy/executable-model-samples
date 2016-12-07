/**
 */
package petrinetTrace.Steps;

import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petrinet Transition Fire</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see petrinetTrace.Steps.StepsPackage#getPetrinet_Transition_Fire()
 * @model
 * @generated
 */
public interface Petrinet_Transition_Fire extends Petrinet_Net_Run_AbstractSubStep, SpecificStep, SequentialStep<Petrinet_Transition_Fire_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Transition getCaller();

} // Petrinet_Transition_Fire
