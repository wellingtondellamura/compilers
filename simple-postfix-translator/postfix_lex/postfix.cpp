#include <cstdio>
#include <cctype>
#include <string>
#include <cstdlib>
#include <iostream>
#include "lex.yy.c"
#include "tokens.h"

using namespace std;

struct token{
    int type;
    string value;
};

// string input;
// int pos = -1;
// char peek = ' ';
token lookahead;

// //inputreader
// int nextChar(){
//     if (pos == -1)
//         pos = 0;
//     else if (pos == (int) input.length())
//         return 0;
//     return input[pos++];
// }

//lexer
// token scan(){
//     token t;
//     for (;;peek=nextChar()){
//         if (peek != ' ' && peek != '\t' && peek != '\n')
//             break;
//     }
//     if (isdigit(peek)){
//         int v = 0;
//         do {
//             v = 10 * v + atoi(&peek);
//             peek = nextChar();
//         } while (isdigit(peek));
//         t.type = NUMBER;
//         t.value = v;
//         return t;
//     }
//     t.type = SYMBOL;
//     t.value = peek;
//     peek = ' ';
//     return t;
// }

token scan(){
    token t;
    t.type =  yylex();
    t.value = yytext;
    return t;
}

//parser
void match(token t){
    if (lookahead.type == t.type && lookahead.value == t.value){
        lookahead = scan();
    }else{
        printf("\n*** Syntax Error! Values do not match. *** \n");
        exit(0);
    }
}

void term(){
    if (lookahead.type == NUMBER){
        printf("%s ", lookahead.value.c_str());
        match(lookahead);
    }else{
        printf("\n*** Syntax Error! '%s' it's not a number. ***\n", lookahead.value.c_str());
        exit(0);
    }
}

void expr(){
    term();
    while(true){
        if (lookahead.type == SYMBOL){
            if (lookahead.value == "+"){
                match(lookahead);
                term();
                printf("+ ");
            }else if (lookahead.value == "-"){
                match(lookahead);
                term();
                printf("- ");
            }else{
                return;
            }
        }else{
            return;
        }
    }
}

int main(){
    char* input = (char*) malloc(1000);
    scanf("%s", input);
    printf("%s\n", input);
    yy_scan_string(input);
    printf("Postfix:");
    lookahead = scan();
	expr();
    printf("\n");
    free(input);
    return 0;
}
