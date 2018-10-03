/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linguagenzinha;

import java.awt.HeadlessException;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.MiniLangBaseListener;
import parser.MiniLangLexer;
import parser.MiniLangParser;

/**
 *
 * @author wellington
 */
public class Run {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String filename = "teste.src";
        //LEXER
        CharStream charInput = new ANTLRFileStream(filename);
        MiniLangLexer lexer = new MiniLangLexer(charInput);
        //----
        TokenStream input = new BufferedTokenStream(lexer);
        //----
        //PARSER
        MiniLangParser parser = new MiniLangParser(input);
        MyListener listener = new MyListener();
        parser.addParseListener(listener);
        //----
        MiniLangParser.ProgContext prog = parser.prog();
        showParseTreeFrame(prog, parser);
    }

    private static void showParseTreeFrame(ParseTree tree, MiniLangParser parser) throws HeadlessException {
        JFrame frame = new JFrame("SRC: " + tree.getText());
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()), tree);
        viewr.setScale(1);
        panel.add(viewr);
        frame.add(panel);
        frame.setSize(1000, 600);
        frame.setState(JFrame.MAXIMIZED_HORIZ);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
