/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import java.util.HashMap;
import java.util.Map;

/**
 * Esta classe implementa a tabela de simbolos e utiliza o padrão de projetos
 * Singleton.
 *
 * @author wellington
 */
public class SymbolTable {

    //<editor-fold defaultstate="collapsed" desc="SINGLETON">
    private static SymbolTable instance;

    public static SymbolTable getInstance() {
        if (instance == null) {
            instance = new SymbolTable();
        }
        return instance;
    }
    //</editor-fold>

    protected HashMap<String, Double> memory;

    private SymbolTable() {
        memory = new HashMap<>();
    }

    public void addSymbol(String token, Double value) {
        memory.put(token, value);
    }
    
    public Double getSymbol(String token) {
        return memory.get(token);
    }

    public String dumpTable(){
      StringBuilder sb = new StringBuilder();
      sb.append("---Symbols---\n");
      for (Map.Entry<String, Double> e : memory.entrySet()){
          sb.append(String.format(" %s -> %f \n", e.getKey(), e.getValue()));
      }
      sb.append("-------------\n");
      return sb.toString();
      
    }
    
}
