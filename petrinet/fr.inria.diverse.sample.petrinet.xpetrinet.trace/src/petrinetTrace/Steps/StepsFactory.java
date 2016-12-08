/**
 */
package petrinetTrace.Steps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see petrinetTrace.Steps.StepsPackage
 * @generated
 */
public interface StepsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsFactory eINSTANCE = petrinetTrace.Steps.impl.StepsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Petrinet Net Fire Enabled Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinet Net Fire Enabled Transition</em>'.
	 * @generated
	 */
	Petrinet_Net_FireEnabledTransition createPetrinet_Net_FireEnabledTransition();

	/**
	 * Returns a new object of class '<em>Petrinet Net Fire Enabled Transition Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinet Net Fire Enabled Transition Implicit Step</em>'.
	 * @generated
	 */
	Petrinet_Net_FireEnabledTransition_ImplicitStep createPetrinet_Net_FireEnabledTransition_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Petrinet Net Initialize Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinet Net Initialize Model</em>'.
	 * @generated
	 */
	Petrinet_Net_InitializeModel createPetrinet_Net_InitializeModel();

	/**
	 * Returns a new object of class '<em>Petrinet Net Initialize Model Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinet Net Initialize Model Implicit Step</em>'.
	 * @generated
	 */
	Petrinet_Net_InitializeModel_ImplicitStep createPetrinet_Net_InitializeModel_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Petrinet Net Stop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinet Net Stop</em>'.
	 * @generated
	 */
	Petrinet_Net_Stop createPetrinet_Net_Stop();

	/**
	 * Returns a new object of class '<em>Petrinet Net Stop Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinet Net Stop Implicit Step</em>'.
	 * @generated
	 */
	Petrinet_Net_Stop_ImplicitStep createPetrinet_Net_Stop_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Petrinet Place Add Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinet Place Add Token</em>'.
	 * @generated
	 */
	Petrinet_Place_AddToken createPetrinet_Place_AddToken();

	/**
	 * Returns a new object of class '<em>Petrinet Place Add Token Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinet Place Add Token Implicit Step</em>'.
	 * @generated
	 */
	Petrinet_Place_AddToken_ImplicitStep createPetrinet_Place_AddToken_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Petrinet Place Remove Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinet Place Remove Token</em>'.
	 * @generated
	 */
	Petrinet_Place_RemoveToken createPetrinet_Place_RemoveToken();

	/**
	 * Returns a new object of class '<em>Petrinet Place Remove Token Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinet Place Remove Token Implicit Step</em>'.
	 * @generated
	 */
	Petrinet_Place_RemoveToken_ImplicitStep createPetrinet_Place_RemoveToken_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Petrinet Transition Fire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinet Transition Fire</em>'.
	 * @generated
	 */
	Petrinet_Transition_Fire createPetrinet_Transition_Fire();

	/**
	 * Returns a new object of class '<em>Petrinet Transition Fire Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinet Transition Fire Implicit Step</em>'.
	 * @generated
	 */
	Petrinet_Transition_Fire_ImplicitStep createPetrinet_Transition_Fire_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Implicit Step</em>'.
	 * @generated
	 */
	RootImplicitStep createRootImplicitStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StepsPackage getStepsPackage();

} //StepsFactory
