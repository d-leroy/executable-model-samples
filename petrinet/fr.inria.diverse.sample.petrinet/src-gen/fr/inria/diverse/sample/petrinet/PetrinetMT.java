package fr.inria.diverse.sample.petrinet;

import fr.inria.diverse.melange.lib.IModelType;
import fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetFactory;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface PetrinetMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract PetrinetFactory getPetrinetFactory();
  
  public abstract void save(final String uri) throws IOException;
}
