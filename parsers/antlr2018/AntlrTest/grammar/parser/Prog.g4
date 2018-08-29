grammar Prog;

@header{
package parser;
}

@members{

}

prog : cmd EOL prog
     | 
     ;

cmd  : atrib {System.out.println("a");}
     | write {System.out.println("w");} 
     | read  {System.out.println("r");}
     | expr  {System.out.println("e");}
     ;
atrib: VAR '=' expr
     ; 
write: WRITE expr
     ;
read : READ VAR
     ;
expr : expr '+' expr
     | expr '-' expr
     | fact
     ;

fact : fact '*' fact
     | fact '/' fact
     | fact2
     ;
fact2: NUM 
     | VAR 
     | '(' expr ')' 
     ;

READ    : [rR][eE][aA][dD];
WRITE   : [wW][rR][iI][tT][eE];
VAR     : [_a-zA-Z][_a-zA-Z0-9];
MULT    : '*';
SUM     : '+';
MIN     : '-';
DIV     : '/';
OPEN    : '(';
CLOSE   : ')';
EOL     : [\r\n]+ ;
NUM     : [0-9]+ ;