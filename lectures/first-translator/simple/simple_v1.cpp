#include <cstdio>
#include <iostream>
#include <cctype>
#include <cstdlib>

using namespace std;

void list();
void term();
void x();
void match(char);
void print(char);

char lookahead;
string input;
int pos = 0;

void print(char c){
    printf("%c", c);
}

char nextToken(){
    if (pos < input.length()){
        return input[pos++];
    } else {
        return EOF;
    }
}

void list(){
    term();
    x();
}

void x(){
    if (lookahead == '+') {
        match('+'); term(); print('+'); x();
    } else if (lookahead == '-'){
        match('-'); term(); print('-'); x();
    } else if (lookahead == EOF){
        printf("\nSuccess.\n");
    } else {
        printf("Syntax error on x\n");
        exit(1);
    }
}

void term(){
    // if (isalpha(lookahead)){ //var
    //     match(lookahead);
    // } else
    if (isdigit(lookahead)) {
        print(lookahead);
        match(lookahead);
    } else {
        printf("Syntax error on term\n");
        exit(1);
    }
}

void match(char s){
    if (lookahead == s){
        lookahead = nextToken();
    } else {
        printf("Match error");
    }
}

int main(){
    input = "2+2-2";
    lookahead = nextToken();
    list();
}
