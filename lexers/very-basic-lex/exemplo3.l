
%%

[a-zA-Z][_a-zA-Z]*	ECHO;
[1-9][0-9]*				printf("NÚMERO %s", yytext);
%%

int main() {
    yylex();
    return 0;
}