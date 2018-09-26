grammar Prog;

@header{
package parser;
}

@members{
    
}

prog : (cmd EOL)+
     ;

cmd  : atrib            #cmdAtrib
     | write            #cmdWrite
     | read             #cmdRead
     | expr             #cmdExpr
     | ifstm            #cmdIf
     ;
atrib: VAR '=' expr           
     ; 
write: WRITE expr       #writeExpr      
     | WRITE STR        #writeStr
     ;
read : READ VAR               
     ;
expr returns [Double value]
     : e1=expr '+' e2=expr    #exprPlus
     | e1=expr '-' e2=expr    #exprMin
     | term                   #exprTerm
     ;

term returns [Double value]
     : t1=term '*' t2=term    #termMult
     | t1=term '/' t2=term    #termDiv
     | fact                   #termFact
     ;
fact returns [Double value]
     : NUM                    #factNum
     | VAR                    #factVar
     | '(' expr ')'           #factExpr
     ;

ifstm: IF cond THEN block                       #ifStm
     | IF cond THEN b1=block ELSE b2=block      #ifStmElse
     ;

cond returns [Boolean value]
     : expr                   #condExpr 
     | expr RELOP expr         #confRelop
     ;

block: cmd                    #blockSingle
     | BEGIN (cmd EOL)+ END   #blockCompose
     ;

RELOP   : '>'|'<'|'>='|'<='|'=='|'!=';
IF      : [iI][fF];
THEN    : [tT][hH][eE][nN];
ELSE    : [eE][lL][sS][eE];
END     : [eE][nN][dD];
BEGIN   : [bB][eE][gG][iI][nN];
STR     : '"'[a-zA-Z0-9\t ]*'"';
READ    : [rR][eE][aA][dD];
WRITE   : [wW][rR][iI][tT][eE];
VAR     : [_a-zA-Z][_a-zA-Z0-9]*;
MULT    : '*';
SUM     : '+';
MIN     : '-';
DIV     : '/';
OPEN    : '(';
CLOSE   : ')';
EOL     : ';' ;
NUM     : [0-9]+ ('.'[0-9]+)?;
WS      : [ \t\r\n]+ -> skip;