/**
 */
package petrinetTrace;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

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
 * @see petrinetTrace.PetrinetTraceFactory
 * @model kind="package"
 * @generated
 */
public interface PetrinetTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinetTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "petrinetTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinetTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetTracePackage eINSTANCE = petrinetTrace.impl.PetrinetTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.impl.SpecificTraceImpl
	 * @see petrinetTrace.impl.PetrinetTracePackageImpl#getSpecificTrace()
	 * @generated
	 */
	int SPECIFIC_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Root Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ROOT_STEP = TracePackage.TRACE__ROOT_STEP;

	/**
	 * The feature id for the '<em><b>Launchconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LAUNCHCONFIGURATION = TracePackage.TRACE__LAUNCHCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Petrinet Net Initialize Model Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__PETRINET_NET_INITIALIZE_MODEL_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Petrinet Net Run Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__PETRINET_NET_RUN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Petrinet Place Add Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__PETRINET_PLACE_ADD_TOKEN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Petrinet Place Remove Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__PETRINET_PLACE_REMOVE_TOKEN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Petrinet Transition Fire Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__PETRINET_TRANSITION_FIRE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Petrinet traced Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__PETRINET_TRACED_PLACES = TracePackage.TRACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Petrinet traced Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__PETRINET_TRACED_TOKENS = TracePackage.TRACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__STATES_TRACE = TracePackage.TRACE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_FEATURE_COUNT = TracePackage.TRACE_FEATURE_COUNT + 8;


	/**
	 * Returns the meta object for class '{@link petrinetTrace.SpecificTrace <em>Specific Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Trace</em>'.
	 * @see petrinetTrace.SpecificTrace
	 * @generated
	 */
	EClass getSpecificTrace();

	/**
	 * Returns the meta object for the reference list '{@link petrinetTrace.SpecificTrace#getPetrinet_Net_InitializeModel_Sequence <em>Petrinet Net Initialize Model Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Petrinet Net Initialize Model Sequence</em>'.
	 * @see petrinetTrace.SpecificTrace#getPetrinet_Net_InitializeModel_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Petrinet_Net_InitializeModel_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link petrinetTrace.SpecificTrace#getPetrinet_Net_Run_Sequence <em>Petrinet Net Run Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Petrinet Net Run Sequence</em>'.
	 * @see petrinetTrace.SpecificTrace#getPetrinet_Net_Run_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Petrinet_Net_Run_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link petrinetTrace.SpecificTrace#getPetrinet_Place_AddToken_Sequence <em>Petrinet Place Add Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Petrinet Place Add Token Sequence</em>'.
	 * @see petrinetTrace.SpecificTrace#getPetrinet_Place_AddToken_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Petrinet_Place_AddToken_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link petrinetTrace.SpecificTrace#getPetrinet_Place_RemoveToken_Sequence <em>Petrinet Place Remove Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Petrinet Place Remove Token Sequence</em>'.
	 * @see petrinetTrace.SpecificTrace#getPetrinet_Place_RemoveToken_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Petrinet_Place_RemoveToken_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link petrinetTrace.SpecificTrace#getPetrinet_Transition_Fire_Sequence <em>Petrinet Transition Fire Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Petrinet Transition Fire Sequence</em>'.
	 * @see petrinetTrace.SpecificTrace#getPetrinet_Transition_Fire_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Petrinet_Transition_Fire_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetTrace.SpecificTrace#getPetrinet_tracedPlaces <em>Petrinet traced Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Petrinet traced Places</em>'.
	 * @see petrinetTrace.SpecificTrace#getPetrinet_tracedPlaces()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Petrinet_tracedPlaces();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetTrace.SpecificTrace#getPetrinet_tracedTokens <em>Petrinet traced Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Petrinet traced Tokens</em>'.
	 * @see petrinetTrace.SpecificTrace#getPetrinet_tracedTokens()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Petrinet_tracedTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see petrinetTrace.SpecificTrace#getStatesTrace()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_StatesTrace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetrinetTraceFactory getPetrinetTraceFactory();

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
		 * The meta object literal for the '{@link petrinetTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.impl.SpecificTraceImpl
		 * @see petrinetTrace.impl.PetrinetTracePackageImpl#getSpecificTrace()
		 * @generated
		 */
		EClass SPECIFIC_TRACE = eINSTANCE.getSpecificTrace();

		/**
		 * The meta object literal for the '<em><b>Petrinet Net Initialize Model Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__PETRINET_NET_INITIALIZE_MODEL_SEQUENCE = eINSTANCE.getSpecificTrace_Petrinet_Net_InitializeModel_Sequence();

		/**
		 * The meta object literal for the '<em><b>Petrinet Net Run Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__PETRINET_NET_RUN_SEQUENCE = eINSTANCE.getSpecificTrace_Petrinet_Net_Run_Sequence();

		/**
		 * The meta object literal for the '<em><b>Petrinet Place Add Token Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__PETRINET_PLACE_ADD_TOKEN_SEQUENCE = eINSTANCE.getSpecificTrace_Petrinet_Place_AddToken_Sequence();

		/**
		 * The meta object literal for the '<em><b>Petrinet Place Remove Token Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__PETRINET_PLACE_REMOVE_TOKEN_SEQUENCE = eINSTANCE.getSpecificTrace_Petrinet_Place_RemoveToken_Sequence();

		/**
		 * The meta object literal for the '<em><b>Petrinet Transition Fire Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__PETRINET_TRANSITION_FIRE_SEQUENCE = eINSTANCE.getSpecificTrace_Petrinet_Transition_Fire_Sequence();

		/**
		 * The meta object literal for the '<em><b>Petrinet traced Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__PETRINET_TRACED_PLACES = eINSTANCE.getSpecificTrace_Petrinet_tracedPlaces();

		/**
		 * The meta object literal for the '<em><b>Petrinet traced Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__PETRINET_TRACED_TOKENS = eINSTANCE.getSpecificTrace_Petrinet_tracedTokens();

		/**
		 * The meta object literal for the '<em><b>States Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__STATES_TRACE = eINSTANCE.getSpecificTrace_StatesTrace();

	}

} //PetrinetTracePackage
