package fr.inria.diverse.sample.petrinet;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage.eNS_URI,
    	fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor xPetrinet = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"fr.inria.diverse.sample.petrinet.XPetrinet", "", "http://fr.inria.diverse.sample.petrinet.xpetrinet/petrinet/", "fr.inria.diverse.sample.petrinet.PetrinetMT"
    );
    xPetrinet.addAdapter("fr.inria.diverse.sample.petrinet.PetrinetMT", fr.inria.diverse.sample.petrinet.xpetrinet.adapters.petrinetmt.XPetrinetAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"fr.inria.diverse.sample.petrinet.XPetrinet",
    	xPetrinet
    );
    MelangeRegistry.ModelTypeDescriptor petrinetMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"fr.inria.diverse.sample.petrinet.PetrinetMT", "", "http://fr.inria.diverse.sample.petrinet.petrinetmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"fr.inria.diverse.sample.petrinet.PetrinetMT",
    	petrinetMT
    );
  }
}
