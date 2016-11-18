grammar MiniGrammar;

init : expr             {System.out.println($expr.value);};

expr returns [Integer value]
     : NUM              {$value = Integer.valueOf($NUM.text);} 
     | n1=NUM           {$value = Integer.valueOf($n1.text);}
       ('+' n2=NUM      {$value += Integer.valueOf($n2.text);} |
        '-' n2=NUM      {$value -= Integer.valueOf($n2.text);} )*
     ;

//TOKENS
NUM     : [0-9]+;
PLUS    : '+';
MINUS   : '-';