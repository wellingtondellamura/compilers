/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicinterpreter;

import basicInterpreter.parser.BasicBaseVisitor;
import basicInterpreter.parser.BasicParser;

/**
 *
 * @author wellington
 */
public class BasicInterpreterVisitor extends BasicBaseVisitor {

    @Override
    public Object visitWriteStr(BasicParser.WriteStrContext ctx) {
        String text = ctx.STR().getText().replace("\"", "");
        
        System.out.println(text);
        return null;
    }

}
