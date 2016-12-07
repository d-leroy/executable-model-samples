/**
 */
package petrinetTrace.States.petrinet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see petrinetTrace.States.petrinet.PetrinetFactory
 * @model kind="package"
 * @generated
 */
public interface PetrinetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "petrinetTrace_petrinet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetPackage eINSTANCE = petrinetTrace.States.petrinet.impl.PetrinetPackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetTrace.States.petrinet.impl.TracedPlaceImpl <em>Traced Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.States.petrinet.impl.TracedPlaceImpl
	 * @see petrinetTrace.States.petrinet.impl.PetrinetPackageImpl#getTracedPlace()
	 * @generated
	 */
	int TRACED_PLACE = 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PLACE__ORIGINAL_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Tokens Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PLACE__TOKENS_SEQUENCE = 1;

	/**
	 * The number of structural features of the '<em>Traced Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PLACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link petrinetTrace.States.petrinet.impl.TracedTokenImpl <em>Traced Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.States.petrinet.impl.TracedTokenImpl
	 * @see petrinetTrace.States.petrinet.impl.PetrinetPackageImpl#getTracedToken()
	 * @generated
	 */
	int TRACED_TOKEN = 1;

	/**
	 * The number of structural features of the '<em>Traced Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TOKEN_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link petrinetTrace.States.petrinet.TracedPlace <em>Traced Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Place</em>'.
	 * @see petrinetTrace.States.petrinet.TracedPlace
	 * @generated
	 */
	EClass getTracedPlace();

	/**
	 * Returns the meta object for the reference '{@link petrinetTrace.States.petrinet.TracedPlace#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see petrinetTrace.States.petrinet.TracedPlace#getOriginalObject()
	 * @see #getTracedPlace()
	 * @generated
	 */
	EReference getTracedPlace_OriginalObject();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetTrace.States.petrinet.TracedPlace#getTokensSequence <em>Tokens Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens Sequence</em>'.
	 * @see petrinetTrace.States.petrinet.TracedPlace#getTokensSequence()
	 * @see #getTracedPlace()
	 * @generated
	 */
	EReference getTracedPlace_TokensSequence();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.States.petrinet.TracedToken <em>Traced Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Token</em>'.
	 * @see petrinetTrace.States.petrinet.TracedToken
	 * @generated
	 */
	EClass getTracedToken();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetrinetFactory getPetrinetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link petrinetTrace.States.petrinet.impl.TracedPlaceImpl <em>Traced Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.States.petrinet.impl.TracedPlaceImpl
		 * @see petrinetTrace.States.petrinet.impl.PetrinetPackageImpl#getTracedPlace()
		 * @generated
		 */
		EClass TRACED_PLACE = eINSTANCE.getTracedPlace();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PLACE__ORIGINAL_OBJECT = eINSTANCE.getTracedPlace_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Tokens Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PLACE__TOKENS_SEQUENCE = eINSTANCE.getTracedPlace_TokensSequence();

		/**
		 * The meta object literal for the '{@link petrinetTrace.States.petrinet.impl.TracedTokenImpl <em>Traced Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.States.petrinet.impl.TracedTokenImpl
		 * @see petrinetTrace.States.petrinet.impl.PetrinetPackageImpl#getTracedToken()
		 * @generated
		 */
		EClass TRACED_TOKEN = eINSTANCE.getTracedToken();

	}

} //PetrinetPackage
