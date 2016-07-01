%{
#include "tokens.h"
%}
%%
[+-]							return SYMBOL;
[0-9][0-9]*					return NUMBER;
[\n \t]						;
.								printf("caracter inesperado %s\n",yytext);
%%

int yywrap(void)
{
	return 1;
}
