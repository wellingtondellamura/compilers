/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

/**
 *
 * @author wellington
 */
public class MyProgVisitor extends ProgBaseVisitor<Object>{

    @Override
    public Object visitCmdExpr(ProgParser.CmdExprContext ctx) {
        return super.visitCmdExpr(ctx);
    } 
    
    //<editor-fold defaultstate="collapsed" desc="expr">
    
    @Override
    public Object visitExprMin(ProgParser.ExprMinContext ctx) {
        return super.visitExprMin(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitExprPlus(ProgParser.ExprPlusContext ctx) {
        return super.visitExprPlus(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitExprTerm(ProgParser.ExprTermContext ctx) {
        return super.visitExprTerm(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="term">
    @Override
    public Object visitTermDiv(ProgParser.TermDivContext ctx) {
        return super.visitTermDiv(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitTermFact(ProgParser.TermFactContext ctx) {
        return super.visitTermFact(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitTermMult(ProgParser.TermMultContext ctx) {
        return super.visitTermMult(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="fact">
    @Override
    public Object visitFactExpr(ProgParser.FactExprContext ctx) {
        return ctx.expr().value;
    }
    
    @Override
    public Object visitFactNum(ProgParser.FactNumContext ctx) {
        Double d = Double.parseDouble(ctx.NUM().getText());
        return (Object) d;
    }
    
    @Override
    public Object visitFactVar(ProgParser.FactVarContext ctx) {
        String var = ctx.VAR().getText();
        Double symbol = Util.getValue(var);
        if (symbol == null){
            Util.error("Variável "+var+ " não encontrada");
        }
        return symbol;
    }
    //</editor-fold>

    @Override
    public Object visitIfStm(ProgParser.IfStmContext ctx) {
        Boolean cond = ctx.cond().value;
        if (cond){
            return visit(ctx.block());
        } else {
            return null;
        }        
    }

    @Override
    public Object visitIfStmElse(ProgParser.IfStmElseContext ctx) {
        Boolean cond = (Boolean) visit(ctx.cond());
        if (cond){
            return visit(ctx.b1);
        } else {
            return visit(ctx.b2);
        }        
    }

    @Override
    public Object visitCondExpr(ProgParser.CondExprContext ctx) {
        Double value = ctx.expr().value;
        return Util.getBoolean(value);
    }

    @Override
    public Object visitConfRelop(ProgParser.ConfRelopContext ctx) {
        return super.visitConfRelop(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}