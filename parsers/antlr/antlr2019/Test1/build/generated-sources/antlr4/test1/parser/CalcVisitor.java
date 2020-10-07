// Generated from C:\Users\wellington\Documents\projects\lectures\compilers\parsers\antlr2019\Test1\grammar\test1\parser\Calc.g4 by ANTLR 4.6

package test1.parser;
import test1.Utils;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcParser#lang}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLang(CalcParser.LangContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CalcParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term2}
	 * labeled alternative in {@link CalcParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm2(CalcParser.Term2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code term1}
	 * labeled alternative in {@link CalcParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm1(CalcParser.Term1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(CalcParser.FactorContext ctx);
}