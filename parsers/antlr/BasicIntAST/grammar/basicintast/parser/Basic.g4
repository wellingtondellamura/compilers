/******************************************************
 * A multi-line Javadoc-like comment about my grammar *
 ******************************************************/
grammar Basic;

@header{
package basicintast.parser;
import basicintast.util.*;
}

program : (stmt)+               #programStmt
        ;

stmt    : print EOL             #stmtPrint
        | read  EOL             #stmtRead
        | attr  EOL             #stmtAttr
        | expr  EOL             #stmtExpr
        | cond                  #stmtCond
        ;

cond    : IF '('condExpr')' b1=block                   #ifStmt
        | IF '('condExpr')' b1=block ELSE b2=block     #ifElseStmt 
        ;

condExpr: expr                                              #condExpresion
        | expr relop=('>'|'<'|'=='|'>='|'<='|'!=') expr     #condRelOp
        ;

block   : '{' program '}'   #blockStmt
        ;

print   : PRINT STR         #printStr
        | PRINT expr        #printExpr
        ;

read    : READ VAR          #readVar
        ;

attr    : VAR '=' expr      #attrExpr
        ;

expr    : expr1 '+' expr    #exprPlus
        | expr1 '-' expr    #exprMinus
        | expr1             #expr1Empty
        ;

expr1   : expr2 '*' expr    #expr1Mult
        | expr2 '/' expr    #expr1Div
        | expr2             #expr2Empty
        ;

expr2   : '(' expr ')'      #expr2Par
        | NUM               #expr2Num
        | VAR               #expr2Var
        ;

//TOKENS
IF      : 'if';
ELSE    : 'else';
GT      : '>' ;
LT      : '<' ;
EQ      : '==';
GE      : '>=';
LE      : '<=';
NE      : '!=';
PLUS    : '+' ;
MINUS   : '-' ;
MULT    : '*' ;
DIV     : '/' ;
OPEN    : '(' ;
CLOSE   : ')' ;
OPEN_BL : '{' ;
CLOSE_BL: '}' ;
IS      : '=' ;
EOL     : ';' ;
PRINT   : 'print' ;
READ    : 'read' ;
NUM     : [0-9]+ ;
VAR     : [a-zA-Z][a-zA-Z0-9_]*;
STR     : '"' ('\\' ["\\] | ~["\\\r\n])* '"';
WS      : [\n\r \t]+ -> skip;