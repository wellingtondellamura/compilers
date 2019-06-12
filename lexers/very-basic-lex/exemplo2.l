
%%
"[iI][fF]"                	printf("<IF>");
[a-zA-Z][_a-zA-Z]*	printf("<VAR, %s>", yytext);
[1-9][0-9]*				  printf("<NUM, %s>", yytext);
[0][0-9]*				    printf("<NUM0, %s>", yytext);
%%

int main() {
    yylex();
    return 0;
}
