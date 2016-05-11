#include <cstdio>
#include <cctype>
#include <string>
#include <cstdlib>
#include <iostream>

#define NUMBER 256
#define SYMBOL 257

using namespace std;

struct token{
    int type;
    int value;

    void print(){
        if (type == SYMBOL)
            printf("TOKEN {type: SYMBOL, value: %c}\n", value);
        else
            printf("TOKEN {type: NUMBER, value: %d}\n", value);
    }
};

string input;
int pos = -1;
char peek = ' ';
token lookahead;

//inputreader
int getchar(){
    if (pos == -1)
        pos = 0;
    else if (pos == (int) input.length())
        return 0;
    return input[pos++];
}

//lexer
token scan(){
    token t;
    for (;;peek=getchar()){
        if (peek != ' ' && peek != '\t' && peek != '\n')
            break;
    }
    if (isdigit(peek)){
        int v = 0;
        do {
            v = 10 * v + atoi(&peek);
            peek = getchar();
        } while (isdigit(peek));
        t.type = NUMBER;
        t.value = v;
        return t;
    }
    t.type = SYMBOL;
    t.value = peek;
    peek = ' ';
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
        printf("%d ", lookahead.value);
        match(lookahead);
    }else{
        printf("\n*** Syntax Error! '%c' it's not a number. ***\n", lookahead.value);
        exit(0);
    }
}

void expr(){
    term();
    while(true){
        if (lookahead.type == SYMBOL){
            if (lookahead.value == '+'){
                match(lookahead); term(); printf("+ ");
            }else if (lookahead.value == '-'){
                match(lookahead); term(); printf("- ");
            }else{
                return;
            }
        }else{
            return;
        }
    }
}

int main(){
    printf("Infix: ");
    getline(cin, input);

    printf("Postfix:");

    lookahead = scan();
    expr();

    printf("\n");
    return 0;
}
