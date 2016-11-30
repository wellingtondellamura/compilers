grammar Sum;

prog : 
        {System.out.println("inicio");} 
        expr EOF {System.out.println($expr.value);}
        {System.out.println("fim");};

expr returns [int value]
     : NUM              {$value = Integer.parseInt($NUM.text);}
     | NUM '+' e1=expr  
       {$value = Integer.parseInt($NUM.text) + $e1.value;}
     ;

//TOKENS
NUM     : [0-9]+;
PLUS    : '+';
WS      : [\t \n\r]+ -> skip;