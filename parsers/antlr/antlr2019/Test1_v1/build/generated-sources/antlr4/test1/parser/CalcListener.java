// Generated from C:\Users\wellington\Documents\projects\lectures\compilers\parsers\antlr2019\Test1\grammar\test1\parser\Calc.g4 by ANTLR 4.6

package test1.parser;
import test1.Utils;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#lang}.
	 * @param ctx the parse tree
	 */
	void enterLang(CalcParser.LangContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#lang}.
	 * @param ctx the parse tree
	 */
	void exitLang(CalcParser.LangContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalcParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CalcParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CalcParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CalcParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CalcParser.FactorContext ctx);
}