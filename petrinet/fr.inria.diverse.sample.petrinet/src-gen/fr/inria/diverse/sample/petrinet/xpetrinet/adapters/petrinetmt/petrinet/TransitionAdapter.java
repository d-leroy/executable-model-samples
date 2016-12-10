package fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Place;
import fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Transition {
  private PetrinetMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private EList<Place> input_;
  
  @Override
  public EList<Place> getInput() {
    if (input_ == null)
    	input_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInput(), adaptersFactory, eResource);
    return input_;
  }
  
  private EList<Place> output_;
  
  @Override
  public EList<Place> getOutput() {
    if (output_ == null)
    	output_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutput(), adaptersFactory, eResource);
    return output_;
  }
  
  @Override
  public void fire() {
    fr.inria.diverse.sample.petrinet.xpetrinet.aspects.TransitionAspect.fire(adaptee);
  }
  
  @Override
  public boolean fire_PreCondition() {
    return fr.inria.diverse.sample.petrinet.xpetrinet.aspects.TransitionAspect.fire_PreCondition(adaptee);
  }
  
  @Override
  public boolean isEnabled() {
    return fr.inria.diverse.sample.petrinet.xpetrinet.aspects.TransitionAspect.isEnabled(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.TRANSITION__INPUT:
    		return getInput();
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.TRANSITION__OUTPUT:
    		return getOutput();
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.TRANSITION__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.TRANSITION__INPUT:
    		return getInput() != null && !getInput().isEmpty();
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.TRANSITION__OUTPUT:
    		return getOutput() != null && !getOutput().isEmpty();
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.TRANSITION__INPUT:
    		getInput().clear();
    		getInput().addAll((Collection) newValue);
    		return;
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.TRANSITION__OUTPUT:
    		getOutput().clear();
    		getOutput().addAll((Collection) newValue);
    		return;
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
