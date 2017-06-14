/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniportugol.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author wellington
 */
public class ComposedStmt implements Statement{

    private List<Statement> statements;

    public ComposedStmt() {
        statements = new ArrayList<Statement>();
    }

    public int size() {
        return statements.size();
    }

    public boolean isEmpty() {
        return statements.isEmpty();
    }

    public boolean add(Statement e) {
        return statements.add(e);
    }

    public boolean remove(Object o) {
        return statements.remove(o);
    }

    public boolean addAll(Collection<? extends Statement> c) {
        return statements.addAll(c);
    }

    public void clear() {
        statements.clear();
    }
    
    @Override
    public void run() {        
        statements.forEach(s -> s.run());
    }
    
    
}
