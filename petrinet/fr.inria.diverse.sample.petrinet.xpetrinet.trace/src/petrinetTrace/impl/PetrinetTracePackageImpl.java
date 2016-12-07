/**
 */
package petrinetTrace.impl;

import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import petrinetTrace.PetrinetTraceFactory;
import petrinetTrace.PetrinetTracePackage;
import petrinetTrace.SpecificTrace;

import petrinetTrace.States.StatesPackage;

import petrinetTrace.States.impl.StatesPackageImpl;

import petrinetTrace.States.petrinet.impl.PetrinetPackageImpl;

import petrinetTrace.Steps.StepsPackage;

import petrinetTrace.Steps.impl.StepsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetTracePackageImpl extends EPackageImpl implements PetrinetTracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificTraceEClass = null;

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
	 * @see petrinetTrace.PetrinetTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PetrinetTracePackageImpl() {
		super(eNS_URI, PetrinetTraceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PetrinetTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PetrinetTracePackage init() {
		if (isInited) return (PetrinetTracePackage)EPackage.Registry.INSTANCE.getEPackage(PetrinetTracePackage.eNS_URI);

		// Obtain or create and register package
		PetrinetTracePackageImpl thePetrinetTracePackage = (PetrinetTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PetrinetTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PetrinetTracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		PetrinetPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		PetrinetPackageImpl thePetrinetPackage_1 = (PetrinetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(petrinetTrace.States.petrinet.PetrinetPackage.eNS_URI) instanceof PetrinetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(petrinetTrace.States.petrinet.PetrinetPackage.eNS_URI) : petrinetTrace.States.petrinet.PetrinetPackage.eINSTANCE);

		// Create package meta-data objects
		thePetrinetTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		thePetrinetPackage_1.createPackageContents();

		// Initialize created meta-data
		thePetrinetTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		thePetrinetPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetrinetTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PetrinetTracePackage.eNS_URI, thePetrinetTracePackage);
		return thePetrinetTracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificTrace() {
		return specificTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Petrinet_Net_InitializeModel_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Petrinet_Net_Run_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Petrinet_Place_AddToken_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Petrinet_Place_RemoveToken_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Petrinet_Transition_Fire_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Petrinet_tracedPlaces() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Petrinet_tracedTokens() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_StatesTrace() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetTraceFactory getPetrinetTraceFactory() {
		return (PetrinetTraceFactory)getEFactoryInstance();
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
		specificTraceEClass = createEClass(SPECIFIC_TRACE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__PETRINET_NET_INITIALIZE_MODEL_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__PETRINET_NET_RUN_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__PETRINET_PLACE_ADD_TOKEN_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__PETRINET_PLACE_REMOVE_TOKEN_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__PETRINET_TRANSITION_FIRE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__PETRINET_TRACED_PLACES);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__PETRINET_TRACED_TOKENS);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__STATES_TRACE);
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
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		petrinetTrace.States.petrinet.PetrinetPackage thePetrinetPackage_1 = (petrinetTrace.States.petrinet.PetrinetPackage)EPackage.Registry.INSTANCE.getEPackage(petrinetTrace.States.petrinet.PetrinetPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStepsPackage);
		getESubpackages().add(theStatesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theTracePackage.getTrace());
		EGenericType g2 = createEGenericType(theTracePackage.getSequentialStep());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(theStepsPackage.getSpecificStep());
		g2.getETypeArguments().add(g3);
		specificTraceEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(specificTraceEClass, SpecificTrace.class, "SpecificTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificTrace_Petrinet_Net_InitializeModel_Sequence(), theStepsPackage.getPetrinet_Net_InitializeModel(), null, "Petrinet_Net_InitializeModel_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Petrinet_Net_Run_Sequence(), theStepsPackage.getPetrinet_Net_Run(), null, "Petrinet_Net_Run_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Petrinet_Place_AddToken_Sequence(), theStepsPackage.getPetrinet_Place_AddToken(), null, "Petrinet_Place_AddToken_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Petrinet_Place_RemoveToken_Sequence(), theStepsPackage.getPetrinet_Place_RemoveToken(), null, "Petrinet_Place_RemoveToken_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Petrinet_Transition_Fire_Sequence(), theStepsPackage.getPetrinet_Transition_Fire(), null, "Petrinet_Transition_Fire_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Petrinet_tracedPlaces(), thePetrinetPackage_1.getTracedPlace(), null, "petrinet_tracedPlaces", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_Petrinet_tracedTokens(), thePetrinetPackage_1.getTracedToken(), null, "petrinet_tracedTokens", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecificTrace_StatesTrace(), theStatesPackage.getState(), null, "statesTrace", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PetrinetTracePackageImpl
