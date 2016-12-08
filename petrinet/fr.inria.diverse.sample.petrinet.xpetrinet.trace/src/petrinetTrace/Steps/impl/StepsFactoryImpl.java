/**
 */
package petrinetTrace.Steps.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import petrinetTrace.Steps.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsFactoryImpl extends EFactoryImpl implements StepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepsFactory init() {
		try {
			StepsFactory theStepsFactory = (StepsFactory)EPackage.Registry.INSTANCE.getEFactory(StepsPackage.eNS_URI);
			if (theStepsFactory != null) {
				return theStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StepsPackage.PETRINET_NET_FIRE_ENABLED_TRANSITION: return createPetrinet_Net_FireEnabledTransition();
			case StepsPackage.PETRINET_NET_FIRE_ENABLED_TRANSITION_IMPLICIT_STEP: return createPetrinet_Net_FireEnabledTransition_ImplicitStep();
			case StepsPackage.PETRINET_NET_INITIALIZE_MODEL: return createPetrinet_Net_InitializeModel();
			case StepsPackage.PETRINET_NET_INITIALIZE_MODEL_IMPLICIT_STEP: return createPetrinet_Net_InitializeModel_ImplicitStep();
			case StepsPackage.PETRINET_NET_STOP: return createPetrinet_Net_Stop();
			case StepsPackage.PETRINET_NET_STOP_IMPLICIT_STEP: return createPetrinet_Net_Stop_ImplicitStep();
			case StepsPackage.PETRINET_PLACE_ADD_TOKEN: return createPetrinet_Place_AddToken();
			case StepsPackage.PETRINET_PLACE_ADD_TOKEN_IMPLICIT_STEP: return createPetrinet_Place_AddToken_ImplicitStep();
			case StepsPackage.PETRINET_PLACE_REMOVE_TOKEN: return createPetrinet_Place_RemoveToken();
			case StepsPackage.PETRINET_PLACE_REMOVE_TOKEN_IMPLICIT_STEP: return createPetrinet_Place_RemoveToken_ImplicitStep();
			case StepsPackage.PETRINET_TRANSITION_FIRE: return createPetrinet_Transition_Fire();
			case StepsPackage.PETRINET_TRANSITION_FIRE_IMPLICIT_STEP: return createPetrinet_Transition_Fire_ImplicitStep();
			case StepsPackage.ROOT_IMPLICIT_STEP: return createRootImplicitStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinet_Net_FireEnabledTransition createPetrinet_Net_FireEnabledTransition() {
		Petrinet_Net_FireEnabledTransitionImpl petrinet_Net_FireEnabledTransition = new Petrinet_Net_FireEnabledTransitionImpl();
		return petrinet_Net_FireEnabledTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinet_Net_FireEnabledTransition_ImplicitStep createPetrinet_Net_FireEnabledTransition_ImplicitStep() {
		Petrinet_Net_FireEnabledTransition_ImplicitStepImpl petrinet_Net_FireEnabledTransition_ImplicitStep = new Petrinet_Net_FireEnabledTransition_ImplicitStepImpl();
		return petrinet_Net_FireEnabledTransition_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinet_Net_InitializeModel createPetrinet_Net_InitializeModel() {
		Petrinet_Net_InitializeModelImpl petrinet_Net_InitializeModel = new Petrinet_Net_InitializeModelImpl();
		return petrinet_Net_InitializeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinet_Net_InitializeModel_ImplicitStep createPetrinet_Net_InitializeModel_ImplicitStep() {
		Petrinet_Net_InitializeModel_ImplicitStepImpl petrinet_Net_InitializeModel_ImplicitStep = new Petrinet_Net_InitializeModel_ImplicitStepImpl();
		return petrinet_Net_InitializeModel_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinet_Net_Stop createPetrinet_Net_Stop() {
		Petrinet_Net_StopImpl petrinet_Net_Stop = new Petrinet_Net_StopImpl();
		return petrinet_Net_Stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinet_Net_Stop_ImplicitStep createPetrinet_Net_Stop_ImplicitStep() {
		Petrinet_Net_Stop_ImplicitStepImpl petrinet_Net_Stop_ImplicitStep = new Petrinet_Net_Stop_ImplicitStepImpl();
		return petrinet_Net_Stop_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinet_Place_AddToken createPetrinet_Place_AddToken() {
		Petrinet_Place_AddTokenImpl petrinet_Place_AddToken = new Petrinet_Place_AddTokenImpl();
		return petrinet_Place_AddToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinet_Place_AddToken_ImplicitStep createPetrinet_Place_AddToken_ImplicitStep() {
		Petrinet_Place_AddToken_ImplicitStepImpl petrinet_Place_AddToken_ImplicitStep = new Petrinet_Place_AddToken_ImplicitStepImpl();
		return petrinet_Place_AddToken_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinet_Place_RemoveToken createPetrinet_Place_RemoveToken() {
		Petrinet_Place_RemoveTokenImpl petrinet_Place_RemoveToken = new Petrinet_Place_RemoveTokenImpl();
		return petrinet_Place_RemoveToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinet_Place_RemoveToken_ImplicitStep createPetrinet_Place_RemoveToken_ImplicitStep() {
		Petrinet_Place_RemoveToken_ImplicitStepImpl petrinet_Place_RemoveToken_ImplicitStep = new Petrinet_Place_RemoveToken_ImplicitStepImpl();
		return petrinet_Place_RemoveToken_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinet_Transition_Fire createPetrinet_Transition_Fire() {
		Petrinet_Transition_FireImpl petrinet_Transition_Fire = new Petrinet_Transition_FireImpl();
		return petrinet_Transition_Fire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinet_Transition_Fire_ImplicitStep createPetrinet_Transition_Fire_ImplicitStep() {
		Petrinet_Transition_Fire_ImplicitStepImpl petrinet_Transition_Fire_ImplicitStep = new Petrinet_Transition_Fire_ImplicitStepImpl();
		return petrinet_Transition_Fire_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootImplicitStep createRootImplicitStep() {
		RootImplicitStepImpl rootImplicitStep = new RootImplicitStepImpl();
		return rootImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsPackage getStepsPackage() {
		return (StepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StepsPackage getPackage() {
		return StepsPackage.eINSTANCE;
	}

} //StepsFactoryImpl
