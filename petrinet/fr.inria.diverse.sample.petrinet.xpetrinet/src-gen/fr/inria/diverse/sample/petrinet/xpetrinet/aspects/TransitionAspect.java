package fr.inria.diverse.sample.petrinet.xpetrinet.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspect;
import fr.inria.diverse.sample.petrinet.xpetrinet.aspects.TransitionAspectTransitionAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetFactory;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  /**
   * Query to know if the Transition is enabled.
   * @return true if all input places have at least one token, false otherwise.
   */
  public static boolean isEnabled(final Transition _self) {
	final fr.inria.diverse.sample.petrinet.xpetrinet.aspects.TransitionAspectTransitionAspectProperties _self_ = fr.inria.diverse.sample.petrinet.xpetrinet.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_isEnabled(_self_, _self);
	;
	return (boolean) result;
}
  
  /**
   * Transformation rule that fires the Transition.
   */
  @Step
  public static void fire(final Transition _self) {
	final fr.inria.diverse.sample.petrinet.xpetrinet.aspects.TransitionAspectTransitionAspectProperties _self_ = fr.inria.diverse.sample.petrinet.xpetrinet.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_fire(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Transition", "fire");
	} else {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
				.getInstance().findEventManager(_self);
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  protected static boolean _privk3_isEnabled(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    EList<Place> _input = _self.getInput();
    final Function1<Place, Boolean> _function = (Place place) -> {
      EList<Token> _kens = PlaceAspect.tokens(place);
      int _size = _kens.size();
      return Boolean.valueOf((_size > 0));
    };
    return IterableExtensions.<Place>forall(_input, _function);
  }
  
  protected static void _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    boolean _isEnabled = TransitionAspect.isEnabled(_self);
    if (_isEnabled) {
      EList<Place> _input = _self.getInput();
      for (final Place input : _input) {
        EList<Token> _kens = PlaceAspect.tokens(input);
        EList<Token> _kens_1 = PlaceAspect.tokens(input);
        Token _get = _kens_1.get(0);
        _kens.remove(_get);
      }
      EList<Place> _output = _self.getOutput();
      for (final Place output : _output) {
        EList<Token> _kens_2 = PlaceAspect.tokens(output);
        Token _createToken = PetrinetFactory.eINSTANCE.createToken();
        _kens_2.add(_createToken);
      }
    }
  }
}
