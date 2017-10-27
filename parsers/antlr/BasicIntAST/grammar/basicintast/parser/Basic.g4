/******************************************************
 * A multi-line Javadoc-like comment about my grammar *
 ******************************************************/
grammar Basic;

@header{
package basicintast.parser;

import basicintast.util.*;
}

program : (stmt EOL)+       #programStmt
        ;

stmt    : print     #stmtPrint
        | read      #stmtRead
        | attr      #stmtAttr
        | expr      #stmtExpr
        ;

print   : PRINT STR     #printStr
        | PRINT expr    #printExpr
        ;

read    : READ VAR      #readVar
        ;

attr    : VAR '=' expr  #attrExpr
        ;

expr    returns [Double value]
        : expr1 '+' expr        #exprPlus
        | expr1 '-' expr        #exprMinus
        | expr1                 #expr1
        ;

expr1   returns [Double value]
        : expr2 '*' expr        #expr1Mult
        | expr2 '/' expr        #expr1Div
        | expr2                 #expr2
        ;

expr2   returns [Double value]
        : '(' expr ')'          #expr2Par
        | NUM                   #expr2Num
        | VAR                   #expr2Var
        ;

//TOKENS
PLUS    : '+' ;
MINUS   : '-' ;
MULT    : '*' ;
DIV     : '/' ;
OPEN    : '(' ;
CLOSE   : ')' ;
EQ      : '=' ;
EOL     : ';' ;
PRINT   : 'print' ;
READ    : 'read' ;
NUM     : [0-9]+ ;
VAR     : [a-zA-Z][a-zA-Z0-9_]*;
STR     : '"'[a-zA-Z0-9\t ]*'"';
WS      : [\n\r \t]+ -> skip;