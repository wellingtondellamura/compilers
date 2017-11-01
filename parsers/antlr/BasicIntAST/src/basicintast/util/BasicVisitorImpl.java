/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicintast.util;

import basicintast.parser.BasicBaseVisitor;
import basicintast.parser.BasicLexer;
import basicintast.parser.BasicParser;
import java.util.Scanner;

/**
 *
 * @author wellington
 */
public class BasicVisitorImpl extends BasicBaseVisitor<Object> {

    @Override
    public Object visitIfStmt(BasicParser.IfStmtContext ctx) {
        Boolean visit = (Boolean) visit(ctx.condExpr());
        if (visit) {
            return visit(ctx.b1);
        }
        return null;
    }

    @Override
    public Object visitIfElseStmt(BasicParser.IfElseStmtContext ctx) {
        Boolean visit = (Boolean) visit(ctx.condExpr());
        if (visit) {
            return visit(ctx.b1);
        } else {
            return visit(ctx.b2);
        }
    }

    @Override
    public Object visitBlockStmt(BasicParser.BlockStmtContext ctx) {
        return super.visitBlockStmt(ctx);
    }

    @Override
    public Object visitCondRelOp(BasicParser.CondRelOpContext ctx) {
        Double a = (Double) visit(ctx.expr(0));
        Double b = (Double) visit(ctx.expr(1));
        int op = ctx.relop.getType();
        switch (op) {
            case BasicLexer.EQ:
                return a == b;
            case BasicLexer.NE:
                return a != b;
            case BasicLexer.LT:
                return a < b;
            case BasicLexer.GT:
                return a > b;
            case BasicLexer.LE:
                return a <= b;
            case BasicLexer.GE:
                return a >= b;
        }
        return null;
    }

    @Override
    public Object visitCondExpresion(BasicParser.CondExpresionContext ctx) {
        Double d = (Double) visit(ctx.expr());
        return d > 0;
    }

    @Override
    public Object visitPrintStr(BasicParser.PrintStrContext ctx) {
        String val = ctx.STR().getText();
        System.out.println(val);
        return 0d;
    }

    @Override
    public Object visitPrintExpr(BasicParser.PrintExprContext ctx) {
        Object o = visit(ctx.expr());
        System.out.println(o);
        return o;
    }

    @Override
    public Object visitReadVar(BasicParser.ReadVarContext ctx) {
        Scanner s = new Scanner(System.in);
        Double value = s.nextDouble();
        SymbolsTable.getInstance().addSymbol(ctx.VAR().getText(), value);
        return value;
    }

    @Override
    public Object visitAttrExpr(BasicParser.AttrExprContext ctx) {
        Double value = (Double) visit(ctx.expr());
        SymbolsTable.getInstance().addSymbol(ctx.VAR().getText(), value);
        return value;
    }

    @Override
    public Object visitExprPlus(BasicParser.ExprPlusContext ctx) {
        Double a = (Double) visit(ctx.expr1());
        Double b = (Double) visit(ctx.expr());
        return a + b;
    }

    @Override
    public Object visitExprMinus(BasicParser.ExprMinusContext ctx) {
        Double a = (Double) visit(ctx.expr1());
        Double b = (Double) visit(ctx.expr());
        return a - b;
    }

    @Override
    public Object visitExpr1Empty(BasicParser.Expr1EmptyContext ctx) {
        return visit(ctx.expr1());
    }

    @Override
    public Object visitExpr1Mult(BasicParser.Expr1MultContext ctx) {
        Double a = (Double) visit(ctx.expr2());
        Double b = (Double) visit(ctx.expr());
        return a * b;
    }

    @Override
    public Object visitExpr1Div(BasicParser.Expr1DivContext ctx) {
        Double a = (Double) visit(ctx.expr2());
        Double b = (Double) visit(ctx.expr());
        return a / b;
    }

    @Override
    public Object visitExpr2Empty(BasicParser.Expr2EmptyContext ctx) {
        return visit(ctx.expr2());
    }

    @Override
    public Object visitExpr2Par(BasicParser.Expr2ParContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Object visitExpr2Num(BasicParser.Expr2NumContext ctx) {
        return Double.parseDouble(ctx.NUM().getText());
    }

    @Override
    public Object visitExpr2Var(BasicParser.Expr2VarContext ctx) {
        return SymbolsTable.getInstance().getSymbol(ctx.VAR().getText());
    }

}
