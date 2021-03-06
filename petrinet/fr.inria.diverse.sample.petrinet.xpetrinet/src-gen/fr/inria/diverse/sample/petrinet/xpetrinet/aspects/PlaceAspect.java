package fr.inria.diverse.sample.petrinet.xpetrinet.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.melange.annotation.Containment;
import fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspectPlaceAspectProperties;
import org.eclipse.emf.common.util.EList;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token;

@Aspect(className = Place.class)
@SuppressWarnings("all")
public class PlaceAspect {
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
