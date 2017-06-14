grammar Sum;

prog : (stm EOL)+ ;
stm  : expr {System.out.println($expr.value);}
     | ID '=' expr
        {
            Symbol s = new Symbol($ID.text, Symbol.Token.INT, $expr.value);
            SymbolTable.getInstance().add(s);            
        }
        
     ;  

expr returns [int value]
     : NUM              {$value = Integer.parseInt($NUM.text);}
     | NUM '+' e1=expr  
       {$value = Integer.parseInt($NUM.text) + $e1.value;}
     ;

//TOKENS
NUM     : [0-9]+;
ID      : [a-zA-Z][a-zA-Z0-9]*;
PLUS    : '+';
EQ      : '=';
EOL     : '\n';
WS      : [\t \r]+ -> skip;