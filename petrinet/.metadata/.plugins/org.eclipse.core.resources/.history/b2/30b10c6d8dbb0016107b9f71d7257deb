package fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import fr.inria.diverse.sample.petrinet.PetrinetMT;
import fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetFactory;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class XPetrinetAdapter extends ResourceAdapter implements PetrinetMT {
  public XPetrinetAdapter() {
    super(fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory.getInstance());
  }
  
  @Override
  public PetrinetFactory getPetrinetFactory() {
    return new fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet.PetrinetFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getPetrinetFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
