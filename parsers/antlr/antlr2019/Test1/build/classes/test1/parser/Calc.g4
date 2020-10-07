grammar Calc;

@header {
package test1.parser;
import test1.Utils;
}

lang returns [Integer value] 
     : (expr N)+                         
     ;
expr returns [Integer value] 
     : e1=expr '+' term                 
     | term                             
     ;
term returns [Integer value]
     : t1=term '*' factor       #term1         
     | factor                   #term2        
     ;


factor returns [Integer value] 
     : '(' expr ')'                     
     | DIGIT                             
     ;

DIGIT : [0-9]+ ;
N : '\n';