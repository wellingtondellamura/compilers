/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.parser;

import java.util.Objects;

/**
 *
 * @author wellington
 */
public class Symbol {

    //<editor-fold defaultstate="collapsed" desc="propriedades">  
        public String getLexem() {
            return lexem;
        }

        public void setLexem(String lexem) {
            this.lexem = lexem;
        }

        public Token getToken() {
            return token;
        }

        public void setToken(Token token) {
            this.token = token;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    //</editor-fold>
        
    public enum Token{
        INT, FLOAT
    }
        
    private String lexem;
    private Token token;
    private Object value;

    public Symbol() {
    }

    public Symbol(String lexem, Token token, Object value) {
        this.lexem = lexem;
        this.token = token;
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.lexem);
        hash = 41 * hash + Objects.hashCode(this.token);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Symbol other = (Symbol) obj;
        if (!Objects.equals(this.lexem, other.lexem)) {
            return false;
        }
        if (this.token != other.token) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Symbol{" + "lexem=" + lexem + ", token=" + token + ", value=" + value + '}';
    }
    
    
}
