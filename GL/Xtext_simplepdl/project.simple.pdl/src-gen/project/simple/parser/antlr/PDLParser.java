/*
 * generated by Xtext 2.17.1
 */
package project.simple.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import project.simple.parser.antlr.internal.InternalPDLParser;
import project.simple.services.PDLGrammarAccess;

public class PDLParser extends AbstractAntlrParser {

	@Inject
	private PDLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPDLParser createParser(XtextTokenStream stream) {
		return new InternalPDLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Process";
	}

	public PDLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PDLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}