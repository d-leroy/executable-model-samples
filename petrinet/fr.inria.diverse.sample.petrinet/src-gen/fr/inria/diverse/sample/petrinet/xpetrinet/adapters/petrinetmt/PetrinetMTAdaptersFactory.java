package fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.NetAdapter;
import fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.NetStopEventAdapter;
import fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.PlaceAdapter;
import fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.PlaceAddTokenEventAdapter;
import fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.PlaceRemoveTokenEventAdapter;
import fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.TokenAdapter;
import fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.TransitionAdapter;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Net;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.NetStopEvent;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PlaceAddTokenEvent;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PlaceRemoveTokenEvent;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class PetrinetMTAdaptersFactory implements AdaptersFactory {
  private static PetrinetMTAdaptersFactory instance;
  
  public static PetrinetMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public PetrinetMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Net){
    	return createNetAdapter((fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Net) o, res);
    }
    if (o instanceof fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition){
    	return createTransitionAdapter((fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition) o, res);
    }
    if (o instanceof fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place){
    	return createPlaceAdapter((fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place) o, res);
    }
    if (o instanceof fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token){
    	return createTokenAdapter((fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token) o, res);
    }
    if (o instanceof fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.NetStopEvent){
    	return createNetStopEventAdapter((fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.NetStopEvent) o, res);
    }
    if (o instanceof fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PlaceAddTokenEvent){
    	return createPlaceAddTokenEventAdapter((fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PlaceAddTokenEvent) o, res);
    }
    if (o instanceof fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PlaceRemoveTokenEvent){
    	return createPlaceRemoveTokenEventAdapter((fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PlaceRemoveTokenEvent) o, res);
    }
    
    return null;
  }
  
  public NetAdapter createNetAdapter(final Net adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.NetAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.NetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.NetAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.TransitionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.TransitionAdapter) adapter;
    }
  }
  
  public PlaceAdapter createPlaceAdapter(final Place adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.PlaceAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.PlaceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.PlaceAdapter) adapter;
    }
  }
  
  public TokenAdapter createTokenAdapter(final Token adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.TokenAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.TokenAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.TokenAdapter) adapter;
    }
  }
  
  public NetStopEventAdapter createNetStopEventAdapter(final NetStopEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.NetStopEventAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.NetStopEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.NetStopEventAdapter) adapter;
    }
  }
  
  public PlaceAddTokenEventAdapter createPlaceAddTokenEventAdapter(final PlaceAddTokenEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.PlaceAddTokenEventAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.PlaceAddTokenEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.PlaceAddTokenEventAdapter) adapter;
    }
  }
  
  public PlaceRemoveTokenEventAdapter createPlaceRemoveTokenEventAdapter(final PlaceRemoveTokenEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.PlaceRemoveTokenEventAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.PlaceRemoveTokenEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.PlaceRemoveTokenEventAdapter) adapter;
    }
  }
}
