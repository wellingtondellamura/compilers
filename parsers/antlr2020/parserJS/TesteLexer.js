// Generated from Teste.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');



var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u0002\b\u001e\b\u0001\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004",
    "\u0004\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t",
    "\u0007\u0003\u0002\u0006\u0002\u0011\n\u0002\r\u0002\u000e\u0002\u0012",
    "\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005",
    "\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0002\u0002\b\u0003",
    "\u0003\u0005\u0004\u0007\u0005\t\u0006\u000b\u0007\r\b\u0003\u0002\u0003",
    "\u0003\u00022;\u0002\u001e\u0002\u0003\u0003\u0002\u0002\u0002\u0002",
    "\u0005\u0003\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0002",
    "\t\u0003\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002\u0002\u0002",
    "\r\u0003\u0002\u0002\u0002\u0003\u0010\u0003\u0002\u0002\u0002\u0005",
    "\u0014\u0003\u0002\u0002\u0002\u0007\u0016\u0003\u0002\u0002\u0002\t",
    "\u0018\u0003\u0002\u0002\u0002\u000b\u001a\u0003\u0002\u0002\u0002\r",
    "\u001c\u0003\u0002\u0002\u0002\u000f\u0011\t\u0002\u0002\u0002\u0010",
    "\u000f\u0003\u0002\u0002\u0002\u0011\u0012\u0003\u0002\u0002\u0002\u0012",
    "\u0010\u0003\u0002\u0002\u0002\u0012\u0013\u0003\u0002\u0002\u0002\u0013",
    "\u0004\u0003\u0002\u0002\u0002\u0014\u0015\u0007\f\u0002\u0002\u0015",
    "\u0006\u0003\u0002\u0002\u0002\u0016\u0017\u0007-\u0002\u0002\u0017",
    "\b\u0003\u0002\u0002\u0002\u0018\u0019\u0007,\u0002\u0002\u0019\n\u0003",
    "\u0002\u0002\u0002\u001a\u001b\u0007*\u0002\u0002\u001b\f\u0003\u0002",
    "\u0002\u0002\u001c\u001d\u0007+\u0002\u0002\u001d\u000e\u0003\u0002",
    "\u0002\u0002\u0004\u0002\u0012\u0002"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

function TesteLexer(input) {
	antlr4.Lexer.call(this, input);
    this._interp = new antlr4.atn.LexerATNSimulator(this, atn, decisionsToDFA, new antlr4.PredictionContextCache());
    return this;
}

TesteLexer.prototype = Object.create(antlr4.Lexer.prototype);
TesteLexer.prototype.constructor = TesteLexer;

Object.defineProperty(TesteLexer.prototype, "atn", {
        get : function() {
                return atn;
        }
});

TesteLexer.EOF = antlr4.Token.EOF;
TesteLexer.DIGIT = 1;
TesteLexer.EOL = 2;
TesteLexer.ADD = 3;
TesteLexer.MULT = 4;
TesteLexer.OPEN = 5;
TesteLexer.CLOSE = 6;

TesteLexer.prototype.channelNames = [ "DEFAULT_TOKEN_CHANNEL", "HIDDEN" ];

TesteLexer.prototype.modeNames = [ "DEFAULT_MODE" ];

TesteLexer.prototype.literalNames = [ null, null, "'\n'", "'+'", "'*'", 
                                      "'('", "')'" ];

TesteLexer.prototype.symbolicNames = [ null, "DIGIT", "EOL", "ADD", "MULT", 
                                       "OPEN", "CLOSE" ];

TesteLexer.prototype.ruleNames = [ "DIGIT", "EOL", "ADD", "MULT", "OPEN", 
                                   "CLOSE" ];

TesteLexer.prototype.grammarFileName = "Teste.g4";


exports.TesteLexer = TesteLexer;

