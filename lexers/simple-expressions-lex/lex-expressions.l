%{
#include <stdio.h>
#include "tokens.hpp"
int line = 1;
%}
%%
[ \t]                 ;
[\n]                  line++;
";"                   return EOL;
"+"                   return PLUS;
"="                   return EQUALS;
[pP][rR][iI][nN][tT]  return PRINT;
[0-9]+                return NUM;
"$"[a-z]+             return VAR;
.                     return ERR;
%%
/*int main(){
  int x = 0;
  do {
    x= yylex();
    printf("%d\n", x);
  } while (x > 0);
}*/
