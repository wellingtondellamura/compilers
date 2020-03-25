// Generated from Teste.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TesteParser}.
 */
public interface TesteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TesteParser#lang}.
	 * @param ctx the parse tree
	 */
	void enterLang(TesteParser.LangContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteParser#lang}.
	 * @param ctx the parse tree
	 */
	void exitLang(TesteParser.LangContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TesteParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TesteParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(TesteParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(TesteParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link TesteParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(TesteParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TesteParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(TesteParser.FactorContext ctx);
}