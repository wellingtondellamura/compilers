/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicintast.util;

import basicintast.parser.BasicBaseVisitor;
import basicintast.parser.BasicParser;
import java.util.Scanner;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author wellington
 */

public class BasicVisitorImpl extends BasicBaseVisitor<Double>{

    @Override
    public Double visitPrintStr(BasicParser.PrintStrContext ctx) {
        System.out.println(ctx.STR().getText());
        return 0d;
    }

    @Override
    public Double visitPrintExpr(BasicParser.PrintExprContext ctx) {
        double value = visit(ctx.expr()); 
        System.out.println(value);
        return 0d;
    }

    @Override
    public Double visitReadVar(BasicParser.ReadVarContext ctx) {
        Scanner s = new Scanner(System.in);
        Double value = s.nextDouble();
        SymbolsTable.getInstance().addSymbol(ctx.VAR().getText(), value);
        return value;
    }

    @Override
    public Double visitAttrExpr(BasicParser.AttrExprContext ctx) {
        Double value = visit(ctx.expr());
        SymbolsTable.getInstance().addSymbol(ctx.VAR().getText(), value);
        return value;
    }

    @Override
    public Double visitExprPlus(BasicParser.ExprPlusContext ctx) {
        Double a = visit(ctx.expr1());
        Double b = visit(ctx.expr());
        return a + b;
    }

    @Override
    public Double visitExprMinus(BasicParser.ExprMinusContext ctx) {
        Double a = visit(ctx.expr1());
        Double b = visit(ctx.expr());
        return a - b;
    }

    @Override
    public Double visitExpr1Empty(BasicParser.Expr1EmptyContext ctx) {
        return visit(ctx.expr1());
    }

    @Override
    public Double visitExpr1Mult(BasicParser.Expr1MultContext ctx) {
        Double a = visit(ctx.expr2());
        Double b = visit(ctx.expr());
        return a * b;
    }

    @Override
    public Double visitExpr1Div(BasicParser.Expr1DivContext ctx) {
        Double a = visit(ctx.expr2());
        Double b = visit(ctx.expr());
        return a / b;
    }

    @Override
    public Double visitExpr2Empty(BasicParser.Expr2EmptyContext ctx) {
        return visit(ctx.expr2());
    }

    @Override
    public Double visitExpr2Par(BasicParser.Expr2ParContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Double visitExpr2Num(BasicParser.Expr2NumContext ctx) {
        return Double.parseDouble(ctx.NUM().getText());
    }

    @Override
    public Double visitExpr2Var(BasicParser.Expr2VarContext ctx) {
        return SymbolsTable.getInstance().getSymbol(ctx.VAR().getText());
    }

}
