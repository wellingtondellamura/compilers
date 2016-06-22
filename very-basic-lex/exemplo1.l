
%%

[a-zA-Z][_a-zA-Z]*	printf("TEXTO");
[1-9][0-9]*				printf("NÚMERO");

%%

int main() {
    yylex();
    return 0;
}
