package fr.inria.diverse.sample.petrinet.xpetrinet.aspects;

import fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspectPlaceAspectProperties;
import java.util.Map;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place;

@SuppressWarnings("all")
public class PlaceAspectPlaceAspectContext {
  public final static PlaceAspectPlaceAspectContext INSTANCE = new PlaceAspectPlaceAspectContext();
  
  public static PlaceAspectPlaceAspectProperties getSelf(final Place _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspectPlaceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Place, PlaceAspectPlaceAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place, fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspectPlaceAspectProperties>();
  
  public Map<Place, PlaceAspectPlaceAspectProperties> getMap() {
    return map;
  }
}
