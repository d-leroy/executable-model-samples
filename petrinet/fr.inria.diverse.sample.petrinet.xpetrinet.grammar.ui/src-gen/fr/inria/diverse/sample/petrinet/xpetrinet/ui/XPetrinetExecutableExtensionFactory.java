/*
 * generated by Xtext 2.9.2
 */
package fr.inria.diverse.sample.petrinet.xpetrinet.ui;

import com.google.inject.Injector;
import fr.inria.diverse.sample.petrinet.xpetrinet.grammar.ui.internal.GrammarActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class XPetrinetExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return GrammarActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return GrammarActivator.getInstance().getInjector(GrammarActivator.FR_INRIA_DIVERSE_SAMPLE_PETRINET_XPETRINET_XPETRINET);
	}
	
}
