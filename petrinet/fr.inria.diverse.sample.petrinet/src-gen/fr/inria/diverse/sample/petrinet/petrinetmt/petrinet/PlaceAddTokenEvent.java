/**
 */
package fr.inria.diverse.sample.petrinet.petrinetmt.petrinet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place Add Token Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PlaceAddTokenEvent#getPlace <em>Place</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage#getPlaceAddTokenEvent()
 * @model
 * @generated
 */
public interface PlaceAddTokenEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference.
	 * @see #setPlace(Place)
	 * @see fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage#getPlaceAddTokenEvent_Place()
	 * @model
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PlaceAddTokenEvent#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

} // PlaceAddTokenEvent
