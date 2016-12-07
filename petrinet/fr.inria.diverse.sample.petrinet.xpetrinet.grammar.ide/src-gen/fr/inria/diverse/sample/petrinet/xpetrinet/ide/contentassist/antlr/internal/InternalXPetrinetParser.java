package fr.inria.diverse.sample.petrinet.xpetrinet.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.inria.diverse.sample.petrinet.xpetrinet.services.XPetrinetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXPetrinetParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(XPetrinetGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleNet"
    // InternalXPetrinet.g:53:1: entryRuleNet : ruleNet EOF ;
    public final void entryRuleNet() throws RecognitionException {
        try {
            // InternalXPetrinet.g:54:1: ( ruleNet EOF )
            // InternalXPetrinet.g:55:1: ruleNet EOF
            {
             before(grammarAccess.getNetRule()); 
            pushFollow(FOLLOW_1);
            ruleNet();

            state._fsp--;

             after(grammarAccess.getNetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNet"


    // $ANTLR start "ruleNet"
    // InternalXPetrinet.g:62:1: ruleNet : ( ( rule__Net__Group__0 ) ) ;
    public final void ruleNet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:66:2: ( ( ( rule__Net__Group__0 ) ) )
            // InternalXPetrinet.g:67:2: ( ( rule__Net__Group__0 ) )
            {
            // InternalXPetrinet.g:67:2: ( ( rule__Net__Group__0 ) )
            // InternalXPetrinet.g:68:3: ( rule__Net__Group__0 )
            {
             before(grammarAccess.getNetAccess().getGroup()); 
            // InternalXPetrinet.g:69:3: ( rule__Net__Group__0 )
            // InternalXPetrinet.g:69:4: rule__Net__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Net__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNet"


    // $ANTLR start "entryRulePlace"
    // InternalXPetrinet.g:78:1: entryRulePlace : rulePlace EOF ;
    public final void entryRulePlace() throws RecognitionException {
        try {
            // InternalXPetrinet.g:79:1: ( rulePlace EOF )
            // InternalXPetrinet.g:80:1: rulePlace EOF
            {
             before(grammarAccess.getPlaceRule()); 
            pushFollow(FOLLOW_1);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getPlaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // InternalXPetrinet.g:87:1: rulePlace : ( ( rule__Place__Group__0 ) ) ;
    public final void rulePlace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:91:2: ( ( ( rule__Place__Group__0 ) ) )
            // InternalXPetrinet.g:92:2: ( ( rule__Place__Group__0 ) )
            {
            // InternalXPetrinet.g:92:2: ( ( rule__Place__Group__0 ) )
            // InternalXPetrinet.g:93:3: ( rule__Place__Group__0 )
            {
             before(grammarAccess.getPlaceAccess().getGroup()); 
            // InternalXPetrinet.g:94:3: ( rule__Place__Group__0 )
            // InternalXPetrinet.g:94:4: rule__Place__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRuleTransition"
    // InternalXPetrinet.g:103:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalXPetrinet.g:104:1: ( ruleTransition EOF )
            // InternalXPetrinet.g:105:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalXPetrinet.g:112:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:116:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalXPetrinet.g:117:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalXPetrinet.g:117:2: ( ( rule__Transition__Group__0 ) )
            // InternalXPetrinet.g:118:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalXPetrinet.g:119:3: ( rule__Transition__Group__0 )
            // InternalXPetrinet.g:119:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEString"
    // InternalXPetrinet.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalXPetrinet.g:129:1: ( ruleEString EOF )
            // InternalXPetrinet.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalXPetrinet.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalXPetrinet.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalXPetrinet.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalXPetrinet.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalXPetrinet.g:144:3: ( rule__EString__Alternatives )
            // InternalXPetrinet.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalXPetrinet.g:153:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalXPetrinet.g:154:1: ( ruleEInt EOF )
            // InternalXPetrinet.g:155:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalXPetrinet.g:162:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:166:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalXPetrinet.g:167:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalXPetrinet.g:167:2: ( ( rule__EInt__Group__0 ) )
            // InternalXPetrinet.g:168:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalXPetrinet.g:169:3: ( rule__EInt__Group__0 )
            // InternalXPetrinet.g:169:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalXPetrinet.g:177:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:181:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalXPetrinet.g:182:2: ( RULE_STRING )
                    {
                    // InternalXPetrinet.g:182:2: ( RULE_STRING )
                    // InternalXPetrinet.g:183:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXPetrinet.g:188:2: ( RULE_ID )
                    {
                    // InternalXPetrinet.g:188:2: ( RULE_ID )
                    // InternalXPetrinet.g:189:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Net__Group__0"
    // InternalXPetrinet.g:198:1: rule__Net__Group__0 : rule__Net__Group__0__Impl rule__Net__Group__1 ;
    public final void rule__Net__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:202:1: ( rule__Net__Group__0__Impl rule__Net__Group__1 )
            // InternalXPetrinet.g:203:2: rule__Net__Group__0__Impl rule__Net__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Net__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group__0"


    // $ANTLR start "rule__Net__Group__0__Impl"
    // InternalXPetrinet.g:210:1: rule__Net__Group__0__Impl : ( () ) ;
    public final void rule__Net__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:214:1: ( ( () ) )
            // InternalXPetrinet.g:215:1: ( () )
            {
            // InternalXPetrinet.g:215:1: ( () )
            // InternalXPetrinet.g:216:2: ()
            {
             before(grammarAccess.getNetAccess().getNetAction_0()); 
            // InternalXPetrinet.g:217:2: ()
            // InternalXPetrinet.g:217:3: 
            {
            }

             after(grammarAccess.getNetAccess().getNetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group__0__Impl"


    // $ANTLR start "rule__Net__Group__1"
    // InternalXPetrinet.g:225:1: rule__Net__Group__1 : rule__Net__Group__1__Impl rule__Net__Group__2 ;
    public final void rule__Net__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:229:1: ( rule__Net__Group__1__Impl rule__Net__Group__2 )
            // InternalXPetrinet.g:230:2: rule__Net__Group__1__Impl rule__Net__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Net__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group__1"


    // $ANTLR start "rule__Net__Group__1__Impl"
    // InternalXPetrinet.g:237:1: rule__Net__Group__1__Impl : ( 'Net' ) ;
    public final void rule__Net__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:241:1: ( ( 'Net' ) )
            // InternalXPetrinet.g:242:1: ( 'Net' )
            {
            // InternalXPetrinet.g:242:1: ( 'Net' )
            // InternalXPetrinet.g:243:2: 'Net'
            {
             before(grammarAccess.getNetAccess().getNetKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getNetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group__1__Impl"


    // $ANTLR start "rule__Net__Group__2"
    // InternalXPetrinet.g:252:1: rule__Net__Group__2 : rule__Net__Group__2__Impl rule__Net__Group__3 ;
    public final void rule__Net__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:256:1: ( rule__Net__Group__2__Impl rule__Net__Group__3 )
            // InternalXPetrinet.g:257:2: rule__Net__Group__2__Impl rule__Net__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Net__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group__2"


    // $ANTLR start "rule__Net__Group__2__Impl"
    // InternalXPetrinet.g:264:1: rule__Net__Group__2__Impl : ( ( rule__Net__Group_2__0 )? ) ;
    public final void rule__Net__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:268:1: ( ( ( rule__Net__Group_2__0 )? ) )
            // InternalXPetrinet.g:269:1: ( ( rule__Net__Group_2__0 )? )
            {
            // InternalXPetrinet.g:269:1: ( ( rule__Net__Group_2__0 )? )
            // InternalXPetrinet.g:270:2: ( rule__Net__Group_2__0 )?
            {
             before(grammarAccess.getNetAccess().getGroup_2()); 
            // InternalXPetrinet.g:271:2: ( rule__Net__Group_2__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalXPetrinet.g:271:3: rule__Net__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Net__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNetAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group__2__Impl"


    // $ANTLR start "rule__Net__Group__3"
    // InternalXPetrinet.g:279:1: rule__Net__Group__3 : rule__Net__Group__3__Impl ;
    public final void rule__Net__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:283:1: ( rule__Net__Group__3__Impl )
            // InternalXPetrinet.g:284:2: rule__Net__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Net__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group__3"


    // $ANTLR start "rule__Net__Group__3__Impl"
    // InternalXPetrinet.g:290:1: rule__Net__Group__3__Impl : ( ( rule__Net__Group_3__0 )? ) ;
    public final void rule__Net__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:294:1: ( ( ( rule__Net__Group_3__0 )? ) )
            // InternalXPetrinet.g:295:1: ( ( rule__Net__Group_3__0 )? )
            {
            // InternalXPetrinet.g:295:1: ( ( rule__Net__Group_3__0 )? )
            // InternalXPetrinet.g:296:2: ( rule__Net__Group_3__0 )?
            {
             before(grammarAccess.getNetAccess().getGroup_3()); 
            // InternalXPetrinet.g:297:2: ( rule__Net__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXPetrinet.g:297:3: rule__Net__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Net__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNetAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group__3__Impl"


    // $ANTLR start "rule__Net__Group_2__0"
    // InternalXPetrinet.g:306:1: rule__Net__Group_2__0 : rule__Net__Group_2__0__Impl rule__Net__Group_2__1 ;
    public final void rule__Net__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:310:1: ( rule__Net__Group_2__0__Impl rule__Net__Group_2__1 )
            // InternalXPetrinet.g:311:2: rule__Net__Group_2__0__Impl rule__Net__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Net__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_2__0"


    // $ANTLR start "rule__Net__Group_2__0__Impl"
    // InternalXPetrinet.g:318:1: rule__Net__Group_2__0__Impl : ( 'places' ) ;
    public final void rule__Net__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:322:1: ( ( 'places' ) )
            // InternalXPetrinet.g:323:1: ( 'places' )
            {
            // InternalXPetrinet.g:323:1: ( 'places' )
            // InternalXPetrinet.g:324:2: 'places'
            {
             before(grammarAccess.getNetAccess().getPlacesKeyword_2_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getPlacesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_2__0__Impl"


    // $ANTLR start "rule__Net__Group_2__1"
    // InternalXPetrinet.g:333:1: rule__Net__Group_2__1 : rule__Net__Group_2__1__Impl rule__Net__Group_2__2 ;
    public final void rule__Net__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:337:1: ( rule__Net__Group_2__1__Impl rule__Net__Group_2__2 )
            // InternalXPetrinet.g:338:2: rule__Net__Group_2__1__Impl rule__Net__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__Net__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_2__1"


    // $ANTLR start "rule__Net__Group_2__1__Impl"
    // InternalXPetrinet.g:345:1: rule__Net__Group_2__1__Impl : ( ( rule__Net__PlacesAssignment_2_1 ) ) ;
    public final void rule__Net__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:349:1: ( ( ( rule__Net__PlacesAssignment_2_1 ) ) )
            // InternalXPetrinet.g:350:1: ( ( rule__Net__PlacesAssignment_2_1 ) )
            {
            // InternalXPetrinet.g:350:1: ( ( rule__Net__PlacesAssignment_2_1 ) )
            // InternalXPetrinet.g:351:2: ( rule__Net__PlacesAssignment_2_1 )
            {
             before(grammarAccess.getNetAccess().getPlacesAssignment_2_1()); 
            // InternalXPetrinet.g:352:2: ( rule__Net__PlacesAssignment_2_1 )
            // InternalXPetrinet.g:352:3: rule__Net__PlacesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Net__PlacesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNetAccess().getPlacesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_2__1__Impl"


    // $ANTLR start "rule__Net__Group_2__2"
    // InternalXPetrinet.g:360:1: rule__Net__Group_2__2 : rule__Net__Group_2__2__Impl ;
    public final void rule__Net__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:364:1: ( rule__Net__Group_2__2__Impl )
            // InternalXPetrinet.g:365:2: rule__Net__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Net__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_2__2"


    // $ANTLR start "rule__Net__Group_2__2__Impl"
    // InternalXPetrinet.g:371:1: rule__Net__Group_2__2__Impl : ( ( rule__Net__Group_2_2__0 )* ) ;
    public final void rule__Net__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:375:1: ( ( ( rule__Net__Group_2_2__0 )* ) )
            // InternalXPetrinet.g:376:1: ( ( rule__Net__Group_2_2__0 )* )
            {
            // InternalXPetrinet.g:376:1: ( ( rule__Net__Group_2_2__0 )* )
            // InternalXPetrinet.g:377:2: ( rule__Net__Group_2_2__0 )*
            {
             before(grammarAccess.getNetAccess().getGroup_2_2()); 
            // InternalXPetrinet.g:378:2: ( rule__Net__Group_2_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXPetrinet.g:378:3: rule__Net__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Net__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getNetAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_2__2__Impl"


    // $ANTLR start "rule__Net__Group_2_2__0"
    // InternalXPetrinet.g:387:1: rule__Net__Group_2_2__0 : rule__Net__Group_2_2__0__Impl rule__Net__Group_2_2__1 ;
    public final void rule__Net__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:391:1: ( rule__Net__Group_2_2__0__Impl rule__Net__Group_2_2__1 )
            // InternalXPetrinet.g:392:2: rule__Net__Group_2_2__0__Impl rule__Net__Group_2_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Net__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_2_2__0"


    // $ANTLR start "rule__Net__Group_2_2__0__Impl"
    // InternalXPetrinet.g:399:1: rule__Net__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Net__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:403:1: ( ( ',' ) )
            // InternalXPetrinet.g:404:1: ( ',' )
            {
            // InternalXPetrinet.g:404:1: ( ',' )
            // InternalXPetrinet.g:405:2: ','
            {
             before(grammarAccess.getNetAccess().getCommaKeyword_2_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_2_2__0__Impl"


    // $ANTLR start "rule__Net__Group_2_2__1"
    // InternalXPetrinet.g:414:1: rule__Net__Group_2_2__1 : rule__Net__Group_2_2__1__Impl ;
    public final void rule__Net__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:418:1: ( rule__Net__Group_2_2__1__Impl )
            // InternalXPetrinet.g:419:2: rule__Net__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Net__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_2_2__1"


    // $ANTLR start "rule__Net__Group_2_2__1__Impl"
    // InternalXPetrinet.g:425:1: rule__Net__Group_2_2__1__Impl : ( ( rule__Net__PlacesAssignment_2_2_1 ) ) ;
    public final void rule__Net__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:429:1: ( ( ( rule__Net__PlacesAssignment_2_2_1 ) ) )
            // InternalXPetrinet.g:430:1: ( ( rule__Net__PlacesAssignment_2_2_1 ) )
            {
            // InternalXPetrinet.g:430:1: ( ( rule__Net__PlacesAssignment_2_2_1 ) )
            // InternalXPetrinet.g:431:2: ( rule__Net__PlacesAssignment_2_2_1 )
            {
             before(grammarAccess.getNetAccess().getPlacesAssignment_2_2_1()); 
            // InternalXPetrinet.g:432:2: ( rule__Net__PlacesAssignment_2_2_1 )
            // InternalXPetrinet.g:432:3: rule__Net__PlacesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Net__PlacesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNetAccess().getPlacesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_2_2__1__Impl"


    // $ANTLR start "rule__Net__Group_3__0"
    // InternalXPetrinet.g:441:1: rule__Net__Group_3__0 : rule__Net__Group_3__0__Impl rule__Net__Group_3__1 ;
    public final void rule__Net__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:445:1: ( rule__Net__Group_3__0__Impl rule__Net__Group_3__1 )
            // InternalXPetrinet.g:446:2: rule__Net__Group_3__0__Impl rule__Net__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Net__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_3__0"


    // $ANTLR start "rule__Net__Group_3__0__Impl"
    // InternalXPetrinet.g:453:1: rule__Net__Group_3__0__Impl : ( 'transitions' ) ;
    public final void rule__Net__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:457:1: ( ( 'transitions' ) )
            // InternalXPetrinet.g:458:1: ( 'transitions' )
            {
            // InternalXPetrinet.g:458:1: ( 'transitions' )
            // InternalXPetrinet.g:459:2: 'transitions'
            {
             before(grammarAccess.getNetAccess().getTransitionsKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getTransitionsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_3__0__Impl"


    // $ANTLR start "rule__Net__Group_3__1"
    // InternalXPetrinet.g:468:1: rule__Net__Group_3__1 : rule__Net__Group_3__1__Impl rule__Net__Group_3__2 ;
    public final void rule__Net__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:472:1: ( rule__Net__Group_3__1__Impl rule__Net__Group_3__2 )
            // InternalXPetrinet.g:473:2: rule__Net__Group_3__1__Impl rule__Net__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__Net__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_3__1"


    // $ANTLR start "rule__Net__Group_3__1__Impl"
    // InternalXPetrinet.g:480:1: rule__Net__Group_3__1__Impl : ( ( rule__Net__TransitionsAssignment_3_1 ) ) ;
    public final void rule__Net__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:484:1: ( ( ( rule__Net__TransitionsAssignment_3_1 ) ) )
            // InternalXPetrinet.g:485:1: ( ( rule__Net__TransitionsAssignment_3_1 ) )
            {
            // InternalXPetrinet.g:485:1: ( ( rule__Net__TransitionsAssignment_3_1 ) )
            // InternalXPetrinet.g:486:2: ( rule__Net__TransitionsAssignment_3_1 )
            {
             before(grammarAccess.getNetAccess().getTransitionsAssignment_3_1()); 
            // InternalXPetrinet.g:487:2: ( rule__Net__TransitionsAssignment_3_1 )
            // InternalXPetrinet.g:487:3: rule__Net__TransitionsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Net__TransitionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNetAccess().getTransitionsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_3__1__Impl"


    // $ANTLR start "rule__Net__Group_3__2"
    // InternalXPetrinet.g:495:1: rule__Net__Group_3__2 : rule__Net__Group_3__2__Impl ;
    public final void rule__Net__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:499:1: ( rule__Net__Group_3__2__Impl )
            // InternalXPetrinet.g:500:2: rule__Net__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Net__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_3__2"


    // $ANTLR start "rule__Net__Group_3__2__Impl"
    // InternalXPetrinet.g:506:1: rule__Net__Group_3__2__Impl : ( ( rule__Net__Group_3_2__0 )* ) ;
    public final void rule__Net__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:510:1: ( ( ( rule__Net__Group_3_2__0 )* ) )
            // InternalXPetrinet.g:511:1: ( ( rule__Net__Group_3_2__0 )* )
            {
            // InternalXPetrinet.g:511:1: ( ( rule__Net__Group_3_2__0 )* )
            // InternalXPetrinet.g:512:2: ( rule__Net__Group_3_2__0 )*
            {
             before(grammarAccess.getNetAccess().getGroup_3_2()); 
            // InternalXPetrinet.g:513:2: ( rule__Net__Group_3_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalXPetrinet.g:513:3: rule__Net__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Net__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getNetAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_3__2__Impl"


    // $ANTLR start "rule__Net__Group_3_2__0"
    // InternalXPetrinet.g:522:1: rule__Net__Group_3_2__0 : rule__Net__Group_3_2__0__Impl rule__Net__Group_3_2__1 ;
    public final void rule__Net__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:526:1: ( rule__Net__Group_3_2__0__Impl rule__Net__Group_3_2__1 )
            // InternalXPetrinet.g:527:2: rule__Net__Group_3_2__0__Impl rule__Net__Group_3_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Net__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Net__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_3_2__0"


    // $ANTLR start "rule__Net__Group_3_2__0__Impl"
    // InternalXPetrinet.g:534:1: rule__Net__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Net__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:538:1: ( ( ',' ) )
            // InternalXPetrinet.g:539:1: ( ',' )
            {
            // InternalXPetrinet.g:539:1: ( ',' )
            // InternalXPetrinet.g:540:2: ','
            {
             before(grammarAccess.getNetAccess().getCommaKeyword_3_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNetAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_3_2__0__Impl"


    // $ANTLR start "rule__Net__Group_3_2__1"
    // InternalXPetrinet.g:549:1: rule__Net__Group_3_2__1 : rule__Net__Group_3_2__1__Impl ;
    public final void rule__Net__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:553:1: ( rule__Net__Group_3_2__1__Impl )
            // InternalXPetrinet.g:554:2: rule__Net__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Net__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_3_2__1"


    // $ANTLR start "rule__Net__Group_3_2__1__Impl"
    // InternalXPetrinet.g:560:1: rule__Net__Group_3_2__1__Impl : ( ( rule__Net__TransitionsAssignment_3_2_1 ) ) ;
    public final void rule__Net__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:564:1: ( ( ( rule__Net__TransitionsAssignment_3_2_1 ) ) )
            // InternalXPetrinet.g:565:1: ( ( rule__Net__TransitionsAssignment_3_2_1 ) )
            {
            // InternalXPetrinet.g:565:1: ( ( rule__Net__TransitionsAssignment_3_2_1 ) )
            // InternalXPetrinet.g:566:2: ( rule__Net__TransitionsAssignment_3_2_1 )
            {
             before(grammarAccess.getNetAccess().getTransitionsAssignment_3_2_1()); 
            // InternalXPetrinet.g:567:2: ( rule__Net__TransitionsAssignment_3_2_1 )
            // InternalXPetrinet.g:567:3: rule__Net__TransitionsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Net__TransitionsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNetAccess().getTransitionsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__Group_3_2__1__Impl"


    // $ANTLR start "rule__Place__Group__0"
    // InternalXPetrinet.g:576:1: rule__Place__Group__0 : rule__Place__Group__0__Impl rule__Place__Group__1 ;
    public final void rule__Place__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:580:1: ( rule__Place__Group__0__Impl rule__Place__Group__1 )
            // InternalXPetrinet.g:581:2: rule__Place__Group__0__Impl rule__Place__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Place__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0"


    // $ANTLR start "rule__Place__Group__0__Impl"
    // InternalXPetrinet.g:588:1: rule__Place__Group__0__Impl : ( () ) ;
    public final void rule__Place__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:592:1: ( ( () ) )
            // InternalXPetrinet.g:593:1: ( () )
            {
            // InternalXPetrinet.g:593:1: ( () )
            // InternalXPetrinet.g:594:2: ()
            {
             before(grammarAccess.getPlaceAccess().getPlaceAction_0()); 
            // InternalXPetrinet.g:595:2: ()
            // InternalXPetrinet.g:595:3: 
            {
            }

             after(grammarAccess.getPlaceAccess().getPlaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0__Impl"


    // $ANTLR start "rule__Place__Group__1"
    // InternalXPetrinet.g:603:1: rule__Place__Group__1 : rule__Place__Group__1__Impl rule__Place__Group__2 ;
    public final void rule__Place__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:607:1: ( rule__Place__Group__1__Impl rule__Place__Group__2 )
            // InternalXPetrinet.g:608:2: rule__Place__Group__1__Impl rule__Place__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Place__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1"


    // $ANTLR start "rule__Place__Group__1__Impl"
    // InternalXPetrinet.g:615:1: rule__Place__Group__1__Impl : ( 'place' ) ;
    public final void rule__Place__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:619:1: ( ( 'place' ) )
            // InternalXPetrinet.g:620:1: ( 'place' )
            {
            // InternalXPetrinet.g:620:1: ( 'place' )
            // InternalXPetrinet.g:621:2: 'place'
            {
             before(grammarAccess.getPlaceAccess().getPlaceKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getPlaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1__Impl"


    // $ANTLR start "rule__Place__Group__2"
    // InternalXPetrinet.g:630:1: rule__Place__Group__2 : rule__Place__Group__2__Impl rule__Place__Group__3 ;
    public final void rule__Place__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:634:1: ( rule__Place__Group__2__Impl rule__Place__Group__3 )
            // InternalXPetrinet.g:635:2: rule__Place__Group__2__Impl rule__Place__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Place__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2"


    // $ANTLR start "rule__Place__Group__2__Impl"
    // InternalXPetrinet.g:642:1: rule__Place__Group__2__Impl : ( ( rule__Place__NameAssignment_2 ) ) ;
    public final void rule__Place__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:646:1: ( ( ( rule__Place__NameAssignment_2 ) ) )
            // InternalXPetrinet.g:647:1: ( ( rule__Place__NameAssignment_2 ) )
            {
            // InternalXPetrinet.g:647:1: ( ( rule__Place__NameAssignment_2 ) )
            // InternalXPetrinet.g:648:2: ( rule__Place__NameAssignment_2 )
            {
             before(grammarAccess.getPlaceAccess().getNameAssignment_2()); 
            // InternalXPetrinet.g:649:2: ( rule__Place__NameAssignment_2 )
            // InternalXPetrinet.g:649:3: rule__Place__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Place__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2__Impl"


    // $ANTLR start "rule__Place__Group__3"
    // InternalXPetrinet.g:657:1: rule__Place__Group__3 : rule__Place__Group__3__Impl ;
    public final void rule__Place__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:661:1: ( rule__Place__Group__3__Impl )
            // InternalXPetrinet.g:662:2: rule__Place__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__3"


    // $ANTLR start "rule__Place__Group__3__Impl"
    // InternalXPetrinet.g:668:1: rule__Place__Group__3__Impl : ( ( rule__Place__Group_3__0 )? ) ;
    public final void rule__Place__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:672:1: ( ( ( rule__Place__Group_3__0 )? ) )
            // InternalXPetrinet.g:673:1: ( ( rule__Place__Group_3__0 )? )
            {
            // InternalXPetrinet.g:673:1: ( ( rule__Place__Group_3__0 )? )
            // InternalXPetrinet.g:674:2: ( rule__Place__Group_3__0 )?
            {
             before(grammarAccess.getPlaceAccess().getGroup_3()); 
            // InternalXPetrinet.g:675:2: ( rule__Place__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXPetrinet.g:675:3: rule__Place__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Place__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlaceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__3__Impl"


    // $ANTLR start "rule__Place__Group_3__0"
    // InternalXPetrinet.g:684:1: rule__Place__Group_3__0 : rule__Place__Group_3__0__Impl rule__Place__Group_3__1 ;
    public final void rule__Place__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:688:1: ( rule__Place__Group_3__0__Impl rule__Place__Group_3__1 )
            // InternalXPetrinet.g:689:2: rule__Place__Group_3__0__Impl rule__Place__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Place__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_3__0"


    // $ANTLR start "rule__Place__Group_3__0__Impl"
    // InternalXPetrinet.g:696:1: rule__Place__Group_3__0__Impl : ( 'initialTokens' ) ;
    public final void rule__Place__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:700:1: ( ( 'initialTokens' ) )
            // InternalXPetrinet.g:701:1: ( 'initialTokens' )
            {
            // InternalXPetrinet.g:701:1: ( 'initialTokens' )
            // InternalXPetrinet.g:702:2: 'initialTokens'
            {
             before(grammarAccess.getPlaceAccess().getInitialTokensKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getInitialTokensKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_3__0__Impl"


    // $ANTLR start "rule__Place__Group_3__1"
    // InternalXPetrinet.g:711:1: rule__Place__Group_3__1 : rule__Place__Group_3__1__Impl ;
    public final void rule__Place__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:715:1: ( rule__Place__Group_3__1__Impl )
            // InternalXPetrinet.g:716:2: rule__Place__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_3__1"


    // $ANTLR start "rule__Place__Group_3__1__Impl"
    // InternalXPetrinet.g:722:1: rule__Place__Group_3__1__Impl : ( ( rule__Place__InitialTokensAssignment_3_1 ) ) ;
    public final void rule__Place__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:726:1: ( ( ( rule__Place__InitialTokensAssignment_3_1 ) ) )
            // InternalXPetrinet.g:727:1: ( ( rule__Place__InitialTokensAssignment_3_1 ) )
            {
            // InternalXPetrinet.g:727:1: ( ( rule__Place__InitialTokensAssignment_3_1 ) )
            // InternalXPetrinet.g:728:2: ( rule__Place__InitialTokensAssignment_3_1 )
            {
             before(grammarAccess.getPlaceAccess().getInitialTokensAssignment_3_1()); 
            // InternalXPetrinet.g:729:2: ( rule__Place__InitialTokensAssignment_3_1 )
            // InternalXPetrinet.g:729:3: rule__Place__InitialTokensAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Place__InitialTokensAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getInitialTokensAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_3__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalXPetrinet.g:738:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:742:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalXPetrinet.g:743:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalXPetrinet.g:750:1: rule__Transition__Group__0__Impl : ( 'transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:754:1: ( ( 'transition' ) )
            // InternalXPetrinet.g:755:1: ( 'transition' )
            {
            // InternalXPetrinet.g:755:1: ( 'transition' )
            // InternalXPetrinet.g:756:2: 'transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalXPetrinet.g:765:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:769:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalXPetrinet.g:770:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalXPetrinet.g:777:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__NameAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:781:1: ( ( ( rule__Transition__NameAssignment_1 ) ) )
            // InternalXPetrinet.g:782:1: ( ( rule__Transition__NameAssignment_1 ) )
            {
            // InternalXPetrinet.g:782:1: ( ( rule__Transition__NameAssignment_1 ) )
            // InternalXPetrinet.g:783:2: ( rule__Transition__NameAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_1()); 
            // InternalXPetrinet.g:784:2: ( rule__Transition__NameAssignment_1 )
            // InternalXPetrinet.g:784:3: rule__Transition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalXPetrinet.g:792:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:796:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalXPetrinet.g:797:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalXPetrinet.g:804:1: rule__Transition__Group__2__Impl : ( 'from' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:808:1: ( ( 'from' ) )
            // InternalXPetrinet.g:809:1: ( 'from' )
            {
            // InternalXPetrinet.g:809:1: ( 'from' )
            // InternalXPetrinet.g:810:2: 'from'
            {
             before(grammarAccess.getTransitionAccess().getFromKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalXPetrinet.g:819:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:823:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalXPetrinet.g:824:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalXPetrinet.g:831:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__InputAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:835:1: ( ( ( rule__Transition__InputAssignment_3 ) ) )
            // InternalXPetrinet.g:836:1: ( ( rule__Transition__InputAssignment_3 ) )
            {
            // InternalXPetrinet.g:836:1: ( ( rule__Transition__InputAssignment_3 ) )
            // InternalXPetrinet.g:837:2: ( rule__Transition__InputAssignment_3 )
            {
             before(grammarAccess.getTransitionAccess().getInputAssignment_3()); 
            // InternalXPetrinet.g:838:2: ( rule__Transition__InputAssignment_3 )
            // InternalXPetrinet.g:838:3: rule__Transition__InputAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Transition__InputAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getInputAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalXPetrinet.g:846:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:850:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalXPetrinet.g:851:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalXPetrinet.g:858:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )* ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:862:1: ( ( ( rule__Transition__Group_4__0 )* ) )
            // InternalXPetrinet.g:863:1: ( ( rule__Transition__Group_4__0 )* )
            {
            // InternalXPetrinet.g:863:1: ( ( rule__Transition__Group_4__0 )* )
            // InternalXPetrinet.g:864:2: ( rule__Transition__Group_4__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // InternalXPetrinet.g:865:2: ( rule__Transition__Group_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXPetrinet.g:865:3: rule__Transition__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Transition__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // InternalXPetrinet.g:873:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:877:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // InternalXPetrinet.g:878:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalXPetrinet.g:885:1: rule__Transition__Group__5__Impl : ( 'to' ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:889:1: ( ( 'to' ) )
            // InternalXPetrinet.g:890:1: ( 'to' )
            {
            // InternalXPetrinet.g:890:1: ( 'to' )
            // InternalXPetrinet.g:891:2: 'to'
            {
             before(grammarAccess.getTransitionAccess().getToKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__6"
    // InternalXPetrinet.g:900:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl rule__Transition__Group__7 ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:904:1: ( rule__Transition__Group__6__Impl rule__Transition__Group__7 )
            // InternalXPetrinet.g:905:2: rule__Transition__Group__6__Impl rule__Transition__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Transition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6"


    // $ANTLR start "rule__Transition__Group__6__Impl"
    // InternalXPetrinet.g:912:1: rule__Transition__Group__6__Impl : ( ( rule__Transition__OutputAssignment_6 ) ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:916:1: ( ( ( rule__Transition__OutputAssignment_6 ) ) )
            // InternalXPetrinet.g:917:1: ( ( rule__Transition__OutputAssignment_6 ) )
            {
            // InternalXPetrinet.g:917:1: ( ( rule__Transition__OutputAssignment_6 ) )
            // InternalXPetrinet.g:918:2: ( rule__Transition__OutputAssignment_6 )
            {
             before(grammarAccess.getTransitionAccess().getOutputAssignment_6()); 
            // InternalXPetrinet.g:919:2: ( rule__Transition__OutputAssignment_6 )
            // InternalXPetrinet.g:919:3: rule__Transition__OutputAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Transition__OutputAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getOutputAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6__Impl"


    // $ANTLR start "rule__Transition__Group__7"
    // InternalXPetrinet.g:927:1: rule__Transition__Group__7 : rule__Transition__Group__7__Impl ;
    public final void rule__Transition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:931:1: ( rule__Transition__Group__7__Impl )
            // InternalXPetrinet.g:932:2: rule__Transition__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7"


    // $ANTLR start "rule__Transition__Group__7__Impl"
    // InternalXPetrinet.g:938:1: rule__Transition__Group__7__Impl : ( ( rule__Transition__Group_7__0 )* ) ;
    public final void rule__Transition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:942:1: ( ( ( rule__Transition__Group_7__0 )* ) )
            // InternalXPetrinet.g:943:1: ( ( rule__Transition__Group_7__0 )* )
            {
            // InternalXPetrinet.g:943:1: ( ( rule__Transition__Group_7__0 )* )
            // InternalXPetrinet.g:944:2: ( rule__Transition__Group_7__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_7()); 
            // InternalXPetrinet.g:945:2: ( rule__Transition__Group_7__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13) ) {
                    int LA8_2 = input.LA(2);

                    if ( ((LA8_2>=RULE_STRING && LA8_2<=RULE_ID)) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalXPetrinet.g:945:3: rule__Transition__Group_7__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Transition__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7__Impl"


    // $ANTLR start "rule__Transition__Group_4__0"
    // InternalXPetrinet.g:954:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:958:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // InternalXPetrinet.g:959:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Transition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0"


    // $ANTLR start "rule__Transition__Group_4__0__Impl"
    // InternalXPetrinet.g:966:1: rule__Transition__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:970:1: ( ( ',' ) )
            // InternalXPetrinet.g:971:1: ( ',' )
            {
            // InternalXPetrinet.g:971:1: ( ',' )
            // InternalXPetrinet.g:972:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_4_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0__Impl"


    // $ANTLR start "rule__Transition__Group_4__1"
    // InternalXPetrinet.g:981:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:985:1: ( rule__Transition__Group_4__1__Impl )
            // InternalXPetrinet.g:986:2: rule__Transition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1"


    // $ANTLR start "rule__Transition__Group_4__1__Impl"
    // InternalXPetrinet.g:992:1: rule__Transition__Group_4__1__Impl : ( ( rule__Transition__InputAssignment_4_1 ) ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:996:1: ( ( ( rule__Transition__InputAssignment_4_1 ) ) )
            // InternalXPetrinet.g:997:1: ( ( rule__Transition__InputAssignment_4_1 ) )
            {
            // InternalXPetrinet.g:997:1: ( ( rule__Transition__InputAssignment_4_1 ) )
            // InternalXPetrinet.g:998:2: ( rule__Transition__InputAssignment_4_1 )
            {
             before(grammarAccess.getTransitionAccess().getInputAssignment_4_1()); 
            // InternalXPetrinet.g:999:2: ( rule__Transition__InputAssignment_4_1 )
            // InternalXPetrinet.g:999:3: rule__Transition__InputAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__InputAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getInputAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1__Impl"


    // $ANTLR start "rule__Transition__Group_7__0"
    // InternalXPetrinet.g:1008:1: rule__Transition__Group_7__0 : rule__Transition__Group_7__0__Impl rule__Transition__Group_7__1 ;
    public final void rule__Transition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:1012:1: ( rule__Transition__Group_7__0__Impl rule__Transition__Group_7__1 )
            // InternalXPetrinet.g:1013:2: rule__Transition__Group_7__0__Impl rule__Transition__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__Transition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_7__0"


    // $ANTLR start "rule__Transition__Group_7__0__Impl"
    // InternalXPetrinet.g:1020:1: rule__Transition__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:1024:1: ( ( ',' ) )
            // InternalXPetrinet.g:1025:1: ( ',' )
            {
            // InternalXPetrinet.g:1025:1: ( ',' )
            // InternalXPetrinet.g:1026:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_7_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_7__0__Impl"


    // $ANTLR start "rule__Transition__Group_7__1"
    // InternalXPetrinet.g:1035:1: rule__Transition__Group_7__1 : rule__Transition__Group_7__1__Impl ;
    public final void rule__Transition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:1039:1: ( rule__Transition__Group_7__1__Impl )
            // InternalXPetrinet.g:1040:2: rule__Transition__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_7__1"


    // $ANTLR start "rule__Transition__Group_7__1__Impl"
    // InternalXPetrinet.g:1046:1: rule__Transition__Group_7__1__Impl : ( ( rule__Transition__OutputAssignment_7_1 ) ) ;
    public final void rule__Transition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:1050:1: ( ( ( rule__Transition__OutputAssignment_7_1 ) ) )
            // InternalXPetrinet.g:1051:1: ( ( rule__Transition__OutputAssignment_7_1 ) )
            {
            // InternalXPetrinet.g:1051:1: ( ( rule__Transition__OutputAssignment_7_1 ) )
            // InternalXPetrinet.g:1052:2: ( rule__Transition__OutputAssignment_7_1 )
            {
             before(grammarAccess.getTransitionAccess().getOutputAssignment_7_1()); 
            // InternalXPetrinet.g:1053:2: ( rule__Transition__OutputAssignment_7_1 )
            // InternalXPetrinet.g:1053:3: rule__Transition__OutputAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__OutputAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getOutputAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_7__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalXPetrinet.g:1062:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:1066:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalXPetrinet.g:1067:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalXPetrinet.g:1074:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:1078:1: ( ( ( '-' )? ) )
            // InternalXPetrinet.g:1079:1: ( ( '-' )? )
            {
            // InternalXPetrinet.g:1079:1: ( ( '-' )? )
            // InternalXPetrinet.g:1080:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalXPetrinet.g:1081:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXPetrinet.g:1081:3: '-'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalXPetrinet.g:1089:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:1093:1: ( rule__EInt__Group__1__Impl )
            // InternalXPetrinet.g:1094:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalXPetrinet.g:1100:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:1104:1: ( ( RULE_INT ) )
            // InternalXPetrinet.g:1105:1: ( RULE_INT )
            {
            // InternalXPetrinet.g:1105:1: ( RULE_INT )
            // InternalXPetrinet.g:1106:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Net__PlacesAssignment_2_1"
    // InternalXPetrinet.g:1116:1: rule__Net__PlacesAssignment_2_1 : ( rulePlace ) ;
    public final void rule__Net__PlacesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:1120:1: ( ( rulePlace ) )
            // InternalXPetrinet.g:1121:2: ( rulePlace )
            {
            // InternalXPetrinet.g:1121:2: ( rulePlace )
            // InternalXPetrinet.g:1122:3: rulePlace
            {
             before(grammarAccess.getNetAccess().getPlacesPlaceParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getNetAccess().getPlacesPlaceParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__PlacesAssignment_2_1"


    // $ANTLR start "rule__Net__PlacesAssignment_2_2_1"
    // InternalXPetrinet.g:1131:1: rule__Net__PlacesAssignment_2_2_1 : ( rulePlace ) ;
    public final void rule__Net__PlacesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:1135:1: ( ( rulePlace ) )
            // InternalXPetrinet.g:1136:2: ( rulePlace )
            {
            // InternalXPetrinet.g:1136:2: ( rulePlace )
            // InternalXPetrinet.g:1137:3: rulePlace
            {
             before(grammarAccess.getNetAccess().getPlacesPlaceParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getNetAccess().getPlacesPlaceParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__PlacesAssignment_2_2_1"


    // $ANTLR start "rule__Net__TransitionsAssignment_3_1"
    // InternalXPetrinet.g:1146:1: rule__Net__TransitionsAssignment_3_1 : ( ruleTransition ) ;
    public final void rule__Net__TransitionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:1150:1: ( ( ruleTransition ) )
            // InternalXPetrinet.g:1151:2: ( ruleTransition )
            {
            // InternalXPetrinet.g:1151:2: ( ruleTransition )
            // InternalXPetrinet.g:1152:3: ruleTransition
            {
             before(grammarAccess.getNetAccess().getTransitionsTransitionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getNetAccess().getTransitionsTransitionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__TransitionsAssignment_3_1"


    // $ANTLR start "rule__Net__TransitionsAssignment_3_2_1"
    // InternalXPetrinet.g:1161:1: rule__Net__TransitionsAssignment_3_2_1 : ( ruleTransition ) ;
    public final void rule__Net__TransitionsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:1165:1: ( ( ruleTransition ) )
            // InternalXPetrinet.g:1166:2: ( ruleTransition )
            {
            // InternalXPetrinet.g:1166:2: ( ruleTransition )
            // InternalXPetrinet.g:1167:3: ruleTransition
            {
             before(grammarAccess.getNetAccess().getTransitionsTransitionParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getNetAccess().getTransitionsTransitionParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Net__TransitionsAssignment_3_2_1"


    // $ANTLR start "rule__Place__NameAssignment_2"
    // InternalXPetrinet.g:1176:1: rule__Place__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Place__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:1180:1: ( ( ruleEString ) )
            // InternalXPetrinet.g:1181:2: ( ruleEString )
            {
            // InternalXPetrinet.g:1181:2: ( ruleEString )
            // InternalXPetrinet.g:1182:3: ruleEString
            {
             before(grammarAccess.getPlaceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__NameAssignment_2"


    // $ANTLR start "rule__Place__InitialTokensAssignment_3_1"
    // InternalXPetrinet.g:1191:1: rule__Place__InitialTokensAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Place__InitialTokensAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:1195:1: ( ( ruleEInt ) )
            // InternalXPetrinet.g:1196:2: ( ruleEInt )
            {
            // InternalXPetrinet.g:1196:2: ( ruleEInt )
            // InternalXPetrinet.g:1197:3: ruleEInt
            {
             before(grammarAccess.getPlaceAccess().getInitialTokensEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getInitialTokensEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__InitialTokensAssignment_3_1"


    // $ANTLR start "rule__Transition__NameAssignment_1"
    // InternalXPetrinet.g:1206:1: rule__Transition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Transition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:1210:1: ( ( ruleEString ) )
            // InternalXPetrinet.g:1211:2: ( ruleEString )
            {
            // InternalXPetrinet.g:1211:2: ( ruleEString )
            // InternalXPetrinet.g:1212:3: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NameAssignment_1"


    // $ANTLR start "rule__Transition__InputAssignment_3"
    // InternalXPetrinet.g:1221:1: rule__Transition__InputAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Transition__InputAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:1225:1: ( ( ( ruleEString ) ) )
            // InternalXPetrinet.g:1226:2: ( ( ruleEString ) )
            {
            // InternalXPetrinet.g:1226:2: ( ( ruleEString ) )
            // InternalXPetrinet.g:1227:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getInputPlaceCrossReference_3_0()); 
            // InternalXPetrinet.g:1228:3: ( ruleEString )
            // InternalXPetrinet.g:1229:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getInputPlaceEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getInputPlaceEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getInputPlaceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__InputAssignment_3"


    // $ANTLR start "rule__Transition__InputAssignment_4_1"
    // InternalXPetrinet.g:1240:1: rule__Transition__InputAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__InputAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:1244:1: ( ( ( ruleEString ) ) )
            // InternalXPetrinet.g:1245:2: ( ( ruleEString ) )
            {
            // InternalXPetrinet.g:1245:2: ( ( ruleEString ) )
            // InternalXPetrinet.g:1246:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getInputPlaceCrossReference_4_1_0()); 
            // InternalXPetrinet.g:1247:3: ( ruleEString )
            // InternalXPetrinet.g:1248:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getInputPlaceEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getInputPlaceEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getInputPlaceCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__InputAssignment_4_1"


    // $ANTLR start "rule__Transition__OutputAssignment_6"
    // InternalXPetrinet.g:1259:1: rule__Transition__OutputAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Transition__OutputAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:1263:1: ( ( ( ruleEString ) ) )
            // InternalXPetrinet.g:1264:2: ( ( ruleEString ) )
            {
            // InternalXPetrinet.g:1264:2: ( ( ruleEString ) )
            // InternalXPetrinet.g:1265:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getOutputPlaceCrossReference_6_0()); 
            // InternalXPetrinet.g:1266:3: ( ruleEString )
            // InternalXPetrinet.g:1267:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getOutputPlaceEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getOutputPlaceEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getOutputPlaceCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__OutputAssignment_6"


    // $ANTLR start "rule__Transition__OutputAssignment_7_1"
    // InternalXPetrinet.g:1278:1: rule__Transition__OutputAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__OutputAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXPetrinet.g:1282:1: ( ( ( ruleEString ) ) )
            // InternalXPetrinet.g:1283:2: ( ( ruleEString ) )
            {
            // InternalXPetrinet.g:1283:2: ( ( ruleEString ) )
            // InternalXPetrinet.g:1284:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getOutputPlaceCrossReference_7_1_0()); 
            // InternalXPetrinet.g:1285:3: ( ruleEString )
            // InternalXPetrinet.g:1286:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getOutputPlaceEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getOutputPlaceEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getOutputPlaceCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__OutputAssignment_7_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000082000L});

}