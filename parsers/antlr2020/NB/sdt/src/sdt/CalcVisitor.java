/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdt;

import sdt.parser.InterpreterBaseVisitor;
import sdt.parser.InterpreterParser;

/**
 *
 * @author wellington
 */
public class CalcVisitor extends InterpreterBaseVisitor<Integer> {

    @Override
    public Integer visitFactVar(InterpreterParser.FactVarContext ctx) {
        return super.visitFactVar(ctx);
    }

    @Override
    public Integer visitFactDigit(InterpreterParser.FactDigitContext ctx) {
        String dig = ctx.DIGIT().getText();
        ctx.val = Integer.parseInt(dig);
        return Integer.parseInt(dig);
    }

    @Override
    public Integer visitTermMult(InterpreterParser.TermMultContext ctx) {
        Integer term = visit(ctx.term1);
        Integer fact = visit(ctx.fact());
        return term * fact;
    }

    @Override
    public Integer visitTermFact(InterpreterParser.TermFactContext ctx) {
        return visit(ctx.fact());
    }

}
