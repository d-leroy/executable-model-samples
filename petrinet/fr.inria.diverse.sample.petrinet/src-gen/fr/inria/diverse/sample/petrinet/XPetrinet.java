package fr.inria.diverse.sample.petrinet;

import fr.inria.diverse.melange.lib.IMetamodel;
import fr.inria.diverse.sample.petrinet.PetrinetMT;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class XPetrinet implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XPetrinet load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XPetrinet mm = new XPetrinet();
    mm.setResource(res);
    return mm ;
  }
  
  public PetrinetMT toPetrinetMT() {
    fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.XPetrinetAdapter adaptee = new fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.XPetrinetAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
