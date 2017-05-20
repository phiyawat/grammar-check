// Generated from SimpleSQL.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleSQLParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(SimpleSQLParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleSQLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSQLParser#bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket(SimpleSQLParser.BracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSQLParser#letter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetter(SimpleSQLParser.LetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SimpleSQLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSQLParser#inputString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputString(SimpleSQLParser.InputStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSQLParser#inputNumberic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputNumberic(SimpleSQLParser.InputNumbericContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSQLParser#inputReal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputReal(SimpleSQLParser.InputRealContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSQLParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(SimpleSQLParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSQLParser#or_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_operator(SimpleSQLParser.Or_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSQLParser#and_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_operator(SimpleSQLParser.And_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleSQLParser#relational_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operators(SimpleSQLParser.Relational_operatorsContext ctx);
}