package fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Transition;
import fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.TransitionFireEvent;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class TransitionFireEventAdapter extends EObjectAdapter<TransitionFireEvent> implements fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.TransitionFireEvent {
  private PetrinetMTAdaptersFactory adaptersFactory;
  
  public TransitionFireEventAdapter() {
    super(fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Transition getTransition() {
    return (Transition) adaptersFactory.createAdapter(adaptee.getTransition(), eResource);
  }
  
  @Override
  public void setTransition(final Transition o) {
    if (o != null)
    	adaptee.setTransition(((fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.TransitionAdapter) o).getAdaptee());
    else adaptee.setTransition(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.eINSTANCE.getTransitionFireEvent();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.TRANSITION_FIRE_EVENT__TRANSITION:
    		return getTransition();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.TRANSITION_FIRE_EVENT__TRANSITION:
    		return getTransition() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.TRANSITION_FIRE_EVENT__TRANSITION:
    		setTransition(
    		(fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Transition)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
