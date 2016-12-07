package fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Place;
import fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Transition;
import fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Net;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class NetAdapter extends EObjectAdapter<Net> implements fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Net {
  private PetrinetMTAdaptersFactory adaptersFactory;
  
  public NetAdapter() {
    super(fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory.getInstance();
  }
  
  private EList<Place> places_;
  
  @Override
  public EList<Place> getPlaces() {
    if (places_ == null)
    	places_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getPlaces(), adaptersFactory, eResource);
    return places_;
  }
  
  private EList<Transition> transitions_;
  
  @Override
  public EList<Transition> getTransitions() {
    if (transitions_ == null)
    	transitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTransitions(), adaptersFactory, eResource);
    return transitions_;
  }
  
  @Override
  public void initializeModel(final org.eclipse.emf.common.util.EList<java.lang.String> args) {
    fr.inria.diverse.sample.petrinet.xpetrinet.aspects.NetAspect.initializeModel(adaptee, args
    );
  }
  
  @Override
  public void run() {
    fr.inria.diverse.sample.petrinet.xpetrinet.aspects.NetAspect.run(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.eINSTANCE.getNet();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.NET__PLACES:
    		return getPlaces();
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.NET__TRANSITIONS:
    		return getTransitions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.NET__PLACES:
    		return getPlaces() != null && !getPlaces().isEmpty();
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.NET__TRANSITIONS:
    		return getTransitions() != null && !getTransitions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.NET__PLACES:
    		getPlaces().clear();
    		getPlaces().addAll((Collection) newValue);
    		return;
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.NET__TRANSITIONS:
    		getTransitions().clear();
    		getTransitions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
