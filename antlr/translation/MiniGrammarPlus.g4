grammar MiniGrammarPlus;

@header {
import java.util.HashMap;
}

@members {
HashMap<String,Integer> memory = new HashMap<String,Integer>();

void print(Object o){
   System.out.println(o);
}

int getSymbol(String s){
    Integer v = memory.get(s);
    if ( v!=null ) 
        return v;
    else 
        System.err.println("undefined variable "+s);
    return 0;
}                        

}

prog: (stat)+ ;
                
stat returns [int value]
    :   expr NEWLINE {$stat.value = $expr.value;}
    |   ID '=' expr NEWLINE {memory.put($ID.text, new Integer($expr.value));}
    |   PRINT '('ID')' NEWLINE{print(getSymbol($ID.text));}
    |   NEWLINE
    ;

expr returns [int value]
    :   e=multExpr {$value = $e.value;} ('+' e=multExpr {$value += $e.value;} | '-' e=multExpr {$value -= $e.value;} )*
    ;

multExpr returns [int value]
    :   e=atom {$value = $e.value;} ('*' e=atom {$value *= $e.value;})*
    ; 

atom returns [int value]
    :   INT {$value = Integer.parseInt($INT.text);}
    |   ID  {$value = getSymbol($ID.text); }
    |   '(' expr ')' {$value = $expr.value;}
    ;
PRINT   : [pP][rR][iI][nN][tT];
ID      : [a-zA-Z]+ ;
INT     : [0-9]+ ;
EQ      : '=';
PLUS    : '+';
MINUS   : '-';
MULT    : '*';
BRACL   : '(';
BRACR   : ')';
NEWLINE : '\r'? '\n' ;
WS      : (' '|'\t')+ -> skip;