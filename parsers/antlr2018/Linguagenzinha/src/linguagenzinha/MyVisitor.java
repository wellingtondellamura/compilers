/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linguagenzinha;

import parser.MiniLangBaseVisitor;
import parser.MiniLangParser;

/**
 *
 * @author wellington
 */
public class MyVisitor extends MiniLangBaseVisitor<Object>{

    @Override
    public Object visitExprNum(MiniLangParser.ExprNumContext ctx) {
        String num = ctx.NUM().getText();
        Double d = Double.parseDouble(num);
        ctx.result = d;
        return d;
    }

    @Override
    public Object visitIfElseStmt(MiniLangParser.IfElseStmtContext ctx) {
        Boolean cond = (Boolean) visit(ctx.cond());
        if (cond){
            return visit(ctx.block(0));
        } else {
            return visit(ctx.block(1));
        }
    }


    
}
