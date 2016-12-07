package fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet;

import fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Net;
import fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetFactory;
import fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage;
import fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Place;
import fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PlaceAddTokenEvent;
import fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PlaceRemoveTokenEvent;
import fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Token;
import fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Transition;
import fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class PetrinetFactoryAdapter extends EFactoryImpl implements PetrinetFactory {
  private PetrinetMTAdaptersFactory adaptersFactory = fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory.getInstance();
  
  private fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetFactory petrinetAdaptee = fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetFactory.eINSTANCE;
  
  @Override
  public Net createNet() {
    return adaptersFactory.createNetAdapter(petrinetAdaptee.createNet(), null);
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(petrinetAdaptee.createTransition(), null);
  }
  
  @Override
  public Place createPlace() {
    return adaptersFactory.createPlaceAdapter(petrinetAdaptee.createPlace(), null);
  }
  
  @Override
  public Token createToken() {
    return adaptersFactory.createTokenAdapter(petrinetAdaptee.createToken(), null);
  }
  
  @Override
  public PlaceAddTokenEvent createPlaceAddTokenEvent() {
    return adaptersFactory.createPlaceAddTokenEventAdapter(petrinetAdaptee.createPlaceAddTokenEvent(), null);
  }
  
  @Override
  public PlaceRemoveTokenEvent createPlaceRemoveTokenEvent() {
    return adaptersFactory.createPlaceRemoveTokenEventAdapter(petrinetAdaptee.createPlaceRemoveTokenEvent(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getPetrinetPackage();
  }
  
  public PetrinetPackage getPetrinetPackage() {
    return fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.eINSTANCE;
  }
}
