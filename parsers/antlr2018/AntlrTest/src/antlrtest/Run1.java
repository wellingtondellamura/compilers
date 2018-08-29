/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antlrtest;

import java.awt.HeadlessException;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.ExprParser;
import parser.ProgLexer;
import parser.ProgParser;

/**
 *
 * @author wellington
 */
public class Run1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        CharStream stream = new ANTLRFileStream("test.src");
        
        ProgLexer lexer = new ProgLexer(stream);            //Lexer
        
        TokenStream tokens = new CommonTokenStream(lexer);  //nextToken 
        
        ProgParser parser = new ProgParser(tokens);         //Parser
        
        ProgParser.ProgContext prog = parser.prog();        //Exec Parser prog
        
        showParseTreeFrame(prog, parser);
    }
    
    
     private static void showParseTreeFrame(ParseTree tree, ProgParser parser) throws HeadlessException {
        JFrame frame = new JFrame("SRC: " + tree.getText());
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()), tree);
        viewr.setScale(2);
        panel.add(viewr);
        frame.add(panel);
        frame.setSize(1000, 600);
        frame.setState(JFrame.MAXIMIZED_HORIZ);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
