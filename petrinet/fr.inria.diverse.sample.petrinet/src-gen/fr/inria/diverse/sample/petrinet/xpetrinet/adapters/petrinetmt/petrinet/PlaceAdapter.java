package fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Token;
import fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class PlaceAdapter extends EObjectAdapter<Place> implements fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Place {
  private PetrinetMTAdaptersFactory adaptersFactory;
  
  public PlaceAdapter() {
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
  
  @Override
  public int getInitialTokens() {
    return adaptee.getInitialTokens();
  }
  
  @Override
  public void setInitialTokens(final int o) {
    adaptee.setInitialTokens(o);
  }
  
  @Override
  public EList<Token> getTokens() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(fr.inria.diverse.sample.petrinet.xpetrinet.aspects.PlaceAspect.tokens(adaptee), adaptersFactory, eResource);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static int INITIAL_TOKENS_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.eINSTANCE.getPlace();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.PLACE__NAME:
    		return getName();
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.PLACE__INITIAL_TOKENS:
    		return new java.lang.Integer(getInitialTokens());
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.PLACE__TOKENS:
    		return getTokens();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.PLACE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.PLACE__INITIAL_TOKENS:
    		return getInitialTokens() != INITIAL_TOKENS_EDEFAULT;
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.PLACE__TOKENS:
    		return getTokens() != null && !getTokens().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.PLACE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.PLACE__INITIAL_TOKENS:
    		setInitialTokens(((java.lang.Integer) newValue).intValue());
    		return;
    	case fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.PLACE__TOKENS:
    		getTokens().clear();
    		getTokens().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
