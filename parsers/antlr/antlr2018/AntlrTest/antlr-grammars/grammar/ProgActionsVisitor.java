// Generated from c:\Users\wellington\projects\lectures\compilers\parsers\antlr\antlr2018\AntlrTest\antlr-grammars\ProgActions.g4 by ANTLR 4.9.2

package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProgActionsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProgActionsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProgActionsParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ProgActionsParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgActionsParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(ProgActionsParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgActionsParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrib(ProgActionsParser.AtribContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgActionsParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(ProgActionsParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgActionsParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(ProgActionsParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgActionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ProgActionsParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgActionsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ProgActionsParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgActionsParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(ProgActionsParser.FactContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgActionsParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(ProgActionsParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgActionsParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(ProgActionsParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgActionsParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ProgActionsParser.BlockContext ctx);
}