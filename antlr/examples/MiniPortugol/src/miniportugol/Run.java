/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniportugol;

import miniportugol.parser.MiniPortugolLexer;
import miniportugol.parser.MiniPortugolParser;
import miniportugol.parser.PortugolVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author wellington
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ANTLRInputStream input = new ANTLRInputStream("2/2+2\n");
        MiniPortugolLexer lexer = new MiniPortugolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniPortugolParser parser = new MiniPortugolParser(tokens);
         
        ParseTree tree = parser.prog();
         
        PortugolVisitor eval = new PortugolVisitor();
        eval.visit(tree);

    }

}
