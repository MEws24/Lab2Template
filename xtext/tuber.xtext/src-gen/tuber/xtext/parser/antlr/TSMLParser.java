/*
 * generated by Xtext 2.35.0
 */
package tuber.xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import tuber.xtext.parser.antlr.internal.InternalTSMLParser;
import tuber.xtext.services.TSMLGrammarAccess;

public class TSMLParser extends AbstractAntlrParser {

	@Inject
	private TSMLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTSMLParser createParser(XtextTokenStream stream) {
		return new InternalTSMLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "TUber";
	}

	public TSMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TSMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
