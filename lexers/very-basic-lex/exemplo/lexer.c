#include <stdio.h>
#include <stdlib.h>
#include "tokens.h"
#include "lexer_base.c"

int main()
{
	int ntoken;
    char* d = (char*) malloc(2);
	ntoken = yylex();
	while(ntoken) {
		switch(ntoken){
			case RELOP:
            switch (relop_att) {
               case LT: d = "LT"; break;
               case LE: d = "LE"; break;
               case EQ: d = "EQ"; break;
               case NE: d = "NE"; break;
               case GT: d = "GT"; break;
               case GE: d = "GE"; break;
            }
				printf("<RELOP,%s>", d );
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
         case OP:
   				printf("<OP>");
   				break;
         case CL:
               printf("<CL>");
               break;
		}
      printf("\n");
		ntoken = yylex();
	}
	printf("\n EOF - Lines: %d\n", nline);
	return 0;
}
