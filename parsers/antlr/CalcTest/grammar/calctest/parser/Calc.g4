/******************************************************
 * A multi-line Javadoc-like comment about my grammar *
 ******************************************************/
grammar Calc;

@header{
package calctest.parser;
}

calc returns [int value]
     : expr             { $value = $expr.value; }
     ;

expr returns [int value]
     : NUM '+' e=expr   { $value = Integer.parseInt($NUM.text) + $e.value;}
     | NUM '*' e=expr   { $value = Integer.parseInt($NUM.text) * $e.value;}
     | NUM              { $value = Integer.parseInt($NUM.text); }
     ;

PLUS: '*';
SUM: '+';
WS : [ \t\n]* -> skip;
NUM: [0-9]+;