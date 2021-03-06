/*
 * generated by Xtext 2.9.2
 */
package fr.inria.diverse.sample.petrinet.xpetrinet.parser.antlr;

import com.google.inject.Inject;
import fr.inria.diverse.sample.petrinet.xpetrinet.parser.antlr.internal.InternalXPetrinetParser;
import fr.inria.diverse.sample.petrinet.xpetrinet.services.XPetrinetGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class XPetrinetParser extends AbstractAntlrParser {

	@Inject
	private XPetrinetGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalXPetrinetParser createParser(XtextTokenStream stream) {
		return new InternalXPetrinetParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Net";
	}

	public XPetrinetGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(XPetrinetGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
