package fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.petrinet;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Token;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class TokenAdapter extends EObjectAdapter<Token> implements fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Token {
  private PetrinetMTAdaptersFactory adaptersFactory;
  
  public TokenAdapter() {
    super(fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.PetrinetMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage.eINSTANCE.getToken();
  }
}
