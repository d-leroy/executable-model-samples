/**
 */
package fr.inria.diverse.sample.petrinet.petrinetmt.petrinet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Fire Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.TransitionFireEvent#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage#getTransitionFireEvent()
 * @model
 * @generated
 */
public interface TransitionFireEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transition)
	 * @see fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage#getTransitionFireEvent_Transition()
	 * @model
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.TransitionFireEvent#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

} // TransitionFireEvent
