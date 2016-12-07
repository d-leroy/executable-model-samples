/**
 */
package petrinetTrace.Steps;

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
 * @see petrinetTrace.Steps.StepsFactory
 * @model kind="package"
 * @generated
 */
public interface StepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Steps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "petrinetTrace_Steps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsPackage eINSTANCE = petrinetTrace.Steps.impl.StepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.SpecificStep
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
	 * @generated
	 */
	int SPECIFIC_STEP = 16;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__MSEOCCURRENCE = TracePackage.STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__ENDING_STATE = TracePackage.STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__STARTING_STATE = TracePackage.STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_FEATURE_COUNT = TracePackage.STEP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.Petrinet_Net_InitializeModelImpl <em>Petrinet Net Initialize Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.Petrinet_Net_InitializeModelImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_InitializeModel()
	 * @generated
	 */
	int PETRINET_NET_INITIALIZE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_INITIALIZE_MODEL__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_INITIALIZE_MODEL__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_INITIALIZE_MODEL__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_INITIALIZE_MODEL__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Petrinet Net Initialize Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_INITIALIZE_MODEL_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.Petrinet_Net_InitializeModel_AbstractSubStep <em>Petrinet Net Initialize Model Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.Petrinet_Net_InitializeModel_AbstractSubStep
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_InitializeModel_AbstractSubStep()
	 * @generated
	 */
	int PETRINET_NET_INITIALIZE_MODEL_ABSTRACT_SUB_STEP = 1;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_INITIALIZE_MODEL_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_INITIALIZE_MODEL_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_INITIALIZE_MODEL_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Net Initialize Model Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_INITIALIZE_MODEL_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.Petrinet_Net_InitializeModel_ImplicitStepImpl <em>Petrinet Net Initialize Model Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.Petrinet_Net_InitializeModel_ImplicitStepImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_InitializeModel_ImplicitStep()
	 * @generated
	 */
	int PETRINET_NET_INITIALIZE_MODEL_IMPLICIT_STEP = 2;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_INITIALIZE_MODEL_IMPLICIT_STEP__MSEOCCURRENCE = PETRINET_NET_INITIALIZE_MODEL_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_INITIALIZE_MODEL_IMPLICIT_STEP__ENDING_STATE = PETRINET_NET_INITIALIZE_MODEL_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_INITIALIZE_MODEL_IMPLICIT_STEP__STARTING_STATE = PETRINET_NET_INITIALIZE_MODEL_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Net Initialize Model Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_INITIALIZE_MODEL_IMPLICIT_STEP_FEATURE_COUNT = PETRINET_NET_INITIALIZE_MODEL_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.Petrinet_Net_RunImpl <em>Petrinet Net Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.Petrinet_Net_RunImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_Run()
	 * @generated
	 */
	int PETRINET_NET_RUN = 3;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_RUN__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_RUN__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_RUN__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_RUN__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Petrinet Net Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_RUN_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.Petrinet_Net_Run_AbstractSubStep <em>Petrinet Net Run Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.Petrinet_Net_Run_AbstractSubStep
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_Run_AbstractSubStep()
	 * @generated
	 */
	int PETRINET_NET_RUN_ABSTRACT_SUB_STEP = 4;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_RUN_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_RUN_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_RUN_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Net Run Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.Petrinet_Net_Run_ImplicitStepImpl <em>Petrinet Net Run Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.Petrinet_Net_Run_ImplicitStepImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_Run_ImplicitStep()
	 * @generated
	 */
	int PETRINET_NET_RUN_IMPLICIT_STEP = 5;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_RUN_IMPLICIT_STEP__MSEOCCURRENCE = PETRINET_NET_RUN_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_RUN_IMPLICIT_STEP__ENDING_STATE = PETRINET_NET_RUN_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_RUN_IMPLICIT_STEP__STARTING_STATE = PETRINET_NET_RUN_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Net Run Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_RUN_IMPLICIT_STEP_FEATURE_COUNT = PETRINET_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.Petrinet_Place_AddTokenImpl <em>Petrinet Place Add Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.Petrinet_Place_AddTokenImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Place_AddToken()
	 * @generated
	 */
	int PETRINET_PLACE_ADD_TOKEN = 6;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_ADD_TOKEN__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_ADD_TOKEN__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_ADD_TOKEN__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_ADD_TOKEN__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Petrinet Place Add Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_ADD_TOKEN_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.Petrinet_Place_AddToken_AbstractSubStep <em>Petrinet Place Add Token Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.Petrinet_Place_AddToken_AbstractSubStep
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Place_AddToken_AbstractSubStep()
	 * @generated
	 */
	int PETRINET_PLACE_ADD_TOKEN_ABSTRACT_SUB_STEP = 7;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_ADD_TOKEN_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_ADD_TOKEN_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_ADD_TOKEN_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Place Add Token Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_ADD_TOKEN_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.Petrinet_Place_AddToken_ImplicitStepImpl <em>Petrinet Place Add Token Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.Petrinet_Place_AddToken_ImplicitStepImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Place_AddToken_ImplicitStep()
	 * @generated
	 */
	int PETRINET_PLACE_ADD_TOKEN_IMPLICIT_STEP = 8;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_ADD_TOKEN_IMPLICIT_STEP__MSEOCCURRENCE = PETRINET_PLACE_ADD_TOKEN_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_ADD_TOKEN_IMPLICIT_STEP__ENDING_STATE = PETRINET_PLACE_ADD_TOKEN_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_ADD_TOKEN_IMPLICIT_STEP__STARTING_STATE = PETRINET_PLACE_ADD_TOKEN_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Place Add Token Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_ADD_TOKEN_IMPLICIT_STEP_FEATURE_COUNT = PETRINET_PLACE_ADD_TOKEN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.Petrinet_Place_RemoveTokenImpl <em>Petrinet Place Remove Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.Petrinet_Place_RemoveTokenImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Place_RemoveToken()
	 * @generated
	 */
	int PETRINET_PLACE_REMOVE_TOKEN = 9;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_REMOVE_TOKEN__MSEOCCURRENCE = PETRINET_PLACE_ADD_TOKEN_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_REMOVE_TOKEN__ENDING_STATE = PETRINET_PLACE_ADD_TOKEN_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_REMOVE_TOKEN__STARTING_STATE = PETRINET_PLACE_ADD_TOKEN_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_REMOVE_TOKEN__SUB_STEPS = PETRINET_PLACE_ADD_TOKEN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Petrinet Place Remove Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_REMOVE_TOKEN_FEATURE_COUNT = PETRINET_PLACE_ADD_TOKEN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.Petrinet_Place_RemoveToken_AbstractSubStep <em>Petrinet Place Remove Token Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.Petrinet_Place_RemoveToken_AbstractSubStep
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Place_RemoveToken_AbstractSubStep()
	 * @generated
	 */
	int PETRINET_PLACE_REMOVE_TOKEN_ABSTRACT_SUB_STEP = 10;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_REMOVE_TOKEN_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_REMOVE_TOKEN_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_REMOVE_TOKEN_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Place Remove Token Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_REMOVE_TOKEN_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.Petrinet_Place_RemoveToken_ImplicitStepImpl <em>Petrinet Place Remove Token Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.Petrinet_Place_RemoveToken_ImplicitStepImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Place_RemoveToken_ImplicitStep()
	 * @generated
	 */
	int PETRINET_PLACE_REMOVE_TOKEN_IMPLICIT_STEP = 11;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_REMOVE_TOKEN_IMPLICIT_STEP__MSEOCCURRENCE = PETRINET_PLACE_REMOVE_TOKEN_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_REMOVE_TOKEN_IMPLICIT_STEP__ENDING_STATE = PETRINET_PLACE_REMOVE_TOKEN_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_REMOVE_TOKEN_IMPLICIT_STEP__STARTING_STATE = PETRINET_PLACE_REMOVE_TOKEN_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Place Remove Token Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_PLACE_REMOVE_TOKEN_IMPLICIT_STEP_FEATURE_COUNT = PETRINET_PLACE_REMOVE_TOKEN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.Petrinet_Transition_FireImpl <em>Petrinet Transition Fire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.Petrinet_Transition_FireImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Transition_Fire()
	 * @generated
	 */
	int PETRINET_TRANSITION_FIRE = 12;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_TRANSITION_FIRE__MSEOCCURRENCE = PETRINET_NET_RUN_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_TRANSITION_FIRE__ENDING_STATE = PETRINET_NET_RUN_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_TRANSITION_FIRE__STARTING_STATE = PETRINET_NET_RUN_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_TRANSITION_FIRE__SUB_STEPS = PETRINET_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Petrinet Transition Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_TRANSITION_FIRE_FEATURE_COUNT = PETRINET_NET_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.Petrinet_Transition_Fire_AbstractSubStep <em>Petrinet Transition Fire Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.Petrinet_Transition_Fire_AbstractSubStep
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Transition_Fire_AbstractSubStep()
	 * @generated
	 */
	int PETRINET_TRANSITION_FIRE_ABSTRACT_SUB_STEP = 13;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_TRANSITION_FIRE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_TRANSITION_FIRE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_TRANSITION_FIRE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Transition Fire Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_TRANSITION_FIRE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.Petrinet_Transition_Fire_ImplicitStepImpl <em>Petrinet Transition Fire Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.Petrinet_Transition_Fire_ImplicitStepImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Transition_Fire_ImplicitStep()
	 * @generated
	 */
	int PETRINET_TRANSITION_FIRE_IMPLICIT_STEP = 14;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_TRANSITION_FIRE_IMPLICIT_STEP__MSEOCCURRENCE = PETRINET_TRANSITION_FIRE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_TRANSITION_FIRE_IMPLICIT_STEP__ENDING_STATE = PETRINET_TRANSITION_FIRE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_TRANSITION_FIRE_IMPLICIT_STEP__STARTING_STATE = PETRINET_TRANSITION_FIRE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Transition Fire Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_TRANSITION_FIRE_IMPLICIT_STEP_FEATURE_COUNT = PETRINET_TRANSITION_FIRE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.RootImplicitStepImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 15;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSEOCCURRENCE = TracePackage.SMALL_STEP__MSEOCCURRENCE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = TracePackage.SMALL_STEP_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Net_InitializeModel <em>Petrinet Net Initialize Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Net Initialize Model</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Net_InitializeModel
	 * @generated
	 */
	EClass getPetrinet_Net_InitializeModel();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Net_InitializeModel_AbstractSubStep <em>Petrinet Net Initialize Model Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Net Initialize Model Abstract Sub Step</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Net_InitializeModel_AbstractSubStep
	 * @generated
	 */
	EClass getPetrinet_Net_InitializeModel_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Net_InitializeModel_ImplicitStep <em>Petrinet Net Initialize Model Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Net Initialize Model Implicit Step</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Net_InitializeModel_ImplicitStep
	 * @generated
	 */
	EClass getPetrinet_Net_InitializeModel_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Net_Run <em>Petrinet Net Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Net Run</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Net_Run
	 * @generated
	 */
	EClass getPetrinet_Net_Run();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Net_Run_AbstractSubStep <em>Petrinet Net Run Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Net Run Abstract Sub Step</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Net_Run_AbstractSubStep
	 * @generated
	 */
	EClass getPetrinet_Net_Run_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Net_Run_ImplicitStep <em>Petrinet Net Run Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Net Run Implicit Step</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Net_Run_ImplicitStep
	 * @generated
	 */
	EClass getPetrinet_Net_Run_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Place_AddToken <em>Petrinet Place Add Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Place Add Token</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Place_AddToken
	 * @generated
	 */
	EClass getPetrinet_Place_AddToken();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Place_AddToken_AbstractSubStep <em>Petrinet Place Add Token Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Place Add Token Abstract Sub Step</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Place_AddToken_AbstractSubStep
	 * @generated
	 */
	EClass getPetrinet_Place_AddToken_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Place_AddToken_ImplicitStep <em>Petrinet Place Add Token Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Place Add Token Implicit Step</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Place_AddToken_ImplicitStep
	 * @generated
	 */
	EClass getPetrinet_Place_AddToken_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Place_RemoveToken <em>Petrinet Place Remove Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Place Remove Token</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Place_RemoveToken
	 * @generated
	 */
	EClass getPetrinet_Place_RemoveToken();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Place_RemoveToken_AbstractSubStep <em>Petrinet Place Remove Token Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Place Remove Token Abstract Sub Step</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Place_RemoveToken_AbstractSubStep
	 * @generated
	 */
	EClass getPetrinet_Place_RemoveToken_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Place_RemoveToken_ImplicitStep <em>Petrinet Place Remove Token Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Place Remove Token Implicit Step</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Place_RemoveToken_ImplicitStep
	 * @generated
	 */
	EClass getPetrinet_Place_RemoveToken_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Transition_Fire <em>Petrinet Transition Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Transition Fire</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Transition_Fire
	 * @generated
	 */
	EClass getPetrinet_Transition_Fire();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Transition_Fire_AbstractSubStep <em>Petrinet Transition Fire Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Transition Fire Abstract Sub Step</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Transition_Fire_AbstractSubStep
	 * @generated
	 */
	EClass getPetrinet_Transition_Fire_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Transition_Fire_ImplicitStep <em>Petrinet Transition Fire Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Transition Fire Implicit Step</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Transition_Fire_ImplicitStep
	 * @generated
	 */
	EClass getPetrinet_Transition_Fire_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Implicit Step</em>'.
	 * @see petrinetTrace.Steps.RootImplicitStep
	 * @generated
	 */
	EClass getRootImplicitStep();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Step</em>'.
	 * @see petrinetTrace.Steps.SpecificStep
	 * @generated
	 */
	EClass getSpecificStep();

	/**
	 * Returns the meta object for the reference '{@link petrinetTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ending State</em>'.
	 * @see petrinetTrace.Steps.SpecificStep#getEndingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_EndingState();

	/**
	 * Returns the meta object for the reference '{@link petrinetTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting State</em>'.
	 * @see petrinetTrace.Steps.SpecificStep#getStartingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_StartingState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StepsFactory getStepsFactory();

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
		 * The meta object literal for the '{@link petrinetTrace.Steps.impl.Petrinet_Net_InitializeModelImpl <em>Petrinet Net Initialize Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.impl.Petrinet_Net_InitializeModelImpl
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_InitializeModel()
		 * @generated
		 */
		EClass PETRINET_NET_INITIALIZE_MODEL = eINSTANCE.getPetrinet_Net_InitializeModel();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.Petrinet_Net_InitializeModel_AbstractSubStep <em>Petrinet Net Initialize Model Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.Petrinet_Net_InitializeModel_AbstractSubStep
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_InitializeModel_AbstractSubStep()
		 * @generated
		 */
		EClass PETRINET_NET_INITIALIZE_MODEL_ABSTRACT_SUB_STEP = eINSTANCE.getPetrinet_Net_InitializeModel_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.impl.Petrinet_Net_InitializeModel_ImplicitStepImpl <em>Petrinet Net Initialize Model Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.impl.Petrinet_Net_InitializeModel_ImplicitStepImpl
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_InitializeModel_ImplicitStep()
		 * @generated
		 */
		EClass PETRINET_NET_INITIALIZE_MODEL_IMPLICIT_STEP = eINSTANCE.getPetrinet_Net_InitializeModel_ImplicitStep();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.impl.Petrinet_Net_RunImpl <em>Petrinet Net Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.impl.Petrinet_Net_RunImpl
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_Run()
		 * @generated
		 */
		EClass PETRINET_NET_RUN = eINSTANCE.getPetrinet_Net_Run();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.Petrinet_Net_Run_AbstractSubStep <em>Petrinet Net Run Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.Petrinet_Net_Run_AbstractSubStep
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_Run_AbstractSubStep()
		 * @generated
		 */
		EClass PETRINET_NET_RUN_ABSTRACT_SUB_STEP = eINSTANCE.getPetrinet_Net_Run_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.impl.Petrinet_Net_Run_ImplicitStepImpl <em>Petrinet Net Run Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.impl.Petrinet_Net_Run_ImplicitStepImpl
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_Run_ImplicitStep()
		 * @generated
		 */
		EClass PETRINET_NET_RUN_IMPLICIT_STEP = eINSTANCE.getPetrinet_Net_Run_ImplicitStep();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.impl.Petrinet_Place_AddTokenImpl <em>Petrinet Place Add Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.impl.Petrinet_Place_AddTokenImpl
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Place_AddToken()
		 * @generated
		 */
		EClass PETRINET_PLACE_ADD_TOKEN = eINSTANCE.getPetrinet_Place_AddToken();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.Petrinet_Place_AddToken_AbstractSubStep <em>Petrinet Place Add Token Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.Petrinet_Place_AddToken_AbstractSubStep
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Place_AddToken_AbstractSubStep()
		 * @generated
		 */
		EClass PETRINET_PLACE_ADD_TOKEN_ABSTRACT_SUB_STEP = eINSTANCE.getPetrinet_Place_AddToken_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.impl.Petrinet_Place_AddToken_ImplicitStepImpl <em>Petrinet Place Add Token Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.impl.Petrinet_Place_AddToken_ImplicitStepImpl
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Place_AddToken_ImplicitStep()
		 * @generated
		 */
		EClass PETRINET_PLACE_ADD_TOKEN_IMPLICIT_STEP = eINSTANCE.getPetrinet_Place_AddToken_ImplicitStep();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.impl.Petrinet_Place_RemoveTokenImpl <em>Petrinet Place Remove Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.impl.Petrinet_Place_RemoveTokenImpl
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Place_RemoveToken()
		 * @generated
		 */
		EClass PETRINET_PLACE_REMOVE_TOKEN = eINSTANCE.getPetrinet_Place_RemoveToken();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.Petrinet_Place_RemoveToken_AbstractSubStep <em>Petrinet Place Remove Token Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.Petrinet_Place_RemoveToken_AbstractSubStep
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Place_RemoveToken_AbstractSubStep()
		 * @generated
		 */
		EClass PETRINET_PLACE_REMOVE_TOKEN_ABSTRACT_SUB_STEP = eINSTANCE.getPetrinet_Place_RemoveToken_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.impl.Petrinet_Place_RemoveToken_ImplicitStepImpl <em>Petrinet Place Remove Token Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.impl.Petrinet_Place_RemoveToken_ImplicitStepImpl
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Place_RemoveToken_ImplicitStep()
		 * @generated
		 */
		EClass PETRINET_PLACE_REMOVE_TOKEN_IMPLICIT_STEP = eINSTANCE.getPetrinet_Place_RemoveToken_ImplicitStep();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.impl.Petrinet_Transition_FireImpl <em>Petrinet Transition Fire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.impl.Petrinet_Transition_FireImpl
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Transition_Fire()
		 * @generated
		 */
		EClass PETRINET_TRANSITION_FIRE = eINSTANCE.getPetrinet_Transition_Fire();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.Petrinet_Transition_Fire_AbstractSubStep <em>Petrinet Transition Fire Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.Petrinet_Transition_Fire_AbstractSubStep
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Transition_Fire_AbstractSubStep()
		 * @generated
		 */
		EClass PETRINET_TRANSITION_FIRE_ABSTRACT_SUB_STEP = eINSTANCE.getPetrinet_Transition_Fire_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.impl.Petrinet_Transition_Fire_ImplicitStepImpl <em>Petrinet Transition Fire Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.impl.Petrinet_Transition_Fire_ImplicitStepImpl
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Transition_Fire_ImplicitStep()
		 * @generated
		 */
		EClass PETRINET_TRANSITION_FIRE_IMPLICIT_STEP = eINSTANCE.getPetrinet_Transition_Fire_ImplicitStep();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.impl.RootImplicitStepImpl
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.SpecificStep
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
		 * @generated
		 */
		EClass SPECIFIC_STEP = eINSTANCE.getSpecificStep();

		/**
		 * The meta object literal for the '<em><b>Ending State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__ENDING_STATE = eINSTANCE.getSpecificStep_EndingState();

		/**
		 * The meta object literal for the '<em><b>Starting State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__STARTING_STATE = eINSTANCE.getSpecificStep_StartingState();

	}

} //StepsPackage
