/**
 */
package fr.inria.diverse.sample.petrinet.xpetrinet.petrinet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage
 * @generated
 */
public interface PetrinetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetFactory eINSTANCE = fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PetrinetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Net</em>'.
	 * @generated
	 */
	Net createNet();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token</em>'.
	 * @generated
	 */
	Token createToken();

	/**
	 * Returns a new object of class '<em>Net Stop Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Net Stop Event</em>'.
	 * @generated
	 */
	NetStopEvent createNetStopEvent();

	/**
	 * Returns a new object of class '<em>Place Add Token Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place Add Token Event</em>'.
	 * @generated
	 */
	PlaceAddTokenEvent createPlaceAddTokenEvent();

	/**
	 * Returns a new object of class '<em>Place Remove Token Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place Remove Token Event</em>'.
	 * @generated
	 */
	PlaceRemoveTokenEvent createPlaceRemoveTokenEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PetrinetPackage getPetrinetPackage();

} //PetrinetFactory
