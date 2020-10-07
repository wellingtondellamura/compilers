grammar MiniLang;

@header {
package parser;
}


//----- PARSER -------------------------------------
prog    : stmt+
        ;
stmt    : ( atr | print | read ) EOL
        | ifstmt
        ;
print   : PRINT expr
        | PRINT STRING
        ;
read    : READ '('VAR')'
        ;
atr     : VAR '=' expr
        ;
expr    returns [double result]
        : VAR '+' expr            #exprVarPlus
        | NUM '+' expr            #exprNumPlus
        | NUM                     #exprNum
        | VAR                     #exprVar
        ;           // fazer operações matemáticas com precedência e parentização
ifstmt  : IF '(' cond ')' block                #ifStmt
        | IF '(' cond ')' block ELSE block     #ifElseStmt
        ;
cond    : expr
        ;           //expressões relativas > < >= <= != lógicas && || !
                    //((x && y) || (z && a))
block   : stmt
        | '{' stmt+ '}'
        ;
//----- LEXER -------------------------------------
//dúvidas: https://regexr.com/
NUM     : [0-9]+ ;
IF      : 'if';
ELSE    : 'else';
PRINT   : 'print';
READ    : 'read';
STRING  : '"'(~["\\\r\n])*'"';
VAR     : [a-zA-Z]+;
SUM     : '+';
EQUALS  : '=';
B_EXPR  : '(';
E_EXPR  : ')';
B_BLOCK : '{';
E_BLOCK : '}';
EOL     : ';';
WS      : [ \t\n] -> skip;