// Generated from Sum.g4 by ANTLR 4.5
package test1.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SumParser}.
 */
public interface SumListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SumParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SumParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SumParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SumParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SumParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterStm(SumParser.StmContext ctx);
	/**
	 * Exit a parse tree produced by {@link SumParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitStm(SumParser.StmContext ctx);
	/**
	 * Enter a parse tree produced by {@link SumParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SumParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SumParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SumParser.ExprContext ctx);
}