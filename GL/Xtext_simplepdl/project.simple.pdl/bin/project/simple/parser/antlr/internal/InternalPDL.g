/*
 * generated by Xtext 2.17.1
 */
grammar InternalPDL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package project.simple.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProcess
entryRuleProcess returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProcessRule()); }
	iv_ruleProcess=ruleProcess
	{ $current=$iv_ruleProcess.current; }
	EOF;

// Rule Process
ruleProcess returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Process'
		{
			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProcessRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"project.simple.PDL.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='workDefinitions'
		{
			newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getWorkDefinitionsKeyword_3());
		}
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionParserRuleCall_5_0());
				}
				lv_workDefinitions_5_0=ruleWorkDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProcessRule());
					}
					add(
						$current,
						"workDefinitions",
						lv_workDefinitions_5_0,
						"project.simple.PDL.WorkDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getProcessAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionParserRuleCall_6_1_0());
					}
					lv_workDefinitions_7_0=ruleWorkDefinition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProcessRule());
						}
						add(
							$current,
							"workDefinitions",
							lv_workDefinitions_7_0,
							"project.simple.PDL.WorkDefinition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_7());
		}
		(
			otherlv_9='workSequences'
			{
				newLeafNode(otherlv_9, grammarAccess.getProcessAccess().getWorkSequencesKeyword_8_0());
			}
			otherlv_10='{'
			{
				newLeafNode(otherlv_10, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_8_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_8_2_0());
					}
					lv_workSequences_11_0=ruleWorkSequence
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProcessRule());
						}
						add(
							$current,
							"workSequences",
							lv_workSequences_11_0,
							"project.simple.PDL.WorkSequence");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_12=','
				{
					newLeafNode(otherlv_12, grammarAccess.getProcessAccess().getCommaKeyword_8_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_8_3_1_0());
						}
						lv_workSequences_13_0=ruleWorkSequence
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getProcessRule());
							}
							add(
								$current,
								"workSequences",
								lv_workSequences_13_0,
								"project.simple.PDL.WorkSequence");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_14='}'
			{
				newLeafNode(otherlv_14, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_8_4());
			}
		)?
		(
			otherlv_15='guidance'
			{
				newLeafNode(otherlv_15, grammarAccess.getProcessAccess().getGuidanceKeyword_9_0());
			}
			otherlv_16='{'
			{
				newLeafNode(otherlv_16, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_9_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProcessAccess().getGuidanceGuidanceParserRuleCall_9_2_0());
					}
					lv_guidance_17_0=ruleGuidance
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProcessRule());
						}
						add(
							$current,
							"guidance",
							lv_guidance_17_0,
							"project.simple.PDL.Guidance");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_18=','
				{
					newLeafNode(otherlv_18, grammarAccess.getProcessAccess().getCommaKeyword_9_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getProcessAccess().getGuidanceGuidanceParserRuleCall_9_3_1_0());
						}
						lv_guidance_19_0=ruleGuidance
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getProcessRule());
							}
							add(
								$current,
								"guidance",
								lv_guidance_19_0,
								"project.simple.PDL.Guidance");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_20='}'
			{
				newLeafNode(otherlv_20, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_9_4());
			}
		)?
		(
			otherlv_21='resource'
			{
				newLeafNode(otherlv_21, grammarAccess.getProcessAccess().getResourceKeyword_10_0());
			}
			otherlv_22='{'
			{
				newLeafNode(otherlv_22, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProcessAccess().getResourceResourceParserRuleCall_10_2_0());
					}
					lv_resource_23_0=ruleResource
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProcessRule());
						}
						add(
							$current,
							"resource",
							lv_resource_23_0,
							"project.simple.PDL.Resource");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_24=','
				{
					newLeafNode(otherlv_24, grammarAccess.getProcessAccess().getCommaKeyword_10_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getProcessAccess().getResourceResourceParserRuleCall_10_3_1_0());
						}
						lv_resource_25_0=ruleResource
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getProcessRule());
							}
							add(
								$current,
								"resource",
								lv_resource_25_0,
								"project.simple.PDL.Resource");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_26='}'
			{
				newLeafNode(otherlv_26, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_10_4());
			}
		)?
		otherlv_27='}'
		{
			newLeafNode(otherlv_27, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleWorkDefinition
entryRuleWorkDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWorkDefinitionRule()); }
	iv_ruleWorkDefinition=ruleWorkDefinition
	{ $current=$iv_ruleWorkDefinition.current; }
	EOF;

// Rule WorkDefinition
ruleWorkDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0(),
					$current);
			}
		)
		otherlv_1='WorkDefinition'
		{
			newLeafNode(otherlv_1, grammarAccess.getWorkDefinitionAccess().getWorkDefinitionKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"project.simple.PDL.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='linksToPredecessors'
			{
				newLeafNode(otherlv_4, grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsKeyword_4_0());
			}
			otherlv_5='('
			{
				newLeafNode(otherlv_5, grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_4_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getWorkDefinitionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_4_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getWorkDefinitionRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_4_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9=')'
			{
				newLeafNode(otherlv_9, grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_4_4());
			}
		)?
		(
			otherlv_10='linksToSuccessors'
			{
				newLeafNode(otherlv_10, grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsKeyword_5_0());
			}
			otherlv_11='('
			{
				newLeafNode(otherlv_11, grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_5_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getWorkDefinitionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_5_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_13=','
				{
					newLeafNode(otherlv_13, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getWorkDefinitionRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_5_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_15=')'
			{
				newLeafNode(otherlv_15, grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_5_4());
			}
		)?
		(
			otherlv_16='guidance'
			{
				newLeafNode(otherlv_16, grammarAccess.getWorkDefinitionAccess().getGuidanceKeyword_6_0());
			}
			otherlv_17='('
			{
				newLeafNode(otherlv_17, grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_6_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getWorkDefinitionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceCrossReference_6_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_19=','
				{
					newLeafNode(otherlv_19, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_6_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getWorkDefinitionRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceCrossReference_6_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_21=')'
			{
				newLeafNode(otherlv_21, grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_6_4());
			}
		)?
		(
			otherlv_22='parameters'
			{
				newLeafNode(otherlv_22, grammarAccess.getWorkDefinitionAccess().getParametersKeyword_7_0());
			}
			otherlv_23='{'
			{
				newLeafNode(otherlv_23, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_7_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getParametersParameterParserRuleCall_7_2_0());
					}
					lv_parameters_24_0=ruleparameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_24_0,
							"project.simple.PDL.parameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_25=','
				{
					newLeafNode(otherlv_25, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_7_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getParametersParameterParserRuleCall_7_3_1_0());
						}
						lv_parameters_26_0=ruleparameter
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_26_0,
								"project.simple.PDL.parameter");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_27='}'
			{
				newLeafNode(otherlv_27, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_7_4());
			}
		)?
		otherlv_28='}'
		{
			newLeafNode(otherlv_28, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleWorkSequence
entryRuleWorkSequence returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWorkSequenceRule()); }
	iv_ruleWorkSequence=ruleWorkSequence
	{ $current=$iv_ruleWorkSequence.current; }
	EOF;

// Rule WorkSequence
ruleWorkSequence returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='WorkSequence'
		{
			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWorkSequenceKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getWorkSequenceAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='linkType'
		{
			newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getLinkTypeKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_3_0());
				}
				lv_linkType_3_0=ruleWorkSequenceType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
					}
					set(
						$current,
						"linkType",
						lv_linkType_3_0,
						"project.simple.PDL.WorkSequenceType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='predecessor'
		{
			newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getPredecessorKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkSequenceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_5_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='successor'
		{
			newLeafNode(otherlv_6, grammarAccess.getWorkSequenceAccess().getSuccessorKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkSequenceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_7_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getWorkSequenceAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleGuidance
entryRuleGuidance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGuidanceRule()); }
	iv_ruleGuidance=ruleGuidance
	{ $current=$iv_ruleGuidance.current; }
	EOF;

// Rule Guidance
ruleGuidance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Guidance'
		{
			newLeafNode(otherlv_0, grammarAccess.getGuidanceAccess().getGuidanceKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='description'
		{
			newLeafNode(otherlv_2, grammarAccess.getGuidanceAccess().getDescriptionKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGuidanceAccess().getDescriptionEStringParserRuleCall_3_0());
				}
				lv_description_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGuidanceRule());
					}
					set(
						$current,
						"description",
						lv_description_3_0,
						"project.simple.PDL.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleResource
entryRuleResource returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getResourceRule()); }
	iv_ruleResource=ruleResource
	{ $current=$iv_ruleResource.current; }
	EOF;

// Rule Resource
ruleResource returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getResourceAccess().getResourceAction_0(),
					$current);
			}
		)
		otherlv_1='Resource'
		{
			newLeafNode(otherlv_1, grammarAccess.getResourceAccess().getResourceKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getResourceAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getResourceRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"project.simple.PDL.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='OccuranceNb'
			{
				newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getOccuranceNbKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getResourceAccess().getOccuranceNbEIntParserRuleCall_4_1_0());
					}
					lv_OccuranceNb_5_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getResourceRule());
						}
						set(
							$current,
							"OccuranceNb",
							lv_OccuranceNb_5_0,
							"project.simple.PDL.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleparameter
entryRuleparameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	iv_ruleparameter=ruleparameter
	{ $current=$iv_ruleparameter.current; }
	EOF;

// Rule parameter
ruleparameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='parameter'
		{
			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='quantity'
			{
				newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getQuantityKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getParameterAccess().getQuantityEIntParserRuleCall_2_1_0());
					}
					lv_quantity_3_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getParameterRule());
						}
						set(
							$current,
							"quantity",
							lv_quantity_3_0,
							"project.simple.PDL.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_4='resource'
		{
			newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getResourceKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getParameterAccess().getResourceResourceCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Rule WorkSequenceType
ruleWorkSequenceType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='startToStart'
			{
				$current = grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='finishToStart'
			{
				$current = grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='startToFinish'
			{
				$current = grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='finishToFinish'
			{
				$current = grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;