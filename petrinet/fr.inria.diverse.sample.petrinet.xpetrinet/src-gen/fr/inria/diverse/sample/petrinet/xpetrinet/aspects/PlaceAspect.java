package fr.inria.diverse.sample.petrinet.xpetrinet.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.inria.diverse.melange.annotation.Containment;
import fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspectPlaceAspectProperties;
import org.eclipse.emf.common.util.EList;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetFactory;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token;

@Aspect(className = Place.class)
@SuppressWarnings("all")
public class PlaceAspect {
  @Step(eventTriggerable = true)
  public static void addToken(final Place _self) {
	final fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspectPlaceAspectProperties _self_ = fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspectPlaceAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_addToken(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Place", "addToken");
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
  
  public static boolean addToken_PreCondition(final Place _self) {
	final fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspectPlaceAspectProperties _self_ = fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspectPlaceAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_addToken_PreCondition(_self_, _self);
	;
	return (boolean) result;
}
  
  @Step(eventTriggerable = true)
  public static void removeToken(final Place _self) {
	final fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspectPlaceAspectProperties _self_ = fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspectPlaceAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_removeToken(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Place", "removeToken");
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
  
  public static boolean removeToken_PreCondition(final Place _self) {
	final fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspectPlaceAspectProperties _self_ = fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspectPlaceAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_removeToken_PreCondition(_self_, _self);
	;
	return (boolean) result;
}
  
  @Containment
  public static EList<Token> tokens(final Place _self) {
	final fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspectPlaceAspectProperties _self_ = fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspectPlaceAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_tokens(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  @Containment
  public static void tokens(final Place _self, final EList<Token> tokens) {
    final fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspectPlaceAspectProperties _self_ = fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspectPlaceAspectContext.getSelf(_self);
    _privk3_tokens(_self_, _self,tokens);;
  }
  
  protected static void _privk3_addToken(final PlaceAspectPlaceAspectProperties _self_, final Place _self) {
    EList<Token> _kens = PlaceAspect.tokens(_self);
    Token _createToken = PetrinetFactory.eINSTANCE.createToken();
    _kens.add(_createToken);
  }
  
  protected static boolean _privk3_addToken_PreCondition(final PlaceAspectPlaceAspectProperties _self_, final Place _self) {
    EList<Token> _kens = PlaceAspect.tokens(_self);
    return _kens.isEmpty();
  }
  
  protected static void _privk3_removeToken(final PlaceAspectPlaceAspectProperties _self_, final Place _self) {
    EList<Token> _kens = PlaceAspect.tokens(_self);
    _kens.remove(0);
  }
  
  protected static boolean _privk3_removeToken_PreCondition(final PlaceAspectPlaceAspectProperties _self_, final Place _self) {
    EList<Token> _kens = PlaceAspect.tokens(_self);
    boolean _isEmpty = _kens.isEmpty();
    return (!_isEmpty);
  }
  
  protected static EList<Token> _privk3_tokens(final PlaceAspectPlaceAspectProperties _self_, final Place _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTokens") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.common.util.EList) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.tokens;
  }
  
  protected static void _privk3_tokens(final PlaceAspectPlaceAspectProperties _self_, final Place _self, final EList<Token> tokens) {
    _self_.tokens = tokens; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTokens")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, tokens);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
