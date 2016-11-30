/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import test1.parser.SumLexer;
import test1.parser.SumParser;
import test1.parser.SymbolTable;

/**
 *
 * @author wellington
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRFileStream("teste.sum");
        SumLexer lexer = new SumLexer(input);
        TokenStream stream = new CommonTokenStream(lexer);
        SumParser parser = new SumParser(stream);
        parser.prog();
        SymbolTable.getInstance().getSymbols().forEach(s -> System.out.println(s));
    }

}
