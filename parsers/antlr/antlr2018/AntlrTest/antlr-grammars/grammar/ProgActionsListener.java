// Generated from c:\Users\wellington\projects\lectures\compilers\parsers\antlr\antlr2018\AntlrTest\antlr-grammars\ProgActions.g4 by ANTLR 4.9.2

package parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgActionsParser}.
 */
public interface ProgActionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProgActionsParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ProgActionsParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgActionsParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ProgActionsParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgActionsParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(ProgActionsParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgActionsParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(ProgActionsParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgActionsParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(ProgActionsParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgActionsParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(ProgActionsParser.AtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgActionsParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(ProgActionsParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgActionsParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(ProgActionsParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgActionsParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(ProgActionsParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgActionsParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(ProgActionsParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgActionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ProgActionsParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgActionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ProgActionsParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgActionsParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ProgActionsParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgActionsParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ProgActionsParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgActionsParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(ProgActionsParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgActionsParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(ProgActionsParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgActionsParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(ProgActionsParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgActionsParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(ProgActionsParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgActionsParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(ProgActionsParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgActionsParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(ProgActionsParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgActionsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ProgActionsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgActionsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ProgActionsParser.BlockContext ctx);
}