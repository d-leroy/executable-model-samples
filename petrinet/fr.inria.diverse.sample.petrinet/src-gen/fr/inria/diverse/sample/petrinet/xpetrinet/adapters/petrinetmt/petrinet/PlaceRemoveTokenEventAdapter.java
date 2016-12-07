package fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Place;
import fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PlaceRemoveTokenEvent;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class PlaceRemoveTokenEventAdapter extends EObjectAdapter<PlaceRemoveTokenEvent> implements fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PlaceRemoveTokenEvent {
  private PetrinetMTAdaptersFactory adaptersFactory;
  
  public PlaceRemoveTokenEventAdapter() {
    super(fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Place getPlace() {
    return (Place) adaptersFactory.createAdapter(adaptee.getPlace(), eResource);
  }
  
  @Override
  public void setPlace(final Place o) {
    if (o != null)
    	adaptee.setPlace(((fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.PlaceAdapter) o).getAdaptee());
    else adaptee.setPlace(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.eINSTANCE.getPlaceRemoveTokenEvent();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.PLACE_REMOVE_TOKEN_EVENT__PLACE:
    		return getPlace();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.PLACE_REMOVE_TOKEN_EVENT__PLACE:
    		return getPlace() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.PLACE_REMOVE_TOKEN_EVENT__PLACE:
    		setPlace(
    		(fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Place)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
