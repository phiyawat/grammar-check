// Generated from SimpleSQL.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleSQLParser}.
 */
public interface SimpleSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(SimpleSQLParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(SimpleSQLParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleSQLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleSQLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#bracket}.
	 * @param ctx the parse tree
	 */
	void enterBracket(SimpleSQLParser.BracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#bracket}.
	 * @param ctx the parse tree
	 */
	void exitBracket(SimpleSQLParser.BracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#letter}.
	 * @param ctx the parse tree
	 */
	void enterLetter(SimpleSQLParser.LetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#letter}.
	 * @param ctx the parse tree
	 */
	void exitLetter(SimpleSQLParser.LetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SimpleSQLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SimpleSQLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#inputString}.
	 * @param ctx the parse tree
	 */
	void enterInputString(SimpleSQLParser.InputStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#inputString}.
	 * @param ctx the parse tree
	 */
	void exitInputString(SimpleSQLParser.InputStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#inputNumberic}.
	 * @param ctx the parse tree
	 */
	void enterInputNumberic(SimpleSQLParser.InputNumbericContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#inputNumberic}.
	 * @param ctx the parse tree
	 */
	void exitInputNumberic(SimpleSQLParser.InputNumbericContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#inputReal}.
	 * @param ctx the parse tree
	 */
	void enterInputReal(SimpleSQLParser.InputRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#inputReal}.
	 * @param ctx the parse tree
	 */
	void exitInputReal(SimpleSQLParser.InputRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(SimpleSQLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(SimpleSQLParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#or_operator}.
	 * @param ctx the parse tree
	 */
	void enterOr_operator(SimpleSQLParser.Or_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#or_operator}.
	 * @param ctx the parse tree
	 */
	void exitOr_operator(SimpleSQLParser.Or_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#and_operator}.
	 * @param ctx the parse tree
	 */
	void enterAnd_operator(SimpleSQLParser.And_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#and_operator}.
	 * @param ctx the parse tree
	 */
	void exitAnd_operator(SimpleSQLParser.And_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#relational_operators}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operators(SimpleSQLParser.Relational_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#relational_operators}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operators(SimpleSQLParser.Relational_operatorsContext ctx);
}