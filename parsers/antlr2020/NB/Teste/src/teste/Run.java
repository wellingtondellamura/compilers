/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.awt.HeadlessException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import teste.parser.TesteLexer;
import teste.parser.TesteParser;

/**
 *
 * @author wellington
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CharStream input = new ANTLRInputStream("2+2*(8++8)\n");
        TesteLexer lexer = new TesteLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);
        TesteParser parser = new TesteParser(tokens);
        TesteParser.LangContext lang = parser.lang();
        showParseTreeFrame(lang, parser);
    }
    
    
    private static void showParseTreeFrame(ParseTree tree, TesteParser parser) throws HeadlessException {
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
