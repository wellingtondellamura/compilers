// Generated from Teste.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');
var TesteListener = require('./TesteListener').TesteListener;
var grammarFileName = "Teste.g4";


var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u0003\b+\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t\u0004",
    "\u0004\u0005\t\u0005\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0003",
    "\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0007\u0003",
    "\u0014\n\u0003\f\u0003\u000e\u0003\u0017\u000b\u0003\u0003\u0004\u0003",
    "\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0007\u0004\u001f",
    "\n\u0004\f\u0004\u000e\u0004\"\u000b\u0004\u0003\u0005\u0003\u0005\u0003",
    "\u0005\u0003\u0005\u0003\u0005\u0005\u0005)\n\u0005\u0003\u0005\u0002",
    "\u0004\u0004\u0006\u0006\u0002\u0004\u0006\b\u0002\u0002\u0002)\u0002",
    "\n\u0003\u0002\u0002\u0002\u0004\r\u0003\u0002\u0002\u0002\u0006\u0018",
    "\u0003\u0002\u0002\u0002\b(\u0003\u0002\u0002\u0002\n\u000b\u0005\u0004",
    "\u0003\u0002\u000b\f\u0007\u0004\u0002\u0002\f\u0003\u0003\u0002\u0002",
    "\u0002\r\u000e\b\u0003\u0001\u0002\u000e\u000f\u0005\u0006\u0004\u0002",
    "\u000f\u0015\u0003\u0002\u0002\u0002\u0010\u0011\f\u0004\u0002\u0002",
    "\u0011\u0012\u0007\u0005\u0002\u0002\u0012\u0014\u0005\u0006\u0004\u0002",
    "\u0013\u0010\u0003\u0002\u0002\u0002\u0014\u0017\u0003\u0002\u0002\u0002",
    "\u0015\u0013\u0003\u0002\u0002\u0002\u0015\u0016\u0003\u0002\u0002\u0002",
    "\u0016\u0005\u0003\u0002\u0002\u0002\u0017\u0015\u0003\u0002\u0002\u0002",
    "\u0018\u0019\b\u0004\u0001\u0002\u0019\u001a\u0005\b\u0005\u0002\u001a",
    " \u0003\u0002\u0002\u0002\u001b\u001c\f\u0004\u0002\u0002\u001c\u001d",
    "\u0007\u0006\u0002\u0002\u001d\u001f\u0005\b\u0005\u0002\u001e\u001b",
    "\u0003\u0002\u0002\u0002\u001f\"\u0003\u0002\u0002\u0002 \u001e\u0003",
    "\u0002\u0002\u0002 !\u0003\u0002\u0002\u0002!\u0007\u0003\u0002\u0002",
    "\u0002\" \u0003\u0002\u0002\u0002#$\u0007\u0007\u0002\u0002$%\u0005",
    "\u0004\u0003\u0002%&\u0007\b\u0002\u0002&)\u0003\u0002\u0002\u0002\'",
    ")\u0007\u0003\u0002\u0002(#\u0003\u0002\u0002\u0002(\'\u0003\u0002\u0002",
    "\u0002)\t\u0003\u0002\u0002\u0002\u0005\u0015 ("].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, null, "'\n'", "'+'", "'*'", "'('", "')'" ];

var symbolicNames = [ null, "DIGIT", "EOL", "ADD", "MULT", "OPEN", "CLOSE" ];

var ruleNames =  [ "lang", "expr", "term", "factor" ];

function TesteParser (input) {
	antlr4.Parser.call(this, input);
    this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = ruleNames;
    this.literalNames = literalNames;
    this.symbolicNames = symbolicNames;
    return this;
}

TesteParser.prototype = Object.create(antlr4.Parser.prototype);
TesteParser.prototype.constructor = TesteParser;

Object.defineProperty(TesteParser.prototype, "atn", {
	get : function() {
		return atn;
	}
});

TesteParser.EOF = antlr4.Token.EOF;
TesteParser.DIGIT = 1;
TesteParser.EOL = 2;
TesteParser.ADD = 3;
TesteParser.MULT = 4;
TesteParser.OPEN = 5;
TesteParser.CLOSE = 6;

TesteParser.RULE_lang = 0;
TesteParser.RULE_expr = 1;
TesteParser.RULE_term = 2;
TesteParser.RULE_factor = 3;


function LangContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TesteParser.RULE_lang;
    return this;
}

LangContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
LangContext.prototype.constructor = LangContext;

LangContext.prototype.expr = function() {
    return this.getTypedRuleContext(ExprContext,0);
};

LangContext.prototype.EOL = function() {
    return this.getToken(TesteParser.EOL, 0);
};

LangContext.prototype.enterRule = function(listener) {
    if(listener instanceof TesteListener ) {
        listener.enterLang(this);
	}
};

LangContext.prototype.exitRule = function(listener) {
    if(listener instanceof TesteListener ) {
        listener.exitLang(this);
	}
};




TesteParser.LangContext = LangContext;

TesteParser.prototype.lang = function() {

    var localctx = new LangContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, TesteParser.RULE_lang);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 8;
        this.expr(0);
        this.state = 9;
        this.match(TesteParser.EOL);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function ExprContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TesteParser.RULE_expr;
    return this;
}

ExprContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ExprContext.prototype.constructor = ExprContext;

ExprContext.prototype.term = function() {
    return this.getTypedRuleContext(TermContext,0);
};

ExprContext.prototype.expr = function() {
    return this.getTypedRuleContext(ExprContext,0);
};

ExprContext.prototype.ADD = function() {
    return this.getToken(TesteParser.ADD, 0);
};

ExprContext.prototype.enterRule = function(listener) {
    if(listener instanceof TesteListener ) {
        listener.enterExpr(this);
	}
};

ExprContext.prototype.exitRule = function(listener) {
    if(listener instanceof TesteListener ) {
        listener.exitExpr(this);
	}
};



TesteParser.prototype.expr = function(_p) {
	if(_p===undefined) {
	    _p = 0;
	}
    var _parentctx = this._ctx;
    var _parentState = this.state;
    var localctx = new ExprContext(this, this._ctx, _parentState);
    var _prevctx = localctx;
    var _startState = 2;
    this.enterRecursionRule(localctx, 2, TesteParser.RULE_expr, _p);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 12;
        this.term(0);
        this._ctx.stop = this._input.LT(-1);
        this.state = 19;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,0,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                if(this._parseListeners!==null) {
                    this.triggerExitRuleEvent();
                }
                _prevctx = localctx;
                localctx = new ExprContext(this, _parentctx, _parentState);
                this.pushNewRecursionContext(localctx, _startState, TesteParser.RULE_expr);
                this.state = 14;
                if (!( this.precpred(this._ctx, 2))) {
                    throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 2)");
                }
                this.state = 15;
                this.match(TesteParser.ADD);
                this.state = 16;
                this.term(0); 
            }
            this.state = 21;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,0,this._ctx);
        }

    } catch( error) {
        if(error instanceof antlr4.error.RecognitionException) {
	        localctx.exception = error;
	        this._errHandler.reportError(this, error);
	        this._errHandler.recover(this, error);
	    } else {
	    	throw error;
	    }
    } finally {
        this.unrollRecursionContexts(_parentctx)
    }
    return localctx;
};


function TermContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TesteParser.RULE_term;
    return this;
}

TermContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
TermContext.prototype.constructor = TermContext;

TermContext.prototype.factor = function() {
    return this.getTypedRuleContext(FactorContext,0);
};

TermContext.prototype.term = function() {
    return this.getTypedRuleContext(TermContext,0);
};

TermContext.prototype.MULT = function() {
    return this.getToken(TesteParser.MULT, 0);
};

TermContext.prototype.enterRule = function(listener) {
    if(listener instanceof TesteListener ) {
        listener.enterTerm(this);
	}
};

TermContext.prototype.exitRule = function(listener) {
    if(listener instanceof TesteListener ) {
        listener.exitTerm(this);
	}
};



TesteParser.prototype.term = function(_p) {
	if(_p===undefined) {
	    _p = 0;
	}
    var _parentctx = this._ctx;
    var _parentState = this.state;
    var localctx = new TermContext(this, this._ctx, _parentState);
    var _prevctx = localctx;
    var _startState = 4;
    this.enterRecursionRule(localctx, 4, TesteParser.RULE_term, _p);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 23;
        this.factor();
        this._ctx.stop = this._input.LT(-1);
        this.state = 30;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,1,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                if(this._parseListeners!==null) {
                    this.triggerExitRuleEvent();
                }
                _prevctx = localctx;
                localctx = new TermContext(this, _parentctx, _parentState);
                this.pushNewRecursionContext(localctx, _startState, TesteParser.RULE_term);
                this.state = 25;
                if (!( this.precpred(this._ctx, 2))) {
                    throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 2)");
                }
                this.state = 26;
                this.match(TesteParser.MULT);
                this.state = 27;
                this.factor(); 
            }
            this.state = 32;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,1,this._ctx);
        }

    } catch( error) {
        if(error instanceof antlr4.error.RecognitionException) {
	        localctx.exception = error;
	        this._errHandler.reportError(this, error);
	        this._errHandler.recover(this, error);
	    } else {
	    	throw error;
	    }
    } finally {
        this.unrollRecursionContexts(_parentctx)
    }
    return localctx;
};


function FactorContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = TesteParser.RULE_factor;
    return this;
}

FactorContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
FactorContext.prototype.constructor = FactorContext;

FactorContext.prototype.OPEN = function() {
    return this.getToken(TesteParser.OPEN, 0);
};

FactorContext.prototype.expr = function() {
    return this.getTypedRuleContext(ExprContext,0);
};

FactorContext.prototype.CLOSE = function() {
    return this.getToken(TesteParser.CLOSE, 0);
};

FactorContext.prototype.DIGIT = function() {
    return this.getToken(TesteParser.DIGIT, 0);
};

FactorContext.prototype.enterRule = function(listener) {
    if(listener instanceof TesteListener ) {
        listener.enterFactor(this);
	}
};

FactorContext.prototype.exitRule = function(listener) {
    if(listener instanceof TesteListener ) {
        listener.exitFactor(this);
	}
};




TesteParser.FactorContext = FactorContext;

TesteParser.prototype.factor = function() {

    var localctx = new FactorContext(this, this._ctx, this.state);
    this.enterRule(localctx, 6, TesteParser.RULE_factor);
    try {
        this.state = 38;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case TesteParser.OPEN:
            this.enterOuterAlt(localctx, 1);
            this.state = 33;
            this.match(TesteParser.OPEN);
            this.state = 34;
            this.expr(0);
            this.state = 35;
            this.match(TesteParser.CLOSE);
            break;
        case TesteParser.DIGIT:
            this.enterOuterAlt(localctx, 2);
            this.state = 37;
            this.match(TesteParser.DIGIT);
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


TesteParser.prototype.sempred = function(localctx, ruleIndex, predIndex) {
	switch(ruleIndex) {
	case 1:
			return this.expr_sempred(localctx, predIndex);
	case 2:
			return this.term_sempred(localctx, predIndex);
    default:
        throw "No predicate with index:" + ruleIndex;
   }
};

TesteParser.prototype.expr_sempred = function(localctx, predIndex) {
	switch(predIndex) {
		case 0:
			return this.precpred(this._ctx, 2);
		default:
			throw "No predicate with index:" + predIndex;
	}
};

TesteParser.prototype.term_sempred = function(localctx, predIndex) {
	switch(predIndex) {
		case 1:
			return this.precpred(this._ctx, 2);
		default:
			throw "No predicate with index:" + predIndex;
	}
};


exports.TesteParser = TesteParser;
