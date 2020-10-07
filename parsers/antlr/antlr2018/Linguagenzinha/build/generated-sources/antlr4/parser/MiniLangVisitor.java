// Generated from C:\Users\wellington\Documents\projects\lectures\compilers\parsers\antlr2018\Linguagenzinha\grammar\parser\MiniLang.g4 by ANTLR 4.6

package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniLangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MiniLangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLangParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MiniLangParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MiniLangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLangParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(MiniLangParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLangParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtr(MiniLangParser.AtrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprVarPlus}
	 * labeled alternative in {@link MiniLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVarPlus(MiniLangParser.ExprVarPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNumPlus}
	 * labeled alternative in {@link MiniLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumPlus(MiniLangParser.ExprNumPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNum}
	 * labeled alternative in {@link MiniLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNum(MiniLangParser.ExprNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprVar}
	 * labeled alternative in {@link MiniLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVar(MiniLangParser.ExprVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link MiniLangParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(MiniLangParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link MiniLangParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStmt(MiniLangParser.IfElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLangParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(MiniLangParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiniLangParser.BlockContext ctx);
}