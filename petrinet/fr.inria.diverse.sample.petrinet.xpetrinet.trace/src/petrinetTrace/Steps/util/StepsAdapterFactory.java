/**
 */
package petrinetTrace.Steps.util;

import fr.inria.diverse.trace.commons.model.trace.BigStep;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.SmallStep;
import fr.inria.diverse.trace.commons.model.trace.Step;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import petrinetTrace.Steps.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see petrinetTrace.Steps.StepsPackage
 * @generated
 */
public class StepsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StepsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StepsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepsSwitch<Adapter> modelSwitch =
		new StepsSwitch<Adapter>() {
			@Override
			public Adapter casePetrinet_Net_InitializeModel(Petrinet_Net_InitializeModel object) {
				return createPetrinet_Net_InitializeModelAdapter();
			}
			@Override
			public Adapter casePetrinet_Net_InitializeModel_AbstractSubStep(Petrinet_Net_InitializeModel_AbstractSubStep object) {
				return createPetrinet_Net_InitializeModel_AbstractSubStepAdapter();
			}
			@Override
			public Adapter casePetrinet_Net_InitializeModel_ImplicitStep(Petrinet_Net_InitializeModel_ImplicitStep object) {
				return createPetrinet_Net_InitializeModel_ImplicitStepAdapter();
			}
			@Override
			public Adapter casePetrinet_Net_Run(Petrinet_Net_Run object) {
				return createPetrinet_Net_RunAdapter();
			}
			@Override
			public Adapter casePetrinet_Net_Run_AbstractSubStep(Petrinet_Net_Run_AbstractSubStep object) {
				return createPetrinet_Net_Run_AbstractSubStepAdapter();
			}
			@Override
			public Adapter casePetrinet_Net_Run_ImplicitStep(Petrinet_Net_Run_ImplicitStep object) {
				return createPetrinet_Net_Run_ImplicitStepAdapter();
			}
			@Override
			public Adapter casePetrinet_Place_AddToken(Petrinet_Place_AddToken object) {
				return createPetrinet_Place_AddTokenAdapter();
			}
			@Override
			public Adapter casePetrinet_Place_AddToken_AbstractSubStep(Petrinet_Place_AddToken_AbstractSubStep object) {
				return createPetrinet_Place_AddToken_AbstractSubStepAdapter();
			}
			@Override
			public Adapter casePetrinet_Place_AddToken_ImplicitStep(Petrinet_Place_AddToken_ImplicitStep object) {
				return createPetrinet_Place_AddToken_ImplicitStepAdapter();
			}
			@Override
			public Adapter casePetrinet_Place_RemoveToken(Petrinet_Place_RemoveToken object) {
				return createPetrinet_Place_RemoveTokenAdapter();
			}
			@Override
			public Adapter casePetrinet_Place_RemoveToken_AbstractSubStep(Petrinet_Place_RemoveToken_AbstractSubStep object) {
				return createPetrinet_Place_RemoveToken_AbstractSubStepAdapter();
			}
			@Override
			public Adapter casePetrinet_Place_RemoveToken_ImplicitStep(Petrinet_Place_RemoveToken_ImplicitStep object) {
				return createPetrinet_Place_RemoveToken_ImplicitStepAdapter();
			}
			@Override
			public Adapter casePetrinet_Transition_Fire(Petrinet_Transition_Fire object) {
				return createPetrinet_Transition_FireAdapter();
			}
			@Override
			public Adapter casePetrinet_Transition_Fire_AbstractSubStep(Petrinet_Transition_Fire_AbstractSubStep object) {
				return createPetrinet_Transition_Fire_AbstractSubStepAdapter();
			}
			@Override
			public Adapter casePetrinet_Transition_Fire_ImplicitStep(Petrinet_Transition_Fire_ImplicitStep object) {
				return createPetrinet_Transition_Fire_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseRootImplicitStep(RootImplicitStep object) {
				return createRootImplicitStepAdapter();
			}
			@Override
			public Adapter caseSpecificStep(SpecificStep object) {
				return createSpecificStepAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public <StepSubtype extends Step> Adapter caseBigStep(BigStep<StepSubtype> object) {
				return createBigStepAdapter();
			}
			@Override
			public <StepSubtype extends Step> Adapter caseSequentialStep(SequentialStep<StepSubtype> object) {
				return createSequentialStepAdapter();
			}
			@Override
			public Adapter caseSmallStep(SmallStep object) {
				return createSmallStepAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link petrinetTrace.Steps.Petrinet_Net_InitializeModel <em>Petrinet Net Initialize Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetTrace.Steps.Petrinet_Net_InitializeModel
	 * @generated
	 */
	public Adapter createPetrinet_Net_InitializeModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetTrace.Steps.Petrinet_Net_InitializeModel_AbstractSubStep <em>Petrinet Net Initialize Model Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetTrace.Steps.Petrinet_Net_InitializeModel_AbstractSubStep
	 * @generated
	 */
	public Adapter createPetrinet_Net_InitializeModel_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetTrace.Steps.Petrinet_Net_InitializeModel_ImplicitStep <em>Petrinet Net Initialize Model Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetTrace.Steps.Petrinet_Net_InitializeModel_ImplicitStep
	 * @generated
	 */
	public Adapter createPetrinet_Net_InitializeModel_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetTrace.Steps.Petrinet_Net_Run <em>Petrinet Net Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetTrace.Steps.Petrinet_Net_Run
	 * @generated
	 */
	public Adapter createPetrinet_Net_RunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetTrace.Steps.Petrinet_Net_Run_AbstractSubStep <em>Petrinet Net Run Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetTrace.Steps.Petrinet_Net_Run_AbstractSubStep
	 * @generated
	 */
	public Adapter createPetrinet_Net_Run_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetTrace.Steps.Petrinet_Net_Run_ImplicitStep <em>Petrinet Net Run Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetTrace.Steps.Petrinet_Net_Run_ImplicitStep
	 * @generated
	 */
	public Adapter createPetrinet_Net_Run_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetTrace.Steps.Petrinet_Place_AddToken <em>Petrinet Place Add Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetTrace.Steps.Petrinet_Place_AddToken
	 * @generated
	 */
	public Adapter createPetrinet_Place_AddTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetTrace.Steps.Petrinet_Place_AddToken_AbstractSubStep <em>Petrinet Place Add Token Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetTrace.Steps.Petrinet_Place_AddToken_AbstractSubStep
	 * @generated
	 */
	public Adapter createPetrinet_Place_AddToken_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetTrace.Steps.Petrinet_Place_AddToken_ImplicitStep <em>Petrinet Place Add Token Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetTrace.Steps.Petrinet_Place_AddToken_ImplicitStep
	 * @generated
	 */
	public Adapter createPetrinet_Place_AddToken_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetTrace.Steps.Petrinet_Place_RemoveToken <em>Petrinet Place Remove Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetTrace.Steps.Petrinet_Place_RemoveToken
	 * @generated
	 */
	public Adapter createPetrinet_Place_RemoveTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetTrace.Steps.Petrinet_Place_RemoveToken_AbstractSubStep <em>Petrinet Place Remove Token Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetTrace.Steps.Petrinet_Place_RemoveToken_AbstractSubStep
	 * @generated
	 */
	public Adapter createPetrinet_Place_RemoveToken_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetTrace.Steps.Petrinet_Place_RemoveToken_ImplicitStep <em>Petrinet Place Remove Token Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetTrace.Steps.Petrinet_Place_RemoveToken_ImplicitStep
	 * @generated
	 */
	public Adapter createPetrinet_Place_RemoveToken_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetTrace.Steps.Petrinet_Transition_Fire <em>Petrinet Transition Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetTrace.Steps.Petrinet_Transition_Fire
	 * @generated
	 */
	public Adapter createPetrinet_Transition_FireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetTrace.Steps.Petrinet_Transition_Fire_AbstractSubStep <em>Petrinet Transition Fire Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetTrace.Steps.Petrinet_Transition_Fire_AbstractSubStep
	 * @generated
	 */
	public Adapter createPetrinet_Transition_Fire_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetTrace.Steps.Petrinet_Transition_Fire_ImplicitStep <em>Petrinet Transition Fire Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetTrace.Steps.Petrinet_Transition_Fire_ImplicitStep
	 * @generated
	 */
	public Adapter createPetrinet_Transition_Fire_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetTrace.Steps.RootImplicitStep
	 * @generated
	 */
	public Adapter createRootImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link petrinetTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see petrinetTrace.Steps.SpecificStep
	 * @generated
	 */
	public Adapter createSpecificStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.BigStep <em>Big Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.BigStep
	 * @generated
	 */
	public Adapter createBigStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.SequentialStep <em>Sequential Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.SequentialStep
	 * @generated
	 */
	public Adapter createSequentialStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.SmallStep <em>Small Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.SmallStep
	 * @generated
	 */
	public Adapter createSmallStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StepsAdapterFactory
