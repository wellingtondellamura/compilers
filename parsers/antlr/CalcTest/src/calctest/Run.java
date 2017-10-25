package calctest;
import calctest.parser.CalcLexer;
import calctest.parser.CalcParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.TokenStream;

public class Run {

    public static void main(String[] args) {
        //define a entrada
        ANTLRInputStream input = new ANTLRInputStream("10+10");
        //instancia o lexer
        CalcLexer lexer = new CalcLexer(input);
        //instancia o buffer de tokens (nextToken)
        TokenStream stream = new BufferedTokenStream(lexer);
        //instancia o parser
        CalcParser parser = new CalcParser(stream);
        //realiza a análise
        CalcParser.CalcContext calc = parser.calc();   
        
        System.out.println(calc.value);
    }
}