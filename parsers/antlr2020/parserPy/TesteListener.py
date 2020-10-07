# Generated from Teste.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .TesteParser import TesteParser
else:
    from TesteParser import TesteParser

# This class defines a complete listener for a parse tree produced by TesteParser.
class TesteListener(ParseTreeListener):

    # Enter a parse tree produced by TesteParser#lang.
    def enterLang(self, ctx:TesteParser.LangContext):
        pass

    # Exit a parse tree produced by TesteParser#lang.
    def exitLang(self, ctx:TesteParser.LangContext):
        pass


    # Enter a parse tree produced by TesteParser#expr.
    def enterExpr(self, ctx:TesteParser.ExprContext):
        pass

    # Exit a parse tree produced by TesteParser#expr.
    def exitExpr(self, ctx:TesteParser.ExprContext):
        pass


    # Enter a parse tree produced by TesteParser#term.
    def enterTerm(self, ctx:TesteParser.TermContext):
        pass

    # Exit a parse tree produced by TesteParser#term.
    def exitTerm(self, ctx:TesteParser.TermContext):
        pass


    # Enter a parse tree produced by TesteParser#factor.
    def enterFactor(self, ctx:TesteParser.FactorContext):
        pass

    # Exit a parse tree produced by TesteParser#factor.
    def exitFactor(self, ctx:TesteParser.FactorContext):
        pass



del TesteParser