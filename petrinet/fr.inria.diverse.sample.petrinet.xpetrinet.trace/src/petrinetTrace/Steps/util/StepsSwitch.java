/**
 */
package petrinetTrace.Steps.util;

import fr.inria.diverse.trace.commons.model.trace.BigStep;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.SmallStep;
import fr.inria.diverse.trace.commons.model.trace.Step;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import petrinetTrace.Steps.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see petrinetTrace.Steps.StepsPackage
 * @generated
 */
public class StepsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StepsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsSwitch() {
		if (modelPackage == null) {
			modelPackage = StepsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StepsPackage.PETRINET_NET_FIRE_ENABLED_TRANSITION: {
				Petrinet_Net_FireEnabledTransition petrinet_Net_FireEnabledTransition = (Petrinet_Net_FireEnabledTransition)theEObject;
				T result = casePetrinet_Net_FireEnabledTransition(petrinet_Net_FireEnabledTransition);
				if (result == null) result = caseSpecificStep(petrinet_Net_FireEnabledTransition);
				if (result == null) result = caseSequentialStep(petrinet_Net_FireEnabledTransition);
				if (result == null) result = caseBigStep(petrinet_Net_FireEnabledTransition);
				if (result == null) result = caseStep(petrinet_Net_FireEnabledTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_NET_FIRE_ENABLED_TRANSITION_ABSTRACT_SUB_STEP: {
				Petrinet_Net_FireEnabledTransition_AbstractSubStep petrinet_Net_FireEnabledTransition_AbstractSubStep = (Petrinet_Net_FireEnabledTransition_AbstractSubStep)theEObject;
				T result = casePetrinet_Net_FireEnabledTransition_AbstractSubStep(petrinet_Net_FireEnabledTransition_AbstractSubStep);
				if (result == null) result = caseSpecificStep(petrinet_Net_FireEnabledTransition_AbstractSubStep);
				if (result == null) result = caseStep(petrinet_Net_FireEnabledTransition_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_NET_FIRE_ENABLED_TRANSITION_IMPLICIT_STEP: {
				Petrinet_Net_FireEnabledTransition_ImplicitStep petrinet_Net_FireEnabledTransition_ImplicitStep = (Petrinet_Net_FireEnabledTransition_ImplicitStep)theEObject;
				T result = casePetrinet_Net_FireEnabledTransition_ImplicitStep(petrinet_Net_FireEnabledTransition_ImplicitStep);
				if (result == null) result = casePetrinet_Net_FireEnabledTransition_AbstractSubStep(petrinet_Net_FireEnabledTransition_ImplicitStep);
				if (result == null) result = caseSmallStep(petrinet_Net_FireEnabledTransition_ImplicitStep);
				if (result == null) result = caseSpecificStep(petrinet_Net_FireEnabledTransition_ImplicitStep);
				if (result == null) result = caseStep(petrinet_Net_FireEnabledTransition_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_NET_INITIALIZE_MODEL: {
				Petrinet_Net_InitializeModel petrinet_Net_InitializeModel = (Petrinet_Net_InitializeModel)theEObject;
				T result = casePetrinet_Net_InitializeModel(petrinet_Net_InitializeModel);
				if (result == null) result = caseSpecificStep(petrinet_Net_InitializeModel);
				if (result == null) result = caseSequentialStep(petrinet_Net_InitializeModel);
				if (result == null) result = caseBigStep(petrinet_Net_InitializeModel);
				if (result == null) result = caseStep(petrinet_Net_InitializeModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_NET_INITIALIZE_MODEL_ABSTRACT_SUB_STEP: {
				Petrinet_Net_InitializeModel_AbstractSubStep petrinet_Net_InitializeModel_AbstractSubStep = (Petrinet_Net_InitializeModel_AbstractSubStep)theEObject;
				T result = casePetrinet_Net_InitializeModel_AbstractSubStep(petrinet_Net_InitializeModel_AbstractSubStep);
				if (result == null) result = caseSpecificStep(petrinet_Net_InitializeModel_AbstractSubStep);
				if (result == null) result = caseStep(petrinet_Net_InitializeModel_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_NET_INITIALIZE_MODEL_IMPLICIT_STEP: {
				Petrinet_Net_InitializeModel_ImplicitStep petrinet_Net_InitializeModel_ImplicitStep = (Petrinet_Net_InitializeModel_ImplicitStep)theEObject;
				T result = casePetrinet_Net_InitializeModel_ImplicitStep(petrinet_Net_InitializeModel_ImplicitStep);
				if (result == null) result = casePetrinet_Net_InitializeModel_AbstractSubStep(petrinet_Net_InitializeModel_ImplicitStep);
				if (result == null) result = caseSmallStep(petrinet_Net_InitializeModel_ImplicitStep);
				if (result == null) result = caseSpecificStep(petrinet_Net_InitializeModel_ImplicitStep);
				if (result == null) result = caseStep(petrinet_Net_InitializeModel_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_NET_STOP: {
				Petrinet_Net_Stop petrinet_Net_Stop = (Petrinet_Net_Stop)theEObject;
				T result = casePetrinet_Net_Stop(petrinet_Net_Stop);
				if (result == null) result = casePetrinet_Net_FireEnabledTransition_AbstractSubStep(petrinet_Net_Stop);
				if (result == null) result = caseSequentialStep(petrinet_Net_Stop);
				if (result == null) result = casePetrinet_Net_Stop_AbstractSubStep(petrinet_Net_Stop);
				if (result == null) result = casePetrinet_Transition_Fire_AbstractSubStep(petrinet_Net_Stop);
				if (result == null) result = casePetrinet_Net_InitializeModel_AbstractSubStep(petrinet_Net_Stop);
				if (result == null) result = caseSpecificStep(petrinet_Net_Stop);
				if (result == null) result = caseBigStep(petrinet_Net_Stop);
				if (result == null) result = caseStep(petrinet_Net_Stop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_NET_STOP_ABSTRACT_SUB_STEP: {
				Petrinet_Net_Stop_AbstractSubStep petrinet_Net_Stop_AbstractSubStep = (Petrinet_Net_Stop_AbstractSubStep)theEObject;
				T result = casePetrinet_Net_Stop_AbstractSubStep(petrinet_Net_Stop_AbstractSubStep);
				if (result == null) result = caseSpecificStep(petrinet_Net_Stop_AbstractSubStep);
				if (result == null) result = caseStep(petrinet_Net_Stop_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_NET_STOP_IMPLICIT_STEP: {
				Petrinet_Net_Stop_ImplicitStep petrinet_Net_Stop_ImplicitStep = (Petrinet_Net_Stop_ImplicitStep)theEObject;
				T result = casePetrinet_Net_Stop_ImplicitStep(petrinet_Net_Stop_ImplicitStep);
				if (result == null) result = casePetrinet_Net_Stop_AbstractSubStep(petrinet_Net_Stop_ImplicitStep);
				if (result == null) result = caseSmallStep(petrinet_Net_Stop_ImplicitStep);
				if (result == null) result = caseSpecificStep(petrinet_Net_Stop_ImplicitStep);
				if (result == null) result = caseStep(petrinet_Net_Stop_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_TRANSITION_FIRE: {
				Petrinet_Transition_Fire petrinet_Transition_Fire = (Petrinet_Transition_Fire)theEObject;
				T result = casePetrinet_Transition_Fire(petrinet_Transition_Fire);
				if (result == null) result = casePetrinet_Net_FireEnabledTransition_AbstractSubStep(petrinet_Transition_Fire);
				if (result == null) result = casePetrinet_Net_Stop_AbstractSubStep(petrinet_Transition_Fire);
				if (result == null) result = caseSequentialStep(petrinet_Transition_Fire);
				if (result == null) result = casePetrinet_Transition_Fire_AbstractSubStep(petrinet_Transition_Fire);
				if (result == null) result = casePetrinet_Net_InitializeModel_AbstractSubStep(petrinet_Transition_Fire);
				if (result == null) result = caseSpecificStep(petrinet_Transition_Fire);
				if (result == null) result = caseBigStep(petrinet_Transition_Fire);
				if (result == null) result = caseStep(petrinet_Transition_Fire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_TRANSITION_FIRE_ABSTRACT_SUB_STEP: {
				Petrinet_Transition_Fire_AbstractSubStep petrinet_Transition_Fire_AbstractSubStep = (Petrinet_Transition_Fire_AbstractSubStep)theEObject;
				T result = casePetrinet_Transition_Fire_AbstractSubStep(petrinet_Transition_Fire_AbstractSubStep);
				if (result == null) result = caseSpecificStep(petrinet_Transition_Fire_AbstractSubStep);
				if (result == null) result = caseStep(petrinet_Transition_Fire_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_TRANSITION_FIRE_IMPLICIT_STEP: {
				Petrinet_Transition_Fire_ImplicitStep petrinet_Transition_Fire_ImplicitStep = (Petrinet_Transition_Fire_ImplicitStep)theEObject;
				T result = casePetrinet_Transition_Fire_ImplicitStep(petrinet_Transition_Fire_ImplicitStep);
				if (result == null) result = casePetrinet_Transition_Fire_AbstractSubStep(petrinet_Transition_Fire_ImplicitStep);
				if (result == null) result = caseSmallStep(petrinet_Transition_Fire_ImplicitStep);
				if (result == null) result = caseSpecificStep(petrinet_Transition_Fire_ImplicitStep);
				if (result == null) result = caseStep(petrinet_Transition_Fire_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ROOT_IMPLICIT_STEP: {
				RootImplicitStep rootImplicitStep = (RootImplicitStep)theEObject;
				T result = caseRootImplicitStep(rootImplicitStep);
				if (result == null) result = caseSmallStep(rootImplicitStep);
				if (result == null) result = caseStep(rootImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.SPECIFIC_STEP: {
				SpecificStep specificStep = (SpecificStep)theEObject;
				T result = caseSpecificStep(specificStep);
				if (result == null) result = caseStep(specificStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Net Fire Enabled Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Net Fire Enabled Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Net_FireEnabledTransition(Petrinet_Net_FireEnabledTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Net Fire Enabled Transition Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Net Fire Enabled Transition Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Net_FireEnabledTransition_AbstractSubStep(Petrinet_Net_FireEnabledTransition_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Net Fire Enabled Transition Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Net Fire Enabled Transition Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Net_FireEnabledTransition_ImplicitStep(Petrinet_Net_FireEnabledTransition_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Net Initialize Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Net Initialize Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Net_InitializeModel(Petrinet_Net_InitializeModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Net Initialize Model Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Net Initialize Model Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Net_InitializeModel_AbstractSubStep(Petrinet_Net_InitializeModel_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Net Initialize Model Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Net Initialize Model Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Net_InitializeModel_ImplicitStep(Petrinet_Net_InitializeModel_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Net Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Net Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Net_Stop(Petrinet_Net_Stop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Net Stop Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Net Stop Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Net_Stop_AbstractSubStep(Petrinet_Net_Stop_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Net Stop Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Net Stop Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Net_Stop_ImplicitStep(Petrinet_Net_Stop_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Transition Fire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Transition Fire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Transition_Fire(Petrinet_Transition_Fire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Transition Fire Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Transition Fire Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Transition_Fire_AbstractSubStep(Petrinet_Transition_Fire_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Transition Fire Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Transition Fire Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Transition_Fire_ImplicitStep(Petrinet_Transition_Fire_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootImplicitStep(RootImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificStep(SpecificStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StepSubtype extends Step> T caseBigStep(BigStep<StepSubtype> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StepSubtype extends Step> T caseSequentialStep(SequentialStep<StepSubtype> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmallStep(SmallStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StepsSwitch
