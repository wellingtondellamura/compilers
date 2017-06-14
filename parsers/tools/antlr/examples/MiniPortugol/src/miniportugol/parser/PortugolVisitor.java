/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniportugol.parser;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wellington
 */
public class PortugolVisitor extends MiniPortugolBaseVisitor<Double> {
    Map<String, Double> memory = new HashMap<String, Double>();
     
    @Override
    public Double visitAssign(MiniPortugolParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        double value = visit(ctx.expr());
        memory.put(id, value);
        return value;
    }
     
    @Override
    public Double visitPrintExpr(MiniPortugolParser.PrintExprContext ctx) {
        Double value = visit(ctx.expr());
        System.out.println(value);
        return 0.;
    }
     
    @Override
    public Double visitInt(MiniPortugolParser.IntContext ctx) {
        return Double.valueOf(ctx.INT().getText());
    }
     
    @Override
    public Double visitId(MiniPortugolParser.IdContext ctx) {        
        String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) return memory.get(id);
        return 0.;
    }
     
    @Override
    public Double visitMulDiv(MiniPortugolParser.MulDivContext ctx) {
        double left = visit(ctx.expr(0));
        double right = visit(ctx.expr(1));
        if ( ctx.op.getType() == MiniPortugolParser.MUL ) 
            return left * right;
        return left / right;
    }
 
    @Override
    public Double visitAddSub(MiniPortugolParser.AddSubContext ctx) {
        double left = visit(ctx.expr(0));
        double right = visit(ctx.expr(1));
        if ( ctx.op.getType() == MiniPortugolParser.ADD ) 
            return left + right;
        return left - right;
    }
     
    @Override
    public Double visitParens(MiniPortugolParser.ParensContext ctx) {
        return visit(ctx.expr());
    }
}
