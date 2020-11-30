grammar Interpreter;

@header {
package sdt.parser;
}

prog : (line EOL)+
     ;

line : expr                
     | atrib
     ;

atrib : VAR '=' expr           
     ;

expr returns [Integer val]
     : expr1=expr '+' term    #exprSum
     | term                   #exprTerm 
     ;
term returns [Integer val]
     : term1=term '*' fact    #termMult
     | fact                   #termFact  
     ;
fact returns [Integer val]
     : '(' expr ')'           #factExpr  
     | DIGIT                  #factDigit
     | VAR                    #factVar  
     ;

VAR   : [a-zA-Z]+;
DIGIT : [0-9]+;
SUM : '+';
MULT: '*';
OPEN: '(';
CLOSE: ')';
EOL  : '\n';
