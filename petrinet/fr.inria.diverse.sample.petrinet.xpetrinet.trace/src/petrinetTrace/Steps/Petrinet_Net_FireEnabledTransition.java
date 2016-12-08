/**
 */
package petrinetTrace.Steps;

import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Net;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petrinet Net Fire Enabled Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see petrinetTrace.Steps.StepsPackage#getPetrinet_Net_FireEnabledTransition()
 * @model
 * @generated
 */
public interface Petrinet_Net_FireEnabledTransition extends SpecificStep, SequentialStep<Petrinet_Net_FireEnabledTransition_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Net) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Net getCaller();

} // Petrinet_Net_FireEnabledTransition
