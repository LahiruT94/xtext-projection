/*
 * generated by Xtext 2.16.0
 */
package com.ifs.lang.projection.parser.antlr;

import com.google.inject.Inject;
import com.ifs.lang.projection.parser.antlr.internal.InternalProjectionLangParser;
import com.ifs.lang.projection.services.ProjectionLangGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ProjectionLangParser extends AbstractAntlrParser {

	@Inject
	private ProjectionLangGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalProjectionLangParser createParser(XtextTokenStream stream) {
		return new InternalProjectionLangParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public ProjectionLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ProjectionLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
