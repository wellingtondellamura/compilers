%{
#include "tokens.h"
int relop_att;
int nline = 1;
%}
%%
"if"							return IF;
"then"						return THEN;
"else"						return ELSE;
[a-zA-Z][a-zA-Z0-9_]*	return ID;
[0-9][0-9]*					return NUMBER;
"("							return OP;
")"							return CL;
"<" 							{relop_att = LT; return RELOP;}
"<="							{relop_att = LE; return RELOP;}
"="							{relop_att = EQ; return RELOP;}
"<>"							{relop_att = NE; return RELOP;}
">"							{relop_att = GT; return RELOP;}
">="							{relop_att = GE; return RELOP;}
[ \t]							;
[\n]							nline++;
.								printf("caracter inesperado na linha %d\n",nline);
%%

int yywrap(void)
{
	return 1;
}
