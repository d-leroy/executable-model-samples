
package fr.inria.diverse.sample.petrinet.xpetrinet.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class PetrinetTraceStepFactory implements IStepFactory {

	@Override
	public fr.inria.diverse.trace.commons.model.trace.Step createStep(
			fr.inria.diverse.trace.commons.model.trace.MSE mse, List<Object> parameters, List<Object> result) {

		fr.inria.diverse.trace.commons.model.trace.Step step = null;
		org.eclipse.emf.ecore.EClass ec = mse.getCaller().eClass();
		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(ec, ".") + "."
				+ mse.getAction().getName();

		if (mse.getAction().getName().equalsIgnoreCase("fireEnabledTransition")
				&& (ec.getClassifierID() == fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage.eINSTANCE
						.getNet().getClassifierID()))

		{
			step = petrinetTrace.Steps.StepsFactory.eINSTANCE.createPetrinet_Net_FireEnabledTransition();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("initializeModel")
				&& (ec.getClassifierID() == fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage.eINSTANCE
						.getNet().getClassifierID()))

		{
			step = petrinetTrace.Steps.StepsFactory.eINSTANCE.createPetrinet_Net_InitializeModel();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("stop")
				&& (ec.getClassifierID() == fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage.eINSTANCE
						.getNet().getClassifierID()))

		{
			step = petrinetTrace.Steps.StepsFactory.eINSTANCE.createPetrinet_Net_Stop();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("addToken")
				&& (ec.getClassifierID() == fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage.eINSTANCE
						.getPlace().getClassifierID()))

		{
			step = petrinetTrace.Steps.StepsFactory.eINSTANCE.createPetrinet_Place_AddToken();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("removeToken")
				&& (ec.getClassifierID() == fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage.eINSTANCE
						.getPlace().getClassifierID()))

		{
			step = petrinetTrace.Steps.StepsFactory.eINSTANCE.createPetrinet_Place_RemoveToken();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire")
				&& (ec.getClassifierID() == fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage.eINSTANCE
						.getTransition().getClassifierID()))

		{
			step = petrinetTrace.Steps.StepsFactory.eINSTANCE.createPetrinet_Transition_Fire();
		}

		else {
			step = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createGenericSequentialStep();
		}

		fr.inria.diverse.trace.commons.model.trace.MSEOccurrence mseocc = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createMSEOccurrence();
		mseocc.setMse(mse);
		mseocc.getParameters().addAll(parameters);
		mseocc.getResult().addAll(result);
		step.setMseoccurrence(mseocc);

		return step;
	}
}
