/**
 */
package fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.impl;

import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Net;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.NetStopEvent;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetFactory;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.TransitionFireEvent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetPackageImpl extends EPackageImpl implements PetrinetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass netEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass netStopEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionFireEventEClass = null;

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
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PetrinetPackageImpl() {
		super(eNS_URI, PetrinetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PetrinetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PetrinetPackage init() {
		if (isInited) return (PetrinetPackage)EPackage.Registry.INSTANCE.getEPackage(PetrinetPackage.eNS_URI);

		// Obtain or create and register package
		PetrinetPackageImpl thePetrinetPackage = (PetrinetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PetrinetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PetrinetPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePetrinetPackage.createPackageContents();

		// Initialize created meta-data
		thePetrinetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetrinetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PetrinetPackage.eNS_URI, thePetrinetPackage);
		return thePetrinetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNet() {
		return netEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNet_Places() {
		return (EReference)netEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNet_Transitions() {
		return (EReference)netEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Input() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Output() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Name() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Name() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_InitialTokens() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_Tokens() {
		return (EReference)placeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetStopEvent() {
		return netStopEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetStopEvent_Net() {
		return (EReference)netStopEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionFireEvent() {
		return transitionFireEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionFireEvent_Transition() {
		return (EReference)transitionFireEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetFactory getPetrinetFactory() {
		return (PetrinetFactory)getEFactoryInstance();
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
		netEClass = createEClass(NET);
		createEReference(netEClass, NET__PLACES);
		createEReference(netEClass, NET__TRANSITIONS);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__INPUT);
		createEReference(transitionEClass, TRANSITION__OUTPUT);
		createEAttribute(transitionEClass, TRANSITION__NAME);

		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__NAME);
		createEAttribute(placeEClass, PLACE__INITIAL_TOKENS);
		createEReference(placeEClass, PLACE__TOKENS);

		tokenEClass = createEClass(TOKEN);

		netStopEventEClass = createEClass(NET_STOP_EVENT);
		createEReference(netStopEventEClass, NET_STOP_EVENT__NET);

		transitionFireEventEClass = createEClass(TRANSITION_FIRE_EVENT);
		createEReference(transitionFireEventEClass, TRANSITION_FIRE_EVENT__TRANSITION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(netEClass, Net.class, "Net", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNet_Places(), this.getPlace(), null, "places", null, 0, -1, Net.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNet_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, Net.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(netEClass, null, "initializeModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "args", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(netEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(netEClass, null, "fireEnabledTransition", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(netEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Input(), this.getPlace(), null, "input", null, 1, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Output(), this.getPlace(), null, "output", null, 1, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(transitionEClass, ecorePackage.getEBoolean(), "isEnabled", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(transitionEClass, null, "fire", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(transitionEClass, ecorePackage.getEBoolean(), "fire_PreCondition", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Name(), ecorePackage.getEString(), "name", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_InitialTokens(), ecorePackage.getEInt(), "initialTokens", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_Tokens(), this.getToken(), null, "tokens", null, 0, -1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(netStopEventEClass, NetStopEvent.class, "NetStopEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetStopEvent_Net(), this.getNet(), null, "net", null, 0, 1, NetStopEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionFireEventEClass, TransitionFireEvent.class, "TransitionFireEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitionFireEvent_Transition(), this.getTransition(), null, "transition", null, 0, 1, TransitionFireEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (netEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (netEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (netEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (netEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (transitionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (transitionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (transitionEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPlace_Tokens(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (tokenEClass, 
		   source, 
		   new String[] {
		   });
	}

} //PetrinetPackageImpl
