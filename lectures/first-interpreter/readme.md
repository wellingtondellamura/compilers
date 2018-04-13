
x = 10;
2;
2 + 2;
x + 2;
y = 55;
x + y;

<prog> ::= <cmd>
         | <cmd> <prog>

<cmd>  ::= <attr> EOL
         | <expr> EOL

<attr> ::= VAR EQ <expr>

<expr> ::= VAR <rest>
         | NUM <rest>

<rest> ::= PLUS <expr>
         | &

--- TOKENS ---
EOL  [;\n]
VAR  [a-zA-Z]+
PLUS +
EQ   =


--- SYMBOL TABLE ---
# | token | lexem | value
1 |  VAR  |   x   |  10
2 |  VAR  |   y   |  55
