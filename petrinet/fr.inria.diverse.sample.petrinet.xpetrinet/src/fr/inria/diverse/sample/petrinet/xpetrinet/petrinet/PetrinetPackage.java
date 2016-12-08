/**
 */
package fr.inria.diverse.sample.petrinet.xpetrinet.petrinet;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetFactory
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
	String eNS_URI = "http://fr.inria.diverse.sample.petrinet.xpetrinet/petrinet/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetPackage eINSTANCE = fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PetrinetPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.NetImpl <em>Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.NetImpl
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PetrinetPackageImpl#getNet()
	 * @generated
	 */
	int NET = 0;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__PLACES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__TRANSITIONS = 1;

	/**
	 * The number of structural features of the '<em>Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.TransitionImpl
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PetrinetPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PlaceImpl
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PetrinetPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Initial Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__INITIAL_TOKENS = 1;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOKENS = 2;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.TokenImpl
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PetrinetPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 3;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.NetStopEventImpl <em>Net Stop Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.NetStopEventImpl
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PetrinetPackageImpl#getNetStopEvent()
	 * @generated
	 */
	int NET_STOP_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_STOP_EVENT__NET = 0;

	/**
	 * The number of structural features of the '<em>Net Stop Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_STOP_EVENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PlaceAddTokenEventImpl <em>Place Add Token Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PlaceAddTokenEventImpl
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PetrinetPackageImpl#getPlaceAddTokenEvent()
	 * @generated
	 */
	int PLACE_ADD_TOKEN_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_ADD_TOKEN_EVENT__PLACE = 0;

	/**
	 * The number of structural features of the '<em>Place Add Token Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_ADD_TOKEN_EVENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PlaceRemoveTokenEventImpl <em>Place Remove Token Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PlaceRemoveTokenEventImpl
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PetrinetPackageImpl#getPlaceRemoveTokenEvent()
	 * @generated
	 */
	int PLACE_REMOVE_TOKEN_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_REMOVE_TOKEN_EVENT__PLACE = 0;

	/**
	 * The number of structural features of the '<em>Place Remove Token Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_REMOVE_TOKEN_EVENT_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Net <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net</em>'.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Net
	 * @generated
	 */
	EClass getNet();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Net#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Net#getPlaces()
	 * @see #getNet()
	 * @generated
	 */
	EReference getNet_Places();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Net#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Net#getTransitions()
	 * @see #getNet()
	 * @generated
	 */
	EReference getNet_Transitions();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition#getInput()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Input();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition#getOutput()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Output();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place#getName()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place#getInitialTokens <em>Initial Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Tokens</em>'.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place#getInitialTokens()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_InitialTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place#getTokens()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Tokens();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.NetStopEvent <em>Net Stop Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net Stop Event</em>'.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.NetStopEvent
	 * @generated
	 */
	EClass getNetStopEvent();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.NetStopEvent#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Net</em>'.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.NetStopEvent#getNet()
	 * @see #getNetStopEvent()
	 * @generated
	 */
	EReference getNetStopEvent_Net();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PlaceAddTokenEvent <em>Place Add Token Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Add Token Event</em>'.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PlaceAddTokenEvent
	 * @generated
	 */
	EClass getPlaceAddTokenEvent();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PlaceAddTokenEvent#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PlaceAddTokenEvent#getPlace()
	 * @see #getPlaceAddTokenEvent()
	 * @generated
	 */
	EReference getPlaceAddTokenEvent_Place();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PlaceRemoveTokenEvent <em>Place Remove Token Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Remove Token Event</em>'.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PlaceRemoveTokenEvent
	 * @generated
	 */
	EClass getPlaceRemoveTokenEvent();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PlaceRemoveTokenEvent#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PlaceRemoveTokenEvent#getPlace()
	 * @see #getPlaceRemoveTokenEvent()
	 * @generated
	 */
	EReference getPlaceRemoveTokenEvent_Place();

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
		 * The meta object literal for the '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.NetImpl <em>Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.NetImpl
		 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PetrinetPackageImpl#getNet()
		 * @generated
		 */
		EClass NET = eINSTANCE.getNet();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NET__PLACES = eINSTANCE.getNet_Places();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NET__TRANSITIONS = eINSTANCE.getNet_Transitions();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.TransitionImpl
		 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PetrinetPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__INPUT = eINSTANCE.getTransition_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OUTPUT = eINSTANCE.getTransition_Output();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PlaceImpl
		 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PetrinetPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__NAME = eINSTANCE.getPlace_Name();

		/**
		 * The meta object literal for the '<em><b>Initial Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__INITIAL_TOKENS = eINSTANCE.getPlace_InitialTokens();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__TOKENS = eINSTANCE.getPlace_Tokens();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.TokenImpl
		 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PetrinetPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.NetStopEventImpl <em>Net Stop Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.NetStopEventImpl
		 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PetrinetPackageImpl#getNetStopEvent()
		 * @generated
		 */
		EClass NET_STOP_EVENT = eINSTANCE.getNetStopEvent();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NET_STOP_EVENT__NET = eINSTANCE.getNetStopEvent_Net();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PlaceAddTokenEventImpl <em>Place Add Token Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PlaceAddTokenEventImpl
		 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PetrinetPackageImpl#getPlaceAddTokenEvent()
		 * @generated
		 */
		EClass PLACE_ADD_TOKEN_EVENT = eINSTANCE.getPlaceAddTokenEvent();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_ADD_TOKEN_EVENT__PLACE = eINSTANCE.getPlaceAddTokenEvent_Place();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PlaceRemoveTokenEventImpl <em>Place Remove Token Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PlaceRemoveTokenEventImpl
		 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl.PetrinetPackageImpl#getPlaceRemoveTokenEvent()
		 * @generated
		 */
		EClass PLACE_REMOVE_TOKEN_EVENT = eINSTANCE.getPlaceRemoveTokenEvent();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_REMOVE_TOKEN_EVENT__PLACE = eINSTANCE.getPlaceRemoveTokenEvent_Place();

	}

} //PetrinetPackage
