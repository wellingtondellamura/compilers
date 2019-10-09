// Generated from Basic.g4 by ANTLR 4.7.2

package basicInterpreter.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BasicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BasicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BasicParser#progr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgr(BasicParser.ProgrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineRead}
	 * labeled alternative in {@link BasicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineRead(BasicParser.LineReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineWrite}
	 * labeled alternative in {@link BasicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineWrite(BasicParser.LineWriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineAtr}
	 * labeled alternative in {@link BasicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineAtr(BasicParser.LineAtrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineIfStm}
	 * labeled alternative in {@link BasicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineIfStm(BasicParser.LineIfStmContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(BasicParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeStr}
	 * labeled alternative in {@link BasicParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStr(BasicParser.WriteStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeExpr}
	 * labeled alternative in {@link BasicParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteExpr(BasicParser.WriteExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtr(BasicParser.AtrContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#ifstm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstm(BasicParser.IfstmContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(BasicParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(BasicParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(BasicParser.FactContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(BasicParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(BasicParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(BasicParser.BlockContext ctx);
}