/**
 */
package fr.inria.diverse.sample.petrinet.petrinetmt.petrinet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net Stop Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.NetStopEvent#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage#getNetStopEvent()
 * @model
 * @generated
 */
public interface NetStopEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' reference.
	 * @see #setNet(Net)
	 * @see fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage#getNetStopEvent_Net()
	 * @model
	 * @generated
	 */
	Net getNet();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.NetStopEvent#getNet <em>Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Net value);

} // NetStopEvent
