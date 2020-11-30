/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdt;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import sdt.parser.InterpreterLexer;
import sdt.parser.InterpreterParser;



/**
 *
 * @author wellington
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        String str = "x=3*5\n"+
                     "y=10+20\n"+
                     "2+2+5\n"+
                     "z=x+y\n";
        CharStream input = new ANTLRInputStream(str);
        InterpreterLexer lex = new InterpreterLexer(input);
        TokenStream stream = new CommonTokenStream(lex);
        InterpreterParser parser = new InterpreterParser(stream);
        InterpreterParser.ProgContext ctx = parser.prog();
        
        CalcVisitor calc = new CalcVisitor();
        calc.visit(ctx);
        //System.out.println("O resultado é: " + ctx.val);
    }
    
}
