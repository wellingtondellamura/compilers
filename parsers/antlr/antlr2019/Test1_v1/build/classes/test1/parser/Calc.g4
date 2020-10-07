grammar Calc;

@header {
package test1.parser;
import test1.Utils;
}

lang returns [Integer value] 
     : expr N                           {$value = $expr.value;}
     ;
expr returns [Integer value] 
     : e1=expr '+' term                 {$value = $e1.value + $term.value;}
     | term                             {$value = $term.value;}
     ;
term returns [Integer value]
     : t1=term '*' factor               {$value = $t1.value * $factor.value;}
     | factor                           {$value = $factor.value;}
     ;


factor returns [Integer value] 
     : '(' expr ')'                     {$value = $expr.value;}
     | DIGIT                            {$value = Integer.parseInt($DIGIT.text);}
     ;

DIGIT : [0-9]+ ;
N : '\n';