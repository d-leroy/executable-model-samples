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
			case StepsPackage.PETRINET_NET_RUN: {
				Petrinet_Net_Run petrinet_Net_Run = (Petrinet_Net_Run)theEObject;
				T result = casePetrinet_Net_Run(petrinet_Net_Run);
				if (result == null) result = caseSpecificStep(petrinet_Net_Run);
				if (result == null) result = caseSequentialStep(petrinet_Net_Run);
				if (result == null) result = caseBigStep(petrinet_Net_Run);
				if (result == null) result = caseStep(petrinet_Net_Run);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_NET_RUN_ABSTRACT_SUB_STEP: {
				Petrinet_Net_Run_AbstractSubStep petrinet_Net_Run_AbstractSubStep = (Petrinet_Net_Run_AbstractSubStep)theEObject;
				T result = casePetrinet_Net_Run_AbstractSubStep(petrinet_Net_Run_AbstractSubStep);
				if (result == null) result = caseSpecificStep(petrinet_Net_Run_AbstractSubStep);
				if (result == null) result = caseStep(petrinet_Net_Run_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_NET_RUN_IMPLICIT_STEP: {
				Petrinet_Net_Run_ImplicitStep petrinet_Net_Run_ImplicitStep = (Petrinet_Net_Run_ImplicitStep)theEObject;
				T result = casePetrinet_Net_Run_ImplicitStep(petrinet_Net_Run_ImplicitStep);
				if (result == null) result = casePetrinet_Net_Run_AbstractSubStep(petrinet_Net_Run_ImplicitStep);
				if (result == null) result = caseSmallStep(petrinet_Net_Run_ImplicitStep);
				if (result == null) result = caseSpecificStep(petrinet_Net_Run_ImplicitStep);
				if (result == null) result = caseStep(petrinet_Net_Run_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_PLACE_ADD_TOKEN: {
				Petrinet_Place_AddToken petrinet_Place_AddToken = (Petrinet_Place_AddToken)theEObject;
				T result = casePetrinet_Place_AddToken(petrinet_Place_AddToken);
				if (result == null) result = caseSequentialStep(petrinet_Place_AddToken);
				if (result == null) result = casePetrinet_Place_AddToken_AbstractSubStep(petrinet_Place_AddToken);
				if (result == null) result = casePetrinet_Place_RemoveToken_AbstractSubStep(petrinet_Place_AddToken);
				if (result == null) result = casePetrinet_Net_Run_AbstractSubStep(petrinet_Place_AddToken);
				if (result == null) result = casePetrinet_Transition_Fire_AbstractSubStep(petrinet_Place_AddToken);
				if (result == null) result = casePetrinet_Net_InitializeModel_AbstractSubStep(petrinet_Place_AddToken);
				if (result == null) result = caseSpecificStep(petrinet_Place_AddToken);
				if (result == null) result = caseBigStep(petrinet_Place_AddToken);
				if (result == null) result = caseStep(petrinet_Place_AddToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_PLACE_ADD_TOKEN_ABSTRACT_SUB_STEP: {
				Petrinet_Place_AddToken_AbstractSubStep petrinet_Place_AddToken_AbstractSubStep = (Petrinet_Place_AddToken_AbstractSubStep)theEObject;
				T result = casePetrinet_Place_AddToken_AbstractSubStep(petrinet_Place_AddToken_AbstractSubStep);
				if (result == null) result = caseSpecificStep(petrinet_Place_AddToken_AbstractSubStep);
				if (result == null) result = caseStep(petrinet_Place_AddToken_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_PLACE_ADD_TOKEN_IMPLICIT_STEP: {
				Petrinet_Place_AddToken_ImplicitStep petrinet_Place_AddToken_ImplicitStep = (Petrinet_Place_AddToken_ImplicitStep)theEObject;
				T result = casePetrinet_Place_AddToken_ImplicitStep(petrinet_Place_AddToken_ImplicitStep);
				if (result == null) result = casePetrinet_Place_AddToken_AbstractSubStep(petrinet_Place_AddToken_ImplicitStep);
				if (result == null) result = caseSmallStep(petrinet_Place_AddToken_ImplicitStep);
				if (result == null) result = caseSpecificStep(petrinet_Place_AddToken_ImplicitStep);
				if (result == null) result = caseStep(petrinet_Place_AddToken_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_PLACE_REMOVE_TOKEN: {
				Petrinet_Place_RemoveToken petrinet_Place_RemoveToken = (Petrinet_Place_RemoveToken)theEObject;
				T result = casePetrinet_Place_RemoveToken(petrinet_Place_RemoveToken);
				if (result == null) result = casePetrinet_Place_AddToken_AbstractSubStep(petrinet_Place_RemoveToken);
				if (result == null) result = caseSequentialStep(petrinet_Place_RemoveToken);
				if (result == null) result = casePetrinet_Place_RemoveToken_AbstractSubStep(petrinet_Place_RemoveToken);
				if (result == null) result = casePetrinet_Net_Run_AbstractSubStep(petrinet_Place_RemoveToken);
				if (result == null) result = casePetrinet_Transition_Fire_AbstractSubStep(petrinet_Place_RemoveToken);
				if (result == null) result = casePetrinet_Net_InitializeModel_AbstractSubStep(petrinet_Place_RemoveToken);
				if (result == null) result = caseSpecificStep(petrinet_Place_RemoveToken);
				if (result == null) result = caseBigStep(petrinet_Place_RemoveToken);
				if (result == null) result = caseStep(petrinet_Place_RemoveToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_PLACE_REMOVE_TOKEN_ABSTRACT_SUB_STEP: {
				Petrinet_Place_RemoveToken_AbstractSubStep petrinet_Place_RemoveToken_AbstractSubStep = (Petrinet_Place_RemoveToken_AbstractSubStep)theEObject;
				T result = casePetrinet_Place_RemoveToken_AbstractSubStep(petrinet_Place_RemoveToken_AbstractSubStep);
				if (result == null) result = caseSpecificStep(petrinet_Place_RemoveToken_AbstractSubStep);
				if (result == null) result = caseStep(petrinet_Place_RemoveToken_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_PLACE_REMOVE_TOKEN_IMPLICIT_STEP: {
				Petrinet_Place_RemoveToken_ImplicitStep petrinet_Place_RemoveToken_ImplicitStep = (Petrinet_Place_RemoveToken_ImplicitStep)theEObject;
				T result = casePetrinet_Place_RemoveToken_ImplicitStep(petrinet_Place_RemoveToken_ImplicitStep);
				if (result == null) result = casePetrinet_Place_RemoveToken_AbstractSubStep(petrinet_Place_RemoveToken_ImplicitStep);
				if (result == null) result = caseSmallStep(petrinet_Place_RemoveToken_ImplicitStep);
				if (result == null) result = caseSpecificStep(petrinet_Place_RemoveToken_ImplicitStep);
				if (result == null) result = caseStep(petrinet_Place_RemoveToken_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.PETRINET_TRANSITION_FIRE: {
				Petrinet_Transition_Fire petrinet_Transition_Fire = (Petrinet_Transition_Fire)theEObject;
				T result = casePetrinet_Transition_Fire(petrinet_Transition_Fire);
				if (result == null) result = casePetrinet_Net_Run_AbstractSubStep(petrinet_Transition_Fire);
				if (result == null) result = caseSequentialStep(petrinet_Transition_Fire);
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
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Net Run</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Net Run</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Net_Run(Petrinet_Net_Run object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Net Run Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Net Run Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Net_Run_AbstractSubStep(Petrinet_Net_Run_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Net Run Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Net Run Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Net_Run_ImplicitStep(Petrinet_Net_Run_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Place Add Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Place Add Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Place_AddToken(Petrinet_Place_AddToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Place Add Token Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Place Add Token Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Place_AddToken_AbstractSubStep(Petrinet_Place_AddToken_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Place Add Token Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Place Add Token Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Place_AddToken_ImplicitStep(Petrinet_Place_AddToken_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Place Remove Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Place Remove Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Place_RemoveToken(Petrinet_Place_RemoveToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Place Remove Token Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Place Remove Token Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Place_RemoveToken_AbstractSubStep(Petrinet_Place_RemoveToken_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petrinet Place Remove Token Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petrinet Place Remove Token Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetrinet_Place_RemoveToken_ImplicitStep(Petrinet_Place_RemoveToken_ImplicitStep object) {
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
