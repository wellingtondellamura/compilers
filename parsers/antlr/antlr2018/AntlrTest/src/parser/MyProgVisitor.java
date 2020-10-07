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

    //<editor-fold defaultstate="collapsed" desc="ifstm">
    @Override
    public Object visitIfStm(ProgParser.IfStmContext ctx) {
        Boolean cond = (Boolean) visit(ctx.cond());
        if (cond){
            return visit(ctx.block());
        }
        return null;
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
//</editor-fold>

    @Override
    public Object visitCondExpr(ProgParser.CondExprContext ctx) {
        Double value = (Double) visit(ctx.expr());
        return Util.getBoolean(value);
    }

    @Override
    public Object visitConfRelop(ProgParser.ConfRelopContext ctx) {
        Double d1 = (Double) visit(ctx.expr(0));
        Double d2 = (Double) visit(ctx.expr(1));
        String relop = ctx.RELOP().getText();
        if (relop.equals("==")) return (Object) (d1.equals(d2));
        if (relop.equals("!=")) return (Object) !(d1.equals(d2));
        if (relop.equals(">")) return (Object) (d1>d2);
        if (relop.equals("<")) return (Object) (d1<d2);
        if (relop.equals(">=")) return (Object) (d1>=d2);
        if (relop.equals("<=")) return (Object) (d1<=d2);
        return super.visitConfRelop(ctx);
    }

    
    
    
    
}
