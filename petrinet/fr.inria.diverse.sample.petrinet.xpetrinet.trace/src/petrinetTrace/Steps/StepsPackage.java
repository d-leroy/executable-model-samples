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
	int SPECIFIC_STEP = 13;

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
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.Petrinet_Net_FireEnabledTransitionImpl <em>Petrinet Net Fire Enabled Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.Petrinet_Net_FireEnabledTransitionImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_FireEnabledTransition()
	 * @generated
	 */
	int PETRINET_NET_FIRE_ENABLED_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_FIRE_ENABLED_TRANSITION__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_FIRE_ENABLED_TRANSITION__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_FIRE_ENABLED_TRANSITION__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_FIRE_ENABLED_TRANSITION__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Petrinet Net Fire Enabled Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_FIRE_ENABLED_TRANSITION_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition_AbstractSubStep <em>Petrinet Net Fire Enabled Transition Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition_AbstractSubStep
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_FireEnabledTransition_AbstractSubStep()
	 * @generated
	 */
	int PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP = 1;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Net Fire Enabled Transition Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.Petrinet_Net_FireEnabledTransition_ImplicitStepImpl <em>Petrinet Net Fire Enabled Transition Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.Petrinet_Net_FireEnabledTransition_ImplicitStepImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_FireEnabledTransition_ImplicitStep()
	 * @generated
	 */
	int PETRINET_NET_FIRE_ENABLED_TRANSITION_IMPLICIT_STEP = 2;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_FIRE_ENABLED_TRANSITION_IMPLICIT_STEP__MSEOCCURRENCE = PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_FIRE_ENABLED_TRANSITION_IMPLICIT_STEP__ENDING_STATE = PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_FIRE_ENABLED_TRANSITION_IMPLICIT_STEP__STARTING_STATE = PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Net Fire Enabled Transition Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_FIRE_ENABLED_TRANSITION_IMPLICIT_STEP_FEATURE_COUNT = PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.Petrinet_Net_InitializeModelImpl <em>Petrinet Net Initialize Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.Petrinet_Net_InitializeModelImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_InitializeModel()
	 * @generated
	 */
	int PETRINET_NET_INITIALIZE_MODEL = 3;

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
	int PETRINET_NET_INITIALIZE_MODEL_ABSTRACT_SUB_STEP = 4;

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
	int PETRINET_NET_INITIALIZE_MODEL_IMPLICIT_STEP = 5;

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
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.Petrinet_Net_StopImpl <em>Petrinet Net Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.Petrinet_Net_StopImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_Stop()
	 * @generated
	 */
	int PETRINET_NET_STOP = 6;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_STOP__MSEOCCURRENCE = PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_STOP__ENDING_STATE = PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_STOP__STARTING_STATE = PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_STOP__SUB_STEPS = PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Petrinet Net Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_STOP_FEATURE_COUNT = PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.Petrinet_Net_Stop_AbstractSubStep <em>Petrinet Net Stop Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.Petrinet_Net_Stop_AbstractSubStep
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_Stop_AbstractSubStep()
	 * @generated
	 */
	int PETRINET_NET_STOP_ABSTRACT_SUB_STEP = 7;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_STOP_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_STOP_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_STOP_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Net Stop Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_STOP_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.Petrinet_Net_Stop_ImplicitStepImpl <em>Petrinet Net Stop Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.Petrinet_Net_Stop_ImplicitStepImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_Stop_ImplicitStep()
	 * @generated
	 */
	int PETRINET_NET_STOP_IMPLICIT_STEP = 8;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_STOP_IMPLICIT_STEP__MSEOCCURRENCE = PETRINET_NET_STOP_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_STOP_IMPLICIT_STEP__ENDING_STATE = PETRINET_NET_STOP_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_STOP_IMPLICIT_STEP__STARTING_STATE = PETRINET_NET_STOP_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Petrinet Net Stop Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_NET_STOP_IMPLICIT_STEP_FEATURE_COUNT = PETRINET_NET_STOP_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.impl.Petrinet_Transition_FireImpl <em>Petrinet Transition Fire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.impl.Petrinet_Transition_FireImpl
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Transition_Fire()
	 * @generated
	 */
	int PETRINET_TRANSITION_FIRE = 9;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_TRANSITION_FIRE__MSEOCCURRENCE = PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_TRANSITION_FIRE__ENDING_STATE = PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_TRANSITION_FIRE__STARTING_STATE = PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_TRANSITION_FIRE__SUB_STEPS = PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Petrinet Transition Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_TRANSITION_FIRE_FEATURE_COUNT = PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link petrinetTrace.Steps.Petrinet_Transition_Fire_AbstractSubStep <em>Petrinet Transition Fire Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetTrace.Steps.Petrinet_Transition_Fire_AbstractSubStep
	 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Transition_Fire_AbstractSubStep()
	 * @generated
	 */
	int PETRINET_TRANSITION_FIRE_ABSTRACT_SUB_STEP = 10;

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
	int PETRINET_TRANSITION_FIRE_IMPLICIT_STEP = 11;

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
	int ROOT_IMPLICIT_STEP = 12;

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
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition <em>Petrinet Net Fire Enabled Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Net Fire Enabled Transition</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition
	 * @generated
	 */
	EClass getPetrinet_Net_FireEnabledTransition();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition_AbstractSubStep <em>Petrinet Net Fire Enabled Transition Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Net Fire Enabled Transition Abstract Sub Step</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition_AbstractSubStep
	 * @generated
	 */
	EClass getPetrinet_Net_FireEnabledTransition_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition_ImplicitStep <em>Petrinet Net Fire Enabled Transition Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Net Fire Enabled Transition Implicit Step</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition_ImplicitStep
	 * @generated
	 */
	EClass getPetrinet_Net_FireEnabledTransition_ImplicitStep();

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
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Net_Stop <em>Petrinet Net Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Net Stop</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Net_Stop
	 * @generated
	 */
	EClass getPetrinet_Net_Stop();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Net_Stop_AbstractSubStep <em>Petrinet Net Stop Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Net Stop Abstract Sub Step</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Net_Stop_AbstractSubStep
	 * @generated
	 */
	EClass getPetrinet_Net_Stop_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link petrinetTrace.Steps.Petrinet_Net_Stop_ImplicitStep <em>Petrinet Net Stop Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet Net Stop Implicit Step</em>'.
	 * @see petrinetTrace.Steps.Petrinet_Net_Stop_ImplicitStep
	 * @generated
	 */
	EClass getPetrinet_Net_Stop_ImplicitStep();

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
		 * The meta object literal for the '{@link petrinetTrace.Steps.impl.Petrinet_Net_FireEnabledTransitionImpl <em>Petrinet Net Fire Enabled Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.impl.Petrinet_Net_FireEnabledTransitionImpl
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_FireEnabledTransition()
		 * @generated
		 */
		EClass PETRINET_NET_FIRE_ENABLED_TRANSITION = eINSTANCE.getPetrinet_Net_FireEnabledTransition();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition_AbstractSubStep <em>Petrinet Net Fire Enabled Transition Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition_AbstractSubStep
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_FireEnabledTransition_AbstractSubStep()
		 * @generated
		 */
		EClass PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP = eINSTANCE.getPetrinet_Net_FireEnabledTransition_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.impl.Petrinet_Net_FireEnabledTransition_ImplicitStepImpl <em>Petrinet Net Fire Enabled Transition Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.impl.Petrinet_Net_FireEnabledTransition_ImplicitStepImpl
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_FireEnabledTransition_ImplicitStep()
		 * @generated
		 */
		EClass PETRINET_NET_FIRE_ENABLED_TRANSITION_IMPLICIT_STEP = eINSTANCE.getPetrinet_Net_FireEnabledTransition_ImplicitStep();

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
		 * The meta object literal for the '{@link petrinetTrace.Steps.impl.Petrinet_Net_StopImpl <em>Petrinet Net Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.impl.Petrinet_Net_StopImpl
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_Stop()
		 * @generated
		 */
		EClass PETRINET_NET_STOP = eINSTANCE.getPetrinet_Net_Stop();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.Petrinet_Net_Stop_AbstractSubStep <em>Petrinet Net Stop Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.Petrinet_Net_Stop_AbstractSubStep
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_Stop_AbstractSubStep()
		 * @generated
		 */
		EClass PETRINET_NET_STOP_ABSTRACT_SUB_STEP = eINSTANCE.getPetrinet_Net_Stop_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link petrinetTrace.Steps.impl.Petrinet_Net_Stop_ImplicitStepImpl <em>Petrinet Net Stop Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetTrace.Steps.impl.Petrinet_Net_Stop_ImplicitStepImpl
		 * @see petrinetTrace.Steps.impl.StepsPackageImpl#getPetrinet_Net_Stop_ImplicitStep()
		 * @generated
		 */
		EClass PETRINET_NET_STOP_IMPLICIT_STEP = eINSTANCE.getPetrinet_Net_Stop_ImplicitStep();

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
