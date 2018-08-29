grammar Expr;

@header{
package parser;
}

@members{

}
prog:  (expr NEWLINE {System.out.println($expr.value);} )* {System.out.println("acabou");};
expr returns [int value]
    :	e1=expr '+' e2=expr         {$value = $e1.value + $e2.value; }
    |	INT                         {$value = Integer.parseInt($INT.text);}
    ;

MULT    : '*';
SUM     : '+';
MIN     : '-';
DIV     : '/';
OPEN    : '(';
CLOSE   : ')';
NEWLINE : [\r\n]+ ;
INT     : [0-9]+ ;