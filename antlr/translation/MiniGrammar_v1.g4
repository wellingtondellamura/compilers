grammar MiniGrammar_v1;

init : expr;

expr : mult  {System.out.println($mult.valor);}
     | mult  ('+' mult | '-' mult )*
     ;

mult returns [Integer valor]
     : n1=NUM                  {$mult.valor = Integer.valueOf($n1.text);}
     | n1=NUM '*' n2=NUM       
       {$mult.valor = Integer.valueOf($n1.text) * Integer.valueOf($n2.text);}
     ;

//TOKENS
NUM     : [0-9]+;
PLUS    : '+';
MINUS   : '-';
MULT    : '*';
DIV     : '/';
WS      : [\t ]+ -> skip;