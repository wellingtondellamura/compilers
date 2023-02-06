//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9.2
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from c:\Users\wellington\projects\lectures\compilers\parsers\antlr\BasicIntAST\grammar\basicintast\parser\Basic.g4 by ANTLR 4.9.2

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

namespace Grammar {

package basicintast.parser;
import basicintast.util.*;

using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using IToken = Antlr4.Runtime.IToken;
using ParserRuleContext = Antlr4.Runtime.ParserRuleContext;

/// <summary>
/// This class provides an empty implementation of <see cref="IBasicVisitor{Result}"/>,
/// which can be extended to create a visitor which only needs to handle a subset
/// of the available methods.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.2")]
[System.Diagnostics.DebuggerNonUserCode]
[System.CLSCompliant(false)]
public partial class BasicBaseVisitor<Result> : AbstractParseTreeVisitor<Result>, IBasicVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by the <c>programStmt</c>
	/// labeled alternative in <see cref="BasicParser.program"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitProgramStmt([NotNull] BasicParser.ProgramStmtContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>stmtPrint</c>
	/// labeled alternative in <see cref="BasicParser.stmt"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitStmtPrint([NotNull] BasicParser.StmtPrintContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>stmtRead</c>
	/// labeled alternative in <see cref="BasicParser.stmt"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitStmtRead([NotNull] BasicParser.StmtReadContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>stmtAttr</c>
	/// labeled alternative in <see cref="BasicParser.stmt"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitStmtAttr([NotNull] BasicParser.StmtAttrContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>stmtExpr</c>
	/// labeled alternative in <see cref="BasicParser.stmt"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitStmtExpr([NotNull] BasicParser.StmtExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>stmtCond</c>
	/// labeled alternative in <see cref="BasicParser.stmt"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitStmtCond([NotNull] BasicParser.StmtCondContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>ifStmt</c>
	/// labeled alternative in <see cref="BasicParser.cond"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitIfStmt([NotNull] BasicParser.IfStmtContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>ifElseStmt</c>
	/// labeled alternative in <see cref="BasicParser.cond"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitIfElseStmt([NotNull] BasicParser.IfElseStmtContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>condExpresion</c>
	/// labeled alternative in <see cref="BasicParser.condExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitCondExpresion([NotNull] BasicParser.CondExpresionContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>condRelOp</c>
	/// labeled alternative in <see cref="BasicParser.condExpr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitCondRelOp([NotNull] BasicParser.CondRelOpContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>blockStmt</c>
	/// labeled alternative in <see cref="BasicParser.block"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitBlockStmt([NotNull] BasicParser.BlockStmtContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>printStr</c>
	/// labeled alternative in <see cref="BasicParser.print"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitPrintStr([NotNull] BasicParser.PrintStrContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>printExpr</c>
	/// labeled alternative in <see cref="BasicParser.print"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitPrintExpr([NotNull] BasicParser.PrintExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>readVar</c>
	/// labeled alternative in <see cref="BasicParser.read"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitReadVar([NotNull] BasicParser.ReadVarContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>attrExpr</c>
	/// labeled alternative in <see cref="BasicParser.attr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitAttrExpr([NotNull] BasicParser.AttrExprContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>exprPlus</c>
	/// labeled alternative in <see cref="BasicParser.expr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitExprPlus([NotNull] BasicParser.ExprPlusContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>exprMinus</c>
	/// labeled alternative in <see cref="BasicParser.expr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitExprMinus([NotNull] BasicParser.ExprMinusContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>expr1Empty</c>
	/// labeled alternative in <see cref="BasicParser.expr"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitExpr1Empty([NotNull] BasicParser.Expr1EmptyContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>expr1Mult</c>
	/// labeled alternative in <see cref="BasicParser.expr1"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitExpr1Mult([NotNull] BasicParser.Expr1MultContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>expr1Div</c>
	/// labeled alternative in <see cref="BasicParser.expr1"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitExpr1Div([NotNull] BasicParser.Expr1DivContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>expr2Empty</c>
	/// labeled alternative in <see cref="BasicParser.expr1"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitExpr2Empty([NotNull] BasicParser.Expr2EmptyContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>expr2Par</c>
	/// labeled alternative in <see cref="BasicParser.expr2"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitExpr2Par([NotNull] BasicParser.Expr2ParContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>expr2Num</c>
	/// labeled alternative in <see cref="BasicParser.expr2"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitExpr2Num([NotNull] BasicParser.Expr2NumContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>expr2Var</c>
	/// labeled alternative in <see cref="BasicParser.expr2"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitExpr2Var([NotNull] BasicParser.Expr2VarContext context) { return VisitChildren(context); }
}
} // namespace Grammar
