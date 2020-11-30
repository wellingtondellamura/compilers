/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdt;

/**
 *
 * @author wellington
 */
public class Symbol<T> {
    private Type type;
    private T value;

    public Symbol(Type type, T value) {
        this.type = type;
        this.value = value;
    }

    public Symbol() {
    }
    
    

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    
    
    
}

