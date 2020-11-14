package project.simple.ide.contentassist.antlr.internal;

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
import project.simple.services.PDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'startToStart'", "'finishToStart'", "'startToFinish'", "'finishToFinish'", "'Process'", "'{'", "'workDefinitions'", "'}'", "','", "'workSequences'", "'guidance'", "'resource'", "'WorkDefinition'", "'linksToPredecessors'", "'('", "')'", "'linksToSuccessors'", "'parameters'", "'WorkSequence'", "'linkType'", "'predecessor'", "'successor'", "'Guidance'", "'description'", "'Resource'", "'OccuranceNb'", "'parameter'", "'quantity'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDL.g"; }


    	private PDLGrammarAccess grammarAccess;

    	public void setGrammarAccess(PDLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProcess"
    // InternalPDL.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalPDL.g:54:1: ( ruleProcess EOF )
            // InternalPDL.g:55:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalPDL.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalPDL.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalPDL.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalPDL.g:69:3: ( rule__Process__Group__0 )
            // InternalPDL.g:69:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleEString"
    // InternalPDL.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalPDL.g:79:1: ( ruleEString EOF )
            // InternalPDL.g:80:1: ruleEString EOF
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
    // InternalPDL.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalPDL.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalPDL.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalPDL.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalPDL.g:94:3: ( rule__EString__Alternatives )
            // InternalPDL.g:94:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL.g:103:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // InternalPDL.g:104:1: ( ruleWorkDefinition EOF )
            // InternalPDL.g:105:1: ruleWorkDefinition EOF
            {
             before(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRule()); 
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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL.g:112:1: ruleWorkDefinition : ( ( rule__WorkDefinition__Group__0 ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:116:2: ( ( ( rule__WorkDefinition__Group__0 ) ) )
            // InternalPDL.g:117:2: ( ( rule__WorkDefinition__Group__0 ) )
            {
            // InternalPDL.g:117:2: ( ( rule__WorkDefinition__Group__0 ) )
            // InternalPDL.g:118:3: ( rule__WorkDefinition__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup()); 
            // InternalPDL.g:119:3: ( rule__WorkDefinition__Group__0 )
            // InternalPDL.g:119:4: rule__WorkDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL.g:128:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // InternalPDL.g:129:1: ( ruleWorkSequence EOF )
            // InternalPDL.g:130:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL.g:137:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:141:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // InternalPDL.g:142:2: ( ( rule__WorkSequence__Group__0 ) )
            {
            // InternalPDL.g:142:2: ( ( rule__WorkSequence__Group__0 ) )
            // InternalPDL.g:143:3: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // InternalPDL.g:144:3: ( rule__WorkSequence__Group__0 )
            // InternalPDL.g:144:4: rule__WorkSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // InternalPDL.g:153:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // InternalPDL.g:154:1: ( ruleGuidance EOF )
            // InternalPDL.g:155:1: ruleGuidance EOF
            {
             before(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getGuidanceRule()); 
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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalPDL.g:162:1: ruleGuidance : ( ( rule__Guidance__Group__0 ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:166:2: ( ( ( rule__Guidance__Group__0 ) ) )
            // InternalPDL.g:167:2: ( ( rule__Guidance__Group__0 ) )
            {
            // InternalPDL.g:167:2: ( ( rule__Guidance__Group__0 ) )
            // InternalPDL.g:168:3: ( rule__Guidance__Group__0 )
            {
             before(grammarAccess.getGuidanceAccess().getGroup()); 
            // InternalPDL.g:169:3: ( rule__Guidance__Group__0 )
            // InternalPDL.g:169:4: rule__Guidance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getGroup()); 

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
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleResource"
    // InternalPDL.g:178:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalPDL.g:179:1: ( ruleResource EOF )
            // InternalPDL.g:180:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalPDL.g:187:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:191:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalPDL.g:192:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalPDL.g:192:2: ( ( rule__Resource__Group__0 ) )
            // InternalPDL.g:193:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalPDL.g:194:3: ( rule__Resource__Group__0 )
            // InternalPDL.g:194:4: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleparameter"
    // InternalPDL.g:203:1: entryRuleparameter : ruleparameter EOF ;
    public final void entryRuleparameter() throws RecognitionException {
        try {
            // InternalPDL.g:204:1: ( ruleparameter EOF )
            // InternalPDL.g:205:1: ruleparameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleparameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleparameter"


    // $ANTLR start "ruleparameter"
    // InternalPDL.g:212:1: ruleparameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleparameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:216:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalPDL.g:217:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalPDL.g:217:2: ( ( rule__Parameter__Group__0 ) )
            // InternalPDL.g:218:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalPDL.g:219:3: ( rule__Parameter__Group__0 )
            // InternalPDL.g:219:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleparameter"


    // $ANTLR start "entryRuleEInt"
    // InternalPDL.g:228:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalPDL.g:229:1: ( ruleEInt EOF )
            // InternalPDL.g:230:1: ruleEInt EOF
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
    // InternalPDL.g:237:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:241:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalPDL.g:242:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalPDL.g:242:2: ( ( rule__EInt__Group__0 ) )
            // InternalPDL.g:243:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalPDL.g:244:3: ( rule__EInt__Group__0 )
            // InternalPDL.g:244:4: rule__EInt__Group__0
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


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL.g:253:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:257:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // InternalPDL.g:258:2: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // InternalPDL.g:258:2: ( ( rule__WorkSequenceType__Alternatives ) )
            // InternalPDL.g:259:3: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // InternalPDL.g:260:3: ( rule__WorkSequenceType__Alternatives )
            // InternalPDL.g:260:4: rule__WorkSequenceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWorkSequenceType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalPDL.g:268:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:272:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalPDL.g:273:2: ( RULE_STRING )
                    {
                    // InternalPDL.g:273:2: ( RULE_STRING )
                    // InternalPDL.g:274:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:279:2: ( RULE_ID )
                    {
                    // InternalPDL.g:279:2: ( RULE_ID )
                    // InternalPDL.g:280:3: RULE_ID
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


    // $ANTLR start "rule__WorkSequenceType__Alternatives"
    // InternalPDL.g:289:1: rule__WorkSequenceType__Alternatives : ( ( ( 'startToStart' ) ) | ( ( 'finishToStart' ) ) | ( ( 'startToFinish' ) ) | ( ( 'finishToFinish' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:293:1: ( ( ( 'startToStart' ) ) | ( ( 'finishToStart' ) ) | ( ( 'startToFinish' ) ) | ( ( 'finishToFinish' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPDL.g:294:2: ( ( 'startToStart' ) )
                    {
                    // InternalPDL.g:294:2: ( ( 'startToStart' ) )
                    // InternalPDL.g:295:3: ( 'startToStart' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 
                    // InternalPDL.g:296:3: ( 'startToStart' )
                    // InternalPDL.g:296:4: 'startToStart'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:300:2: ( ( 'finishToStart' ) )
                    {
                    // InternalPDL.g:300:2: ( ( 'finishToStart' ) )
                    // InternalPDL.g:301:3: ( 'finishToStart' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1()); 
                    // InternalPDL.g:302:3: ( 'finishToStart' )
                    // InternalPDL.g:302:4: 'finishToStart'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:306:2: ( ( 'startToFinish' ) )
                    {
                    // InternalPDL.g:306:2: ( ( 'startToFinish' ) )
                    // InternalPDL.g:307:3: ( 'startToFinish' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2()); 
                    // InternalPDL.g:308:3: ( 'startToFinish' )
                    // InternalPDL.g:308:4: 'startToFinish'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:312:2: ( ( 'finishToFinish' ) )
                    {
                    // InternalPDL.g:312:2: ( ( 'finishToFinish' ) )
                    // InternalPDL.g:313:3: ( 'finishToFinish' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 
                    // InternalPDL.g:314:3: ( 'finishToFinish' )
                    // InternalPDL.g:314:4: 'finishToFinish'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__WorkSequenceType__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // InternalPDL.g:322:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:326:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalPDL.g:327:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

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
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalPDL.g:334:1: rule__Process__Group__0__Impl : ( 'Process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:338:1: ( ( 'Process' ) )
            // InternalPDL.g:339:1: ( 'Process' )
            {
            // InternalPDL.g:339:1: ( 'Process' )
            // InternalPDL.g:340:2: 'Process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_0()); 

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
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalPDL.g:349:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:353:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalPDL.g:354:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

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
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalPDL.g:361:1: rule__Process__Group__1__Impl : ( ( rule__Process__NameAssignment_1 ) ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:365:1: ( ( ( rule__Process__NameAssignment_1 ) ) )
            // InternalPDL.g:366:1: ( ( rule__Process__NameAssignment_1 ) )
            {
            // InternalPDL.g:366:1: ( ( rule__Process__NameAssignment_1 ) )
            // InternalPDL.g:367:2: ( rule__Process__NameAssignment_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_1()); 
            // InternalPDL.g:368:2: ( rule__Process__NameAssignment_1 )
            // InternalPDL.g:368:3: rule__Process__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalPDL.g:376:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:380:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalPDL.g:381:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

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
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalPDL.g:388:1: rule__Process__Group__2__Impl : ( '{' ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:392:1: ( ( '{' ) )
            // InternalPDL.g:393:1: ( '{' )
            {
            // InternalPDL.g:393:1: ( '{' )
            // InternalPDL.g:394:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalPDL.g:403:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:407:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalPDL.g:408:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

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
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalPDL.g:415:1: rule__Process__Group__3__Impl : ( 'workDefinitions' ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:419:1: ( ( 'workDefinitions' ) )
            // InternalPDL.g:420:1: ( 'workDefinitions' )
            {
            // InternalPDL.g:420:1: ( 'workDefinitions' )
            // InternalPDL.g:421:2: 'workDefinitions'
            {
             before(grammarAccess.getProcessAccess().getWorkDefinitionsKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getWorkDefinitionsKeyword_3()); 

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
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalPDL.g:430:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:434:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalPDL.g:435:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__5();

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
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalPDL.g:442:1: rule__Process__Group__4__Impl : ( '{' ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:446:1: ( ( '{' ) )
            // InternalPDL.g:447:1: ( '{' )
            {
            // InternalPDL.g:447:1: ( '{' )
            // InternalPDL.g:448:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group__5"
    // InternalPDL.g:457:1: rule__Process__Group__5 : rule__Process__Group__5__Impl rule__Process__Group__6 ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:461:1: ( rule__Process__Group__5__Impl rule__Process__Group__6 )
            // InternalPDL.g:462:2: rule__Process__Group__5__Impl rule__Process__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__6();

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
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // InternalPDL.g:469:1: rule__Process__Group__5__Impl : ( ( rule__Process__WorkDefinitionsAssignment_5 ) ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:473:1: ( ( ( rule__Process__WorkDefinitionsAssignment_5 ) ) )
            // InternalPDL.g:474:1: ( ( rule__Process__WorkDefinitionsAssignment_5 ) )
            {
            // InternalPDL.g:474:1: ( ( rule__Process__WorkDefinitionsAssignment_5 ) )
            // InternalPDL.g:475:2: ( rule__Process__WorkDefinitionsAssignment_5 )
            {
             before(grammarAccess.getProcessAccess().getWorkDefinitionsAssignment_5()); 
            // InternalPDL.g:476:2: ( rule__Process__WorkDefinitionsAssignment_5 )
            // InternalPDL.g:476:3: rule__Process__WorkDefinitionsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkDefinitionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkDefinitionsAssignment_5()); 

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
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__Process__Group__6"
    // InternalPDL.g:484:1: rule__Process__Group__6 : rule__Process__Group__6__Impl rule__Process__Group__7 ;
    public final void rule__Process__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:488:1: ( rule__Process__Group__6__Impl rule__Process__Group__7 )
            // InternalPDL.g:489:2: rule__Process__Group__6__Impl rule__Process__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__7();

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
    // $ANTLR end "rule__Process__Group__6"


    // $ANTLR start "rule__Process__Group__6__Impl"
    // InternalPDL.g:496:1: rule__Process__Group__6__Impl : ( ( rule__Process__Group_6__0 )* ) ;
    public final void rule__Process__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:500:1: ( ( ( rule__Process__Group_6__0 )* ) )
            // InternalPDL.g:501:1: ( ( rule__Process__Group_6__0 )* )
            {
            // InternalPDL.g:501:1: ( ( rule__Process__Group_6__0 )* )
            // InternalPDL.g:502:2: ( rule__Process__Group_6__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_6()); 
            // InternalPDL.g:503:2: ( rule__Process__Group_6__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPDL.g:503:3: rule__Process__Group_6__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Process__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Process__Group__6__Impl"


    // $ANTLR start "rule__Process__Group__7"
    // InternalPDL.g:511:1: rule__Process__Group__7 : rule__Process__Group__7__Impl rule__Process__Group__8 ;
    public final void rule__Process__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:515:1: ( rule__Process__Group__7__Impl rule__Process__Group__8 )
            // InternalPDL.g:516:2: rule__Process__Group__7__Impl rule__Process__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Process__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__8();

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
    // $ANTLR end "rule__Process__Group__7"


    // $ANTLR start "rule__Process__Group__7__Impl"
    // InternalPDL.g:523:1: rule__Process__Group__7__Impl : ( '}' ) ;
    public final void rule__Process__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:527:1: ( ( '}' ) )
            // InternalPDL.g:528:1: ( '}' )
            {
            // InternalPDL.g:528:1: ( '}' )
            // InternalPDL.g:529:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Process__Group__7__Impl"


    // $ANTLR start "rule__Process__Group__8"
    // InternalPDL.g:538:1: rule__Process__Group__8 : rule__Process__Group__8__Impl rule__Process__Group__9 ;
    public final void rule__Process__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:542:1: ( rule__Process__Group__8__Impl rule__Process__Group__9 )
            // InternalPDL.g:543:2: rule__Process__Group__8__Impl rule__Process__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Process__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__9();

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
    // $ANTLR end "rule__Process__Group__8"


    // $ANTLR start "rule__Process__Group__8__Impl"
    // InternalPDL.g:550:1: rule__Process__Group__8__Impl : ( ( rule__Process__Group_8__0 )? ) ;
    public final void rule__Process__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:554:1: ( ( ( rule__Process__Group_8__0 )? ) )
            // InternalPDL.g:555:1: ( ( rule__Process__Group_8__0 )? )
            {
            // InternalPDL.g:555:1: ( ( rule__Process__Group_8__0 )? )
            // InternalPDL.g:556:2: ( rule__Process__Group_8__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_8()); 
            // InternalPDL.g:557:2: ( rule__Process__Group_8__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPDL.g:557:3: rule__Process__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Process__Group__8__Impl"


    // $ANTLR start "rule__Process__Group__9"
    // InternalPDL.g:565:1: rule__Process__Group__9 : rule__Process__Group__9__Impl rule__Process__Group__10 ;
    public final void rule__Process__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:569:1: ( rule__Process__Group__9__Impl rule__Process__Group__10 )
            // InternalPDL.g:570:2: rule__Process__Group__9__Impl rule__Process__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Process__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__10();

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
    // $ANTLR end "rule__Process__Group__9"


    // $ANTLR start "rule__Process__Group__9__Impl"
    // InternalPDL.g:577:1: rule__Process__Group__9__Impl : ( ( rule__Process__Group_9__0 )? ) ;
    public final void rule__Process__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:581:1: ( ( ( rule__Process__Group_9__0 )? ) )
            // InternalPDL.g:582:1: ( ( rule__Process__Group_9__0 )? )
            {
            // InternalPDL.g:582:1: ( ( rule__Process__Group_9__0 )? )
            // InternalPDL.g:583:2: ( rule__Process__Group_9__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_9()); 
            // InternalPDL.g:584:2: ( rule__Process__Group_9__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPDL.g:584:3: rule__Process__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Process__Group__9__Impl"


    // $ANTLR start "rule__Process__Group__10"
    // InternalPDL.g:592:1: rule__Process__Group__10 : rule__Process__Group__10__Impl rule__Process__Group__11 ;
    public final void rule__Process__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:596:1: ( rule__Process__Group__10__Impl rule__Process__Group__11 )
            // InternalPDL.g:597:2: rule__Process__Group__10__Impl rule__Process__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__Process__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__11();

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
    // $ANTLR end "rule__Process__Group__10"


    // $ANTLR start "rule__Process__Group__10__Impl"
    // InternalPDL.g:604:1: rule__Process__Group__10__Impl : ( ( rule__Process__Group_10__0 )? ) ;
    public final void rule__Process__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:608:1: ( ( ( rule__Process__Group_10__0 )? ) )
            // InternalPDL.g:609:1: ( ( rule__Process__Group_10__0 )? )
            {
            // InternalPDL.g:609:1: ( ( rule__Process__Group_10__0 )? )
            // InternalPDL.g:610:2: ( rule__Process__Group_10__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_10()); 
            // InternalPDL.g:611:2: ( rule__Process__Group_10__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPDL.g:611:3: rule__Process__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Process__Group__10__Impl"


    // $ANTLR start "rule__Process__Group__11"
    // InternalPDL.g:619:1: rule__Process__Group__11 : rule__Process__Group__11__Impl ;
    public final void rule__Process__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:623:1: ( rule__Process__Group__11__Impl )
            // InternalPDL.g:624:2: rule__Process__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__11__Impl();

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
    // $ANTLR end "rule__Process__Group__11"


    // $ANTLR start "rule__Process__Group__11__Impl"
    // InternalPDL.g:630:1: rule__Process__Group__11__Impl : ( '}' ) ;
    public final void rule__Process__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:634:1: ( ( '}' ) )
            // InternalPDL.g:635:1: ( '}' )
            {
            // InternalPDL.g:635:1: ( '}' )
            // InternalPDL.g:636:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Process__Group__11__Impl"


    // $ANTLR start "rule__Process__Group_6__0"
    // InternalPDL.g:646:1: rule__Process__Group_6__0 : rule__Process__Group_6__0__Impl rule__Process__Group_6__1 ;
    public final void rule__Process__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:650:1: ( rule__Process__Group_6__0__Impl rule__Process__Group_6__1 )
            // InternalPDL.g:651:2: rule__Process__Group_6__0__Impl rule__Process__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_6__1();

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
    // $ANTLR end "rule__Process__Group_6__0"


    // $ANTLR start "rule__Process__Group_6__0__Impl"
    // InternalPDL.g:658:1: rule__Process__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Process__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:662:1: ( ( ',' ) )
            // InternalPDL.g:663:1: ( ',' )
            {
            // InternalPDL.g:663:1: ( ',' )
            // InternalPDL.g:664:2: ','
            {
             before(grammarAccess.getProcessAccess().getCommaKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__Process__Group_6__0__Impl"


    // $ANTLR start "rule__Process__Group_6__1"
    // InternalPDL.g:673:1: rule__Process__Group_6__1 : rule__Process__Group_6__1__Impl ;
    public final void rule__Process__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:677:1: ( rule__Process__Group_6__1__Impl )
            // InternalPDL.g:678:2: rule__Process__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_6__1__Impl();

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
    // $ANTLR end "rule__Process__Group_6__1"


    // $ANTLR start "rule__Process__Group_6__1__Impl"
    // InternalPDL.g:684:1: rule__Process__Group_6__1__Impl : ( ( rule__Process__WorkDefinitionsAssignment_6_1 ) ) ;
    public final void rule__Process__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:688:1: ( ( ( rule__Process__WorkDefinitionsAssignment_6_1 ) ) )
            // InternalPDL.g:689:1: ( ( rule__Process__WorkDefinitionsAssignment_6_1 ) )
            {
            // InternalPDL.g:689:1: ( ( rule__Process__WorkDefinitionsAssignment_6_1 ) )
            // InternalPDL.g:690:2: ( rule__Process__WorkDefinitionsAssignment_6_1 )
            {
             before(grammarAccess.getProcessAccess().getWorkDefinitionsAssignment_6_1()); 
            // InternalPDL.g:691:2: ( rule__Process__WorkDefinitionsAssignment_6_1 )
            // InternalPDL.g:691:3: rule__Process__WorkDefinitionsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkDefinitionsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkDefinitionsAssignment_6_1()); 

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
    // $ANTLR end "rule__Process__Group_6__1__Impl"


    // $ANTLR start "rule__Process__Group_8__0"
    // InternalPDL.g:700:1: rule__Process__Group_8__0 : rule__Process__Group_8__0__Impl rule__Process__Group_8__1 ;
    public final void rule__Process__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:704:1: ( rule__Process__Group_8__0__Impl rule__Process__Group_8__1 )
            // InternalPDL.g:705:2: rule__Process__Group_8__0__Impl rule__Process__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_8__1();

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
    // $ANTLR end "rule__Process__Group_8__0"


    // $ANTLR start "rule__Process__Group_8__0__Impl"
    // InternalPDL.g:712:1: rule__Process__Group_8__0__Impl : ( 'workSequences' ) ;
    public final void rule__Process__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:716:1: ( ( 'workSequences' ) )
            // InternalPDL.g:717:1: ( 'workSequences' )
            {
            // InternalPDL.g:717:1: ( 'workSequences' )
            // InternalPDL.g:718:2: 'workSequences'
            {
             before(grammarAccess.getProcessAccess().getWorkSequencesKeyword_8_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getWorkSequencesKeyword_8_0()); 

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
    // $ANTLR end "rule__Process__Group_8__0__Impl"


    // $ANTLR start "rule__Process__Group_8__1"
    // InternalPDL.g:727:1: rule__Process__Group_8__1 : rule__Process__Group_8__1__Impl rule__Process__Group_8__2 ;
    public final void rule__Process__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:731:1: ( rule__Process__Group_8__1__Impl rule__Process__Group_8__2 )
            // InternalPDL.g:732:2: rule__Process__Group_8__1__Impl rule__Process__Group_8__2
            {
            pushFollow(FOLLOW_10);
            rule__Process__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_8__2();

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
    // $ANTLR end "rule__Process__Group_8__1"


    // $ANTLR start "rule__Process__Group_8__1__Impl"
    // InternalPDL.g:739:1: rule__Process__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Process__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:743:1: ( ( '{' ) )
            // InternalPDL.g:744:1: ( '{' )
            {
            // InternalPDL.g:744:1: ( '{' )
            // InternalPDL.g:745:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_8_1()); 

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
    // $ANTLR end "rule__Process__Group_8__1__Impl"


    // $ANTLR start "rule__Process__Group_8__2"
    // InternalPDL.g:754:1: rule__Process__Group_8__2 : rule__Process__Group_8__2__Impl rule__Process__Group_8__3 ;
    public final void rule__Process__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:758:1: ( rule__Process__Group_8__2__Impl rule__Process__Group_8__3 )
            // InternalPDL.g:759:2: rule__Process__Group_8__2__Impl rule__Process__Group_8__3
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_8__3();

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
    // $ANTLR end "rule__Process__Group_8__2"


    // $ANTLR start "rule__Process__Group_8__2__Impl"
    // InternalPDL.g:766:1: rule__Process__Group_8__2__Impl : ( ( rule__Process__WorkSequencesAssignment_8_2 ) ) ;
    public final void rule__Process__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:770:1: ( ( ( rule__Process__WorkSequencesAssignment_8_2 ) ) )
            // InternalPDL.g:771:1: ( ( rule__Process__WorkSequencesAssignment_8_2 ) )
            {
            // InternalPDL.g:771:1: ( ( rule__Process__WorkSequencesAssignment_8_2 ) )
            // InternalPDL.g:772:2: ( rule__Process__WorkSequencesAssignment_8_2 )
            {
             before(grammarAccess.getProcessAccess().getWorkSequencesAssignment_8_2()); 
            // InternalPDL.g:773:2: ( rule__Process__WorkSequencesAssignment_8_2 )
            // InternalPDL.g:773:3: rule__Process__WorkSequencesAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkSequencesAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkSequencesAssignment_8_2()); 

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
    // $ANTLR end "rule__Process__Group_8__2__Impl"


    // $ANTLR start "rule__Process__Group_8__3"
    // InternalPDL.g:781:1: rule__Process__Group_8__3 : rule__Process__Group_8__3__Impl rule__Process__Group_8__4 ;
    public final void rule__Process__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:785:1: ( rule__Process__Group_8__3__Impl rule__Process__Group_8__4 )
            // InternalPDL.g:786:2: rule__Process__Group_8__3__Impl rule__Process__Group_8__4
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_8__4();

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
    // $ANTLR end "rule__Process__Group_8__3"


    // $ANTLR start "rule__Process__Group_8__3__Impl"
    // InternalPDL.g:793:1: rule__Process__Group_8__3__Impl : ( ( rule__Process__Group_8_3__0 )* ) ;
    public final void rule__Process__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:797:1: ( ( ( rule__Process__Group_8_3__0 )* ) )
            // InternalPDL.g:798:1: ( ( rule__Process__Group_8_3__0 )* )
            {
            // InternalPDL.g:798:1: ( ( rule__Process__Group_8_3__0 )* )
            // InternalPDL.g:799:2: ( rule__Process__Group_8_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_8_3()); 
            // InternalPDL.g:800:2: ( rule__Process__Group_8_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPDL.g:800:3: rule__Process__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Process__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_8_3()); 

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
    // $ANTLR end "rule__Process__Group_8__3__Impl"


    // $ANTLR start "rule__Process__Group_8__4"
    // InternalPDL.g:808:1: rule__Process__Group_8__4 : rule__Process__Group_8__4__Impl ;
    public final void rule__Process__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:812:1: ( rule__Process__Group_8__4__Impl )
            // InternalPDL.g:813:2: rule__Process__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_8__4__Impl();

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
    // $ANTLR end "rule__Process__Group_8__4"


    // $ANTLR start "rule__Process__Group_8__4__Impl"
    // InternalPDL.g:819:1: rule__Process__Group_8__4__Impl : ( '}' ) ;
    public final void rule__Process__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:823:1: ( ( '}' ) )
            // InternalPDL.g:824:1: ( '}' )
            {
            // InternalPDL.g:824:1: ( '}' )
            // InternalPDL.g:825:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_8_4()); 

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
    // $ANTLR end "rule__Process__Group_8__4__Impl"


    // $ANTLR start "rule__Process__Group_8_3__0"
    // InternalPDL.g:835:1: rule__Process__Group_8_3__0 : rule__Process__Group_8_3__0__Impl rule__Process__Group_8_3__1 ;
    public final void rule__Process__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:839:1: ( rule__Process__Group_8_3__0__Impl rule__Process__Group_8_3__1 )
            // InternalPDL.g:840:2: rule__Process__Group_8_3__0__Impl rule__Process__Group_8_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Process__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_8_3__1();

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
    // $ANTLR end "rule__Process__Group_8_3__0"


    // $ANTLR start "rule__Process__Group_8_3__0__Impl"
    // InternalPDL.g:847:1: rule__Process__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Process__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:851:1: ( ( ',' ) )
            // InternalPDL.g:852:1: ( ',' )
            {
            // InternalPDL.g:852:1: ( ',' )
            // InternalPDL.g:853:2: ','
            {
             before(grammarAccess.getProcessAccess().getCommaKeyword_8_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getCommaKeyword_8_3_0()); 

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
    // $ANTLR end "rule__Process__Group_8_3__0__Impl"


    // $ANTLR start "rule__Process__Group_8_3__1"
    // InternalPDL.g:862:1: rule__Process__Group_8_3__1 : rule__Process__Group_8_3__1__Impl ;
    public final void rule__Process__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:866:1: ( rule__Process__Group_8_3__1__Impl )
            // InternalPDL.g:867:2: rule__Process__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_8_3__1__Impl();

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
    // $ANTLR end "rule__Process__Group_8_3__1"


    // $ANTLR start "rule__Process__Group_8_3__1__Impl"
    // InternalPDL.g:873:1: rule__Process__Group_8_3__1__Impl : ( ( rule__Process__WorkSequencesAssignment_8_3_1 ) ) ;
    public final void rule__Process__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:877:1: ( ( ( rule__Process__WorkSequencesAssignment_8_3_1 ) ) )
            // InternalPDL.g:878:1: ( ( rule__Process__WorkSequencesAssignment_8_3_1 ) )
            {
            // InternalPDL.g:878:1: ( ( rule__Process__WorkSequencesAssignment_8_3_1 ) )
            // InternalPDL.g:879:2: ( rule__Process__WorkSequencesAssignment_8_3_1 )
            {
             before(grammarAccess.getProcessAccess().getWorkSequencesAssignment_8_3_1()); 
            // InternalPDL.g:880:2: ( rule__Process__WorkSequencesAssignment_8_3_1 )
            // InternalPDL.g:880:3: rule__Process__WorkSequencesAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkSequencesAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkSequencesAssignment_8_3_1()); 

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
    // $ANTLR end "rule__Process__Group_8_3__1__Impl"


    // $ANTLR start "rule__Process__Group_9__0"
    // InternalPDL.g:889:1: rule__Process__Group_9__0 : rule__Process__Group_9__0__Impl rule__Process__Group_9__1 ;
    public final void rule__Process__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:893:1: ( rule__Process__Group_9__0__Impl rule__Process__Group_9__1 )
            // InternalPDL.g:894:2: rule__Process__Group_9__0__Impl rule__Process__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_9__1();

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
    // $ANTLR end "rule__Process__Group_9__0"


    // $ANTLR start "rule__Process__Group_9__0__Impl"
    // InternalPDL.g:901:1: rule__Process__Group_9__0__Impl : ( 'guidance' ) ;
    public final void rule__Process__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:905:1: ( ( 'guidance' ) )
            // InternalPDL.g:906:1: ( 'guidance' )
            {
            // InternalPDL.g:906:1: ( 'guidance' )
            // InternalPDL.g:907:2: 'guidance'
            {
             before(grammarAccess.getProcessAccess().getGuidanceKeyword_9_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getGuidanceKeyword_9_0()); 

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
    // $ANTLR end "rule__Process__Group_9__0__Impl"


    // $ANTLR start "rule__Process__Group_9__1"
    // InternalPDL.g:916:1: rule__Process__Group_9__1 : rule__Process__Group_9__1__Impl rule__Process__Group_9__2 ;
    public final void rule__Process__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:920:1: ( rule__Process__Group_9__1__Impl rule__Process__Group_9__2 )
            // InternalPDL.g:921:2: rule__Process__Group_9__1__Impl rule__Process__Group_9__2
            {
            pushFollow(FOLLOW_11);
            rule__Process__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_9__2();

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
    // $ANTLR end "rule__Process__Group_9__1"


    // $ANTLR start "rule__Process__Group_9__1__Impl"
    // InternalPDL.g:928:1: rule__Process__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Process__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:932:1: ( ( '{' ) )
            // InternalPDL.g:933:1: ( '{' )
            {
            // InternalPDL.g:933:1: ( '{' )
            // InternalPDL.g:934:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_9_1()); 

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
    // $ANTLR end "rule__Process__Group_9__1__Impl"


    // $ANTLR start "rule__Process__Group_9__2"
    // InternalPDL.g:943:1: rule__Process__Group_9__2 : rule__Process__Group_9__2__Impl rule__Process__Group_9__3 ;
    public final void rule__Process__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:947:1: ( rule__Process__Group_9__2__Impl rule__Process__Group_9__3 )
            // InternalPDL.g:948:2: rule__Process__Group_9__2__Impl rule__Process__Group_9__3
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_9__3();

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
    // $ANTLR end "rule__Process__Group_9__2"


    // $ANTLR start "rule__Process__Group_9__2__Impl"
    // InternalPDL.g:955:1: rule__Process__Group_9__2__Impl : ( ( rule__Process__GuidanceAssignment_9_2 ) ) ;
    public final void rule__Process__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:959:1: ( ( ( rule__Process__GuidanceAssignment_9_2 ) ) )
            // InternalPDL.g:960:1: ( ( rule__Process__GuidanceAssignment_9_2 ) )
            {
            // InternalPDL.g:960:1: ( ( rule__Process__GuidanceAssignment_9_2 ) )
            // InternalPDL.g:961:2: ( rule__Process__GuidanceAssignment_9_2 )
            {
             before(grammarAccess.getProcessAccess().getGuidanceAssignment_9_2()); 
            // InternalPDL.g:962:2: ( rule__Process__GuidanceAssignment_9_2 )
            // InternalPDL.g:962:3: rule__Process__GuidanceAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__GuidanceAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGuidanceAssignment_9_2()); 

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
    // $ANTLR end "rule__Process__Group_9__2__Impl"


    // $ANTLR start "rule__Process__Group_9__3"
    // InternalPDL.g:970:1: rule__Process__Group_9__3 : rule__Process__Group_9__3__Impl rule__Process__Group_9__4 ;
    public final void rule__Process__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:974:1: ( rule__Process__Group_9__3__Impl rule__Process__Group_9__4 )
            // InternalPDL.g:975:2: rule__Process__Group_9__3__Impl rule__Process__Group_9__4
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_9__4();

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
    // $ANTLR end "rule__Process__Group_9__3"


    // $ANTLR start "rule__Process__Group_9__3__Impl"
    // InternalPDL.g:982:1: rule__Process__Group_9__3__Impl : ( ( rule__Process__Group_9_3__0 )* ) ;
    public final void rule__Process__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:986:1: ( ( ( rule__Process__Group_9_3__0 )* ) )
            // InternalPDL.g:987:1: ( ( rule__Process__Group_9_3__0 )* )
            {
            // InternalPDL.g:987:1: ( ( rule__Process__Group_9_3__0 )* )
            // InternalPDL.g:988:2: ( rule__Process__Group_9_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_9_3()); 
            // InternalPDL.g:989:2: ( rule__Process__Group_9_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPDL.g:989:3: rule__Process__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Process__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_9_3()); 

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
    // $ANTLR end "rule__Process__Group_9__3__Impl"


    // $ANTLR start "rule__Process__Group_9__4"
    // InternalPDL.g:997:1: rule__Process__Group_9__4 : rule__Process__Group_9__4__Impl ;
    public final void rule__Process__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1001:1: ( rule__Process__Group_9__4__Impl )
            // InternalPDL.g:1002:2: rule__Process__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_9__4__Impl();

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
    // $ANTLR end "rule__Process__Group_9__4"


    // $ANTLR start "rule__Process__Group_9__4__Impl"
    // InternalPDL.g:1008:1: rule__Process__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Process__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1012:1: ( ( '}' ) )
            // InternalPDL.g:1013:1: ( '}' )
            {
            // InternalPDL.g:1013:1: ( '}' )
            // InternalPDL.g:1014:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_9_4()); 

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
    // $ANTLR end "rule__Process__Group_9__4__Impl"


    // $ANTLR start "rule__Process__Group_9_3__0"
    // InternalPDL.g:1024:1: rule__Process__Group_9_3__0 : rule__Process__Group_9_3__0__Impl rule__Process__Group_9_3__1 ;
    public final void rule__Process__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1028:1: ( rule__Process__Group_9_3__0__Impl rule__Process__Group_9_3__1 )
            // InternalPDL.g:1029:2: rule__Process__Group_9_3__0__Impl rule__Process__Group_9_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Process__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_9_3__1();

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
    // $ANTLR end "rule__Process__Group_9_3__0"


    // $ANTLR start "rule__Process__Group_9_3__0__Impl"
    // InternalPDL.g:1036:1: rule__Process__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Process__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1040:1: ( ( ',' ) )
            // InternalPDL.g:1041:1: ( ',' )
            {
            // InternalPDL.g:1041:1: ( ',' )
            // InternalPDL.g:1042:2: ','
            {
             before(grammarAccess.getProcessAccess().getCommaKeyword_9_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getCommaKeyword_9_3_0()); 

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
    // $ANTLR end "rule__Process__Group_9_3__0__Impl"


    // $ANTLR start "rule__Process__Group_9_3__1"
    // InternalPDL.g:1051:1: rule__Process__Group_9_3__1 : rule__Process__Group_9_3__1__Impl ;
    public final void rule__Process__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1055:1: ( rule__Process__Group_9_3__1__Impl )
            // InternalPDL.g:1056:2: rule__Process__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_9_3__1__Impl();

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
    // $ANTLR end "rule__Process__Group_9_3__1"


    // $ANTLR start "rule__Process__Group_9_3__1__Impl"
    // InternalPDL.g:1062:1: rule__Process__Group_9_3__1__Impl : ( ( rule__Process__GuidanceAssignment_9_3_1 ) ) ;
    public final void rule__Process__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1066:1: ( ( ( rule__Process__GuidanceAssignment_9_3_1 ) ) )
            // InternalPDL.g:1067:1: ( ( rule__Process__GuidanceAssignment_9_3_1 ) )
            {
            // InternalPDL.g:1067:1: ( ( rule__Process__GuidanceAssignment_9_3_1 ) )
            // InternalPDL.g:1068:2: ( rule__Process__GuidanceAssignment_9_3_1 )
            {
             before(grammarAccess.getProcessAccess().getGuidanceAssignment_9_3_1()); 
            // InternalPDL.g:1069:2: ( rule__Process__GuidanceAssignment_9_3_1 )
            // InternalPDL.g:1069:3: rule__Process__GuidanceAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__GuidanceAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGuidanceAssignment_9_3_1()); 

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
    // $ANTLR end "rule__Process__Group_9_3__1__Impl"


    // $ANTLR start "rule__Process__Group_10__0"
    // InternalPDL.g:1078:1: rule__Process__Group_10__0 : rule__Process__Group_10__0__Impl rule__Process__Group_10__1 ;
    public final void rule__Process__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1082:1: ( rule__Process__Group_10__0__Impl rule__Process__Group_10__1 )
            // InternalPDL.g:1083:2: rule__Process__Group_10__0__Impl rule__Process__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_10__1();

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
    // $ANTLR end "rule__Process__Group_10__0"


    // $ANTLR start "rule__Process__Group_10__0__Impl"
    // InternalPDL.g:1090:1: rule__Process__Group_10__0__Impl : ( 'resource' ) ;
    public final void rule__Process__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1094:1: ( ( 'resource' ) )
            // InternalPDL.g:1095:1: ( 'resource' )
            {
            // InternalPDL.g:1095:1: ( 'resource' )
            // InternalPDL.g:1096:2: 'resource'
            {
             before(grammarAccess.getProcessAccess().getResourceKeyword_10_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getResourceKeyword_10_0()); 

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
    // $ANTLR end "rule__Process__Group_10__0__Impl"


    // $ANTLR start "rule__Process__Group_10__1"
    // InternalPDL.g:1105:1: rule__Process__Group_10__1 : rule__Process__Group_10__1__Impl rule__Process__Group_10__2 ;
    public final void rule__Process__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1109:1: ( rule__Process__Group_10__1__Impl rule__Process__Group_10__2 )
            // InternalPDL.g:1110:2: rule__Process__Group_10__1__Impl rule__Process__Group_10__2
            {
            pushFollow(FOLLOW_12);
            rule__Process__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_10__2();

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
    // $ANTLR end "rule__Process__Group_10__1"


    // $ANTLR start "rule__Process__Group_10__1__Impl"
    // InternalPDL.g:1117:1: rule__Process__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Process__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1121:1: ( ( '{' ) )
            // InternalPDL.g:1122:1: ( '{' )
            {
            // InternalPDL.g:1122:1: ( '{' )
            // InternalPDL.g:1123:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_10_1()); 

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
    // $ANTLR end "rule__Process__Group_10__1__Impl"


    // $ANTLR start "rule__Process__Group_10__2"
    // InternalPDL.g:1132:1: rule__Process__Group_10__2 : rule__Process__Group_10__2__Impl rule__Process__Group_10__3 ;
    public final void rule__Process__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1136:1: ( rule__Process__Group_10__2__Impl rule__Process__Group_10__3 )
            // InternalPDL.g:1137:2: rule__Process__Group_10__2__Impl rule__Process__Group_10__3
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_10__3();

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
    // $ANTLR end "rule__Process__Group_10__2"


    // $ANTLR start "rule__Process__Group_10__2__Impl"
    // InternalPDL.g:1144:1: rule__Process__Group_10__2__Impl : ( ( rule__Process__ResourceAssignment_10_2 ) ) ;
    public final void rule__Process__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1148:1: ( ( ( rule__Process__ResourceAssignment_10_2 ) ) )
            // InternalPDL.g:1149:1: ( ( rule__Process__ResourceAssignment_10_2 ) )
            {
            // InternalPDL.g:1149:1: ( ( rule__Process__ResourceAssignment_10_2 ) )
            // InternalPDL.g:1150:2: ( rule__Process__ResourceAssignment_10_2 )
            {
             before(grammarAccess.getProcessAccess().getResourceAssignment_10_2()); 
            // InternalPDL.g:1151:2: ( rule__Process__ResourceAssignment_10_2 )
            // InternalPDL.g:1151:3: rule__Process__ResourceAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__ResourceAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getResourceAssignment_10_2()); 

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
    // $ANTLR end "rule__Process__Group_10__2__Impl"


    // $ANTLR start "rule__Process__Group_10__3"
    // InternalPDL.g:1159:1: rule__Process__Group_10__3 : rule__Process__Group_10__3__Impl rule__Process__Group_10__4 ;
    public final void rule__Process__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1163:1: ( rule__Process__Group_10__3__Impl rule__Process__Group_10__4 )
            // InternalPDL.g:1164:2: rule__Process__Group_10__3__Impl rule__Process__Group_10__4
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_10__4();

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
    // $ANTLR end "rule__Process__Group_10__3"


    // $ANTLR start "rule__Process__Group_10__3__Impl"
    // InternalPDL.g:1171:1: rule__Process__Group_10__3__Impl : ( ( rule__Process__Group_10_3__0 )* ) ;
    public final void rule__Process__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1175:1: ( ( ( rule__Process__Group_10_3__0 )* ) )
            // InternalPDL.g:1176:1: ( ( rule__Process__Group_10_3__0 )* )
            {
            // InternalPDL.g:1176:1: ( ( rule__Process__Group_10_3__0 )* )
            // InternalPDL.g:1177:2: ( rule__Process__Group_10_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_10_3()); 
            // InternalPDL.g:1178:2: ( rule__Process__Group_10_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPDL.g:1178:3: rule__Process__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Process__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_10_3()); 

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
    // $ANTLR end "rule__Process__Group_10__3__Impl"


    // $ANTLR start "rule__Process__Group_10__4"
    // InternalPDL.g:1186:1: rule__Process__Group_10__4 : rule__Process__Group_10__4__Impl ;
    public final void rule__Process__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1190:1: ( rule__Process__Group_10__4__Impl )
            // InternalPDL.g:1191:2: rule__Process__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_10__4__Impl();

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
    // $ANTLR end "rule__Process__Group_10__4"


    // $ANTLR start "rule__Process__Group_10__4__Impl"
    // InternalPDL.g:1197:1: rule__Process__Group_10__4__Impl : ( '}' ) ;
    public final void rule__Process__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1201:1: ( ( '}' ) )
            // InternalPDL.g:1202:1: ( '}' )
            {
            // InternalPDL.g:1202:1: ( '}' )
            // InternalPDL.g:1203:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_10_4()); 

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
    // $ANTLR end "rule__Process__Group_10__4__Impl"


    // $ANTLR start "rule__Process__Group_10_3__0"
    // InternalPDL.g:1213:1: rule__Process__Group_10_3__0 : rule__Process__Group_10_3__0__Impl rule__Process__Group_10_3__1 ;
    public final void rule__Process__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1217:1: ( rule__Process__Group_10_3__0__Impl rule__Process__Group_10_3__1 )
            // InternalPDL.g:1218:2: rule__Process__Group_10_3__0__Impl rule__Process__Group_10_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Process__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_10_3__1();

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
    // $ANTLR end "rule__Process__Group_10_3__0"


    // $ANTLR start "rule__Process__Group_10_3__0__Impl"
    // InternalPDL.g:1225:1: rule__Process__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Process__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1229:1: ( ( ',' ) )
            // InternalPDL.g:1230:1: ( ',' )
            {
            // InternalPDL.g:1230:1: ( ',' )
            // InternalPDL.g:1231:2: ','
            {
             before(grammarAccess.getProcessAccess().getCommaKeyword_10_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getCommaKeyword_10_3_0()); 

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
    // $ANTLR end "rule__Process__Group_10_3__0__Impl"


    // $ANTLR start "rule__Process__Group_10_3__1"
    // InternalPDL.g:1240:1: rule__Process__Group_10_3__1 : rule__Process__Group_10_3__1__Impl ;
    public final void rule__Process__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1244:1: ( rule__Process__Group_10_3__1__Impl )
            // InternalPDL.g:1245:2: rule__Process__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_10_3__1__Impl();

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
    // $ANTLR end "rule__Process__Group_10_3__1"


    // $ANTLR start "rule__Process__Group_10_3__1__Impl"
    // InternalPDL.g:1251:1: rule__Process__Group_10_3__1__Impl : ( ( rule__Process__ResourceAssignment_10_3_1 ) ) ;
    public final void rule__Process__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1255:1: ( ( ( rule__Process__ResourceAssignment_10_3_1 ) ) )
            // InternalPDL.g:1256:1: ( ( rule__Process__ResourceAssignment_10_3_1 ) )
            {
            // InternalPDL.g:1256:1: ( ( rule__Process__ResourceAssignment_10_3_1 ) )
            // InternalPDL.g:1257:2: ( rule__Process__ResourceAssignment_10_3_1 )
            {
             before(grammarAccess.getProcessAccess().getResourceAssignment_10_3_1()); 
            // InternalPDL.g:1258:2: ( rule__Process__ResourceAssignment_10_3_1 )
            // InternalPDL.g:1258:3: rule__Process__ResourceAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__ResourceAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getResourceAssignment_10_3_1()); 

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
    // $ANTLR end "rule__Process__Group_10_3__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__0"
    // InternalPDL.g:1267:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1271:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // InternalPDL.g:1272:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__WorkDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__1();

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
    // $ANTLR end "rule__WorkDefinition__Group__0"


    // $ANTLR start "rule__WorkDefinition__Group__0__Impl"
    // InternalPDL.g:1279:1: rule__WorkDefinition__Group__0__Impl : ( () ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1283:1: ( ( () ) )
            // InternalPDL.g:1284:1: ( () )
            {
            // InternalPDL.g:1284:1: ( () )
            // InternalPDL.g:1285:2: ()
            {
             before(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0()); 
            // InternalPDL.g:1286:2: ()
            // InternalPDL.g:1286:3: 
            {
            }

             after(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__1"
    // InternalPDL.g:1294:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1298:1: ( rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 )
            // InternalPDL.g:1299:2: rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2();

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
    // $ANTLR end "rule__WorkDefinition__Group__1"


    // $ANTLR start "rule__WorkDefinition__Group__1__Impl"
    // InternalPDL.g:1306:1: rule__WorkDefinition__Group__1__Impl : ( 'WorkDefinition' ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1310:1: ( ( 'WorkDefinition' ) )
            // InternalPDL.g:1311:1: ( 'WorkDefinition' )
            {
            // InternalPDL.g:1311:1: ( 'WorkDefinition' )
            // InternalPDL.g:1312:2: 'WorkDefinition'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionKeyword_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__2"
    // InternalPDL.g:1321:1: rule__WorkDefinition__Group__2 : rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 ;
    public final void rule__WorkDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1325:1: ( rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 )
            // InternalPDL.g:1326:2: rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__3();

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
    // $ANTLR end "rule__WorkDefinition__Group__2"


    // $ANTLR start "rule__WorkDefinition__Group__2__Impl"
    // InternalPDL.g:1333:1: rule__WorkDefinition__Group__2__Impl : ( ( rule__WorkDefinition__NameAssignment_2 ) ) ;
    public final void rule__WorkDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1337:1: ( ( ( rule__WorkDefinition__NameAssignment_2 ) ) )
            // InternalPDL.g:1338:1: ( ( rule__WorkDefinition__NameAssignment_2 ) )
            {
            // InternalPDL.g:1338:1: ( ( rule__WorkDefinition__NameAssignment_2 ) )
            // InternalPDL.g:1339:2: ( rule__WorkDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_2()); 
            // InternalPDL.g:1340:2: ( rule__WorkDefinition__NameAssignment_2 )
            // InternalPDL.g:1340:3: rule__WorkDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__3"
    // InternalPDL.g:1348:1: rule__WorkDefinition__Group__3 : rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 ;
    public final void rule__WorkDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1352:1: ( rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 )
            // InternalPDL.g:1353:2: rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__WorkDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__4();

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
    // $ANTLR end "rule__WorkDefinition__Group__3"


    // $ANTLR start "rule__WorkDefinition__Group__3__Impl"
    // InternalPDL.g:1360:1: rule__WorkDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__WorkDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1364:1: ( ( '{' ) )
            // InternalPDL.g:1365:1: ( '{' )
            {
            // InternalPDL.g:1365:1: ( '{' )
            // InternalPDL.g:1366:2: '{'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__4"
    // InternalPDL.g:1375:1: rule__WorkDefinition__Group__4 : rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5 ;
    public final void rule__WorkDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1379:1: ( rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5 )
            // InternalPDL.g:1380:2: rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__WorkDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__5();

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
    // $ANTLR end "rule__WorkDefinition__Group__4"


    // $ANTLR start "rule__WorkDefinition__Group__4__Impl"
    // InternalPDL.g:1387:1: rule__WorkDefinition__Group__4__Impl : ( ( rule__WorkDefinition__Group_4__0 )? ) ;
    public final void rule__WorkDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1391:1: ( ( ( rule__WorkDefinition__Group_4__0 )? ) )
            // InternalPDL.g:1392:1: ( ( rule__WorkDefinition__Group_4__0 )? )
            {
            // InternalPDL.g:1392:1: ( ( rule__WorkDefinition__Group_4__0 )? )
            // InternalPDL.g:1393:2: ( rule__WorkDefinition__Group_4__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_4()); 
            // InternalPDL.g:1394:2: ( rule__WorkDefinition__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPDL.g:1394:3: rule__WorkDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__5"
    // InternalPDL.g:1402:1: rule__WorkDefinition__Group__5 : rule__WorkDefinition__Group__5__Impl rule__WorkDefinition__Group__6 ;
    public final void rule__WorkDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1406:1: ( rule__WorkDefinition__Group__5__Impl rule__WorkDefinition__Group__6 )
            // InternalPDL.g:1407:2: rule__WorkDefinition__Group__5__Impl rule__WorkDefinition__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__WorkDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__6();

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
    // $ANTLR end "rule__WorkDefinition__Group__5"


    // $ANTLR start "rule__WorkDefinition__Group__5__Impl"
    // InternalPDL.g:1414:1: rule__WorkDefinition__Group__5__Impl : ( ( rule__WorkDefinition__Group_5__0 )? ) ;
    public final void rule__WorkDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1418:1: ( ( ( rule__WorkDefinition__Group_5__0 )? ) )
            // InternalPDL.g:1419:1: ( ( rule__WorkDefinition__Group_5__0 )? )
            {
            // InternalPDL.g:1419:1: ( ( rule__WorkDefinition__Group_5__0 )? )
            // InternalPDL.g:1420:2: ( rule__WorkDefinition__Group_5__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_5()); 
            // InternalPDL.g:1421:2: ( rule__WorkDefinition__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPDL.g:1421:3: rule__WorkDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_5()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__5__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__6"
    // InternalPDL.g:1429:1: rule__WorkDefinition__Group__6 : rule__WorkDefinition__Group__6__Impl rule__WorkDefinition__Group__7 ;
    public final void rule__WorkDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1433:1: ( rule__WorkDefinition__Group__6__Impl rule__WorkDefinition__Group__7 )
            // InternalPDL.g:1434:2: rule__WorkDefinition__Group__6__Impl rule__WorkDefinition__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__WorkDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__7();

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
    // $ANTLR end "rule__WorkDefinition__Group__6"


    // $ANTLR start "rule__WorkDefinition__Group__6__Impl"
    // InternalPDL.g:1441:1: rule__WorkDefinition__Group__6__Impl : ( ( rule__WorkDefinition__Group_6__0 )? ) ;
    public final void rule__WorkDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1445:1: ( ( ( rule__WorkDefinition__Group_6__0 )? ) )
            // InternalPDL.g:1446:1: ( ( rule__WorkDefinition__Group_6__0 )? )
            {
            // InternalPDL.g:1446:1: ( ( rule__WorkDefinition__Group_6__0 )? )
            // InternalPDL.g:1447:2: ( rule__WorkDefinition__Group_6__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_6()); 
            // InternalPDL.g:1448:2: ( rule__WorkDefinition__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPDL.g:1448:3: rule__WorkDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_6()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__6__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__7"
    // InternalPDL.g:1456:1: rule__WorkDefinition__Group__7 : rule__WorkDefinition__Group__7__Impl rule__WorkDefinition__Group__8 ;
    public final void rule__WorkDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1460:1: ( rule__WorkDefinition__Group__7__Impl rule__WorkDefinition__Group__8 )
            // InternalPDL.g:1461:2: rule__WorkDefinition__Group__7__Impl rule__WorkDefinition__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__WorkDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__8();

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
    // $ANTLR end "rule__WorkDefinition__Group__7"


    // $ANTLR start "rule__WorkDefinition__Group__7__Impl"
    // InternalPDL.g:1468:1: rule__WorkDefinition__Group__7__Impl : ( ( rule__WorkDefinition__Group_7__0 )? ) ;
    public final void rule__WorkDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1472:1: ( ( ( rule__WorkDefinition__Group_7__0 )? ) )
            // InternalPDL.g:1473:1: ( ( rule__WorkDefinition__Group_7__0 )? )
            {
            // InternalPDL.g:1473:1: ( ( rule__WorkDefinition__Group_7__0 )? )
            // InternalPDL.g:1474:2: ( rule__WorkDefinition__Group_7__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_7()); 
            // InternalPDL.g:1475:2: ( rule__WorkDefinition__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPDL.g:1475:3: rule__WorkDefinition__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_7()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__7__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__8"
    // InternalPDL.g:1483:1: rule__WorkDefinition__Group__8 : rule__WorkDefinition__Group__8__Impl ;
    public final void rule__WorkDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1487:1: ( rule__WorkDefinition__Group__8__Impl )
            // InternalPDL.g:1488:2: rule__WorkDefinition__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__8__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group__8"


    // $ANTLR start "rule__WorkDefinition__Group__8__Impl"
    // InternalPDL.g:1494:1: rule__WorkDefinition__Group__8__Impl : ( '}' ) ;
    public final void rule__WorkDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1498:1: ( ( '}' ) )
            // InternalPDL.g:1499:1: ( '}' )
            {
            // InternalPDL.g:1499:1: ( '}' )
            // InternalPDL.g:1500:2: '}'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__8__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__0"
    // InternalPDL.g:1510:1: rule__WorkDefinition__Group_4__0 : rule__WorkDefinition__Group_4__0__Impl rule__WorkDefinition__Group_4__1 ;
    public final void rule__WorkDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1514:1: ( rule__WorkDefinition__Group_4__0__Impl rule__WorkDefinition__Group_4__1 )
            // InternalPDL.g:1515:2: rule__WorkDefinition__Group_4__0__Impl rule__WorkDefinition__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__WorkDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4__1();

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
    // $ANTLR end "rule__WorkDefinition__Group_4__0"


    // $ANTLR start "rule__WorkDefinition__Group_4__0__Impl"
    // InternalPDL.g:1522:1: rule__WorkDefinition__Group_4__0__Impl : ( 'linksToPredecessors' ) ;
    public final void rule__WorkDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1526:1: ( ( 'linksToPredecessors' ) )
            // InternalPDL.g:1527:1: ( 'linksToPredecessors' )
            {
            // InternalPDL.g:1527:1: ( 'linksToPredecessors' )
            // InternalPDL.g:1528:2: 'linksToPredecessors'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsKeyword_4_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__1"
    // InternalPDL.g:1537:1: rule__WorkDefinition__Group_4__1 : rule__WorkDefinition__Group_4__1__Impl rule__WorkDefinition__Group_4__2 ;
    public final void rule__WorkDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1541:1: ( rule__WorkDefinition__Group_4__1__Impl rule__WorkDefinition__Group_4__2 )
            // InternalPDL.g:1542:2: rule__WorkDefinition__Group_4__1__Impl rule__WorkDefinition__Group_4__2
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4__2();

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
    // $ANTLR end "rule__WorkDefinition__Group_4__1"


    // $ANTLR start "rule__WorkDefinition__Group_4__1__Impl"
    // InternalPDL.g:1549:1: rule__WorkDefinition__Group_4__1__Impl : ( '(' ) ;
    public final void rule__WorkDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1553:1: ( ( '(' ) )
            // InternalPDL.g:1554:1: ( '(' )
            {
            // InternalPDL.g:1554:1: ( '(' )
            // InternalPDL.g:1555:2: '('
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_4_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__2"
    // InternalPDL.g:1564:1: rule__WorkDefinition__Group_4__2 : rule__WorkDefinition__Group_4__2__Impl rule__WorkDefinition__Group_4__3 ;
    public final void rule__WorkDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1568:1: ( rule__WorkDefinition__Group_4__2__Impl rule__WorkDefinition__Group_4__3 )
            // InternalPDL.g:1569:2: rule__WorkDefinition__Group_4__2__Impl rule__WorkDefinition__Group_4__3
            {
            pushFollow(FOLLOW_15);
            rule__WorkDefinition__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4__3();

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
    // $ANTLR end "rule__WorkDefinition__Group_4__2"


    // $ANTLR start "rule__WorkDefinition__Group_4__2__Impl"
    // InternalPDL.g:1576:1: rule__WorkDefinition__Group_4__2__Impl : ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 ) ) ;
    public final void rule__WorkDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1580:1: ( ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 ) ) )
            // InternalPDL.g:1581:1: ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 ) )
            {
            // InternalPDL.g:1581:1: ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 ) )
            // InternalPDL.g:1582:2: ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_4_2()); 
            // InternalPDL.g:1583:2: ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 )
            // InternalPDL.g:1583:3: rule__WorkDefinition__LinksToPredecessorsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__LinksToPredecessorsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_4_2()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_4__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__3"
    // InternalPDL.g:1591:1: rule__WorkDefinition__Group_4__3 : rule__WorkDefinition__Group_4__3__Impl rule__WorkDefinition__Group_4__4 ;
    public final void rule__WorkDefinition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1595:1: ( rule__WorkDefinition__Group_4__3__Impl rule__WorkDefinition__Group_4__4 )
            // InternalPDL.g:1596:2: rule__WorkDefinition__Group_4__3__Impl rule__WorkDefinition__Group_4__4
            {
            pushFollow(FOLLOW_15);
            rule__WorkDefinition__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4__4();

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
    // $ANTLR end "rule__WorkDefinition__Group_4__3"


    // $ANTLR start "rule__WorkDefinition__Group_4__3__Impl"
    // InternalPDL.g:1603:1: rule__WorkDefinition__Group_4__3__Impl : ( ( rule__WorkDefinition__Group_4_3__0 )* ) ;
    public final void rule__WorkDefinition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1607:1: ( ( ( rule__WorkDefinition__Group_4_3__0 )* ) )
            // InternalPDL.g:1608:1: ( ( rule__WorkDefinition__Group_4_3__0 )* )
            {
            // InternalPDL.g:1608:1: ( ( rule__WorkDefinition__Group_4_3__0 )* )
            // InternalPDL.g:1609:2: ( rule__WorkDefinition__Group_4_3__0 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_4_3()); 
            // InternalPDL.g:1610:2: ( rule__WorkDefinition__Group_4_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPDL.g:1610:3: rule__WorkDefinition__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__WorkDefinition__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_4__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__4"
    // InternalPDL.g:1618:1: rule__WorkDefinition__Group_4__4 : rule__WorkDefinition__Group_4__4__Impl ;
    public final void rule__WorkDefinition__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1622:1: ( rule__WorkDefinition__Group_4__4__Impl )
            // InternalPDL.g:1623:2: rule__WorkDefinition__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4__4__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group_4__4"


    // $ANTLR start "rule__WorkDefinition__Group_4__4__Impl"
    // InternalPDL.g:1629:1: rule__WorkDefinition__Group_4__4__Impl : ( ')' ) ;
    public final void rule__WorkDefinition__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1633:1: ( ( ')' ) )
            // InternalPDL.g:1634:1: ( ')' )
            {
            // InternalPDL.g:1634:1: ( ')' )
            // InternalPDL.g:1635:2: ')'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_4_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_4_4()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_4__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4_3__0"
    // InternalPDL.g:1645:1: rule__WorkDefinition__Group_4_3__0 : rule__WorkDefinition__Group_4_3__0__Impl rule__WorkDefinition__Group_4_3__1 ;
    public final void rule__WorkDefinition__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1649:1: ( rule__WorkDefinition__Group_4_3__0__Impl rule__WorkDefinition__Group_4_3__1 )
            // InternalPDL.g:1650:2: rule__WorkDefinition__Group_4_3__0__Impl rule__WorkDefinition__Group_4_3__1
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4_3__1();

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
    // $ANTLR end "rule__WorkDefinition__Group_4_3__0"


    // $ANTLR start "rule__WorkDefinition__Group_4_3__0__Impl"
    // InternalPDL.g:1657:1: rule__WorkDefinition__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__WorkDefinition__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1661:1: ( ( ',' ) )
            // InternalPDL.g:1662:1: ( ',' )
            {
            // InternalPDL.g:1662:1: ( ',' )
            // InternalPDL.g:1663:2: ','
            {
             before(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_4_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_4_3__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4_3__1"
    // InternalPDL.g:1672:1: rule__WorkDefinition__Group_4_3__1 : rule__WorkDefinition__Group_4_3__1__Impl ;
    public final void rule__WorkDefinition__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1676:1: ( rule__WorkDefinition__Group_4_3__1__Impl )
            // InternalPDL.g:1677:2: rule__WorkDefinition__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group_4_3__1"


    // $ANTLR start "rule__WorkDefinition__Group_4_3__1__Impl"
    // InternalPDL.g:1683:1: rule__WorkDefinition__Group_4_3__1__Impl : ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 ) ) ;
    public final void rule__WorkDefinition__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1687:1: ( ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 ) ) )
            // InternalPDL.g:1688:1: ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 ) )
            {
            // InternalPDL.g:1688:1: ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 ) )
            // InternalPDL.g:1689:2: ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_4_3_1()); 
            // InternalPDL.g:1690:2: ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 )
            // InternalPDL.g:1690:3: rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_4_3__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5__0"
    // InternalPDL.g:1699:1: rule__WorkDefinition__Group_5__0 : rule__WorkDefinition__Group_5__0__Impl rule__WorkDefinition__Group_5__1 ;
    public final void rule__WorkDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1703:1: ( rule__WorkDefinition__Group_5__0__Impl rule__WorkDefinition__Group_5__1 )
            // InternalPDL.g:1704:2: rule__WorkDefinition__Group_5__0__Impl rule__WorkDefinition__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__WorkDefinition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5__1();

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
    // $ANTLR end "rule__WorkDefinition__Group_5__0"


    // $ANTLR start "rule__WorkDefinition__Group_5__0__Impl"
    // InternalPDL.g:1711:1: rule__WorkDefinition__Group_5__0__Impl : ( 'linksToSuccessors' ) ;
    public final void rule__WorkDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1715:1: ( ( 'linksToSuccessors' ) )
            // InternalPDL.g:1716:1: ( 'linksToSuccessors' )
            {
            // InternalPDL.g:1716:1: ( 'linksToSuccessors' )
            // InternalPDL.g:1717:2: 'linksToSuccessors'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsKeyword_5_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5__1"
    // InternalPDL.g:1726:1: rule__WorkDefinition__Group_5__1 : rule__WorkDefinition__Group_5__1__Impl rule__WorkDefinition__Group_5__2 ;
    public final void rule__WorkDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1730:1: ( rule__WorkDefinition__Group_5__1__Impl rule__WorkDefinition__Group_5__2 )
            // InternalPDL.g:1731:2: rule__WorkDefinition__Group_5__1__Impl rule__WorkDefinition__Group_5__2
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5__2();

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
    // $ANTLR end "rule__WorkDefinition__Group_5__1"


    // $ANTLR start "rule__WorkDefinition__Group_5__1__Impl"
    // InternalPDL.g:1738:1: rule__WorkDefinition__Group_5__1__Impl : ( '(' ) ;
    public final void rule__WorkDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1742:1: ( ( '(' ) )
            // InternalPDL.g:1743:1: ( '(' )
            {
            // InternalPDL.g:1743:1: ( '(' )
            // InternalPDL.g:1744:2: '('
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_5_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5__2"
    // InternalPDL.g:1753:1: rule__WorkDefinition__Group_5__2 : rule__WorkDefinition__Group_5__2__Impl rule__WorkDefinition__Group_5__3 ;
    public final void rule__WorkDefinition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1757:1: ( rule__WorkDefinition__Group_5__2__Impl rule__WorkDefinition__Group_5__3 )
            // InternalPDL.g:1758:2: rule__WorkDefinition__Group_5__2__Impl rule__WorkDefinition__Group_5__3
            {
            pushFollow(FOLLOW_15);
            rule__WorkDefinition__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5__3();

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
    // $ANTLR end "rule__WorkDefinition__Group_5__2"


    // $ANTLR start "rule__WorkDefinition__Group_5__2__Impl"
    // InternalPDL.g:1765:1: rule__WorkDefinition__Group_5__2__Impl : ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 ) ) ;
    public final void rule__WorkDefinition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1769:1: ( ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 ) ) )
            // InternalPDL.g:1770:1: ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 ) )
            {
            // InternalPDL.g:1770:1: ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 ) )
            // InternalPDL.g:1771:2: ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_5_2()); 
            // InternalPDL.g:1772:2: ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 )
            // InternalPDL.g:1772:3: rule__WorkDefinition__LinksToSuccessorsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__LinksToSuccessorsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_5_2()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_5__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5__3"
    // InternalPDL.g:1780:1: rule__WorkDefinition__Group_5__3 : rule__WorkDefinition__Group_5__3__Impl rule__WorkDefinition__Group_5__4 ;
    public final void rule__WorkDefinition__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1784:1: ( rule__WorkDefinition__Group_5__3__Impl rule__WorkDefinition__Group_5__4 )
            // InternalPDL.g:1785:2: rule__WorkDefinition__Group_5__3__Impl rule__WorkDefinition__Group_5__4
            {
            pushFollow(FOLLOW_15);
            rule__WorkDefinition__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5__4();

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
    // $ANTLR end "rule__WorkDefinition__Group_5__3"


    // $ANTLR start "rule__WorkDefinition__Group_5__3__Impl"
    // InternalPDL.g:1792:1: rule__WorkDefinition__Group_5__3__Impl : ( ( rule__WorkDefinition__Group_5_3__0 )* ) ;
    public final void rule__WorkDefinition__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1796:1: ( ( ( rule__WorkDefinition__Group_5_3__0 )* ) )
            // InternalPDL.g:1797:1: ( ( rule__WorkDefinition__Group_5_3__0 )* )
            {
            // InternalPDL.g:1797:1: ( ( rule__WorkDefinition__Group_5_3__0 )* )
            // InternalPDL.g:1798:2: ( rule__WorkDefinition__Group_5_3__0 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_5_3()); 
            // InternalPDL.g:1799:2: ( rule__WorkDefinition__Group_5_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPDL.g:1799:3: rule__WorkDefinition__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__WorkDefinition__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_5__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5__4"
    // InternalPDL.g:1807:1: rule__WorkDefinition__Group_5__4 : rule__WorkDefinition__Group_5__4__Impl ;
    public final void rule__WorkDefinition__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1811:1: ( rule__WorkDefinition__Group_5__4__Impl )
            // InternalPDL.g:1812:2: rule__WorkDefinition__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5__4__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group_5__4"


    // $ANTLR start "rule__WorkDefinition__Group_5__4__Impl"
    // InternalPDL.g:1818:1: rule__WorkDefinition__Group_5__4__Impl : ( ')' ) ;
    public final void rule__WorkDefinition__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1822:1: ( ( ')' ) )
            // InternalPDL.g:1823:1: ( ')' )
            {
            // InternalPDL.g:1823:1: ( ')' )
            // InternalPDL.g:1824:2: ')'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_5_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_5_4()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_5__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5_3__0"
    // InternalPDL.g:1834:1: rule__WorkDefinition__Group_5_3__0 : rule__WorkDefinition__Group_5_3__0__Impl rule__WorkDefinition__Group_5_3__1 ;
    public final void rule__WorkDefinition__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1838:1: ( rule__WorkDefinition__Group_5_3__0__Impl rule__WorkDefinition__Group_5_3__1 )
            // InternalPDL.g:1839:2: rule__WorkDefinition__Group_5_3__0__Impl rule__WorkDefinition__Group_5_3__1
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5_3__1();

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
    // $ANTLR end "rule__WorkDefinition__Group_5_3__0"


    // $ANTLR start "rule__WorkDefinition__Group_5_3__0__Impl"
    // InternalPDL.g:1846:1: rule__WorkDefinition__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__WorkDefinition__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1850:1: ( ( ',' ) )
            // InternalPDL.g:1851:1: ( ',' )
            {
            // InternalPDL.g:1851:1: ( ',' )
            // InternalPDL.g:1852:2: ','
            {
             before(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_5_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_5_3__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5_3__1"
    // InternalPDL.g:1861:1: rule__WorkDefinition__Group_5_3__1 : rule__WorkDefinition__Group_5_3__1__Impl ;
    public final void rule__WorkDefinition__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1865:1: ( rule__WorkDefinition__Group_5_3__1__Impl )
            // InternalPDL.g:1866:2: rule__WorkDefinition__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group_5_3__1"


    // $ANTLR start "rule__WorkDefinition__Group_5_3__1__Impl"
    // InternalPDL.g:1872:1: rule__WorkDefinition__Group_5_3__1__Impl : ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 ) ) ;
    public final void rule__WorkDefinition__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1876:1: ( ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 ) ) )
            // InternalPDL.g:1877:1: ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 ) )
            {
            // InternalPDL.g:1877:1: ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 ) )
            // InternalPDL.g:1878:2: ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_5_3_1()); 
            // InternalPDL.g:1879:2: ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 )
            // InternalPDL.g:1879:3: rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_5_3_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_5_3__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__0"
    // InternalPDL.g:1888:1: rule__WorkDefinition__Group_6__0 : rule__WorkDefinition__Group_6__0__Impl rule__WorkDefinition__Group_6__1 ;
    public final void rule__WorkDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1892:1: ( rule__WorkDefinition__Group_6__0__Impl rule__WorkDefinition__Group_6__1 )
            // InternalPDL.g:1893:2: rule__WorkDefinition__Group_6__0__Impl rule__WorkDefinition__Group_6__1
            {
            pushFollow(FOLLOW_14);
            rule__WorkDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__1();

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
    // $ANTLR end "rule__WorkDefinition__Group_6__0"


    // $ANTLR start "rule__WorkDefinition__Group_6__0__Impl"
    // InternalPDL.g:1900:1: rule__WorkDefinition__Group_6__0__Impl : ( 'guidance' ) ;
    public final void rule__WorkDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1904:1: ( ( 'guidance' ) )
            // InternalPDL.g:1905:1: ( 'guidance' )
            {
            // InternalPDL.g:1905:1: ( 'guidance' )
            // InternalPDL.g:1906:2: 'guidance'
            {
             before(grammarAccess.getWorkDefinitionAccess().getGuidanceKeyword_6_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getGuidanceKeyword_6_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_6__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__1"
    // InternalPDL.g:1915:1: rule__WorkDefinition__Group_6__1 : rule__WorkDefinition__Group_6__1__Impl rule__WorkDefinition__Group_6__2 ;
    public final void rule__WorkDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1919:1: ( rule__WorkDefinition__Group_6__1__Impl rule__WorkDefinition__Group_6__2 )
            // InternalPDL.g:1920:2: rule__WorkDefinition__Group_6__1__Impl rule__WorkDefinition__Group_6__2
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__2();

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
    // $ANTLR end "rule__WorkDefinition__Group_6__1"


    // $ANTLR start "rule__WorkDefinition__Group_6__1__Impl"
    // InternalPDL.g:1927:1: rule__WorkDefinition__Group_6__1__Impl : ( '(' ) ;
    public final void rule__WorkDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1931:1: ( ( '(' ) )
            // InternalPDL.g:1932:1: ( '(' )
            {
            // InternalPDL.g:1932:1: ( '(' )
            // InternalPDL.g:1933:2: '('
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_6_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_6__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__2"
    // InternalPDL.g:1942:1: rule__WorkDefinition__Group_6__2 : rule__WorkDefinition__Group_6__2__Impl rule__WorkDefinition__Group_6__3 ;
    public final void rule__WorkDefinition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1946:1: ( rule__WorkDefinition__Group_6__2__Impl rule__WorkDefinition__Group_6__3 )
            // InternalPDL.g:1947:2: rule__WorkDefinition__Group_6__2__Impl rule__WorkDefinition__Group_6__3
            {
            pushFollow(FOLLOW_15);
            rule__WorkDefinition__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__3();

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
    // $ANTLR end "rule__WorkDefinition__Group_6__2"


    // $ANTLR start "rule__WorkDefinition__Group_6__2__Impl"
    // InternalPDL.g:1954:1: rule__WorkDefinition__Group_6__2__Impl : ( ( rule__WorkDefinition__GuidanceAssignment_6_2 ) ) ;
    public final void rule__WorkDefinition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1958:1: ( ( ( rule__WorkDefinition__GuidanceAssignment_6_2 ) ) )
            // InternalPDL.g:1959:1: ( ( rule__WorkDefinition__GuidanceAssignment_6_2 ) )
            {
            // InternalPDL.g:1959:1: ( ( rule__WorkDefinition__GuidanceAssignment_6_2 ) )
            // InternalPDL.g:1960:2: ( rule__WorkDefinition__GuidanceAssignment_6_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGuidanceAssignment_6_2()); 
            // InternalPDL.g:1961:2: ( rule__WorkDefinition__GuidanceAssignment_6_2 )
            // InternalPDL.g:1961:3: rule__WorkDefinition__GuidanceAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__GuidanceAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGuidanceAssignment_6_2()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_6__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__3"
    // InternalPDL.g:1969:1: rule__WorkDefinition__Group_6__3 : rule__WorkDefinition__Group_6__3__Impl rule__WorkDefinition__Group_6__4 ;
    public final void rule__WorkDefinition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1973:1: ( rule__WorkDefinition__Group_6__3__Impl rule__WorkDefinition__Group_6__4 )
            // InternalPDL.g:1974:2: rule__WorkDefinition__Group_6__3__Impl rule__WorkDefinition__Group_6__4
            {
            pushFollow(FOLLOW_15);
            rule__WorkDefinition__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__4();

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
    // $ANTLR end "rule__WorkDefinition__Group_6__3"


    // $ANTLR start "rule__WorkDefinition__Group_6__3__Impl"
    // InternalPDL.g:1981:1: rule__WorkDefinition__Group_6__3__Impl : ( ( rule__WorkDefinition__Group_6_3__0 )* ) ;
    public final void rule__WorkDefinition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1985:1: ( ( ( rule__WorkDefinition__Group_6_3__0 )* ) )
            // InternalPDL.g:1986:1: ( ( rule__WorkDefinition__Group_6_3__0 )* )
            {
            // InternalPDL.g:1986:1: ( ( rule__WorkDefinition__Group_6_3__0 )* )
            // InternalPDL.g:1987:2: ( rule__WorkDefinition__Group_6_3__0 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_6_3()); 
            // InternalPDL.g:1988:2: ( rule__WorkDefinition__Group_6_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPDL.g:1988:3: rule__WorkDefinition__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__WorkDefinition__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_6__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__4"
    // InternalPDL.g:1996:1: rule__WorkDefinition__Group_6__4 : rule__WorkDefinition__Group_6__4__Impl ;
    public final void rule__WorkDefinition__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2000:1: ( rule__WorkDefinition__Group_6__4__Impl )
            // InternalPDL.g:2001:2: rule__WorkDefinition__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__4__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group_6__4"


    // $ANTLR start "rule__WorkDefinition__Group_6__4__Impl"
    // InternalPDL.g:2007:1: rule__WorkDefinition__Group_6__4__Impl : ( ')' ) ;
    public final void rule__WorkDefinition__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2011:1: ( ( ')' ) )
            // InternalPDL.g:2012:1: ( ')' )
            {
            // InternalPDL.g:2012:1: ( ')' )
            // InternalPDL.g:2013:2: ')'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_6_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_6_4()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_6__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6_3__0"
    // InternalPDL.g:2023:1: rule__WorkDefinition__Group_6_3__0 : rule__WorkDefinition__Group_6_3__0__Impl rule__WorkDefinition__Group_6_3__1 ;
    public final void rule__WorkDefinition__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2027:1: ( rule__WorkDefinition__Group_6_3__0__Impl rule__WorkDefinition__Group_6_3__1 )
            // InternalPDL.g:2028:2: rule__WorkDefinition__Group_6_3__0__Impl rule__WorkDefinition__Group_6_3__1
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6_3__1();

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
    // $ANTLR end "rule__WorkDefinition__Group_6_3__0"


    // $ANTLR start "rule__WorkDefinition__Group_6_3__0__Impl"
    // InternalPDL.g:2035:1: rule__WorkDefinition__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__WorkDefinition__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2039:1: ( ( ',' ) )
            // InternalPDL.g:2040:1: ( ',' )
            {
            // InternalPDL.g:2040:1: ( ',' )
            // InternalPDL.g:2041:2: ','
            {
             before(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_6_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_6_3__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6_3__1"
    // InternalPDL.g:2050:1: rule__WorkDefinition__Group_6_3__1 : rule__WorkDefinition__Group_6_3__1__Impl ;
    public final void rule__WorkDefinition__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2054:1: ( rule__WorkDefinition__Group_6_3__1__Impl )
            // InternalPDL.g:2055:2: rule__WorkDefinition__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group_6_3__1"


    // $ANTLR start "rule__WorkDefinition__Group_6_3__1__Impl"
    // InternalPDL.g:2061:1: rule__WorkDefinition__Group_6_3__1__Impl : ( ( rule__WorkDefinition__GuidanceAssignment_6_3_1 ) ) ;
    public final void rule__WorkDefinition__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2065:1: ( ( ( rule__WorkDefinition__GuidanceAssignment_6_3_1 ) ) )
            // InternalPDL.g:2066:1: ( ( rule__WorkDefinition__GuidanceAssignment_6_3_1 ) )
            {
            // InternalPDL.g:2066:1: ( ( rule__WorkDefinition__GuidanceAssignment_6_3_1 ) )
            // InternalPDL.g:2067:2: ( rule__WorkDefinition__GuidanceAssignment_6_3_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGuidanceAssignment_6_3_1()); 
            // InternalPDL.g:2068:2: ( rule__WorkDefinition__GuidanceAssignment_6_3_1 )
            // InternalPDL.g:2068:3: rule__WorkDefinition__GuidanceAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__GuidanceAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGuidanceAssignment_6_3_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_6_3__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_7__0"
    // InternalPDL.g:2077:1: rule__WorkDefinition__Group_7__0 : rule__WorkDefinition__Group_7__0__Impl rule__WorkDefinition__Group_7__1 ;
    public final void rule__WorkDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2081:1: ( rule__WorkDefinition__Group_7__0__Impl rule__WorkDefinition__Group_7__1 )
            // InternalPDL.g:2082:2: rule__WorkDefinition__Group_7__0__Impl rule__WorkDefinition__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_7__1();

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
    // $ANTLR end "rule__WorkDefinition__Group_7__0"


    // $ANTLR start "rule__WorkDefinition__Group_7__0__Impl"
    // InternalPDL.g:2089:1: rule__WorkDefinition__Group_7__0__Impl : ( 'parameters' ) ;
    public final void rule__WorkDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2093:1: ( ( 'parameters' ) )
            // InternalPDL.g:2094:1: ( 'parameters' )
            {
            // InternalPDL.g:2094:1: ( 'parameters' )
            // InternalPDL.g:2095:2: 'parameters'
            {
             before(grammarAccess.getWorkDefinitionAccess().getParametersKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getParametersKeyword_7_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_7__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_7__1"
    // InternalPDL.g:2104:1: rule__WorkDefinition__Group_7__1 : rule__WorkDefinition__Group_7__1__Impl rule__WorkDefinition__Group_7__2 ;
    public final void rule__WorkDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2108:1: ( rule__WorkDefinition__Group_7__1__Impl rule__WorkDefinition__Group_7__2 )
            // InternalPDL.g:2109:2: rule__WorkDefinition__Group_7__1__Impl rule__WorkDefinition__Group_7__2
            {
            pushFollow(FOLLOW_16);
            rule__WorkDefinition__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_7__2();

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
    // $ANTLR end "rule__WorkDefinition__Group_7__1"


    // $ANTLR start "rule__WorkDefinition__Group_7__1__Impl"
    // InternalPDL.g:2116:1: rule__WorkDefinition__Group_7__1__Impl : ( '{' ) ;
    public final void rule__WorkDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2120:1: ( ( '{' ) )
            // InternalPDL.g:2121:1: ( '{' )
            {
            // InternalPDL.g:2121:1: ( '{' )
            // InternalPDL.g:2122:2: '{'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_7__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_7__2"
    // InternalPDL.g:2131:1: rule__WorkDefinition__Group_7__2 : rule__WorkDefinition__Group_7__2__Impl rule__WorkDefinition__Group_7__3 ;
    public final void rule__WorkDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2135:1: ( rule__WorkDefinition__Group_7__2__Impl rule__WorkDefinition__Group_7__3 )
            // InternalPDL.g:2136:2: rule__WorkDefinition__Group_7__2__Impl rule__WorkDefinition__Group_7__3
            {
            pushFollow(FOLLOW_7);
            rule__WorkDefinition__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_7__3();

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
    // $ANTLR end "rule__WorkDefinition__Group_7__2"


    // $ANTLR start "rule__WorkDefinition__Group_7__2__Impl"
    // InternalPDL.g:2143:1: rule__WorkDefinition__Group_7__2__Impl : ( ( rule__WorkDefinition__ParametersAssignment_7_2 ) ) ;
    public final void rule__WorkDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2147:1: ( ( ( rule__WorkDefinition__ParametersAssignment_7_2 ) ) )
            // InternalPDL.g:2148:1: ( ( rule__WorkDefinition__ParametersAssignment_7_2 ) )
            {
            // InternalPDL.g:2148:1: ( ( rule__WorkDefinition__ParametersAssignment_7_2 ) )
            // InternalPDL.g:2149:2: ( rule__WorkDefinition__ParametersAssignment_7_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getParametersAssignment_7_2()); 
            // InternalPDL.g:2150:2: ( rule__WorkDefinition__ParametersAssignment_7_2 )
            // InternalPDL.g:2150:3: rule__WorkDefinition__ParametersAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__ParametersAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getParametersAssignment_7_2()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_7__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_7__3"
    // InternalPDL.g:2158:1: rule__WorkDefinition__Group_7__3 : rule__WorkDefinition__Group_7__3__Impl rule__WorkDefinition__Group_7__4 ;
    public final void rule__WorkDefinition__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2162:1: ( rule__WorkDefinition__Group_7__3__Impl rule__WorkDefinition__Group_7__4 )
            // InternalPDL.g:2163:2: rule__WorkDefinition__Group_7__3__Impl rule__WorkDefinition__Group_7__4
            {
            pushFollow(FOLLOW_7);
            rule__WorkDefinition__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_7__4();

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
    // $ANTLR end "rule__WorkDefinition__Group_7__3"


    // $ANTLR start "rule__WorkDefinition__Group_7__3__Impl"
    // InternalPDL.g:2170:1: rule__WorkDefinition__Group_7__3__Impl : ( ( rule__WorkDefinition__Group_7_3__0 )* ) ;
    public final void rule__WorkDefinition__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2174:1: ( ( ( rule__WorkDefinition__Group_7_3__0 )* ) )
            // InternalPDL.g:2175:1: ( ( rule__WorkDefinition__Group_7_3__0 )* )
            {
            // InternalPDL.g:2175:1: ( ( rule__WorkDefinition__Group_7_3__0 )* )
            // InternalPDL.g:2176:2: ( rule__WorkDefinition__Group_7_3__0 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_7_3()); 
            // InternalPDL.g:2177:2: ( rule__WorkDefinition__Group_7_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPDL.g:2177:3: rule__WorkDefinition__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__WorkDefinition__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_7__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_7__4"
    // InternalPDL.g:2185:1: rule__WorkDefinition__Group_7__4 : rule__WorkDefinition__Group_7__4__Impl ;
    public final void rule__WorkDefinition__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2189:1: ( rule__WorkDefinition__Group_7__4__Impl )
            // InternalPDL.g:2190:2: rule__WorkDefinition__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_7__4__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group_7__4"


    // $ANTLR start "rule__WorkDefinition__Group_7__4__Impl"
    // InternalPDL.g:2196:1: rule__WorkDefinition__Group_7__4__Impl : ( '}' ) ;
    public final void rule__WorkDefinition__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2200:1: ( ( '}' ) )
            // InternalPDL.g:2201:1: ( '}' )
            {
            // InternalPDL.g:2201:1: ( '}' )
            // InternalPDL.g:2202:2: '}'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_7__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_7_3__0"
    // InternalPDL.g:2212:1: rule__WorkDefinition__Group_7_3__0 : rule__WorkDefinition__Group_7_3__0__Impl rule__WorkDefinition__Group_7_3__1 ;
    public final void rule__WorkDefinition__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2216:1: ( rule__WorkDefinition__Group_7_3__0__Impl rule__WorkDefinition__Group_7_3__1 )
            // InternalPDL.g:2217:2: rule__WorkDefinition__Group_7_3__0__Impl rule__WorkDefinition__Group_7_3__1
            {
            pushFollow(FOLLOW_16);
            rule__WorkDefinition__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_7_3__1();

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
    // $ANTLR end "rule__WorkDefinition__Group_7_3__0"


    // $ANTLR start "rule__WorkDefinition__Group_7_3__0__Impl"
    // InternalPDL.g:2224:1: rule__WorkDefinition__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__WorkDefinition__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2228:1: ( ( ',' ) )
            // InternalPDL.g:2229:1: ( ',' )
            {
            // InternalPDL.g:2229:1: ( ',' )
            // InternalPDL.g:2230:2: ','
            {
             before(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_7_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_7_3__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_7_3__1"
    // InternalPDL.g:2239:1: rule__WorkDefinition__Group_7_3__1 : rule__WorkDefinition__Group_7_3__1__Impl ;
    public final void rule__WorkDefinition__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2243:1: ( rule__WorkDefinition__Group_7_3__1__Impl )
            // InternalPDL.g:2244:2: rule__WorkDefinition__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group_7_3__1"


    // $ANTLR start "rule__WorkDefinition__Group_7_3__1__Impl"
    // InternalPDL.g:2250:1: rule__WorkDefinition__Group_7_3__1__Impl : ( ( rule__WorkDefinition__ParametersAssignment_7_3_1 ) ) ;
    public final void rule__WorkDefinition__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2254:1: ( ( ( rule__WorkDefinition__ParametersAssignment_7_3_1 ) ) )
            // InternalPDL.g:2255:1: ( ( rule__WorkDefinition__ParametersAssignment_7_3_1 ) )
            {
            // InternalPDL.g:2255:1: ( ( rule__WorkDefinition__ParametersAssignment_7_3_1 ) )
            // InternalPDL.g:2256:2: ( rule__WorkDefinition__ParametersAssignment_7_3_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getParametersAssignment_7_3_1()); 
            // InternalPDL.g:2257:2: ( rule__WorkDefinition__ParametersAssignment_7_3_1 )
            // InternalPDL.g:2257:3: rule__WorkDefinition__ParametersAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__ParametersAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getParametersAssignment_7_3_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_7_3__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalPDL.g:2266:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2270:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalPDL.g:2271:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__1();

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
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // InternalPDL.g:2278:1: rule__WorkSequence__Group__0__Impl : ( 'WorkSequence' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2282:1: ( ( 'WorkSequence' ) )
            // InternalPDL.g:2283:1: ( 'WorkSequence' )
            {
            // InternalPDL.g:2283:1: ( 'WorkSequence' )
            // InternalPDL.g:2284:2: 'WorkSequence'
            {
             before(grammarAccess.getWorkSequenceAccess().getWorkSequenceKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getWorkSequenceKeyword_0()); 

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
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // InternalPDL.g:2293:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2297:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalPDL.g:2298:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2();

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
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // InternalPDL.g:2305:1: rule__WorkSequence__Group__1__Impl : ( '{' ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2309:1: ( ( '{' ) )
            // InternalPDL.g:2310:1: ( '{' )
            {
            // InternalPDL.g:2310:1: ( '{' )
            // InternalPDL.g:2311:2: '{'
            {
             before(grammarAccess.getWorkSequenceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // InternalPDL.g:2320:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2324:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // InternalPDL.g:2325:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__3();

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
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // InternalPDL.g:2332:1: rule__WorkSequence__Group__2__Impl : ( 'linkType' ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2336:1: ( ( 'linkType' ) )
            // InternalPDL.g:2337:1: ( 'linkType' )
            {
            // InternalPDL.g:2337:1: ( 'linkType' )
            // InternalPDL.g:2338:2: 'linkType'
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getLinkTypeKeyword_2()); 

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
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__3"
    // InternalPDL.g:2347:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2351:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // InternalPDL.g:2352:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__WorkSequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__4();

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
    // $ANTLR end "rule__WorkSequence__Group__3"


    // $ANTLR start "rule__WorkSequence__Group__3__Impl"
    // InternalPDL.g:2359:1: rule__WorkSequence__Group__3__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_3 ) ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2363:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_3 ) ) )
            // InternalPDL.g:2364:1: ( ( rule__WorkSequence__LinkTypeAssignment_3 ) )
            {
            // InternalPDL.g:2364:1: ( ( rule__WorkSequence__LinkTypeAssignment_3 ) )
            // InternalPDL.g:2365:2: ( rule__WorkSequence__LinkTypeAssignment_3 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_3()); 
            // InternalPDL.g:2366:2: ( rule__WorkSequence__LinkTypeAssignment_3 )
            // InternalPDL.g:2366:3: rule__WorkSequence__LinkTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__LinkTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_3()); 

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
    // $ANTLR end "rule__WorkSequence__Group__3__Impl"


    // $ANTLR start "rule__WorkSequence__Group__4"
    // InternalPDL.g:2374:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2378:1: ( rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 )
            // InternalPDL.g:2379:2: rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5();

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
    // $ANTLR end "rule__WorkSequence__Group__4"


    // $ANTLR start "rule__WorkSequence__Group__4__Impl"
    // InternalPDL.g:2386:1: rule__WorkSequence__Group__4__Impl : ( 'predecessor' ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2390:1: ( ( 'predecessor' ) )
            // InternalPDL.g:2391:1: ( 'predecessor' )
            {
            // InternalPDL.g:2391:1: ( 'predecessor' )
            // InternalPDL.g:2392:2: 'predecessor'
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorKeyword_4()); 

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
    // $ANTLR end "rule__WorkSequence__Group__4__Impl"


    // $ANTLR start "rule__WorkSequence__Group__5"
    // InternalPDL.g:2401:1: rule__WorkSequence__Group__5 : rule__WorkSequence__Group__5__Impl rule__WorkSequence__Group__6 ;
    public final void rule__WorkSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2405:1: ( rule__WorkSequence__Group__5__Impl rule__WorkSequence__Group__6 )
            // InternalPDL.g:2406:2: rule__WorkSequence__Group__5__Impl rule__WorkSequence__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__WorkSequence__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__6();

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
    // $ANTLR end "rule__WorkSequence__Group__5"


    // $ANTLR start "rule__WorkSequence__Group__5__Impl"
    // InternalPDL.g:2413:1: rule__WorkSequence__Group__5__Impl : ( ( rule__WorkSequence__PredecessorAssignment_5 ) ) ;
    public final void rule__WorkSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2417:1: ( ( ( rule__WorkSequence__PredecessorAssignment_5 ) ) )
            // InternalPDL.g:2418:1: ( ( rule__WorkSequence__PredecessorAssignment_5 ) )
            {
            // InternalPDL.g:2418:1: ( ( rule__WorkSequence__PredecessorAssignment_5 ) )
            // InternalPDL.g:2419:2: ( rule__WorkSequence__PredecessorAssignment_5 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_5()); 
            // InternalPDL.g:2420:2: ( rule__WorkSequence__PredecessorAssignment_5 )
            // InternalPDL.g:2420:3: rule__WorkSequence__PredecessorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_5()); 

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
    // $ANTLR end "rule__WorkSequence__Group__5__Impl"


    // $ANTLR start "rule__WorkSequence__Group__6"
    // InternalPDL.g:2428:1: rule__WorkSequence__Group__6 : rule__WorkSequence__Group__6__Impl rule__WorkSequence__Group__7 ;
    public final void rule__WorkSequence__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2432:1: ( rule__WorkSequence__Group__6__Impl rule__WorkSequence__Group__7 )
            // InternalPDL.g:2433:2: rule__WorkSequence__Group__6__Impl rule__WorkSequence__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__7();

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
    // $ANTLR end "rule__WorkSequence__Group__6"


    // $ANTLR start "rule__WorkSequence__Group__6__Impl"
    // InternalPDL.g:2440:1: rule__WorkSequence__Group__6__Impl : ( 'successor' ) ;
    public final void rule__WorkSequence__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2444:1: ( ( 'successor' ) )
            // InternalPDL.g:2445:1: ( 'successor' )
            {
            // InternalPDL.g:2445:1: ( 'successor' )
            // InternalPDL.g:2446:2: 'successor'
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorKeyword_6()); 

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
    // $ANTLR end "rule__WorkSequence__Group__6__Impl"


    // $ANTLR start "rule__WorkSequence__Group__7"
    // InternalPDL.g:2455:1: rule__WorkSequence__Group__7 : rule__WorkSequence__Group__7__Impl rule__WorkSequence__Group__8 ;
    public final void rule__WorkSequence__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2459:1: ( rule__WorkSequence__Group__7__Impl rule__WorkSequence__Group__8 )
            // InternalPDL.g:2460:2: rule__WorkSequence__Group__7__Impl rule__WorkSequence__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__WorkSequence__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__8();

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
    // $ANTLR end "rule__WorkSequence__Group__7"


    // $ANTLR start "rule__WorkSequence__Group__7__Impl"
    // InternalPDL.g:2467:1: rule__WorkSequence__Group__7__Impl : ( ( rule__WorkSequence__SuccessorAssignment_7 ) ) ;
    public final void rule__WorkSequence__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2471:1: ( ( ( rule__WorkSequence__SuccessorAssignment_7 ) ) )
            // InternalPDL.g:2472:1: ( ( rule__WorkSequence__SuccessorAssignment_7 ) )
            {
            // InternalPDL.g:2472:1: ( ( rule__WorkSequence__SuccessorAssignment_7 ) )
            // InternalPDL.g:2473:2: ( rule__WorkSequence__SuccessorAssignment_7 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_7()); 
            // InternalPDL.g:2474:2: ( rule__WorkSequence__SuccessorAssignment_7 )
            // InternalPDL.g:2474:3: rule__WorkSequence__SuccessorAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_7()); 

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
    // $ANTLR end "rule__WorkSequence__Group__7__Impl"


    // $ANTLR start "rule__WorkSequence__Group__8"
    // InternalPDL.g:2482:1: rule__WorkSequence__Group__8 : rule__WorkSequence__Group__8__Impl ;
    public final void rule__WorkSequence__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2486:1: ( rule__WorkSequence__Group__8__Impl )
            // InternalPDL.g:2487:2: rule__WorkSequence__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__8__Impl();

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
    // $ANTLR end "rule__WorkSequence__Group__8"


    // $ANTLR start "rule__WorkSequence__Group__8__Impl"
    // InternalPDL.g:2493:1: rule__WorkSequence__Group__8__Impl : ( '}' ) ;
    public final void rule__WorkSequence__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2497:1: ( ( '}' ) )
            // InternalPDL.g:2498:1: ( '}' )
            {
            // InternalPDL.g:2498:1: ( '}' )
            // InternalPDL.g:2499:2: '}'
            {
             before(grammarAccess.getWorkSequenceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__WorkSequence__Group__8__Impl"


    // $ANTLR start "rule__Guidance__Group__0"
    // InternalPDL.g:2509:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2513:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // InternalPDL.g:2514:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__1();

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
    // $ANTLR end "rule__Guidance__Group__0"


    // $ANTLR start "rule__Guidance__Group__0__Impl"
    // InternalPDL.g:2521:1: rule__Guidance__Group__0__Impl : ( 'Guidance' ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2525:1: ( ( 'Guidance' ) )
            // InternalPDL.g:2526:1: ( 'Guidance' )
            {
            // InternalPDL.g:2526:1: ( 'Guidance' )
            // InternalPDL.g:2527:2: 'Guidance'
            {
             before(grammarAccess.getGuidanceAccess().getGuidanceKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getGuidanceKeyword_0()); 

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
    // $ANTLR end "rule__Guidance__Group__0__Impl"


    // $ANTLR start "rule__Guidance__Group__1"
    // InternalPDL.g:2536:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl rule__Guidance__Group__2 ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2540:1: ( rule__Guidance__Group__1__Impl rule__Guidance__Group__2 )
            // InternalPDL.g:2541:2: rule__Guidance__Group__1__Impl rule__Guidance__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Guidance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__2();

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
    // $ANTLR end "rule__Guidance__Group__1"


    // $ANTLR start "rule__Guidance__Group__1__Impl"
    // InternalPDL.g:2548:1: rule__Guidance__Group__1__Impl : ( '{' ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2552:1: ( ( '{' ) )
            // InternalPDL.g:2553:1: ( '{' )
            {
            // InternalPDL.g:2553:1: ( '{' )
            // InternalPDL.g:2554:2: '{'
            {
             before(grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Guidance__Group__1__Impl"


    // $ANTLR start "rule__Guidance__Group__2"
    // InternalPDL.g:2563:1: rule__Guidance__Group__2 : rule__Guidance__Group__2__Impl rule__Guidance__Group__3 ;
    public final void rule__Guidance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2567:1: ( rule__Guidance__Group__2__Impl rule__Guidance__Group__3 )
            // InternalPDL.g:2568:2: rule__Guidance__Group__2__Impl rule__Guidance__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Guidance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__3();

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
    // $ANTLR end "rule__Guidance__Group__2"


    // $ANTLR start "rule__Guidance__Group__2__Impl"
    // InternalPDL.g:2575:1: rule__Guidance__Group__2__Impl : ( 'description' ) ;
    public final void rule__Guidance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2579:1: ( ( 'description' ) )
            // InternalPDL.g:2580:1: ( 'description' )
            {
            // InternalPDL.g:2580:1: ( 'description' )
            // InternalPDL.g:2581:2: 'description'
            {
             before(grammarAccess.getGuidanceAccess().getDescriptionKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getDescriptionKeyword_2()); 

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
    // $ANTLR end "rule__Guidance__Group__2__Impl"


    // $ANTLR start "rule__Guidance__Group__3"
    // InternalPDL.g:2590:1: rule__Guidance__Group__3 : rule__Guidance__Group__3__Impl rule__Guidance__Group__4 ;
    public final void rule__Guidance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2594:1: ( rule__Guidance__Group__3__Impl rule__Guidance__Group__4 )
            // InternalPDL.g:2595:2: rule__Guidance__Group__3__Impl rule__Guidance__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Guidance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__4();

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
    // $ANTLR end "rule__Guidance__Group__3"


    // $ANTLR start "rule__Guidance__Group__3__Impl"
    // InternalPDL.g:2602:1: rule__Guidance__Group__3__Impl : ( ( rule__Guidance__DescriptionAssignment_3 ) ) ;
    public final void rule__Guidance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2606:1: ( ( ( rule__Guidance__DescriptionAssignment_3 ) ) )
            // InternalPDL.g:2607:1: ( ( rule__Guidance__DescriptionAssignment_3 ) )
            {
            // InternalPDL.g:2607:1: ( ( rule__Guidance__DescriptionAssignment_3 ) )
            // InternalPDL.g:2608:2: ( rule__Guidance__DescriptionAssignment_3 )
            {
             before(grammarAccess.getGuidanceAccess().getDescriptionAssignment_3()); 
            // InternalPDL.g:2609:2: ( rule__Guidance__DescriptionAssignment_3 )
            // InternalPDL.g:2609:3: rule__Guidance__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getDescriptionAssignment_3()); 

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
    // $ANTLR end "rule__Guidance__Group__3__Impl"


    // $ANTLR start "rule__Guidance__Group__4"
    // InternalPDL.g:2617:1: rule__Guidance__Group__4 : rule__Guidance__Group__4__Impl ;
    public final void rule__Guidance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2621:1: ( rule__Guidance__Group__4__Impl )
            // InternalPDL.g:2622:2: rule__Guidance__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__4__Impl();

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
    // $ANTLR end "rule__Guidance__Group__4"


    // $ANTLR start "rule__Guidance__Group__4__Impl"
    // InternalPDL.g:2628:1: rule__Guidance__Group__4__Impl : ( '}' ) ;
    public final void rule__Guidance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2632:1: ( ( '}' ) )
            // InternalPDL.g:2633:1: ( '}' )
            {
            // InternalPDL.g:2633:1: ( '}' )
            // InternalPDL.g:2634:2: '}'
            {
             before(grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Guidance__Group__4__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // InternalPDL.g:2644:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2648:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalPDL.g:2649:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__1();

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
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // InternalPDL.g:2656:1: rule__Resource__Group__0__Impl : ( () ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2660:1: ( ( () ) )
            // InternalPDL.g:2661:1: ( () )
            {
            // InternalPDL.g:2661:1: ( () )
            // InternalPDL.g:2662:2: ()
            {
             before(grammarAccess.getResourceAccess().getResourceAction_0()); 
            // InternalPDL.g:2663:2: ()
            // InternalPDL.g:2663:3: 
            {
            }

             after(grammarAccess.getResourceAccess().getResourceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // InternalPDL.g:2671:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2675:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalPDL.g:2676:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__2();

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
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // InternalPDL.g:2683:1: rule__Resource__Group__1__Impl : ( 'Resource' ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2687:1: ( ( 'Resource' ) )
            // InternalPDL.g:2688:1: ( 'Resource' )
            {
            // InternalPDL.g:2688:1: ( 'Resource' )
            // InternalPDL.g:2689:2: 'Resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_1()); 

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
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // InternalPDL.g:2698:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2702:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // InternalPDL.g:2703:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Resource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__3();

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
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // InternalPDL.g:2710:1: rule__Resource__Group__2__Impl : ( ( rule__Resource__NameAssignment_2 ) ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2714:1: ( ( ( rule__Resource__NameAssignment_2 ) ) )
            // InternalPDL.g:2715:1: ( ( rule__Resource__NameAssignment_2 ) )
            {
            // InternalPDL.g:2715:1: ( ( rule__Resource__NameAssignment_2 ) )
            // InternalPDL.g:2716:2: ( rule__Resource__NameAssignment_2 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_2()); 
            // InternalPDL.g:2717:2: ( rule__Resource__NameAssignment_2 )
            // InternalPDL.g:2717:3: rule__Resource__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Resource__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__Resource__Group__3"
    // InternalPDL.g:2725:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl rule__Resource__Group__4 ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2729:1: ( rule__Resource__Group__3__Impl rule__Resource__Group__4 )
            // InternalPDL.g:2730:2: rule__Resource__Group__3__Impl rule__Resource__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Resource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__4();

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
    // $ANTLR end "rule__Resource__Group__3"


    // $ANTLR start "rule__Resource__Group__3__Impl"
    // InternalPDL.g:2737:1: rule__Resource__Group__3__Impl : ( '{' ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2741:1: ( ( '{' ) )
            // InternalPDL.g:2742:1: ( '{' )
            {
            // InternalPDL.g:2742:1: ( '{' )
            // InternalPDL.g:2743:2: '{'
            {
             before(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Resource__Group__3__Impl"


    // $ANTLR start "rule__Resource__Group__4"
    // InternalPDL.g:2752:1: rule__Resource__Group__4 : rule__Resource__Group__4__Impl rule__Resource__Group__5 ;
    public final void rule__Resource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2756:1: ( rule__Resource__Group__4__Impl rule__Resource__Group__5 )
            // InternalPDL.g:2757:2: rule__Resource__Group__4__Impl rule__Resource__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Resource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__5();

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
    // $ANTLR end "rule__Resource__Group__4"


    // $ANTLR start "rule__Resource__Group__4__Impl"
    // InternalPDL.g:2764:1: rule__Resource__Group__4__Impl : ( ( rule__Resource__Group_4__0 )? ) ;
    public final void rule__Resource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2768:1: ( ( ( rule__Resource__Group_4__0 )? ) )
            // InternalPDL.g:2769:1: ( ( rule__Resource__Group_4__0 )? )
            {
            // InternalPDL.g:2769:1: ( ( rule__Resource__Group_4__0 )? )
            // InternalPDL.g:2770:2: ( rule__Resource__Group_4__0 )?
            {
             before(grammarAccess.getResourceAccess().getGroup_4()); 
            // InternalPDL.g:2771:2: ( rule__Resource__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPDL.g:2771:3: rule__Resource__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Resource__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Resource__Group__4__Impl"


    // $ANTLR start "rule__Resource__Group__5"
    // InternalPDL.g:2779:1: rule__Resource__Group__5 : rule__Resource__Group__5__Impl ;
    public final void rule__Resource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2783:1: ( rule__Resource__Group__5__Impl )
            // InternalPDL.g:2784:2: rule__Resource__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__5__Impl();

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
    // $ANTLR end "rule__Resource__Group__5"


    // $ANTLR start "rule__Resource__Group__5__Impl"
    // InternalPDL.g:2790:1: rule__Resource__Group__5__Impl : ( '}' ) ;
    public final void rule__Resource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2794:1: ( ( '}' ) )
            // InternalPDL.g:2795:1: ( '}' )
            {
            // InternalPDL.g:2795:1: ( '}' )
            // InternalPDL.g:2796:2: '}'
            {
             before(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Resource__Group__5__Impl"


    // $ANTLR start "rule__Resource__Group_4__0"
    // InternalPDL.g:2806:1: rule__Resource__Group_4__0 : rule__Resource__Group_4__0__Impl rule__Resource__Group_4__1 ;
    public final void rule__Resource__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2810:1: ( rule__Resource__Group_4__0__Impl rule__Resource__Group_4__1 )
            // InternalPDL.g:2811:2: rule__Resource__Group_4__0__Impl rule__Resource__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__Resource__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_4__1();

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
    // $ANTLR end "rule__Resource__Group_4__0"


    // $ANTLR start "rule__Resource__Group_4__0__Impl"
    // InternalPDL.g:2818:1: rule__Resource__Group_4__0__Impl : ( 'OccuranceNb' ) ;
    public final void rule__Resource__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2822:1: ( ( 'OccuranceNb' ) )
            // InternalPDL.g:2823:1: ( 'OccuranceNb' )
            {
            // InternalPDL.g:2823:1: ( 'OccuranceNb' )
            // InternalPDL.g:2824:2: 'OccuranceNb'
            {
             before(grammarAccess.getResourceAccess().getOccuranceNbKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getOccuranceNbKeyword_4_0()); 

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
    // $ANTLR end "rule__Resource__Group_4__0__Impl"


    // $ANTLR start "rule__Resource__Group_4__1"
    // InternalPDL.g:2833:1: rule__Resource__Group_4__1 : rule__Resource__Group_4__1__Impl ;
    public final void rule__Resource__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2837:1: ( rule__Resource__Group_4__1__Impl )
            // InternalPDL.g:2838:2: rule__Resource__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_4__1__Impl();

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
    // $ANTLR end "rule__Resource__Group_4__1"


    // $ANTLR start "rule__Resource__Group_4__1__Impl"
    // InternalPDL.g:2844:1: rule__Resource__Group_4__1__Impl : ( ( rule__Resource__OccuranceNbAssignment_4_1 ) ) ;
    public final void rule__Resource__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2848:1: ( ( ( rule__Resource__OccuranceNbAssignment_4_1 ) ) )
            // InternalPDL.g:2849:1: ( ( rule__Resource__OccuranceNbAssignment_4_1 ) )
            {
            // InternalPDL.g:2849:1: ( ( rule__Resource__OccuranceNbAssignment_4_1 ) )
            // InternalPDL.g:2850:2: ( rule__Resource__OccuranceNbAssignment_4_1 )
            {
             before(grammarAccess.getResourceAccess().getOccuranceNbAssignment_4_1()); 
            // InternalPDL.g:2851:2: ( rule__Resource__OccuranceNbAssignment_4_1 )
            // InternalPDL.g:2851:3: rule__Resource__OccuranceNbAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__OccuranceNbAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getOccuranceNbAssignment_4_1()); 

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
    // $ANTLR end "rule__Resource__Group_4__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalPDL.g:2860:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2864:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalPDL.g:2865:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalPDL.g:2872:1: rule__Parameter__Group__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2876:1: ( ( 'parameter' ) )
            // InternalPDL.g:2877:1: ( 'parameter' )
            {
            // InternalPDL.g:2877:1: ( 'parameter' )
            // InternalPDL.g:2878:2: 'parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0()); 

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalPDL.g:2887:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2891:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalPDL.g:2892:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalPDL.g:2899:1: rule__Parameter__Group__1__Impl : ( '{' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2903:1: ( ( '{' ) )
            // InternalPDL.g:2904:1: ( '{' )
            {
            // InternalPDL.g:2904:1: ( '{' )
            // InternalPDL.g:2905:2: '{'
            {
             before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalPDL.g:2914:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2918:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalPDL.g:2919:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalPDL.g:2926:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__Group_2__0 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2930:1: ( ( ( rule__Parameter__Group_2__0 )? ) )
            // InternalPDL.g:2931:1: ( ( rule__Parameter__Group_2__0 )? )
            {
            // InternalPDL.g:2931:1: ( ( rule__Parameter__Group_2__0 )? )
            // InternalPDL.g:2932:2: ( rule__Parameter__Group_2__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_2()); 
            // InternalPDL.g:2933:2: ( rule__Parameter__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPDL.g:2933:3: rule__Parameter__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalPDL.g:2941:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2945:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalPDL.g:2946:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalPDL.g:2953:1: rule__Parameter__Group__3__Impl : ( 'resource' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2957:1: ( ( 'resource' ) )
            // InternalPDL.g:2958:1: ( 'resource' )
            {
            // InternalPDL.g:2958:1: ( 'resource' )
            // InternalPDL.g:2959:2: 'resource'
            {
             before(grammarAccess.getParameterAccess().getResourceKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getResourceKeyword_3()); 

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
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalPDL.g:2968:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2972:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalPDL.g:2973:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5();

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
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalPDL.g:2980:1: rule__Parameter__Group__4__Impl : ( ( rule__Parameter__ResourceAssignment_4 ) ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2984:1: ( ( ( rule__Parameter__ResourceAssignment_4 ) ) )
            // InternalPDL.g:2985:1: ( ( rule__Parameter__ResourceAssignment_4 ) )
            {
            // InternalPDL.g:2985:1: ( ( rule__Parameter__ResourceAssignment_4 ) )
            // InternalPDL.g:2986:2: ( rule__Parameter__ResourceAssignment_4 )
            {
             before(grammarAccess.getParameterAccess().getResourceAssignment_4()); 
            // InternalPDL.g:2987:2: ( rule__Parameter__ResourceAssignment_4 )
            // InternalPDL.g:2987:3: rule__Parameter__ResourceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ResourceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getResourceAssignment_4()); 

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
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // InternalPDL.g:2995:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2999:1: ( rule__Parameter__Group__5__Impl )
            // InternalPDL.g:3000:2: rule__Parameter__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5__Impl();

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
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // InternalPDL.g:3006:1: rule__Parameter__Group__5__Impl : ( '}' ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3010:1: ( ( '}' ) )
            // InternalPDL.g:3011:1: ( '}' )
            {
            // InternalPDL.g:3011:1: ( '}' )
            // InternalPDL.g:3012:2: '}'
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__Parameter__Group_2__0"
    // InternalPDL.g:3022:1: rule__Parameter__Group_2__0 : rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 ;
    public final void rule__Parameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3026:1: ( rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 )
            // InternalPDL.g:3027:2: rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__Parameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_2__1();

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
    // $ANTLR end "rule__Parameter__Group_2__0"


    // $ANTLR start "rule__Parameter__Group_2__0__Impl"
    // InternalPDL.g:3034:1: rule__Parameter__Group_2__0__Impl : ( 'quantity' ) ;
    public final void rule__Parameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3038:1: ( ( 'quantity' ) )
            // InternalPDL.g:3039:1: ( 'quantity' )
            {
            // InternalPDL.g:3039:1: ( 'quantity' )
            // InternalPDL.g:3040:2: 'quantity'
            {
             before(grammarAccess.getParameterAccess().getQuantityKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getQuantityKeyword_2_0()); 

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
    // $ANTLR end "rule__Parameter__Group_2__0__Impl"


    // $ANTLR start "rule__Parameter__Group_2__1"
    // InternalPDL.g:3049:1: rule__Parameter__Group_2__1 : rule__Parameter__Group_2__1__Impl ;
    public final void rule__Parameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3053:1: ( rule__Parameter__Group_2__1__Impl )
            // InternalPDL.g:3054:2: rule__Parameter__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_2__1__Impl();

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
    // $ANTLR end "rule__Parameter__Group_2__1"


    // $ANTLR start "rule__Parameter__Group_2__1__Impl"
    // InternalPDL.g:3060:1: rule__Parameter__Group_2__1__Impl : ( ( rule__Parameter__QuantityAssignment_2_1 ) ) ;
    public final void rule__Parameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3064:1: ( ( ( rule__Parameter__QuantityAssignment_2_1 ) ) )
            // InternalPDL.g:3065:1: ( ( rule__Parameter__QuantityAssignment_2_1 ) )
            {
            // InternalPDL.g:3065:1: ( ( rule__Parameter__QuantityAssignment_2_1 ) )
            // InternalPDL.g:3066:2: ( rule__Parameter__QuantityAssignment_2_1 )
            {
             before(grammarAccess.getParameterAccess().getQuantityAssignment_2_1()); 
            // InternalPDL.g:3067:2: ( rule__Parameter__QuantityAssignment_2_1 )
            // InternalPDL.g:3067:3: rule__Parameter__QuantityAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__QuantityAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getQuantityAssignment_2_1()); 

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
    // $ANTLR end "rule__Parameter__Group_2__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalPDL.g:3076:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3080:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalPDL.g:3081:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalPDL.g:3088:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3092:1: ( ( ( '-' )? ) )
            // InternalPDL.g:3093:1: ( ( '-' )? )
            {
            // InternalPDL.g:3093:1: ( ( '-' )? )
            // InternalPDL.g:3094:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalPDL.g:3095:2: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPDL.g:3095:3: '-'
                    {
                    match(input,39,FOLLOW_2); 

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
    // InternalPDL.g:3103:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3107:1: ( rule__EInt__Group__1__Impl )
            // InternalPDL.g:3108:2: rule__EInt__Group__1__Impl
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
    // InternalPDL.g:3114:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3118:1: ( ( RULE_INT ) )
            // InternalPDL.g:3119:1: ( RULE_INT )
            {
            // InternalPDL.g:3119:1: ( RULE_INT )
            // InternalPDL.g:3120:2: RULE_INT
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


    // $ANTLR start "rule__Process__NameAssignment_1"
    // InternalPDL.g:3130:1: rule__Process__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Process__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3134:1: ( ( ruleEString ) )
            // InternalPDL.g:3135:2: ( ruleEString )
            {
            // InternalPDL.g:3135:2: ( ruleEString )
            // InternalPDL.g:3136:3: ruleEString
            {
             before(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Process__NameAssignment_1"


    // $ANTLR start "rule__Process__WorkDefinitionsAssignment_5"
    // InternalPDL.g:3145:1: rule__Process__WorkDefinitionsAssignment_5 : ( ruleWorkDefinition ) ;
    public final void rule__Process__WorkDefinitionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3149:1: ( ( ruleWorkDefinition ) )
            // InternalPDL.g:3150:2: ( ruleWorkDefinition )
            {
            // InternalPDL.g:3150:2: ( ruleWorkDefinition )
            // InternalPDL.g:3151:3: ruleWorkDefinition
            {
             before(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Process__WorkDefinitionsAssignment_5"


    // $ANTLR start "rule__Process__WorkDefinitionsAssignment_6_1"
    // InternalPDL.g:3160:1: rule__Process__WorkDefinitionsAssignment_6_1 : ( ruleWorkDefinition ) ;
    public final void rule__Process__WorkDefinitionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3164:1: ( ( ruleWorkDefinition ) )
            // InternalPDL.g:3165:2: ( ruleWorkDefinition )
            {
            // InternalPDL.g:3165:2: ( ruleWorkDefinition )
            // InternalPDL.g:3166:3: ruleWorkDefinition
            {
             before(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Process__WorkDefinitionsAssignment_6_1"


    // $ANTLR start "rule__Process__WorkSequencesAssignment_8_2"
    // InternalPDL.g:3175:1: rule__Process__WorkSequencesAssignment_8_2 : ( ruleWorkSequence ) ;
    public final void rule__Process__WorkSequencesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3179:1: ( ( ruleWorkSequence ) )
            // InternalPDL.g:3180:2: ( ruleWorkSequence )
            {
            // InternalPDL.g:3180:2: ( ruleWorkSequence )
            // InternalPDL.g:3181:3: ruleWorkSequence
            {
             before(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__Process__WorkSequencesAssignment_8_2"


    // $ANTLR start "rule__Process__WorkSequencesAssignment_8_3_1"
    // InternalPDL.g:3190:1: rule__Process__WorkSequencesAssignment_8_3_1 : ( ruleWorkSequence ) ;
    public final void rule__Process__WorkSequencesAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3194:1: ( ( ruleWorkSequence ) )
            // InternalPDL.g:3195:2: ( ruleWorkSequence )
            {
            // InternalPDL.g:3195:2: ( ruleWorkSequence )
            // InternalPDL.g:3196:3: ruleWorkSequence
            {
             before(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_8_3_1_0()); 

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
    // $ANTLR end "rule__Process__WorkSequencesAssignment_8_3_1"


    // $ANTLR start "rule__Process__GuidanceAssignment_9_2"
    // InternalPDL.g:3205:1: rule__Process__GuidanceAssignment_9_2 : ( ruleGuidance ) ;
    public final void rule__Process__GuidanceAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3209:1: ( ( ruleGuidance ) )
            // InternalPDL.g:3210:2: ( ruleGuidance )
            {
            // InternalPDL.g:3210:2: ( ruleGuidance )
            // InternalPDL.g:3211:3: ruleGuidance
            {
             before(grammarAccess.getProcessAccess().getGuidanceGuidanceParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getGuidanceGuidanceParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Process__GuidanceAssignment_9_2"


    // $ANTLR start "rule__Process__GuidanceAssignment_9_3_1"
    // InternalPDL.g:3220:1: rule__Process__GuidanceAssignment_9_3_1 : ( ruleGuidance ) ;
    public final void rule__Process__GuidanceAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3224:1: ( ( ruleGuidance ) )
            // InternalPDL.g:3225:2: ( ruleGuidance )
            {
            // InternalPDL.g:3225:2: ( ruleGuidance )
            // InternalPDL.g:3226:3: ruleGuidance
            {
             before(grammarAccess.getProcessAccess().getGuidanceGuidanceParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getGuidanceGuidanceParserRuleCall_9_3_1_0()); 

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
    // $ANTLR end "rule__Process__GuidanceAssignment_9_3_1"


    // $ANTLR start "rule__Process__ResourceAssignment_10_2"
    // InternalPDL.g:3235:1: rule__Process__ResourceAssignment_10_2 : ( ruleResource ) ;
    public final void rule__Process__ResourceAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3239:1: ( ( ruleResource ) )
            // InternalPDL.g:3240:2: ( ruleResource )
            {
            // InternalPDL.g:3240:2: ( ruleResource )
            // InternalPDL.g:3241:3: ruleResource
            {
             before(grammarAccess.getProcessAccess().getResourceResourceParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getResourceResourceParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__Process__ResourceAssignment_10_2"


    // $ANTLR start "rule__Process__ResourceAssignment_10_3_1"
    // InternalPDL.g:3250:1: rule__Process__ResourceAssignment_10_3_1 : ( ruleResource ) ;
    public final void rule__Process__ResourceAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3254:1: ( ( ruleResource ) )
            // InternalPDL.g:3255:2: ( ruleResource )
            {
            // InternalPDL.g:3255:2: ( ruleResource )
            // InternalPDL.g:3256:3: ruleResource
            {
             before(grammarAccess.getProcessAccess().getResourceResourceParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getResourceResourceParserRuleCall_10_3_1_0()); 

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
    // $ANTLR end "rule__Process__ResourceAssignment_10_3_1"


    // $ANTLR start "rule__WorkDefinition__NameAssignment_2"
    // InternalPDL.g:3265:1: rule__WorkDefinition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__WorkDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3269:1: ( ( ruleEString ) )
            // InternalPDL.g:3270:2: ( ruleEString )
            {
            // InternalPDL.g:3270:2: ( ruleEString )
            // InternalPDL.g:3271:3: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__WorkDefinition__NameAssignment_2"


    // $ANTLR start "rule__WorkDefinition__LinksToPredecessorsAssignment_4_2"
    // InternalPDL.g:3280:1: rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__LinksToPredecessorsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3284:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:3285:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:3285:2: ( ( ruleEString ) )
            // InternalPDL.g:3286:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_4_2_0()); 
            // InternalPDL.g:3287:3: ( ruleEString )
            // InternalPDL.g:3288:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__WorkDefinition__LinksToPredecessorsAssignment_4_2"


    // $ANTLR start "rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1"
    // InternalPDL.g:3299:1: rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3303:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:3304:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:3304:2: ( ( ruleEString ) )
            // InternalPDL.g:3305:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_4_3_1_0()); 
            // InternalPDL.g:3306:3: ( ruleEString )
            // InternalPDL.g:3307:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_4_3_1_0()); 

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
    // $ANTLR end "rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1"


    // $ANTLR start "rule__WorkDefinition__LinksToSuccessorsAssignment_5_2"
    // InternalPDL.g:3318:1: rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__LinksToSuccessorsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3322:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:3323:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:3323:2: ( ( ruleEString ) )
            // InternalPDL.g:3324:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_5_2_0()); 
            // InternalPDL.g:3325:3: ( ruleEString )
            // InternalPDL.g:3326:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_5_2_0()); 

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
    // $ANTLR end "rule__WorkDefinition__LinksToSuccessorsAssignment_5_2"


    // $ANTLR start "rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1"
    // InternalPDL.g:3337:1: rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3341:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:3342:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:3342:2: ( ( ruleEString ) )
            // InternalPDL.g:3343:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_5_3_1_0()); 
            // InternalPDL.g:3344:3: ( ruleEString )
            // InternalPDL.g:3345:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_5_3_1_0()); 

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
    // $ANTLR end "rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1"


    // $ANTLR start "rule__WorkDefinition__GuidanceAssignment_6_2"
    // InternalPDL.g:3356:1: rule__WorkDefinition__GuidanceAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__GuidanceAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3360:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:3361:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:3361:2: ( ( ruleEString ) )
            // InternalPDL.g:3362:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceCrossReference_6_2_0()); 
            // InternalPDL.g:3363:3: ( ruleEString )
            // InternalPDL.g:3364:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceCrossReference_6_2_0()); 

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
    // $ANTLR end "rule__WorkDefinition__GuidanceAssignment_6_2"


    // $ANTLR start "rule__WorkDefinition__GuidanceAssignment_6_3_1"
    // InternalPDL.g:3375:1: rule__WorkDefinition__GuidanceAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__GuidanceAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3379:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:3380:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:3380:2: ( ( ruleEString ) )
            // InternalPDL.g:3381:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceCrossReference_6_3_1_0()); 
            // InternalPDL.g:3382:3: ( ruleEString )
            // InternalPDL.g:3383:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceCrossReference_6_3_1_0()); 

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
    // $ANTLR end "rule__WorkDefinition__GuidanceAssignment_6_3_1"


    // $ANTLR start "rule__WorkDefinition__ParametersAssignment_7_2"
    // InternalPDL.g:3394:1: rule__WorkDefinition__ParametersAssignment_7_2 : ( ruleparameter ) ;
    public final void rule__WorkDefinition__ParametersAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3398:1: ( ( ruleparameter ) )
            // InternalPDL.g:3399:2: ( ruleparameter )
            {
            // InternalPDL.g:3399:2: ( ruleparameter )
            // InternalPDL.g:3400:3: ruleparameter
            {
             before(grammarAccess.getWorkDefinitionAccess().getParametersParameterParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleparameter();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getParametersParameterParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__WorkDefinition__ParametersAssignment_7_2"


    // $ANTLR start "rule__WorkDefinition__ParametersAssignment_7_3_1"
    // InternalPDL.g:3409:1: rule__WorkDefinition__ParametersAssignment_7_3_1 : ( ruleparameter ) ;
    public final void rule__WorkDefinition__ParametersAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3413:1: ( ( ruleparameter ) )
            // InternalPDL.g:3414:2: ( ruleparameter )
            {
            // InternalPDL.g:3414:2: ( ruleparameter )
            // InternalPDL.g:3415:3: ruleparameter
            {
             before(grammarAccess.getWorkDefinitionAccess().getParametersParameterParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleparameter();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getParametersParameterParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__WorkDefinition__ParametersAssignment_7_3_1"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_3"
    // InternalPDL.g:3424:1: rule__WorkSequence__LinkTypeAssignment_3 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3428:1: ( ( ruleWorkSequenceType ) )
            // InternalPDL.g:3429:2: ( ruleWorkSequenceType )
            {
            // InternalPDL.g:3429:2: ( ruleWorkSequenceType )
            // InternalPDL.g:3430:3: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_3"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_5"
    // InternalPDL.g:3439:1: rule__WorkSequence__PredecessorAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3443:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:3444:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:3444:2: ( ( ruleEString ) )
            // InternalPDL.g:3445:3: ( ruleEString )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_5_0()); 
            // InternalPDL.g:3446:3: ( ruleEString )
            // InternalPDL.g:3447:4: ruleEString
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_5_0()); 

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
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_5"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_7"
    // InternalPDL.g:3458:1: rule__WorkSequence__SuccessorAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3462:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:3463:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:3463:2: ( ( ruleEString ) )
            // InternalPDL.g:3464:3: ( ruleEString )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_7_0()); 
            // InternalPDL.g:3465:3: ( ruleEString )
            // InternalPDL.g:3466:4: ruleEString
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_7_0()); 

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
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_7"


    // $ANTLR start "rule__Guidance__DescriptionAssignment_3"
    // InternalPDL.g:3477:1: rule__Guidance__DescriptionAssignment_3 : ( ruleEString ) ;
    public final void rule__Guidance__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3481:1: ( ( ruleEString ) )
            // InternalPDL.g:3482:2: ( ruleEString )
            {
            // InternalPDL.g:3482:2: ( ruleEString )
            // InternalPDL.g:3483:3: ruleEString
            {
             before(grammarAccess.getGuidanceAccess().getDescriptionEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuidanceAccess().getDescriptionEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Guidance__DescriptionAssignment_3"


    // $ANTLR start "rule__Resource__NameAssignment_2"
    // InternalPDL.g:3492:1: rule__Resource__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Resource__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3496:1: ( ( ruleEString ) )
            // InternalPDL.g:3497:2: ( ruleEString )
            {
            // InternalPDL.g:3497:2: ( ruleEString )
            // InternalPDL.g:3498:3: ruleEString
            {
             before(grammarAccess.getResourceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Resource__NameAssignment_2"


    // $ANTLR start "rule__Resource__OccuranceNbAssignment_4_1"
    // InternalPDL.g:3507:1: rule__Resource__OccuranceNbAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Resource__OccuranceNbAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3511:1: ( ( ruleEInt ) )
            // InternalPDL.g:3512:2: ( ruleEInt )
            {
            // InternalPDL.g:3512:2: ( ruleEInt )
            // InternalPDL.g:3513:3: ruleEInt
            {
             before(grammarAccess.getResourceAccess().getOccuranceNbEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getOccuranceNbEIntParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Resource__OccuranceNbAssignment_4_1"


    // $ANTLR start "rule__Parameter__QuantityAssignment_2_1"
    // InternalPDL.g:3522:1: rule__Parameter__QuantityAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__Parameter__QuantityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3526:1: ( ( ruleEInt ) )
            // InternalPDL.g:3527:2: ( ruleEInt )
            {
            // InternalPDL.g:3527:2: ( ruleEInt )
            // InternalPDL.g:3528:3: ruleEInt
            {
             before(grammarAccess.getParameterAccess().getQuantityEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getQuantityEIntParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Parameter__QuantityAssignment_2_1"


    // $ANTLR start "rule__Parameter__ResourceAssignment_4"
    // InternalPDL.g:3537:1: rule__Parameter__ResourceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Parameter__ResourceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3541:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:3542:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:3542:2: ( ( ruleEString ) )
            // InternalPDL.g:3543:3: ( ruleEString )
            {
             before(grammarAccess.getParameterAccess().getResourceResourceCrossReference_4_0()); 
            // InternalPDL.g:3544:3: ( ruleEString )
            // InternalPDL.g:3545:4: ruleEString
            {
             before(grammarAccess.getParameterAccess().getResourceResourceEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getResourceResourceEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getResourceResourceCrossReference_4_0()); 

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
    // $ANTLR end "rule__Parameter__ResourceAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000740000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000019240000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000400000L});

}