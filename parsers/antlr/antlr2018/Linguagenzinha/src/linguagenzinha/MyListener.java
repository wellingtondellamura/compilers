/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linguagenzinha;

import parser.MiniLangBaseListener;
import parser.MiniLangParser;

/**
 *
 * @author wellington
 */
public class MyListener extends MiniLangBaseListener{

    @Override
    public void enterAtr(MiniLangParser.AtrContext ctx) {
        System.out.println("enterAtr");
    }

    @Override
    public void exitAtr(MiniLangParser.AtrContext ctx) {
        System.out.println("exitAtr");
    }
    
    
    
}
