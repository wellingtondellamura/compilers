# Generated from Teste.g4 by ANTLR 4.8
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b")
        buf.write("+\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3")
        buf.write("\3\3\3\3\3\3\3\3\7\3\24\n\3\f\3\16\3\27\13\3\3\4\3\4\3")
        buf.write("\4\3\4\3\4\3\4\7\4\37\n\4\f\4\16\4\"\13\4\3\5\3\5\3\5")
        buf.write("\3\5\3\5\5\5)\n\5\3\5\2\4\4\6\6\2\4\6\b\2\2\2)\2\n\3\2")
        buf.write("\2\2\4\r\3\2\2\2\6\30\3\2\2\2\b(\3\2\2\2\n\13\5\4\3\2")
        buf.write("\13\f\7\4\2\2\f\3\3\2\2\2\r\16\b\3\1\2\16\17\5\6\4\2\17")
        buf.write("\25\3\2\2\2\20\21\f\4\2\2\21\22\7\5\2\2\22\24\5\6\4\2")
        buf.write("\23\20\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2")
        buf.write("\2\26\5\3\2\2\2\27\25\3\2\2\2\30\31\b\4\1\2\31\32\5\b")
        buf.write("\5\2\32 \3\2\2\2\33\34\f\4\2\2\34\35\7\6\2\2\35\37\5\b")
        buf.write("\5\2\36\33\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2")
        buf.write("!\7\3\2\2\2\" \3\2\2\2#$\7\7\2\2$%\5\4\3\2%&\7\b\2\2&")
        buf.write(")\3\2\2\2\')\7\3\2\2(#\3\2\2\2(\'\3\2\2\2)\t\3\2\2\2\5")
        buf.write("\25 (")
        return buf.getvalue()


class TesteParser ( Parser ):

    grammarFileName = "Teste.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "'\n'", "'+'", "'*'", "'('", 
                     "')'" ]

    symbolicNames = [ "<INVALID>", "DIGIT", "EOL", "ADD", "MULT", "OPEN", 
                      "CLOSE" ]

    RULE_lang = 0
    RULE_expr = 1
    RULE_term = 2
    RULE_factor = 3

    ruleNames =  [ "lang", "expr", "term", "factor" ]

    EOF = Token.EOF
    DIGIT=1
    EOL=2
    ADD=3
    MULT=4
    OPEN=5
    CLOSE=6

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class LangContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(TesteParser.ExprContext,0)


        def EOL(self):
            return self.getToken(TesteParser.EOL, 0)

        def getRuleIndex(self):
            return TesteParser.RULE_lang

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLang" ):
                listener.enterLang(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLang" ):
                listener.exitLang(self)




    def lang(self):

        localctx = TesteParser.LangContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_lang)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 8
            self.expr(0)
            self.state = 9
            self.match(TesteParser.EOL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def term(self):
            return self.getTypedRuleContext(TesteParser.TermContext,0)


        def expr(self):
            return self.getTypedRuleContext(TesteParser.ExprContext,0)


        def ADD(self):
            return self.getToken(TesteParser.ADD, 0)

        def getRuleIndex(self):
            return TesteParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = TesteParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 2
        self.enterRecursionRule(localctx, 2, self.RULE_expr, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 12
            self.term(0)
            self._ctx.stop = self._input.LT(-1)
            self.state = 19
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,0,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = TesteParser.ExprContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                    self.state = 14
                    if not self.precpred(self._ctx, 2):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                    self.state = 15
                    self.match(TesteParser.ADD)
                    self.state = 16
                    self.term(0) 
                self.state = 21
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,0,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class TermContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def factor(self):
            return self.getTypedRuleContext(TesteParser.FactorContext,0)


        def term(self):
            return self.getTypedRuleContext(TesteParser.TermContext,0)


        def MULT(self):
            return self.getToken(TesteParser.MULT, 0)

        def getRuleIndex(self):
            return TesteParser.RULE_term

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTerm" ):
                listener.enterTerm(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTerm" ):
                listener.exitTerm(self)



    def term(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = TesteParser.TermContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 4
        self.enterRecursionRule(localctx, 4, self.RULE_term, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 23
            self.factor()
            self._ctx.stop = self._input.LT(-1)
            self.state = 30
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,1,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = TesteParser.TermContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_term)
                    self.state = 25
                    if not self.precpred(self._ctx, 2):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                    self.state = 26
                    self.match(TesteParser.MULT)
                    self.state = 27
                    self.factor() 
                self.state = 32
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,1,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class FactorContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPEN(self):
            return self.getToken(TesteParser.OPEN, 0)

        def expr(self):
            return self.getTypedRuleContext(TesteParser.ExprContext,0)


        def CLOSE(self):
            return self.getToken(TesteParser.CLOSE, 0)

        def DIGIT(self):
            return self.getToken(TesteParser.DIGIT, 0)

        def getRuleIndex(self):
            return TesteParser.RULE_factor

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFactor" ):
                listener.enterFactor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFactor" ):
                listener.exitFactor(self)




    def factor(self):

        localctx = TesteParser.FactorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_factor)
        try:
            self.state = 38
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [TesteParser.OPEN]:
                self.enterOuterAlt(localctx, 1)
                self.state = 33
                self.match(TesteParser.OPEN)
                self.state = 34
                self.expr(0)
                self.state = 35
                self.match(TesteParser.CLOSE)
                pass
            elif token in [TesteParser.DIGIT]:
                self.enterOuterAlt(localctx, 2)
                self.state = 37
                self.match(TesteParser.DIGIT)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[1] = self.expr_sempred
        self._predicates[2] = self.term_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 2)
         

    def term_sempred(self, localctx:TermContext, predIndex:int):
            if predIndex == 1:
                return self.precpred(self._ctx, 2)
         




