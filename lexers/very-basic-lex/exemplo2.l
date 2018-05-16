
%%
"if"                	printf("IF");
[a-zA-Z][_a-zA-Z]*	printf("LETRA %s", yytext);
[1-9][0-9]*				printf("NÚMERO %s", yytext);
[0-9][0-9]*				printf("NÚMERO COM ZERO %s", yytext);
%%

int main() {
    yylex();
    return 0;
}
