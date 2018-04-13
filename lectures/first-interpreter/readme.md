#EXEMPLO
x = 10;
print 2;
print 2 + 2;
print x + 2;
y = 55;
print x + y;

#GRAMÁTICA
<prog> ::= <cmd> <loop>

<loop> ::= <prog>
         | EOF

<cmd>  ::= VAR EQ <expr> EOL
         | PRINT <expr>

<expr> ::= VAR <rest>
         | NUM <rest>

<rest> ::= PLUS <expr>
         | EOL

#TOKENS
EOL  [;\n]
VAR  [a-zA-Z]+
PLUS +
EQ   =
PRINT print


#SYMBOL TABLE
N | token | lexem | value
1 |  VAR  |   x   |  10
2 |  VAR  |   y   |  55
