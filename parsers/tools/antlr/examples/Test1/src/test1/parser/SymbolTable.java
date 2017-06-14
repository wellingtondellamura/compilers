/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.parser;

import java.util.ArrayList;

/**
 *
 * @author wellington
 */
public class SymbolTable {
    private static SymbolTable instance;
    
    private ArrayList<Symbol> symbols;

    private SymbolTable() {
        symbols = new ArrayList<>();
    }
    
    public static SymbolTable getInstance(){
        if (instance == null)
            instance = new SymbolTable();
        return instance;
    }

    public boolean isEmpty() {
        return symbols.isEmpty();
    }

    public boolean add(Symbol e) {
        if (symbols.contains(e)){
            int i = symbols.indexOf(e);
            symbols.get(i).setValue(e.getValue());
            return true;
        }
        return symbols.add(e);
    }

    public ArrayList<Symbol> getSymbols() {
        return symbols;
    }
    
    
}
