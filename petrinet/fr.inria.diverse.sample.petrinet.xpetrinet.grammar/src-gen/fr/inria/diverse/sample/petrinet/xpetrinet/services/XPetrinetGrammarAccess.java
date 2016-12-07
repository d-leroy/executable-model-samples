/*
 * generated by Xtext 2.9.2
 */
package fr.inria.diverse.sample.petrinet.xpetrinet.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class XPetrinetGrammarAccess extends AbstractGrammarElementFinder {
	
	public class NetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.sample.petrinet.xpetrinet.XPetrinet.Net");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNetAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNetKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cPlacesKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cPlacesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cPlacesPlaceParserRuleCall_2_1_0 = (RuleCall)cPlacesAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cPlacesAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cPlacesPlaceParserRuleCall_2_2_1_0 = (RuleCall)cPlacesAssignment_2_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cTransitionsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cTransitionsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cTransitionsTransitionParserRuleCall_3_1_0 = (RuleCall)cTransitionsAssignment_3_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cTransitionsAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cTransitionsTransitionParserRuleCall_3_2_1_0 = (RuleCall)cTransitionsAssignment_3_2_1.eContents().get(0);
		
		//Net:
		//	{Net}
		//	'Net' ('places' places+=Place ("," places+=Place)*)? ('transitions' transitions+=Transition (","
		//	transitions+=Transition)*)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Net} 'Net' ('places' places+=Place ("," places+=Place)*)? ('transitions' transitions+=Transition (","
		//transitions+=Transition)*)?
		public Group getGroup() { return cGroup; }
		
		//{Net}
		public Action getNetAction_0() { return cNetAction_0; }
		
		//'Net'
		public Keyword getNetKeyword_1() { return cNetKeyword_1; }
		
		//('places' places+=Place ("," places+=Place)*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'places'
		public Keyword getPlacesKeyword_2_0() { return cPlacesKeyword_2_0; }
		
		//places+=Place
		public Assignment getPlacesAssignment_2_1() { return cPlacesAssignment_2_1; }
		
		//Place
		public RuleCall getPlacesPlaceParserRuleCall_2_1_0() { return cPlacesPlaceParserRuleCall_2_1_0; }
		
		//("," places+=Place)*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//places+=Place
		public Assignment getPlacesAssignment_2_2_1() { return cPlacesAssignment_2_2_1; }
		
		//Place
		public RuleCall getPlacesPlaceParserRuleCall_2_2_1_0() { return cPlacesPlaceParserRuleCall_2_2_1_0; }
		
		//('transitions' transitions+=Transition ("," transitions+=Transition)*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'transitions'
		public Keyword getTransitionsKeyword_3_0() { return cTransitionsKeyword_3_0; }
		
		//transitions+=Transition
		public Assignment getTransitionsAssignment_3_1() { return cTransitionsAssignment_3_1; }
		
		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_3_1_0() { return cTransitionsTransitionParserRuleCall_3_1_0; }
		
		//("," transitions+=Transition)*
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//","
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }
		
		//transitions+=Transition
		public Assignment getTransitionsAssignment_3_2_1() { return cTransitionsAssignment_3_2_1; }
		
		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_3_2_1_0() { return cTransitionsTransitionParserRuleCall_3_2_1_0; }
	}
	public class PlaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.sample.petrinet.xpetrinet.XPetrinet.Place");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPlaceAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPlaceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cInitialTokensKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cInitialTokensAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cInitialTokensEIntParserRuleCall_3_1_0 = (RuleCall)cInitialTokensAssignment_3_1.eContents().get(0);
		
		//Place:
		//	{Place}
		//	'place'
		//	name=EString ('initialTokens' initialTokens=EInt)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Place} 'place' name=EString ('initialTokens' initialTokens=EInt)?
		public Group getGroup() { return cGroup; }
		
		//{Place}
		public Action getPlaceAction_0() { return cPlaceAction_0; }
		
		//'place'
		public Keyword getPlaceKeyword_1() { return cPlaceKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//('initialTokens' initialTokens=EInt)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'initialTokens'
		public Keyword getInitialTokensKeyword_3_0() { return cInitialTokensKeyword_3_0; }
		
		//initialTokens=EInt
		public Assignment getInitialTokensAssignment_3_1() { return cInitialTokensAssignment_3_1; }
		
		//EInt
		public RuleCall getInitialTokensEIntParserRuleCall_3_1_0() { return cInitialTokensEIntParserRuleCall_3_1_0; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.sample.petrinet.xpetrinet.XPetrinet.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTransitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInputAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cInputPlaceCrossReference_3_0 = (CrossReference)cInputAssignment_3.eContents().get(0);
		private final RuleCall cInputPlaceEStringParserRuleCall_3_0_1 = (RuleCall)cInputPlaceCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cInputAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cInputPlaceCrossReference_4_1_0 = (CrossReference)cInputAssignment_4_1.eContents().get(0);
		private final RuleCall cInputPlaceEStringParserRuleCall_4_1_0_1 = (RuleCall)cInputPlaceCrossReference_4_1_0.eContents().get(1);
		private final Keyword cToKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cOutputAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cOutputPlaceCrossReference_6_0 = (CrossReference)cOutputAssignment_6.eContents().get(0);
		private final RuleCall cOutputPlaceEStringParserRuleCall_6_0_1 = (RuleCall)cOutputPlaceCrossReference_6_0.eContents().get(1);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cCommaKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cOutputAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final CrossReference cOutputPlaceCrossReference_7_1_0 = (CrossReference)cOutputAssignment_7_1.eContents().get(0);
		private final RuleCall cOutputPlaceEStringParserRuleCall_7_1_0_1 = (RuleCall)cOutputPlaceCrossReference_7_1_0.eContents().get(1);
		
		//Transition:
		//	'transition'
		//	name=EString
		//	'from' input+=[Place|EString] ("," input+=[Place|EString])*
		//	'to' output+=[Place|EString] ("," output+=[Place|EString])*;
		@Override public ParserRule getRule() { return rule; }
		
		//'transition' name=EString 'from' input+=[Place|EString] ("," input+=[Place|EString])* 'to' output+=[Place|EString] (","
		//output+=[Place|EString])*
		public Group getGroup() { return cGroup; }
		
		//'transition'
		public Keyword getTransitionKeyword_0() { return cTransitionKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'from'
		public Keyword getFromKeyword_2() { return cFromKeyword_2; }
		
		//input+=[Place|EString]
		public Assignment getInputAssignment_3() { return cInputAssignment_3; }
		
		//[Place|EString]
		public CrossReference getInputPlaceCrossReference_3_0() { return cInputPlaceCrossReference_3_0; }
		
		//EString
		public RuleCall getInputPlaceEStringParserRuleCall_3_0_1() { return cInputPlaceEStringParserRuleCall_3_0_1; }
		
		//("," input+=[Place|EString])*
		public Group getGroup_4() { return cGroup_4; }
		
		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//input+=[Place|EString]
		public Assignment getInputAssignment_4_1() { return cInputAssignment_4_1; }
		
		//[Place|EString]
		public CrossReference getInputPlaceCrossReference_4_1_0() { return cInputPlaceCrossReference_4_1_0; }
		
		//EString
		public RuleCall getInputPlaceEStringParserRuleCall_4_1_0_1() { return cInputPlaceEStringParserRuleCall_4_1_0_1; }
		
		//'to'
		public Keyword getToKeyword_5() { return cToKeyword_5; }
		
		//output+=[Place|EString]
		public Assignment getOutputAssignment_6() { return cOutputAssignment_6; }
		
		//[Place|EString]
		public CrossReference getOutputPlaceCrossReference_6_0() { return cOutputPlaceCrossReference_6_0; }
		
		//EString
		public RuleCall getOutputPlaceEStringParserRuleCall_6_0_1() { return cOutputPlaceEStringParserRuleCall_6_0_1; }
		
		//("," output+=[Place|EString])*
		public Group getGroup_7() { return cGroup_7; }
		
		//","
		public Keyword getCommaKeyword_7_0() { return cCommaKeyword_7_0; }
		
		//output+=[Place|EString]
		public Assignment getOutputAssignment_7_1() { return cOutputAssignment_7_1; }
		
		//[Place|EString]
		public CrossReference getOutputPlaceCrossReference_7_1_0() { return cOutputPlaceCrossReference_7_1_0; }
		
		//EString
		public RuleCall getOutputPlaceEStringParserRuleCall_7_1_0_1() { return cOutputPlaceEStringParserRuleCall_7_1_0_1; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.sample.petrinet.xpetrinet.XPetrinet.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.diverse.sample.petrinet.xpetrinet.XPetrinet.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt ecore::EInt:
		//	'-'? INT
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	
	
	private final NetElements pNet;
	private final PlaceElements pPlace;
	private final TransitionElements pTransition;
	private final EStringElements pEString;
	private final EIntElements pEInt;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public XPetrinetGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pNet = new NetElements();
		this.pPlace = new PlaceElements();
		this.pTransition = new TransitionElements();
		this.pEString = new EStringElements();
		this.pEInt = new EIntElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.inria.diverse.sample.petrinet.xpetrinet.XPetrinet".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Net:
	//	{Net}
	//	'Net' ('places' places+=Place ("," places+=Place)*)? ('transitions' transitions+=Transition (","
	//	transitions+=Transition)*)?;
	public NetElements getNetAccess() {
		return pNet;
	}
	
	public ParserRule getNetRule() {
		return getNetAccess().getRule();
	}
	
	//Place:
	//	{Place}
	//	'place'
	//	name=EString ('initialTokens' initialTokens=EInt)?;
	public PlaceElements getPlaceAccess() {
		return pPlace;
	}
	
	public ParserRule getPlaceRule() {
		return getPlaceAccess().getRule();
	}
	
	//Transition:
	//	'transition'
	//	name=EString
	//	'from' input+=[Place|EString] ("," input+=[Place|EString])*
	//	'to' output+=[Place|EString] ("," output+=[Place|EString])*;
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
