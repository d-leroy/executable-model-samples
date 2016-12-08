/**
 */
package petrinetTrace.Steps.impl;

import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import petrinetTrace.PetrinetTracePackage;

import petrinetTrace.States.StatesPackage;

import petrinetTrace.States.impl.StatesPackageImpl;

import petrinetTrace.States.petrinet.impl.PetrinetPackageImpl;

import petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition;
import petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition_AbstractSubStep;
import petrinetTrace.Steps.Petrinet_Net_FireEnabledTransition_ImplicitStep;
import petrinetTrace.Steps.Petrinet_Net_InitializeModel;
import petrinetTrace.Steps.Petrinet_Net_InitializeModel_AbstractSubStep;
import petrinetTrace.Steps.Petrinet_Net_InitializeModel_ImplicitStep;
import petrinetTrace.Steps.Petrinet_Net_Stop;
import petrinetTrace.Steps.Petrinet_Net_Stop_AbstractSubStep;
import petrinetTrace.Steps.Petrinet_Net_Stop_ImplicitStep;
import petrinetTrace.Steps.Petrinet_Place_AddToken;
import petrinetTrace.Steps.Petrinet_Place_AddToken_AbstractSubStep;
import petrinetTrace.Steps.Petrinet_Place_AddToken_ImplicitStep;
import petrinetTrace.Steps.Petrinet_Place_RemoveToken;
import petrinetTrace.Steps.Petrinet_Place_RemoveToken_AbstractSubStep;
import petrinetTrace.Steps.Petrinet_Place_RemoveToken_ImplicitStep;
import petrinetTrace.Steps.Petrinet_Transition_Fire;
import petrinetTrace.Steps.Petrinet_Transition_Fire_AbstractSubStep;
import petrinetTrace.Steps.Petrinet_Transition_Fire_ImplicitStep;
import petrinetTrace.Steps.RootImplicitStep;
import petrinetTrace.Steps.SpecificStep;
import petrinetTrace.Steps.StepsFactory;
import petrinetTrace.Steps.StepsPackage;

import petrinetTrace.impl.PetrinetTracePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsPackageImpl extends EPackageImpl implements StepsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinet_Net_FireEnabledTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinet_Net_FireEnabledTransition_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinet_Net_FireEnabledTransition_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinet_Net_InitializeModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinet_Net_InitializeModel_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinet_Net_InitializeModel_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinet_Net_StopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinet_Net_Stop_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinet_Net_Stop_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinet_Place_AddTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinet_Place_AddToken_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinet_Place_AddToken_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinet_Place_RemoveTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinet_Place_RemoveToken_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinet_Place_RemoveToken_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinet_Transition_FireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinet_Transition_Fire_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinet_Transition_Fire_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificStepEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see petrinetTrace.Steps.StepsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StepsPackageImpl() {
		super(eNS_URI, StepsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StepsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StepsPackage init() {
		if (isInited) return (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Obtain or create and register package
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StepsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		PetrinetPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PetrinetTracePackageImpl thePetrinetTracePackage = (PetrinetTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PetrinetTracePackage.eNS_URI) instanceof PetrinetTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PetrinetTracePackage.eNS_URI) : PetrinetTracePackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		PetrinetPackageImpl thePetrinetPackage_1 = (PetrinetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(petrinetTrace.States.petrinet.PetrinetPackage.eNS_URI) instanceof PetrinetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(petrinetTrace.States.petrinet.PetrinetPackage.eNS_URI) : petrinetTrace.States.petrinet.PetrinetPackage.eINSTANCE);

		// Create package meta-data objects
		theStepsPackage.createPackageContents();
		thePetrinetTracePackage.createPackageContents();
		theStatesPackage.createPackageContents();
		thePetrinetPackage_1.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		thePetrinetTracePackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		thePetrinetPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStepsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StepsPackage.eNS_URI, theStepsPackage);
		return theStepsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinet_Net_FireEnabledTransition() {
		return petrinet_Net_FireEnabledTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinet_Net_FireEnabledTransition_AbstractSubStep() {
		return petrinet_Net_FireEnabledTransition_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinet_Net_FireEnabledTransition_ImplicitStep() {
		return petrinet_Net_FireEnabledTransition_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinet_Net_InitializeModel() {
		return petrinet_Net_InitializeModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinet_Net_InitializeModel_AbstractSubStep() {
		return petrinet_Net_InitializeModel_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinet_Net_InitializeModel_ImplicitStep() {
		return petrinet_Net_InitializeModel_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinet_Net_Stop() {
		return petrinet_Net_StopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinet_Net_Stop_AbstractSubStep() {
		return petrinet_Net_Stop_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinet_Net_Stop_ImplicitStep() {
		return petrinet_Net_Stop_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinet_Place_AddToken() {
		return petrinet_Place_AddTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinet_Place_AddToken_AbstractSubStep() {
		return petrinet_Place_AddToken_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinet_Place_AddToken_ImplicitStep() {
		return petrinet_Place_AddToken_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinet_Place_RemoveToken() {
		return petrinet_Place_RemoveTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinet_Place_RemoveToken_AbstractSubStep() {
		return petrinet_Place_RemoveToken_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinet_Place_RemoveToken_ImplicitStep() {
		return petrinet_Place_RemoveToken_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinet_Transition_Fire() {
		return petrinet_Transition_FireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinet_Transition_Fire_AbstractSubStep() {
		return petrinet_Transition_Fire_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinet_Transition_Fire_ImplicitStep() {
		return petrinet_Transition_Fire_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootImplicitStep() {
		return rootImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificStep() {
		return specificStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_EndingState() {
		return (EReference)specificStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_StartingState() {
		return (EReference)specificStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactory getStepsFactory() {
		return (StepsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		petrinet_Net_FireEnabledTransitionEClass = createEClass(PETRINET_NET_FIRE_ENABLED_TRANSITION);

		petrinet_Net_FireEnabledTransition_AbstractSubStepEClass = createEClass(PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP);

		petrinet_Net_FireEnabledTransition_ImplicitStepEClass = createEClass(PETRINET_NET_FIRE_ENABLED_TRANSITION_IMPLICIT_STEP);

		petrinet_Net_InitializeModelEClass = createEClass(PETRINET_NET_INITIALIZE_MODEL);

		petrinet_Net_InitializeModel_AbstractSubStepEClass = createEClass(PETRINET_NET_INITIALIZE_MODEL_ABSTRACT_SUB_STEP);

		petrinet_Net_InitializeModel_ImplicitStepEClass = createEClass(PETRINET_NET_INITIALIZE_MODEL_IMPLICIT_STEP);

		petrinet_Net_StopEClass = createEClass(PETRINET_NET_STOP);

		petrinet_Net_Stop_AbstractSubStepEClass = createEClass(PETRINET_NET_STOP_ABSTRACT_SUB_STEP);

		petrinet_Net_Stop_ImplicitStepEClass = createEClass(PETRINET_NET_STOP_IMPLICIT_STEP);

		petrinet_Place_AddTokenEClass = createEClass(PETRINET_PLACE_ADD_TOKEN);

		petrinet_Place_AddToken_AbstractSubStepEClass = createEClass(PETRINET_PLACE_ADD_TOKEN_ABSTRACT_SUB_STEP);

		petrinet_Place_AddToken_ImplicitStepEClass = createEClass(PETRINET_PLACE_ADD_TOKEN_IMPLICIT_STEP);

		petrinet_Place_RemoveTokenEClass = createEClass(PETRINET_PLACE_REMOVE_TOKEN);

		petrinet_Place_RemoveToken_AbstractSubStepEClass = createEClass(PETRINET_PLACE_REMOVE_TOKEN_ABSTRACT_SUB_STEP);

		petrinet_Place_RemoveToken_ImplicitStepEClass = createEClass(PETRINET_PLACE_REMOVE_TOKEN_IMPLICIT_STEP);

		petrinet_Transition_FireEClass = createEClass(PETRINET_TRANSITION_FIRE);

		petrinet_Transition_Fire_AbstractSubStepEClass = createEClass(PETRINET_TRANSITION_FIRE_ABSTRACT_SUB_STEP);

		petrinet_Transition_Fire_ImplicitStepEClass = createEClass(PETRINET_TRANSITION_FIRE_IMPLICIT_STEP);

		rootImplicitStepEClass = createEClass(ROOT_IMPLICIT_STEP);

		specificStepEClass = createEClass(SPECIFIC_STEP);
		createEReference(specificStepEClass, SPECIFIC_STEP__ENDING_STATE);
		createEReference(specificStepEClass, SPECIFIC_STEP__STARTING_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		PetrinetPackage thePetrinetPackage = (PetrinetPackage)EPackage.Registry.INSTANCE.getEPackage(PetrinetPackage.eNS_URI);
		petrinetTrace.States.petrinet.PetrinetPackage thePetrinetPackage_1 = (petrinetTrace.States.petrinet.PetrinetPackage)EPackage.Registry.INSTANCE.getEPackage(petrinetTrace.States.petrinet.PetrinetPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getSpecificStep());
		petrinet_Net_FireEnabledTransitionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		EGenericType g2 = createEGenericType(this.getPetrinet_Net_FireEnabledTransition_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		petrinet_Net_FireEnabledTransitionEClass.getEGenericSuperTypes().add(g1);
		petrinet_Net_FireEnabledTransition_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		petrinet_Net_FireEnabledTransition_ImplicitStepEClass.getESuperTypes().add(this.getPetrinet_Net_FireEnabledTransition_AbstractSubStep());
		petrinet_Net_FireEnabledTransition_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getSpecificStep());
		petrinet_Net_InitializeModelEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getPetrinet_Net_InitializeModel_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		petrinet_Net_InitializeModelEClass.getEGenericSuperTypes().add(g1);
		petrinet_Net_InitializeModel_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		petrinet_Net_InitializeModel_ImplicitStepEClass.getESuperTypes().add(this.getPetrinet_Net_InitializeModel_AbstractSubStep());
		petrinet_Net_InitializeModel_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getPetrinet_Net_FireEnabledTransition_AbstractSubStep());
		petrinet_Net_StopEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPetrinet_Place_AddToken_AbstractSubStep());
		petrinet_Net_StopEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPetrinet_Place_RemoveToken_AbstractSubStep());
		petrinet_Net_StopEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		petrinet_Net_StopEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getPetrinet_Net_Stop_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		petrinet_Net_StopEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPetrinet_Net_Stop_AbstractSubStep());
		petrinet_Net_StopEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPetrinet_Transition_Fire_AbstractSubStep());
		petrinet_Net_StopEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPetrinet_Net_InitializeModel_AbstractSubStep());
		petrinet_Net_StopEClass.getEGenericSuperTypes().add(g1);
		petrinet_Net_Stop_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		petrinet_Net_Stop_ImplicitStepEClass.getESuperTypes().add(this.getPetrinet_Net_Stop_AbstractSubStep());
		petrinet_Net_Stop_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getPetrinet_Net_FireEnabledTransition_AbstractSubStep());
		petrinet_Place_AddTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		petrinet_Place_AddTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getPetrinet_Place_AddToken_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		petrinet_Place_AddTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPetrinet_Place_AddToken_AbstractSubStep());
		petrinet_Place_AddTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPetrinet_Place_RemoveToken_AbstractSubStep());
		petrinet_Place_AddTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPetrinet_Net_Stop_AbstractSubStep());
		petrinet_Place_AddTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPetrinet_Transition_Fire_AbstractSubStep());
		petrinet_Place_AddTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPetrinet_Net_InitializeModel_AbstractSubStep());
		petrinet_Place_AddTokenEClass.getEGenericSuperTypes().add(g1);
		petrinet_Place_AddToken_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		petrinet_Place_AddToken_ImplicitStepEClass.getESuperTypes().add(this.getPetrinet_Place_AddToken_AbstractSubStep());
		petrinet_Place_AddToken_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getPetrinet_Net_FireEnabledTransition_AbstractSubStep());
		petrinet_Place_RemoveTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPetrinet_Place_AddToken_AbstractSubStep());
		petrinet_Place_RemoveTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		petrinet_Place_RemoveTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getPetrinet_Place_RemoveToken_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		petrinet_Place_RemoveTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPetrinet_Place_RemoveToken_AbstractSubStep());
		petrinet_Place_RemoveTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPetrinet_Net_Stop_AbstractSubStep());
		petrinet_Place_RemoveTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPetrinet_Transition_Fire_AbstractSubStep());
		petrinet_Place_RemoveTokenEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPetrinet_Net_InitializeModel_AbstractSubStep());
		petrinet_Place_RemoveTokenEClass.getEGenericSuperTypes().add(g1);
		petrinet_Place_RemoveToken_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		petrinet_Place_RemoveToken_ImplicitStepEClass.getESuperTypes().add(this.getPetrinet_Place_RemoveToken_AbstractSubStep());
		petrinet_Place_RemoveToken_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getPetrinet_Net_FireEnabledTransition_AbstractSubStep());
		petrinet_Transition_FireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		petrinet_Transition_FireEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getPetrinet_Transition_Fire_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		petrinet_Transition_FireEClass.getEGenericSuperTypes().add(g1);
		petrinet_Transition_Fire_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		petrinet_Transition_Fire_ImplicitStepEClass.getESuperTypes().add(this.getPetrinet_Transition_Fire_AbstractSubStep());
		petrinet_Transition_Fire_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		rootImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		specificStepEClass.getESuperTypes().add(theTracePackage.getStep());

		// Initialize classes and features; add operations and parameters
		initEClass(petrinet_Net_FireEnabledTransitionEClass, Petrinet_Net_FireEnabledTransition.class, "Petrinet_Net_FireEnabledTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(petrinet_Net_FireEnabledTransitionEClass, thePetrinetPackage.getNet(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(petrinet_Net_FireEnabledTransition_AbstractSubStepEClass, Petrinet_Net_FireEnabledTransition_AbstractSubStep.class, "Petrinet_Net_FireEnabledTransition_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinet_Net_FireEnabledTransition_ImplicitStepEClass, Petrinet_Net_FireEnabledTransition_ImplicitStep.class, "Petrinet_Net_FireEnabledTransition_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinet_Net_InitializeModelEClass, Petrinet_Net_InitializeModel.class, "Petrinet_Net_InitializeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(petrinet_Net_InitializeModelEClass, thePetrinetPackage.getNet(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(petrinet_Net_InitializeModel_AbstractSubStepEClass, Petrinet_Net_InitializeModel_AbstractSubStep.class, "Petrinet_Net_InitializeModel_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinet_Net_InitializeModel_ImplicitStepEClass, Petrinet_Net_InitializeModel_ImplicitStep.class, "Petrinet_Net_InitializeModel_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinet_Net_StopEClass, Petrinet_Net_Stop.class, "Petrinet_Net_Stop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(petrinet_Net_StopEClass, thePetrinetPackage.getNet(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(petrinet_Net_Stop_AbstractSubStepEClass, Petrinet_Net_Stop_AbstractSubStep.class, "Petrinet_Net_Stop_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinet_Net_Stop_ImplicitStepEClass, Petrinet_Net_Stop_ImplicitStep.class, "Petrinet_Net_Stop_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinet_Place_AddTokenEClass, Petrinet_Place_AddToken.class, "Petrinet_Place_AddToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(petrinet_Place_AddTokenEClass, thePetrinetPackage_1.getTracedPlace(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(petrinet_Place_AddToken_AbstractSubStepEClass, Petrinet_Place_AddToken_AbstractSubStep.class, "Petrinet_Place_AddToken_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinet_Place_AddToken_ImplicitStepEClass, Petrinet_Place_AddToken_ImplicitStep.class, "Petrinet_Place_AddToken_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinet_Place_RemoveTokenEClass, Petrinet_Place_RemoveToken.class, "Petrinet_Place_RemoveToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(petrinet_Place_RemoveTokenEClass, thePetrinetPackage_1.getTracedPlace(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(petrinet_Place_RemoveToken_AbstractSubStepEClass, Petrinet_Place_RemoveToken_AbstractSubStep.class, "Petrinet_Place_RemoveToken_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinet_Place_RemoveToken_ImplicitStepEClass, Petrinet_Place_RemoveToken_ImplicitStep.class, "Petrinet_Place_RemoveToken_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinet_Transition_FireEClass, Petrinet_Transition_Fire.class, "Petrinet_Transition_Fire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(petrinet_Transition_FireEClass, thePetrinetPackage.getTransition(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(petrinet_Transition_Fire_AbstractSubStepEClass, Petrinet_Transition_Fire_AbstractSubStep.class, "Petrinet_Transition_Fire_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinet_Transition_Fire_ImplicitStepEClass, Petrinet_Transition_Fire_ImplicitStep.class, "Petrinet_Transition_Fire_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rootImplicitStepEClass, RootImplicitStep.class, "RootImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificStepEClass, SpecificStep.class, "SpecificStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificStep_EndingState(), theStatesPackage.getState(), theStatesPackage.getState_EndedSteps(), "endingState", null, 0, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificStep_StartingState(), theStatesPackage.getState(), theStatesPackage.getState_StartedSteps(), "startingState", null, 1, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StepsPackageImpl
