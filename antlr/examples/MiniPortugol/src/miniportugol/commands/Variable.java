/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniportugol.commands;

/**
 *
 * @author wellington
 */
public class Variable {

    protected Variable(Type type, String name, Object value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }


    
    public enum Type {
        INT, DOUBLE, STRING
    }

    public Type type;
    public String name;
    public Object value;

    public void set(Object value) {
        this.value = value;
    }

    public Object get() {
        return this.value;
    }

    public static Variable getVariable(String name, Type type){
        return new Variable(type, name, null);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
    
    
}
