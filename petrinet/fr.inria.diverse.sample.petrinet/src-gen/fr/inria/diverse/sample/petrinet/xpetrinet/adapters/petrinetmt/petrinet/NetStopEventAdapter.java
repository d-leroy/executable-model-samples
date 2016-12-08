package fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Net;
import fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.NetStopEvent;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class NetStopEventAdapter extends EObjectAdapter<NetStopEvent> implements fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.NetStopEvent {
  private PetrinetMTAdaptersFactory adaptersFactory;
  
  public NetStopEventAdapter() {
    super(fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Net getNet() {
    return (Net) adaptersFactory.createAdapter(adaptee.getNet(), eResource);
  }
  
  @Override
  public void setNet(final Net o) {
    if (o != null)
    	adaptee.setNet(((fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.NetAdapter) o).getAdaptee());
    else adaptee.setNet(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.eINSTANCE.getNetStopEvent();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.NET_STOP_EVENT__NET:
    		return getNet();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.NET_STOP_EVENT__NET:
    		return getNet() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.NET_STOP_EVENT__NET:
    		setNet(
    		(fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Net)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
