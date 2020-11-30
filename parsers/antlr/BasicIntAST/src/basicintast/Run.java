/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicintast;

import basicintast.parser.BasicLexer;
import basicintast.parser.BasicParser;
import basicintast.parser.BasicVisitor;
import basicintast.util.BasicVisitorImpl;
import basicintast.util.DescriptiveErrorListener;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author wellington
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Iniciando o interpretador\n\n*************");
        ANTLRInputStream input = new ANTLRFileStream("input.basic");
        BasicLexer lexer = new BasicLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BasicParser parser = new BasicParser(tokens);
        
        lexer.removeErrorListeners();
        parser.removeErrorListeners();
                        
        lexer.addErrorListener(DescriptiveErrorListener.INSTANCE);
        parser.addErrorListener(DescriptiveErrorListener.INSTANCE);

        
        DefaultErrorStrategy ee = new DefaultErrorStrategy();
        parser.setErrorHandler(ee);
        
        //parser.setErrorHandler(new BailErrorStrategy());
        
        
        try {
            ParseTree tree = parser.program();
            if (DescriptiveErrorListener.INSTANCE.hasErrors()){
                System.out.println("Can't parse this file.");
                System.exit(0);
            }
            BasicVisitor eval = new BasicVisitorImpl();
            eval.visit(tree);
        } catch (ParseCancellationException e){
            System.out.println("Ops."+e.getMessage());
        }
        
    }

}
