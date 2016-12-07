package fr.inria.diverse.sample.petrinet.xpetrinet.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.diverse.sample.petrinet.xpetrinet.services.XPetrinetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXPetrinetParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Net'", "'places'", "','", "'transitions'", "'place'", "'initialTokens'", "'transition'", "'from'", "'to'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalXPetrinetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXPetrinetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXPetrinetParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXPetrinet.g"; }



     	private XPetrinetGrammarAccess grammarAccess;

        public InternalXPetrinetParser(TokenStream input, XPetrinetGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Net";
       	}

       	@Override
       	protected XPetrinetGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNet"
    // InternalXPetrinet.g:64:1: entryRuleNet returns [EObject current=null] : iv_ruleNet= ruleNet EOF ;
    public final EObject entryRuleNet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNet = null;


        try {
            // InternalXPetrinet.g:64:44: (iv_ruleNet= ruleNet EOF )
            // InternalXPetrinet.g:65:2: iv_ruleNet= ruleNet EOF
            {
             newCompositeNode(grammarAccess.getNetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNet=ruleNet();

            state._fsp--;

             current =iv_ruleNet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNet"


    // $ANTLR start "ruleNet"
    // InternalXPetrinet.g:71:1: ruleNet returns [EObject current=null] : ( () otherlv_1= 'Net' (otherlv_2= 'places' ( (lv_places_3_0= rulePlace ) ) (otherlv_4= ',' ( (lv_places_5_0= rulePlace ) ) )* )? (otherlv_6= 'transitions' ( (lv_transitions_7_0= ruleTransition ) ) (otherlv_8= ',' ( (lv_transitions_9_0= ruleTransition ) ) )* )? ) ;
    public final EObject ruleNet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_places_3_0 = null;

        EObject lv_places_5_0 = null;

        EObject lv_transitions_7_0 = null;

        EObject lv_transitions_9_0 = null;



        	enterRule();

        try {
            // InternalXPetrinet.g:77:2: ( ( () otherlv_1= 'Net' (otherlv_2= 'places' ( (lv_places_3_0= rulePlace ) ) (otherlv_4= ',' ( (lv_places_5_0= rulePlace ) ) )* )? (otherlv_6= 'transitions' ( (lv_transitions_7_0= ruleTransition ) ) (otherlv_8= ',' ( (lv_transitions_9_0= ruleTransition ) ) )* )? ) )
            // InternalXPetrinet.g:78:2: ( () otherlv_1= 'Net' (otherlv_2= 'places' ( (lv_places_3_0= rulePlace ) ) (otherlv_4= ',' ( (lv_places_5_0= rulePlace ) ) )* )? (otherlv_6= 'transitions' ( (lv_transitions_7_0= ruleTransition ) ) (otherlv_8= ',' ( (lv_transitions_9_0= ruleTransition ) ) )* )? )
            {
            // InternalXPetrinet.g:78:2: ( () otherlv_1= 'Net' (otherlv_2= 'places' ( (lv_places_3_0= rulePlace ) ) (otherlv_4= ',' ( (lv_places_5_0= rulePlace ) ) )* )? (otherlv_6= 'transitions' ( (lv_transitions_7_0= ruleTransition ) ) (otherlv_8= ',' ( (lv_transitions_9_0= ruleTransition ) ) )* )? )
            // InternalXPetrinet.g:79:3: () otherlv_1= 'Net' (otherlv_2= 'places' ( (lv_places_3_0= rulePlace ) ) (otherlv_4= ',' ( (lv_places_5_0= rulePlace ) ) )* )? (otherlv_6= 'transitions' ( (lv_transitions_7_0= ruleTransition ) ) (otherlv_8= ',' ( (lv_transitions_9_0= ruleTransition ) ) )* )?
            {
            // InternalXPetrinet.g:79:3: ()
            // InternalXPetrinet.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetAccess().getNetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNetAccess().getNetKeyword_1());
            		
            // InternalXPetrinet.g:90:3: (otherlv_2= 'places' ( (lv_places_3_0= rulePlace ) ) (otherlv_4= ',' ( (lv_places_5_0= rulePlace ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalXPetrinet.g:91:4: otherlv_2= 'places' ( (lv_places_3_0= rulePlace ) ) (otherlv_4= ',' ( (lv_places_5_0= rulePlace ) ) )*
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getNetAccess().getPlacesKeyword_2_0());
                    			
                    // InternalXPetrinet.g:95:4: ( (lv_places_3_0= rulePlace ) )
                    // InternalXPetrinet.g:96:5: (lv_places_3_0= rulePlace )
                    {
                    // InternalXPetrinet.g:96:5: (lv_places_3_0= rulePlace )
                    // InternalXPetrinet.g:97:6: lv_places_3_0= rulePlace
                    {

                    						newCompositeNode(grammarAccess.getNetAccess().getPlacesPlaceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_places_3_0=rulePlace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNetRule());
                    						}
                    						add(
                    							current,
                    							"places",
                    							lv_places_3_0,
                    							"fr.inria.diverse.sample.petrinet.xpetrinet.XPetrinet.Place");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXPetrinet.g:114:4: (otherlv_4= ',' ( (lv_places_5_0= rulePlace ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalXPetrinet.g:115:5: otherlv_4= ',' ( (lv_places_5_0= rulePlace ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getNetAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalXPetrinet.g:119:5: ( (lv_places_5_0= rulePlace ) )
                    	    // InternalXPetrinet.g:120:6: (lv_places_5_0= rulePlace )
                    	    {
                    	    // InternalXPetrinet.g:120:6: (lv_places_5_0= rulePlace )
                    	    // InternalXPetrinet.g:121:7: lv_places_5_0= rulePlace
                    	    {

                    	    							newCompositeNode(grammarAccess.getNetAccess().getPlacesPlaceParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_places_5_0=rulePlace();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"places",
                    	    								lv_places_5_0,
                    	    								"fr.inria.diverse.sample.petrinet.xpetrinet.XPetrinet.Place");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalXPetrinet.g:140:3: (otherlv_6= 'transitions' ( (lv_transitions_7_0= ruleTransition ) ) (otherlv_8= ',' ( (lv_transitions_9_0= ruleTransition ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXPetrinet.g:141:4: otherlv_6= 'transitions' ( (lv_transitions_7_0= ruleTransition ) ) (otherlv_8= ',' ( (lv_transitions_9_0= ruleTransition ) ) )*
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getNetAccess().getTransitionsKeyword_3_0());
                    			
                    // InternalXPetrinet.g:145:4: ( (lv_transitions_7_0= ruleTransition ) )
                    // InternalXPetrinet.g:146:5: (lv_transitions_7_0= ruleTransition )
                    {
                    // InternalXPetrinet.g:146:5: (lv_transitions_7_0= ruleTransition )
                    // InternalXPetrinet.g:147:6: lv_transitions_7_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getNetAccess().getTransitionsTransitionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_transitions_7_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNetRule());
                    						}
                    						add(
                    							current,
                    							"transitions",
                    							lv_transitions_7_0,
                    							"fr.inria.diverse.sample.petrinet.xpetrinet.XPetrinet.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXPetrinet.g:164:4: (otherlv_8= ',' ( (lv_transitions_9_0= ruleTransition ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalXPetrinet.g:165:5: otherlv_8= ',' ( (lv_transitions_9_0= ruleTransition ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getNetAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalXPetrinet.g:169:5: ( (lv_transitions_9_0= ruleTransition ) )
                    	    // InternalXPetrinet.g:170:6: (lv_transitions_9_0= ruleTransition )
                    	    {
                    	    // InternalXPetrinet.g:170:6: (lv_transitions_9_0= ruleTransition )
                    	    // InternalXPetrinet.g:171:7: lv_transitions_9_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getNetAccess().getTransitionsTransitionParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_transitions_9_0=ruleTransition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transitions",
                    	    								lv_transitions_9_0,
                    	    								"fr.inria.diverse.sample.petrinet.xpetrinet.XPetrinet.Transition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNet"


    // $ANTLR start "entryRulePlace"
    // InternalXPetrinet.g:194:1: entryRulePlace returns [EObject current=null] : iv_rulePlace= rulePlace EOF ;
    public final EObject entryRulePlace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlace = null;


        try {
            // InternalXPetrinet.g:194:46: (iv_rulePlace= rulePlace EOF )
            // InternalXPetrinet.g:195:2: iv_rulePlace= rulePlace EOF
            {
             newCompositeNode(grammarAccess.getPlaceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlace=rulePlace();

            state._fsp--;

             current =iv_rulePlace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // InternalXPetrinet.g:201:1: rulePlace returns [EObject current=null] : ( () otherlv_1= 'place' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'initialTokens' ( (lv_initialTokens_4_0= ruleEInt ) ) )? ) ;
    public final EObject rulePlace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialTokens_4_0 = null;



        	enterRule();

        try {
            // InternalXPetrinet.g:207:2: ( ( () otherlv_1= 'place' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'initialTokens' ( (lv_initialTokens_4_0= ruleEInt ) ) )? ) )
            // InternalXPetrinet.g:208:2: ( () otherlv_1= 'place' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'initialTokens' ( (lv_initialTokens_4_0= ruleEInt ) ) )? )
            {
            // InternalXPetrinet.g:208:2: ( () otherlv_1= 'place' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'initialTokens' ( (lv_initialTokens_4_0= ruleEInt ) ) )? )
            // InternalXPetrinet.g:209:3: () otherlv_1= 'place' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'initialTokens' ( (lv_initialTokens_4_0= ruleEInt ) ) )?
            {
            // InternalXPetrinet.g:209:3: ()
            // InternalXPetrinet.g:210:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlaceAccess().getPlaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPlaceAccess().getPlaceKeyword_1());
            		
            // InternalXPetrinet.g:220:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXPetrinet.g:221:4: (lv_name_2_0= ruleEString )
            {
            // InternalXPetrinet.g:221:4: (lv_name_2_0= ruleEString )
            // InternalXPetrinet.g:222:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPlaceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.diverse.sample.petrinet.xpetrinet.XPetrinet.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXPetrinet.g:239:3: (otherlv_3= 'initialTokens' ( (lv_initialTokens_4_0= ruleEInt ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXPetrinet.g:240:4: otherlv_3= 'initialTokens' ( (lv_initialTokens_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getPlaceAccess().getInitialTokensKeyword_3_0());
                    			
                    // InternalXPetrinet.g:244:4: ( (lv_initialTokens_4_0= ruleEInt ) )
                    // InternalXPetrinet.g:245:5: (lv_initialTokens_4_0= ruleEInt )
                    {
                    // InternalXPetrinet.g:245:5: (lv_initialTokens_4_0= ruleEInt )
                    // InternalXPetrinet.g:246:6: lv_initialTokens_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPlaceAccess().getInitialTokensEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_initialTokens_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlaceRule());
                    						}
                    						set(
                    							current,
                    							"initialTokens",
                    							lv_initialTokens_4_0,
                    							"fr.inria.diverse.sample.petrinet.xpetrinet.XPetrinet.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRuleTransition"
    // InternalXPetrinet.g:268:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalXPetrinet.g:268:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalXPetrinet.g:269:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalXPetrinet.g:275:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalXPetrinet.g:281:2: ( (otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) )
            // InternalXPetrinet.g:282:2: (otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            {
            // InternalXPetrinet.g:282:2: (otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            // InternalXPetrinet.g:283:3: otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalXPetrinet.g:287:3: ( (lv_name_1_0= ruleEString ) )
            // InternalXPetrinet.g:288:4: (lv_name_1_0= ruleEString )
            {
            // InternalXPetrinet.g:288:4: (lv_name_1_0= ruleEString )
            // InternalXPetrinet.g:289:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.sample.petrinet.xpetrinet.XPetrinet.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getFromKeyword_2());
            		
            // InternalXPetrinet.g:310:3: ( ( ruleEString ) )
            // InternalXPetrinet.g:311:4: ( ruleEString )
            {
            // InternalXPetrinet.g:311:4: ( ruleEString )
            // InternalXPetrinet.g:312:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getInputPlaceCrossReference_3_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXPetrinet.g:326:3: (otherlv_4= ',' ( ( ruleEString ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalXPetrinet.g:327:4: otherlv_4= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_8); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalXPetrinet.g:331:4: ( ( ruleEString ) )
            	    // InternalXPetrinet.g:332:5: ( ruleEString )
            	    {
            	    // InternalXPetrinet.g:332:5: ( ruleEString )
            	    // InternalXPetrinet.g:333:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTransitionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTransitionAccess().getInputPlaceCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getToKeyword_5());
            		
            // InternalXPetrinet.g:352:3: ( ( ruleEString ) )
            // InternalXPetrinet.g:353:4: ( ruleEString )
            {
            // InternalXPetrinet.g:353:4: ( ruleEString )
            // InternalXPetrinet.g:354:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getOutputPlaceCrossReference_6_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXPetrinet.g:368:3: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    int LA7_1 = input.LA(2);

                    if ( ((LA7_1>=RULE_STRING && LA7_1<=RULE_ID)) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalXPetrinet.g:369:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,13,FOLLOW_8); 

            	    				newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalXPetrinet.g:373:4: ( ( ruleEString ) )
            	    // InternalXPetrinet.g:374:5: ( ruleEString )
            	    {
            	    // InternalXPetrinet.g:374:5: ( ruleEString )
            	    // InternalXPetrinet.g:375:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTransitionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTransitionAccess().getOutputPlaceCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEString"
    // InternalXPetrinet.g:394:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalXPetrinet.g:394:47: (iv_ruleEString= ruleEString EOF )
            // InternalXPetrinet.g:395:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalXPetrinet.g:401:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalXPetrinet.g:407:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalXPetrinet.g:408:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalXPetrinet.g:408:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalXPetrinet.g:409:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXPetrinet.g:417:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalXPetrinet.g:428:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalXPetrinet.g:428:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalXPetrinet.g:429:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalXPetrinet.g:435:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalXPetrinet.g:441:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalXPetrinet.g:442:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalXPetrinet.g:442:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalXPetrinet.g:443:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalXPetrinet.g:443:3: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXPetrinet.g:444:4: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});

}