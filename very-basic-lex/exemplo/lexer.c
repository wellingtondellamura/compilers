#include <stdio.h>
#include "tokens.h"

extern int yylex();
extern int relop_att;
extern int nline;
extern char* yytext;

int main() 
{
	int ntoken, cline;
	cline = nline;
	ntoken = yylex();
	while(ntoken) {		
		switch(ntoken){
			case RELOP:
				printf("<RELOP,%d>", relop_att);
				break;
			case IF:
				printf("<IF>");
				break;
			case THEN:
				printf("<THEN>");
				break;
			case ELSE:
				printf("<ELSE>");
				break;
			case NUMBER:
				printf("<NUMBER,%s>", yytext);
				break;
			case ID:
				printf("<ID,%s>", yytext);
				break;
		}
		ntoken = yylex();
	}
	printf("\n EOF - Lines: %d\n", nline);
	return 0;
}