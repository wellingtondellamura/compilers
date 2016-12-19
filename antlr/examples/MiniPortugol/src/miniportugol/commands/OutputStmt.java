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
public class OutputStmt implements Statement {

    public Object object;
    public Boolean newLine;

    public Boolean getNewLine() {
        return newLine;
    }

    public Object getObject() {
        return object;
    }

    public void setNewLine(Boolean newLine) {
        this.newLine = newLine;
    }

    public void setObject(Object object) {
        this.object = object;
    }
    
    public OutputStmt() {
        this(null, true);
    }

    public OutputStmt(Object object) {
        this(object, true);
    }

    public OutputStmt(Object object, Boolean newLine) {
        this.object = object;
        this.newLine = newLine;
    }

    @Override
    public void run() {
        if (this != null) {
            System.out.print(object);
        }
        if (newLine) {
            System.out.println();
        }
    }

}
