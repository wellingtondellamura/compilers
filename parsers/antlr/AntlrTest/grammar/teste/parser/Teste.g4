/******************************************************
 * A multi-line Javadoc-like comment about my grammar *
 ******************************************************/
grammar Teste;

@header{
package teste.parser;
}

// Monoline comment about a parser rule
myStartingRule : stat+ ;

/* 
 A multi-line Java-like comment
 */
stat: expr NEWLINE
    | ID '=' expr NEWLINE
    | NEWLINE
    ;

expr:
    expr ('*'|'/') expr
    | expr ('+'|'-') expr
    | INT
    | ID
    | '(' expr ')'
    ;

// some lexer rules
ID : [a-zA-Z]+ ; // match identifiers
INT : [0-9]+ ; // match integers
NEWLINE:'\r'? '\n' ; // return newlines to parser
