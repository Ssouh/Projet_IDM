/*
 * generated by Xtext 2.17.1
 */
package project.simple.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import project.simple.pDL.Guidance;
import project.simple.pDL.PDLPackage;
import project.simple.pDL.Resource;
import project.simple.pDL.WorkDefinition;
import project.simple.pDL.WorkSequence;
import project.simple.pDL.parameter;
import project.simple.services.PDLGrammarAccess;

@SuppressWarnings("all")
public class PDLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PDLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PDLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PDLPackage.GUIDANCE:
				sequence_Guidance(context, (Guidance) semanticObject); 
				return; 
			case PDLPackage.PROCESS:
				sequence_Process(context, (project.simple.pDL.Process) semanticObject); 
				return; 
			case PDLPackage.RESOURCE:
				sequence_Resource(context, (Resource) semanticObject); 
				return; 
			case PDLPackage.WORK_DEFINITION:
				sequence_WorkDefinition(context, (WorkDefinition) semanticObject); 
				return; 
			case PDLPackage.WORK_SEQUENCE:
				sequence_WorkSequence(context, (WorkSequence) semanticObject); 
				return; 
			case PDLPackage.PARAMETER:
				sequence_parameter(context, (parameter) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Guidance returns Guidance
	 *
	 * Constraint:
	 *     description=EString
	 */
	protected void sequence_Guidance(ISerializationContext context, Guidance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PDLPackage.Literals.GUIDANCE__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDLPackage.Literals.GUIDANCE__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGuidanceAccess().getDescriptionEStringParserRuleCall_3_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Process returns Process
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         workDefinitions+=WorkDefinition 
	 *         workDefinitions+=WorkDefinition* 
	 *         (workSequences+=WorkSequence workSequences+=WorkSequence*)? 
	 *         (guidance+=Guidance guidance+=Guidance*)? 
	 *         (resource+=Resource resource+=Resource*)?
	 *     )
	 */
	protected void sequence_Process(ISerializationContext context, project.simple.pDL.Process semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Resource returns Resource
	 *
	 * Constraint:
	 *     (name=EString OccuranceNb=EInt?)
	 */
	protected void sequence_Resource(ISerializationContext context, Resource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WorkDefinition returns WorkDefinition
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (linksToPredecessors+=[WorkSequence|EString] linksToPredecessors+=[WorkSequence|EString]*)? 
	 *         (linksToSuccessors+=[WorkSequence|EString] linksToSuccessors+=[WorkSequence|EString]*)? 
	 *         (guidance+=[Guidance|EString] guidance+=[Guidance|EString]*)? 
	 *         (parameters+=parameter parameters+=parameter*)?
	 *     )
	 */
	protected void sequence_WorkDefinition(ISerializationContext context, WorkDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WorkSequence returns WorkSequence
	 *
	 * Constraint:
	 *     (linkType=WorkSequenceType predecessor=[WorkDefinition|EString] successor=[WorkDefinition|EString])
	 */
	protected void sequence_WorkSequence(ISerializationContext context, WorkSequence semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PDLPackage.Literals.WORK_SEQUENCE__LINK_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDLPackage.Literals.WORK_SEQUENCE__LINK_TYPE));
			if (transientValues.isValueTransient(semanticObject, PDLPackage.Literals.WORK_SEQUENCE__PREDECESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDLPackage.Literals.WORK_SEQUENCE__PREDECESSOR));
			if (transientValues.isValueTransient(semanticObject, PDLPackage.Literals.WORK_SEQUENCE__SUCCESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDLPackage.Literals.WORK_SEQUENCE__SUCCESSOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_3_0(), semanticObject.getLinkType());
		feeder.accept(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionEStringParserRuleCall_5_0_1(), semanticObject.eGet(PDLPackage.Literals.WORK_SEQUENCE__PREDECESSOR, false));
		feeder.accept(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionEStringParserRuleCall_7_0_1(), semanticObject.eGet(PDLPackage.Literals.WORK_SEQUENCE__SUCCESSOR, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     parameter returns parameter
	 *
	 * Constraint:
	 *     (quantity=EInt? resource=[Resource|EString])
	 */
	protected void sequence_parameter(ISerializationContext context, parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
