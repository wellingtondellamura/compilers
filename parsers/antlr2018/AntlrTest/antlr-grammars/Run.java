/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antlrtest;

import java.awt.HeadlessException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
//import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.ExprLexer;
import parser.ExprParser;

/**
 *
 * @author wellington
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ola ANTLR");
        
        CharStream stream = new ANTLRInputStream("2+2\n2+2\n2+2\n2+2\n");  //origem SRC
        ExprLexer lexer = new ExprLexer(stream);            //Lexer
        TokenStream tokens = new CommonTokenStream(lexer);  //nextToken 
        ExprParser parser = new ExprParser(tokens);         //Parser
        ExprParser.ProgContext prog = parser.prog();        //Exec Parser prog
        //showParseTreeFrame(prog, parser);
    }
    
    
//     private static void showParseTreeFrame(ParseTree tree, ExprParser parser) throws HeadlessException {
//        JFrame frame = new JFrame("SRC: " + tree.getText());
//        JPanel panel = new JPanel();
//        TreeViewer viewr = new TreeViewer(Arrays.asList(
//                parser.getRuleNames()), tree);
//        viewr.setScale(3);
//        panel.add(viewr);
//        frame.add(panel);
//        frame.setSize(1000, 600);
//        frame.setState(JFrame.MAXIMIZED_HORIZ);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
}
