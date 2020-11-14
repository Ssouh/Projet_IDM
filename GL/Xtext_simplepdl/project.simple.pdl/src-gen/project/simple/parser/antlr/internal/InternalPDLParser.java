package project.simple.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import project.simple.services.PDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Process'", "'{'", "'workDefinitions'", "','", "'}'", "'workSequences'", "'guidance'", "'resource'", "'WorkDefinition'", "'linksToPredecessors'", "'('", "')'", "'linksToSuccessors'", "'parameters'", "'WorkSequence'", "'linkType'", "'predecessor'", "'successor'", "'Guidance'", "'description'", "'Resource'", "'OccuranceNb'", "'parameter'", "'quantity'", "'-'", "'startToStart'", "'finishToStart'", "'startToFinish'", "'finishToFinish'"
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

        public InternalPDLParser(TokenStream input, PDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected PDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalPDL.g:65:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalPDL.g:65:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalPDL.g:66:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL.g:72:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'workDefinitions' otherlv_4= '{' ( (lv_workDefinitions_5_0= ruleWorkDefinition ) ) (otherlv_6= ',' ( (lv_workDefinitions_7_0= ruleWorkDefinition ) ) )* otherlv_8= '}' (otherlv_9= 'workSequences' otherlv_10= '{' ( (lv_workSequences_11_0= ruleWorkSequence ) ) (otherlv_12= ',' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )* otherlv_14= '}' )? (otherlv_15= 'guidance' otherlv_16= '{' ( (lv_guidance_17_0= ruleGuidance ) ) (otherlv_18= ',' ( (lv_guidance_19_0= ruleGuidance ) ) )* otherlv_20= '}' )? (otherlv_21= 'resource' otherlv_22= '{' ( (lv_resource_23_0= ruleResource ) ) (otherlv_24= ',' ( (lv_resource_25_0= ruleResource ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_workDefinitions_5_0 = null;

        EObject lv_workDefinitions_7_0 = null;

        EObject lv_workSequences_11_0 = null;

        EObject lv_workSequences_13_0 = null;

        EObject lv_guidance_17_0 = null;

        EObject lv_guidance_19_0 = null;

        EObject lv_resource_23_0 = null;

        EObject lv_resource_25_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:78:2: ( (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'workDefinitions' otherlv_4= '{' ( (lv_workDefinitions_5_0= ruleWorkDefinition ) ) (otherlv_6= ',' ( (lv_workDefinitions_7_0= ruleWorkDefinition ) ) )* otherlv_8= '}' (otherlv_9= 'workSequences' otherlv_10= '{' ( (lv_workSequences_11_0= ruleWorkSequence ) ) (otherlv_12= ',' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )* otherlv_14= '}' )? (otherlv_15= 'guidance' otherlv_16= '{' ( (lv_guidance_17_0= ruleGuidance ) ) (otherlv_18= ',' ( (lv_guidance_19_0= ruleGuidance ) ) )* otherlv_20= '}' )? (otherlv_21= 'resource' otherlv_22= '{' ( (lv_resource_23_0= ruleResource ) ) (otherlv_24= ',' ( (lv_resource_25_0= ruleResource ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalPDL.g:79:2: (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'workDefinitions' otherlv_4= '{' ( (lv_workDefinitions_5_0= ruleWorkDefinition ) ) (otherlv_6= ',' ( (lv_workDefinitions_7_0= ruleWorkDefinition ) ) )* otherlv_8= '}' (otherlv_9= 'workSequences' otherlv_10= '{' ( (lv_workSequences_11_0= ruleWorkSequence ) ) (otherlv_12= ',' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )* otherlv_14= '}' )? (otherlv_15= 'guidance' otherlv_16= '{' ( (lv_guidance_17_0= ruleGuidance ) ) (otherlv_18= ',' ( (lv_guidance_19_0= ruleGuidance ) ) )* otherlv_20= '}' )? (otherlv_21= 'resource' otherlv_22= '{' ( (lv_resource_23_0= ruleResource ) ) (otherlv_24= ',' ( (lv_resource_25_0= ruleResource ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalPDL.g:79:2: (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'workDefinitions' otherlv_4= '{' ( (lv_workDefinitions_5_0= ruleWorkDefinition ) ) (otherlv_6= ',' ( (lv_workDefinitions_7_0= ruleWorkDefinition ) ) )* otherlv_8= '}' (otherlv_9= 'workSequences' otherlv_10= '{' ( (lv_workSequences_11_0= ruleWorkSequence ) ) (otherlv_12= ',' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )* otherlv_14= '}' )? (otherlv_15= 'guidance' otherlv_16= '{' ( (lv_guidance_17_0= ruleGuidance ) ) (otherlv_18= ',' ( (lv_guidance_19_0= ruleGuidance ) ) )* otherlv_20= '}' )? (otherlv_21= 'resource' otherlv_22= '{' ( (lv_resource_23_0= ruleResource ) ) (otherlv_24= ',' ( (lv_resource_25_0= ruleResource ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalPDL.g:80:3: otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'workDefinitions' otherlv_4= '{' ( (lv_workDefinitions_5_0= ruleWorkDefinition ) ) (otherlv_6= ',' ( (lv_workDefinitions_7_0= ruleWorkDefinition ) ) )* otherlv_8= '}' (otherlv_9= 'workSequences' otherlv_10= '{' ( (lv_workSequences_11_0= ruleWorkSequence ) ) (otherlv_12= ',' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )* otherlv_14= '}' )? (otherlv_15= 'guidance' otherlv_16= '{' ( (lv_guidance_17_0= ruleGuidance ) ) (otherlv_18= ',' ( (lv_guidance_19_0= ruleGuidance ) ) )* otherlv_20= '}' )? (otherlv_21= 'resource' otherlv_22= '{' ( (lv_resource_23_0= ruleResource ) ) (otherlv_24= ',' ( (lv_resource_25_0= ruleResource ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            // InternalPDL.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPDL.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalPDL.g:85:4: (lv_name_1_0= ruleEString )
            // InternalPDL.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"project.simple.PDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getWorkDefinitionsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalPDL.g:115:3: ( (lv_workDefinitions_5_0= ruleWorkDefinition ) )
            // InternalPDL.g:116:4: (lv_workDefinitions_5_0= ruleWorkDefinition )
            {
            // InternalPDL.g:116:4: (lv_workDefinitions_5_0= ruleWorkDefinition )
            // InternalPDL.g:117:5: lv_workDefinitions_5_0= ruleWorkDefinition
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_workDefinitions_5_0=ruleWorkDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					add(
            						current,
            						"workDefinitions",
            						lv_workDefinitions_5_0,
            						"project.simple.PDL.WorkDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPDL.g:134:3: (otherlv_6= ',' ( (lv_workDefinitions_7_0= ruleWorkDefinition ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPDL.g:135:4: otherlv_6= ',' ( (lv_workDefinitions_7_0= ruleWorkDefinition ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getProcessAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalPDL.g:139:4: ( (lv_workDefinitions_7_0= ruleWorkDefinition ) )
            	    // InternalPDL.g:140:5: (lv_workDefinitions_7_0= ruleWorkDefinition )
            	    {
            	    // InternalPDL.g:140:5: (lv_workDefinitions_7_0= ruleWorkDefinition )
            	    // InternalPDL.g:141:6: lv_workDefinitions_7_0= ruleWorkDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_workDefinitions_7_0=ruleWorkDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProcessRule());
            	    						}
            	    						add(
            	    							current,
            	    							"workDefinitions",
            	    							lv_workDefinitions_7_0,
            	    							"project.simple.PDL.WorkDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalPDL.g:163:3: (otherlv_9= 'workSequences' otherlv_10= '{' ( (lv_workSequences_11_0= ruleWorkSequence ) ) (otherlv_12= ',' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )* otherlv_14= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPDL.g:164:4: otherlv_9= 'workSequences' otherlv_10= '{' ( (lv_workSequences_11_0= ruleWorkSequence ) ) (otherlv_12= ',' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getProcessAccess().getWorkSequencesKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalPDL.g:172:4: ( (lv_workSequences_11_0= ruleWorkSequence ) )
                    // InternalPDL.g:173:5: (lv_workSequences_11_0= ruleWorkSequence )
                    {
                    // InternalPDL.g:173:5: (lv_workSequences_11_0= ruleWorkSequence )
                    // InternalPDL.g:174:6: lv_workSequences_11_0= ruleWorkSequence
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_workSequences_11_0=ruleWorkSequence();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						add(
                    							current,
                    							"workSequences",
                    							lv_workSequences_11_0,
                    							"project.simple.PDL.WorkSequence");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPDL.g:191:4: (otherlv_12= ',' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalPDL.g:192:5: otherlv_12= ',' ( (lv_workSequences_13_0= ruleWorkSequence ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getProcessAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalPDL.g:196:5: ( (lv_workSequences_13_0= ruleWorkSequence ) )
                    	    // InternalPDL.g:197:6: (lv_workSequences_13_0= ruleWorkSequence )
                    	    {
                    	    // InternalPDL.g:197:6: (lv_workSequences_13_0= ruleWorkSequence )
                    	    // InternalPDL.g:198:7: lv_workSequences_13_0= ruleWorkSequence
                    	    {

                    	    							newCompositeNode(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_workSequences_13_0=ruleWorkSequence();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"workSequences",
                    	    								lv_workSequences_13_0,
                    	    								"project.simple.PDL.WorkSequence");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalPDL.g:221:3: (otherlv_15= 'guidance' otherlv_16= '{' ( (lv_guidance_17_0= ruleGuidance ) ) (otherlv_18= ',' ( (lv_guidance_19_0= ruleGuidance ) ) )* otherlv_20= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPDL.g:222:4: otherlv_15= 'guidance' otherlv_16= '{' ( (lv_guidance_17_0= ruleGuidance ) ) (otherlv_18= ',' ( (lv_guidance_19_0= ruleGuidance ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getProcessAccess().getGuidanceKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalPDL.g:230:4: ( (lv_guidance_17_0= ruleGuidance ) )
                    // InternalPDL.g:231:5: (lv_guidance_17_0= ruleGuidance )
                    {
                    // InternalPDL.g:231:5: (lv_guidance_17_0= ruleGuidance )
                    // InternalPDL.g:232:6: lv_guidance_17_0= ruleGuidance
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getGuidanceGuidanceParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_guidance_17_0=ruleGuidance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						add(
                    							current,
                    							"guidance",
                    							lv_guidance_17_0,
                    							"project.simple.PDL.Guidance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPDL.g:249:4: (otherlv_18= ',' ( (lv_guidance_19_0= ruleGuidance ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPDL.g:250:5: otherlv_18= ',' ( (lv_guidance_19_0= ruleGuidance ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getProcessAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalPDL.g:254:5: ( (lv_guidance_19_0= ruleGuidance ) )
                    	    // InternalPDL.g:255:6: (lv_guidance_19_0= ruleGuidance )
                    	    {
                    	    // InternalPDL.g:255:6: (lv_guidance_19_0= ruleGuidance )
                    	    // InternalPDL.g:256:7: lv_guidance_19_0= ruleGuidance
                    	    {

                    	    							newCompositeNode(grammarAccess.getProcessAccess().getGuidanceGuidanceParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_guidance_19_0=ruleGuidance();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guidance",
                    	    								lv_guidance_19_0,
                    	    								"project.simple.PDL.Guidance");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_20, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalPDL.g:279:3: (otherlv_21= 'resource' otherlv_22= '{' ( (lv_resource_23_0= ruleResource ) ) (otherlv_24= ',' ( (lv_resource_25_0= ruleResource ) ) )* otherlv_26= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPDL.g:280:4: otherlv_21= 'resource' otherlv_22= '{' ( (lv_resource_23_0= ruleResource ) ) (otherlv_24= ',' ( (lv_resource_25_0= ruleResource ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_21, grammarAccess.getProcessAccess().getResourceKeyword_10_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_22, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalPDL.g:288:4: ( (lv_resource_23_0= ruleResource ) )
                    // InternalPDL.g:289:5: (lv_resource_23_0= ruleResource )
                    {
                    // InternalPDL.g:289:5: (lv_resource_23_0= ruleResource )
                    // InternalPDL.g:290:6: lv_resource_23_0= ruleResource
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getResourceResourceParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_resource_23_0=ruleResource();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						add(
                    							current,
                    							"resource",
                    							lv_resource_23_0,
                    							"project.simple.PDL.Resource");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPDL.g:307:4: (otherlv_24= ',' ( (lv_resource_25_0= ruleResource ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalPDL.g:308:5: otherlv_24= ',' ( (lv_resource_25_0= ruleResource ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getProcessAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalPDL.g:312:5: ( (lv_resource_25_0= ruleResource ) )
                    	    // InternalPDL.g:313:6: (lv_resource_25_0= ruleResource )
                    	    {
                    	    // InternalPDL.g:313:6: (lv_resource_25_0= ruleResource )
                    	    // InternalPDL.g:314:7: lv_resource_25_0= ruleResource
                    	    {

                    	    							newCompositeNode(grammarAccess.getProcessAccess().getResourceResourceParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_resource_25_0=ruleResource();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"resource",
                    	    								lv_resource_25_0,
                    	    								"project.simple.PDL.Resource");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_26, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleEString"
    // InternalPDL.g:345:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPDL.g:345:47: (iv_ruleEString= ruleEString EOF )
            // InternalPDL.g:346:2: iv_ruleEString= ruleEString EOF
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
    // InternalPDL.g:352:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPDL.g:358:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPDL.g:359:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPDL.g:359:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalPDL.g:360:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPDL.g:368:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL.g:379:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // InternalPDL.g:379:55: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // InternalPDL.g:380:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL.g:386:1: ruleWorkDefinition returns [EObject current=null] : ( () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linksToPredecessors' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'linksToSuccessors' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'guidance' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'parameters' otherlv_23= '{' ( (lv_parameters_24_0= ruleparameter ) ) (otherlv_25= ',' ( (lv_parameters_26_0= ruleparameter ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_24_0 = null;

        EObject lv_parameters_26_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:392:2: ( ( () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linksToPredecessors' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'linksToSuccessors' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'guidance' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'parameters' otherlv_23= '{' ( (lv_parameters_24_0= ruleparameter ) ) (otherlv_25= ',' ( (lv_parameters_26_0= ruleparameter ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalPDL.g:393:2: ( () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linksToPredecessors' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'linksToSuccessors' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'guidance' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'parameters' otherlv_23= '{' ( (lv_parameters_24_0= ruleparameter ) ) (otherlv_25= ',' ( (lv_parameters_26_0= ruleparameter ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalPDL.g:393:2: ( () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linksToPredecessors' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'linksToSuccessors' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'guidance' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'parameters' otherlv_23= '{' ( (lv_parameters_24_0= ruleparameter ) ) (otherlv_25= ',' ( (lv_parameters_26_0= ruleparameter ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalPDL.g:394:3: () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linksToPredecessors' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'linksToSuccessors' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'guidance' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? (otherlv_22= 'parameters' otherlv_23= '{' ( (lv_parameters_24_0= ruleparameter ) ) (otherlv_25= ',' ( (lv_parameters_26_0= ruleparameter ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // InternalPDL.g:394:3: ()
            // InternalPDL.g:395:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkDefinitionAccess().getWorkDefinitionKeyword_1());
            		
            // InternalPDL.g:405:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPDL.g:406:4: (lv_name_2_0= ruleEString )
            {
            // InternalPDL.g:406:4: (lv_name_2_0= ruleEString )
            // InternalPDL.g:407:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"project.simple.PDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPDL.g:428:3: (otherlv_4= 'linksToPredecessors' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPDL.g:429:4: otherlv_4= 'linksToPredecessors' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalPDL.g:437:4: ( ( ruleEString ) )
                    // InternalPDL.g:438:5: ( ruleEString )
                    {
                    // InternalPDL.g:438:5: ( ruleEString )
                    // InternalPDL.g:439:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPDL.g:453:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalPDL.g:454:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalPDL.g:458:5: ( ( ruleEString ) )
                    	    // InternalPDL.g:459:6: ( ruleEString )
                    	    {
                    	    // InternalPDL.g:459:6: ( ruleEString )
                    	    // InternalPDL.g:460:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalPDL.g:480:3: (otherlv_10= 'linksToSuccessors' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPDL.g:481:4: otherlv_10= 'linksToSuccessors' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalPDL.g:489:4: ( ( ruleEString ) )
                    // InternalPDL.g:490:5: ( ruleEString )
                    {
                    // InternalPDL.g:490:5: ( ruleEString )
                    // InternalPDL.g:491:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPDL.g:505:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalPDL.g:506:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalPDL.g:510:5: ( ( ruleEString ) )
                    	    // InternalPDL.g:511:6: ( ruleEString )
                    	    {
                    	    // InternalPDL.g:511:6: ( ruleEString )
                    	    // InternalPDL.g:512:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_15, grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalPDL.g:532:3: (otherlv_16= 'guidance' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPDL.g:533:4: otherlv_16= 'guidance' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')'
                    {
                    otherlv_16=(Token)match(input,17,FOLLOW_16); 

                    				newLeafNode(otherlv_16, grammarAccess.getWorkDefinitionAccess().getGuidanceKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalPDL.g:541:4: ( ( ruleEString ) )
                    // InternalPDL.g:542:5: ( ruleEString )
                    {
                    // InternalPDL.g:542:5: ( ruleEString )
                    // InternalPDL.g:543:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPDL.g:557:4: (otherlv_19= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalPDL.g:558:5: otherlv_19= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalPDL.g:562:5: ( ( ruleEString ) )
                    	    // InternalPDL.g:563:6: ( ruleEString )
                    	    {
                    	    // InternalPDL.g:563:6: ( ruleEString )
                    	    // InternalPDL.g:564:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_21, grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalPDL.g:584:3: (otherlv_22= 'parameters' otherlv_23= '{' ( (lv_parameters_24_0= ruleparameter ) ) (otherlv_25= ',' ( (lv_parameters_26_0= ruleparameter ) ) )* otherlv_27= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPDL.g:585:4: otherlv_22= 'parameters' otherlv_23= '{' ( (lv_parameters_24_0= ruleparameter ) ) (otherlv_25= ',' ( (lv_parameters_26_0= ruleparameter ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getWorkDefinitionAccess().getParametersKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_23, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalPDL.g:593:4: ( (lv_parameters_24_0= ruleparameter ) )
                    // InternalPDL.g:594:5: (lv_parameters_24_0= ruleparameter )
                    {
                    // InternalPDL.g:594:5: (lv_parameters_24_0= ruleparameter )
                    // InternalPDL.g:595:6: lv_parameters_24_0= ruleparameter
                    {

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_parameters_24_0=ruleparameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_24_0,
                    							"project.simple.PDL.parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPDL.g:612:4: (otherlv_25= ',' ( (lv_parameters_26_0= ruleparameter ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalPDL.g:613:5: otherlv_25= ',' ( (lv_parameters_26_0= ruleparameter ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_21); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalPDL.g:617:5: ( (lv_parameters_26_0= ruleparameter ) )
                    	    // InternalPDL.g:618:6: (lv_parameters_26_0= ruleparameter )
                    	    {
                    	    // InternalPDL.g:618:6: (lv_parameters_26_0= ruleparameter )
                    	    // InternalPDL.g:619:7: lv_parameters_26_0= ruleparameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_parameters_26_0=ruleparameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_26_0,
                    	    								"project.simple.PDL.parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_27, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL.g:650:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // InternalPDL.g:650:53: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // InternalPDL.g:651:2: iv_ruleWorkSequence= ruleWorkSequence EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequence=ruleWorkSequence();

            state._fsp--;

             current =iv_ruleWorkSequence; 
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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL.g:657:1: ruleWorkSequence returns [EObject current=null] : (otherlv_0= 'WorkSequence' otherlv_1= '{' otherlv_2= 'linkType' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) otherlv_4= 'predecessor' ( ( ruleEString ) ) otherlv_6= 'successor' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_linkType_3_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:663:2: ( (otherlv_0= 'WorkSequence' otherlv_1= '{' otherlv_2= 'linkType' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) otherlv_4= 'predecessor' ( ( ruleEString ) ) otherlv_6= 'successor' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalPDL.g:664:2: (otherlv_0= 'WorkSequence' otherlv_1= '{' otherlv_2= 'linkType' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) otherlv_4= 'predecessor' ( ( ruleEString ) ) otherlv_6= 'successor' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalPDL.g:664:2: (otherlv_0= 'WorkSequence' otherlv_1= '{' otherlv_2= 'linkType' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) otherlv_4= 'predecessor' ( ( ruleEString ) ) otherlv_6= 'successor' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalPDL.g:665:3: otherlv_0= 'WorkSequence' otherlv_1= '{' otherlv_2= 'linkType' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) otherlv_4= 'predecessor' ( ( ruleEString ) ) otherlv_6= 'successor' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWorkSequenceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkSequenceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getLinkTypeKeyword_2());
            		
            // InternalPDL.g:677:3: ( (lv_linkType_3_0= ruleWorkSequenceType ) )
            // InternalPDL.g:678:4: (lv_linkType_3_0= ruleWorkSequenceType )
            {
            // InternalPDL.g:678:4: (lv_linkType_3_0= ruleWorkSequenceType )
            // InternalPDL.g:679:5: lv_linkType_3_0= ruleWorkSequenceType
            {

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_linkType_3_0=ruleWorkSequenceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            					}
            					set(
            						current,
            						"linkType",
            						lv_linkType_3_0,
            						"project.simple.PDL.WorkSequenceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getPredecessorKeyword_4());
            		
            // InternalPDL.g:700:3: ( ( ruleEString ) )
            // InternalPDL.g:701:4: ( ruleEString )
            {
            // InternalPDL.g:701:4: ( ruleEString )
            // InternalPDL.g:702:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_5_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getWorkSequenceAccess().getSuccessorKeyword_6());
            		
            // InternalPDL.g:720:3: ( ( ruleEString ) )
            // InternalPDL.g:721:4: ( ruleEString )
            {
            // InternalPDL.g:721:4: ( ruleEString )
            // InternalPDL.g:722:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_7_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getWorkSequenceAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // InternalPDL.g:744:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // InternalPDL.g:744:49: (iv_ruleGuidance= ruleGuidance EOF )
            // InternalPDL.g:745:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalPDL.g:751:1: ruleGuidance returns [EObject current=null] : (otherlv_0= 'Guidance' otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:757:2: ( (otherlv_0= 'Guidance' otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalPDL.g:758:2: (otherlv_0= 'Guidance' otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalPDL.g:758:2: (otherlv_0= 'Guidance' otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalPDL.g:759:3: otherlv_0= 'Guidance' otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGuidanceAccess().getGuidanceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getGuidanceAccess().getDescriptionKeyword_2());
            		
            // InternalPDL.g:771:3: ( (lv_description_3_0= ruleEString ) )
            // InternalPDL.g:772:4: (lv_description_3_0= ruleEString )
            {
            // InternalPDL.g:772:4: (lv_description_3_0= ruleEString )
            // InternalPDL.g:773:5: lv_description_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGuidanceAccess().getDescriptionEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_description_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGuidanceRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"project.simple.PDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleResource"
    // InternalPDL.g:798:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalPDL.g:798:49: (iv_ruleResource= ruleResource EOF )
            // InternalPDL.g:799:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalPDL.g:805:1: ruleResource returns [EObject current=null] : ( () otherlv_1= 'Resource' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'OccuranceNb' ( (lv_OccuranceNb_5_0= ruleEInt ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_OccuranceNb_5_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:811:2: ( ( () otherlv_1= 'Resource' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'OccuranceNb' ( (lv_OccuranceNb_5_0= ruleEInt ) ) )? otherlv_6= '}' ) )
            // InternalPDL.g:812:2: ( () otherlv_1= 'Resource' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'OccuranceNb' ( (lv_OccuranceNb_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            {
            // InternalPDL.g:812:2: ( () otherlv_1= 'Resource' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'OccuranceNb' ( (lv_OccuranceNb_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            // InternalPDL.g:813:3: () otherlv_1= 'Resource' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'OccuranceNb' ( (lv_OccuranceNb_5_0= ruleEInt ) ) )? otherlv_6= '}'
            {
            // InternalPDL.g:813:3: ()
            // InternalPDL.g:814:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResourceAccess().getResourceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getResourceAccess().getResourceKeyword_1());
            		
            // InternalPDL.g:824:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPDL.g:825:4: (lv_name_2_0= ruleEString )
            {
            // InternalPDL.g:825:4: (lv_name_2_0= ruleEString )
            // InternalPDL.g:826:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getResourceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"project.simple.PDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPDL.g:847:3: (otherlv_4= 'OccuranceNb' ( (lv_OccuranceNb_5_0= ruleEInt ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPDL.g:848:4: otherlv_4= 'OccuranceNb' ( (lv_OccuranceNb_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getOccuranceNbKeyword_4_0());
                    			
                    // InternalPDL.g:852:4: ( (lv_OccuranceNb_5_0= ruleEInt ) )
                    // InternalPDL.g:853:5: (lv_OccuranceNb_5_0= ruleEInt )
                    {
                    // InternalPDL.g:853:5: (lv_OccuranceNb_5_0= ruleEInt )
                    // InternalPDL.g:854:6: lv_OccuranceNb_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getResourceAccess().getOccuranceNbEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_OccuranceNb_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceRule());
                    						}
                    						set(
                    							current,
                    							"OccuranceNb",
                    							lv_OccuranceNb_5_0,
                    							"project.simple.PDL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleparameter"
    // InternalPDL.g:880:1: entryRuleparameter returns [EObject current=null] : iv_ruleparameter= ruleparameter EOF ;
    public final EObject entryRuleparameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter = null;


        try {
            // InternalPDL.g:880:50: (iv_ruleparameter= ruleparameter EOF )
            // InternalPDL.g:881:2: iv_ruleparameter= ruleparameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleparameter=ruleparameter();

            state._fsp--;

             current =iv_ruleparameter; 
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
    // $ANTLR end "entryRuleparameter"


    // $ANTLR start "ruleparameter"
    // InternalPDL.g:887:1: ruleparameter returns [EObject current=null] : (otherlv_0= 'parameter' otherlv_1= '{' (otherlv_2= 'quantity' ( (lv_quantity_3_0= ruleEInt ) ) )? otherlv_4= 'resource' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleparameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_quantity_3_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:893:2: ( (otherlv_0= 'parameter' otherlv_1= '{' (otherlv_2= 'quantity' ( (lv_quantity_3_0= ruleEInt ) ) )? otherlv_4= 'resource' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalPDL.g:894:2: (otherlv_0= 'parameter' otherlv_1= '{' (otherlv_2= 'quantity' ( (lv_quantity_3_0= ruleEInt ) ) )? otherlv_4= 'resource' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalPDL.g:894:2: (otherlv_0= 'parameter' otherlv_1= '{' (otherlv_2= 'quantity' ( (lv_quantity_3_0= ruleEInt ) ) )? otherlv_4= 'resource' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalPDL.g:895:3: otherlv_0= 'parameter' otherlv_1= '{' (otherlv_2= 'quantity' ( (lv_quantity_3_0= ruleEInt ) ) )? otherlv_4= 'resource' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPDL.g:903:3: (otherlv_2= 'quantity' ( (lv_quantity_3_0= ruleEInt ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPDL.g:904:4: otherlv_2= 'quantity' ( (lv_quantity_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getQuantityKeyword_2_0());
                    			
                    // InternalPDL.g:908:4: ( (lv_quantity_3_0= ruleEInt ) )
                    // InternalPDL.g:909:5: (lv_quantity_3_0= ruleEInt )
                    {
                    // InternalPDL.g:909:5: (lv_quantity_3_0= ruleEInt )
                    // InternalPDL.g:910:6: lv_quantity_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getQuantityEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_quantity_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"quantity",
                    							lv_quantity_3_0,
                    							"project.simple.PDL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getResourceKeyword_3());
            		
            // InternalPDL.g:932:3: ( ( ruleEString ) )
            // InternalPDL.g:933:4: ( ruleEString )
            {
            // InternalPDL.g:933:4: ( ruleEString )
            // InternalPDL.g:934:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getResourceResourceCrossReference_4_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleparameter"


    // $ANTLR start "entryRuleEInt"
    // InternalPDL.g:956:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalPDL.g:956:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalPDL.g:957:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalPDL.g:963:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalPDL.g:969:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalPDL.g:970:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalPDL.g:970:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalPDL.g:971:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalPDL.g:971:3: (kw= '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPDL.g:972:4: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_31); 

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


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL.g:989:1: ruleWorkSequenceType returns [Enumerator current=null] : ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) ) ;
    public final Enumerator ruleWorkSequenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPDL.g:995:2: ( ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) ) )
            // InternalPDL.g:996:2: ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) )
            {
            // InternalPDL.g:996:2: ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt20=1;
                }
                break;
            case 37:
                {
                alt20=2;
                }
                break;
            case 38:
                {
                alt20=3;
                }
                break;
            case 39:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalPDL.g:997:3: (enumLiteral_0= 'startToStart' )
                    {
                    // InternalPDL.g:997:3: (enumLiteral_0= 'startToStart' )
                    // InternalPDL.g:998:4: enumLiteral_0= 'startToStart'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:1005:3: (enumLiteral_1= 'finishToStart' )
                    {
                    // InternalPDL.g:1005:3: (enumLiteral_1= 'finishToStart' )
                    // InternalPDL.g:1006:4: enumLiteral_1= 'finishToStart'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:1013:3: (enumLiteral_2= 'startToFinish' )
                    {
                    // InternalPDL.g:1013:3: (enumLiteral_2= 'startToFinish' )
                    // InternalPDL.g:1014:4: enumLiteral_2= 'startToFinish'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:1021:3: (enumLiteral_3= 'finishToFinish' )
                    {
                    // InternalPDL.g:1021:3: (enumLiteral_3= 'finishToFinish' )
                    // InternalPDL.g:1022:4: enumLiteral_3= 'finishToFinish'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleWorkSequenceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001928000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001828000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001028000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});

}