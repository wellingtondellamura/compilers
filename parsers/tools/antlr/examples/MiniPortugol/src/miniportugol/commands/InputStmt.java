/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniportugol.commands;

import java.util.Scanner;

/**
 *
 * @author wellington
 */
public class InputStmt implements Statement {

    private Variable variable;

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public InputStmt(Variable variable) {
        this.variable = variable;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        switch (variable.type) {
            case DOUBLE:
                variable.set(Double.parseDouble(line));
                break;
            case INT:
                variable.set(Integer.parseInt(line));
                break;
            case STRING:
                variable.set(line);
                break;
        }
    }

}
