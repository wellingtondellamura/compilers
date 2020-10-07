// Generated from C:\Users\wellington\Documents\projects\lectures\compilers\parsers\antlr2018\Linguagenzinha\grammar\parser\MiniLang.g4 by ANTLR 4.6

package parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniLangParser}.
 */
public interface MiniLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MiniLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MiniLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MiniLangParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MiniLangParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MiniLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MiniLangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(MiniLangParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(MiniLangParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterAtr(MiniLangParser.AtrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitAtr(MiniLangParser.AtrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprVarPlus}
	 * labeled alternative in {@link MiniLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVarPlus(MiniLangParser.ExprVarPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprVarPlus}
	 * labeled alternative in {@link MiniLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVarPlus(MiniLangParser.ExprVarPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNumPlus}
	 * labeled alternative in {@link MiniLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNumPlus(MiniLangParser.ExprNumPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNumPlus}
	 * labeled alternative in {@link MiniLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNumPlus(MiniLangParser.ExprNumPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNum}
	 * labeled alternative in {@link MiniLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNum(MiniLangParser.ExprNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNum}
	 * labeled alternative in {@link MiniLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNum(MiniLangParser.ExprNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprVar}
	 * labeled alternative in {@link MiniLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVar(MiniLangParser.ExprVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprVar}
	 * labeled alternative in {@link MiniLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVar(MiniLangParser.ExprVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link MiniLangParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(MiniLangParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link MiniLangParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(MiniLangParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link MiniLangParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStmt(MiniLangParser.IfElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link MiniLangParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStmt(MiniLangParser.IfElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(MiniLangParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(MiniLangParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiniLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiniLangParser.BlockContext ctx);
}