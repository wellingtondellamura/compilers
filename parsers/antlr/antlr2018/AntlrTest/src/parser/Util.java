/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import java.util.Scanner;

/**
 * FACADE?
 * @author wellington
 */
public class Util {
    
    public static Boolean getBoolean(Double d){
        return !(d == null || d <= 0);
    }
    
    public static Double getValue(String symbol){
        Double v = SymbolTable.getInstance().getSymbol(symbol);
        if (v == null)
            error(String.format("variável %s não foi declarada", symbol));
        return v;
    }
    
    public static void atrib(String symbol, Double value){
        SymbolTable.getInstance().addSymbol(symbol, value);        
    }
    
    public static Double read() {
        try {
            return Double.parseDouble(new Scanner(System.in).nextLine());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static void readSymbol(String symbol) {
        Double d = read();
        if (d == null) {
            error("entrada invalida");
        } else {
            SymbolTable.getInstance().addSymbol(symbol, d);
        }
    }

    public static void error(String value) {
        //adicionar mensagem de erro mais detalhada
        System.err.println(value);
    }
    
    public static void print(String value) {
        System.out.println(value.substring(1, value.length() - 1));
    }

    public static void print(Double value) {
        System.out.println(value);
    }
}
