%{
    int nchar, nword, nline;
%}

%%
\n         { nline++; nchar++; }
[^ \t\n]+  { nword++; nchar += yyleng; }
.           nchar++;
%%
int main(void) {
    yylex();
    printf("nchar: %d\n nword:%d\n nline:%d\n", nchar, nword, nline);
    return 0;
}
