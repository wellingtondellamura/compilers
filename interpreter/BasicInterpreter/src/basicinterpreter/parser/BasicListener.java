// Generated from Basic.g4 by ANTLR 4.7.2

package basicInterpreter.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BasicParser}.
 */
public interface BasicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BasicParser#progr}.
	 * @param ctx the parse tree
	 */
	void enterProgr(BasicParser.ProgrContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#progr}.
	 * @param ctx the parse tree
	 */
	void exitProgr(BasicParser.ProgrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineRead}
	 * labeled alternative in {@link BasicParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineRead(BasicParser.LineReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineRead}
	 * labeled alternative in {@link BasicParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineRead(BasicParser.LineReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineWrite}
	 * labeled alternative in {@link BasicParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineWrite(BasicParser.LineWriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineWrite}
	 * labeled alternative in {@link BasicParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineWrite(BasicParser.LineWriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineAtr}
	 * labeled alternative in {@link BasicParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineAtr(BasicParser.LineAtrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineAtr}
	 * labeled alternative in {@link BasicParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineAtr(BasicParser.LineAtrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineIfStm}
	 * labeled alternative in {@link BasicParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineIfStm(BasicParser.LineIfStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineIfStm}
	 * labeled alternative in {@link BasicParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineIfStm(BasicParser.LineIfStmContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(BasicParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(BasicParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeStr}
	 * labeled alternative in {@link BasicParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWriteStr(BasicParser.WriteStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeStr}
	 * labeled alternative in {@link BasicParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWriteStr(BasicParser.WriteStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeExpr}
	 * labeled alternative in {@link BasicParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWriteExpr(BasicParser.WriteExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeExpr}
	 * labeled alternative in {@link BasicParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWriteExpr(BasicParser.WriteExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterAtr(BasicParser.AtrContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitAtr(BasicParser.AtrContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void enterIfstm(BasicParser.IfstmContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void exitIfstm(BasicParser.IfstmContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(BasicParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(BasicParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(BasicParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(BasicParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(BasicParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(BasicParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(BasicParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(BasicParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(BasicParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(BasicParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(BasicParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(BasicParser.BlockContext ctx);
}