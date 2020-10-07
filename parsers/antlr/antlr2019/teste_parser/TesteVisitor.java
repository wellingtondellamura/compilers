// Generated from Teste.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TesteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TesteVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TesteParser#lang}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLang(TesteParser.LangContext ctx);
	/**
	 * Visit a parse tree produced by {@link TesteParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TesteParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TesteParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(TesteParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link TesteParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(TesteParser.FactorContext ctx);
}