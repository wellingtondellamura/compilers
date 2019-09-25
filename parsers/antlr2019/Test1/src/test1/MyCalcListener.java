/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import test1.parser.CalcBaseListener;
import test1.parser.CalcParser;

/**
 *
 * @author wellington
 */
public class MyCalcListener extends CalcBaseListener{

    @Override
    public void enterLang(CalcParser.LangContext ctx) {
        super.enterLang(ctx);
    }

    @Override
    public void exitFactor(CalcParser.FactorContext ctx) {
        super.exitFactor(ctx); 
        System.out.println(ctx.DIGIT);
    }

    
    
    
}
