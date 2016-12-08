package fr.inria.diverse.sample.petrinet.xpetrinet.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.inria.diverse.sample.petrinet.xpetrinet.aspects.NetAspectNetAspectProperties;
import fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspect;
import fr.inria.diverse.sample.petrinet.xpetrinet.aspects.TransitionAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Net;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetFactory;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition;

@Aspect(className = Net.class)
@SuppressWarnings("all")
public class NetAspect {
  @InitializeModel
  @Step
  public static void initializeModel(final Net _self, final EList<String> args) {
    final fr.inria.diverse.sample.petrinet.xpetrinet.aspects.NetAspectNetAspectProperties _self_ = fr.inria.diverse.sample.petrinet.xpetrinet.aspects.NetAspectNetAspectContext.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance()
			.registerManager(new XPetrinetEventManager());
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_initializeModel(_self_, _self,args);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Net","initializeModel");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager();
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  /**
   * Transformation rule that runs the Petri net.
   */
  @Main
  public static void run(final Net _self) {
	final fr.inria.diverse.sample.petrinet.xpetrinet.aspects.NetAspectNetAspectProperties _self_ = fr.inria.diverse.sample.petrinet.xpetrinet.aspects.NetAspectNetAspectContext
			.getSelf(_self);
	_privk3_run(_self_, _self);
	;
}
  
  @Step
  public static void fireEnabledTransition(final Net _self) {
	final fr.inria.diverse.sample.petrinet.xpetrinet.aspects.NetAspectNetAspectProperties _self_ = fr.inria.diverse.sample.petrinet.xpetrinet.aspects.NetAspectNetAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_fireEnabledTransition(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Net", "fireEnabledTransition");
	} else {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
				.getInstance().findEventManager();
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  @Step(eventTriggerable = true)
  public static void stop(final Net _self) {
	final fr.inria.diverse.sample.petrinet.xpetrinet.aspects.NetAspectNetAspectProperties _self_ = fr.inria.diverse.sample.petrinet.xpetrinet.aspects.NetAspectNetAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_stop(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Net", "stop");
	} else {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
				.getInstance().findEventManager();
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  private static boolean running(final Net _self) {
    final fr.inria.diverse.sample.petrinet.xpetrinet.aspects.NetAspectNetAspectProperties _self_ = fr.inria.diverse.sample.petrinet.xpetrinet.aspects.NetAspectNetAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_running(_self_, _self);;
    return (boolean)result;
  }
  
  private static void running(final Net _self, final boolean running) {
    final fr.inria.diverse.sample.petrinet.xpetrinet.aspects.NetAspectNetAspectProperties _self_ = fr.inria.diverse.sample.petrinet.xpetrinet.aspects.NetAspectNetAspectContext.getSelf(_self);
    _privk3_running(_self_, _self,running);;
  }
  
  protected static void _privk3_initializeModel(final NetAspectNetAspectProperties _self_, final Net _self, final EList<String> args) {
    EList<Place> _places = _self.getPlaces();
    for (final Place place : _places) {
      {
        final int initialTokens = place.getInitialTokens();
        if ((initialTokens > 0)) {
          int _initialTokens = place.getInitialTokens();
          IntegerRange _upTo = new IntegerRange(1, _initialTokens);
          for (final Integer x : _upTo) {
            EList<Token> _kens = PlaceAspect.tokens(place);
            Token _createToken = PetrinetFactory.eINSTANCE.createToken();
            _kens.add(_createToken);
          }
        }
      }
    }
    NetAspect.running(_self, true);
  }
  
  protected static void _privk3_run(final NetAspectNetAspectProperties _self_, final Net _self) {
    while (NetAspect.running(_self)) {
      NetAspect.fireEnabledTransition(_self);
    }
  }
  
  protected static void _privk3_fireEnabledTransition(final NetAspectNetAspectProperties _self_, final Net _self) {
    EList<Transition> _transitions = _self.getTransitions();
    final Function1<Transition, Boolean> _function = (Transition t) -> {
      return Boolean.valueOf(TransitionAspect.isEnabled(t));
    };
    final Transition enabledTransition = IterableExtensions.<Transition>findFirst(_transitions, _function);
    boolean _notEquals = (!Objects.equal(enabledTransition, null));
    if (_notEquals) {
      TransitionAspect.fire(enabledTransition);
    }
  }
  
  protected static void _privk3_stop(final NetAspectNetAspectProperties _self_, final Net _self) {
    NetAspect.running(_self, false);
  }
  
  protected static boolean _privk3_running(final NetAspectNetAspectProperties _self_, final Net _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getRunning") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.running;
  }
  
  protected static void _privk3_running(final NetAspectNetAspectProperties _self_, final Net _self, final boolean running) {
    _self_.running = running; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setRunning")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, running);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
