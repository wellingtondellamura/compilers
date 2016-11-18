grammar MiniGrammarPlus;

@header {
import java.util.HashMap;
}

@members {
HashMap<String,Integer> memory = new HashMap<String,Integer>();
}

prog:   stat+ ;
                
stat:   expr NEWLINE        {System.out.println($expr.value);}
    |   ID '=' expr NEWLINE {memory.put($ID.text, new Integer($expr.value));}
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
    |   ID
        {
            Integer v = memory.get($ID.text);
            if ( v!=null ) 
                $value = v;
            else 
                System.err.println("undefined variable "+$ID.text);
        }
    |   '(' expr ')' {$value = $expr.value;}
    ;

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