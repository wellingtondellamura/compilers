// Generated from Teste.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete listener for a parse tree produced by TesteParser.
function TesteListener() {
	antlr4.tree.ParseTreeListener.call(this);
	return this;
}

TesteListener.prototype = Object.create(antlr4.tree.ParseTreeListener.prototype);
TesteListener.prototype.constructor = TesteListener;

// Enter a parse tree produced by TesteParser#lang.
TesteListener.prototype.enterLang = function(ctx) {
};

// Exit a parse tree produced by TesteParser#lang.
TesteListener.prototype.exitLang = function(ctx) {
};


// Enter a parse tree produced by TesteParser#expr.
TesteListener.prototype.enterExpr = function(ctx) {
};

// Exit a parse tree produced by TesteParser#expr.
TesteListener.prototype.exitExpr = function(ctx) {
};


// Enter a parse tree produced by TesteParser#term.
TesteListener.prototype.enterTerm = function(ctx) {
};

// Exit a parse tree produced by TesteParser#term.
TesteListener.prototype.exitTerm = function(ctx) {
};


// Enter a parse tree produced by TesteParser#factor.
TesteListener.prototype.enterFactor = function(ctx) {
};

// Exit a parse tree produced by TesteParser#factor.
TesteListener.prototype.exitFactor = function(ctx) {
};



exports.TesteListener = TesteListener;