grammar MiniGrammar_v3;

init : expr {System.out.println($expr.text+"="+$expr.value);};

expr returns [Integer value]
     : m1=mult {$value = $m1.value;}
     | m1=mult {$value = $m1.value;}
       ('+' m2=mult {$value += $m2.value;} | 
        '-' m3=mult {$value -= $m3.value;} )*
     ;

mult returns [Integer value]
     : n1=NUM  {$value = Integer.parseInt($n1.text);}
     | n1=NUM  {$value = Integer.parseInt($n1.text);} 
       ('*' n2=NUM {$value *= Integer.parseInt($n2.text);} | 
        '/' n3=NUM {$value /= Integer.parseInt($n3.text);} )*
     ;

//TOKENS
NUM     : [0-9]+;
PLUS    : '+';
MINUS   : '-';
MULT    : '*';
DIV     : '/';
WS      : [\t ]+ -> skip;