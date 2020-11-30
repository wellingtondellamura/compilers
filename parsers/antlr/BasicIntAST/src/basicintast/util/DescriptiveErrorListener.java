/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicintast.util;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 *
 * @author wellington
 */
public class DescriptiveErrorListener extends BaseErrorListener {
    public static DescriptiveErrorListener INSTANCE = new DescriptiveErrorListener();
    
    private Boolean error = false;

    public Boolean hasErrors() {
        return error;
    }
    
    
    
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e)
    {
        
        error = true;
        String sourceName = recognizer.getInputStream().getSourceName();

        String s = "none";
        if (offendingSymbol instanceof CommonToken){
          CommonToken ct = (CommonToken)offendingSymbol;
            s = ct.getText();
           
        } 
        
        
        
        System.err.println("Error in "+sourceName+" line:"+line+" char:"+charPositionInLine
                            +" unexpected symbol: "+s);
    }
}
