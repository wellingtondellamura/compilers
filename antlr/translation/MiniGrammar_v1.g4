grammar MiniGrammar_v1;

init : expr;

expr : mult
     | mult  ('+' mult | '-' mult )*
     ;

mult : NUM
     | NUM ('*' NUM | '/' NUM)*
     ;

//TOKENS
NUM     : [0-9]+;
PLUS    : '+';
MINUS   : '-';
MULT    : '*';
DIV     : '/';
WS      : [\t ]+ -> skip;