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
};

string input;
int pos = -1;
char peek = ' ';
token lookahead;

//inputreader
int nextChar(){
    if (pos == -1)
        pos = 0;
    else if (pos == (int) input.length())
        return 0;
    return input[pos++];
}

//lexer
token scan(){
    token t;
    for (;;peek=nextChar()){
        if (peek != ' ' && peek != '\t' && peek != '\n')
            break;
    }
    if (isdigit(peek)){
        int v = 0;
        do {
            v = 10 * v + atoi(&peek);
            peek = nextChar();
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

int term(){
    if (lookahead.type == NUMBER){
        int v = lookahead.value;
        match(lookahead);
        return v;
    }else{
        printf("\n*** Syntax Error! '%c' it's not a number. ***\n", lookahead.value);
        exit(0);
    }
}

int expr(){
    int v = term();
    while(true){
        if (lookahead.type == SYMBOL){
            if (lookahead.value == '+'){
                match(lookahead); 
                v += term();
            }else if (lookahead.value == '-'){
                match(lookahead); 
                v -= term();
            }else{
                return v;
            }
        }else{
            return v;
        }
    }
}

int main(){
    printf("Expression: ");
    getline(cin, input);
    lookahead = scan();
    int x = expr();
    printf("Result: %d\n", x);
    return 0;
}
