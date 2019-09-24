grammar Calc;

@header {
package test1.parser;
}
lang : expr N
     ;
expr : expr '+' term
     | term
     ;
term : term '*' factor
     | factor
     ;
factor : '(' expr ')'
     | DIGIT
     ;

DIGIT : [0-9]+ ;
N : '\n';