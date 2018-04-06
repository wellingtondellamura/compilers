#include <cstdio>
#include <iostream>
#include <cctype>
#include <cstdlib>
#include <string>

#define NUM 256
#define VAR 257
#define SUM 258
#define MIN 259

using namespace std;

struct token {
    int type;
    int value;
};

void list();
void term();
void x();
void match(int);
void print(string);
void print(int);
token nextToken();
char nextChar();

token lookahead;
string input;
int pos = 0;
int current_line = 0;

void print(string s){
    cout << s;
}

void print(int i){
    cout << i << " ";
}

char nextChar(){
    if (pos < input.length()){
        char c = input[pos++];
        //cout << "nextChar "<< c << endl;
        return c;
    } else {
        return EOF;
    }
}

token nextToken(){
    char peek;
    token t;
    while (peek = nextChar()){
        if (peek == ' ' || peek == '\t') continue;
        else if (peek == '\n')  current_line++;
        else break;
    }
    if (isdigit(peek)) {
        int value = 0;
        do {
            value = 10 * value + atoi(&peek);
            peek = nextChar();
        } while (isdigit(peek));
        t.type = NUM;
        t.value = value;
        return t;
    }
    if (peek == '+'){
        t.type = SUM;
    } else if (peek == '-'){
        t.type = MIN;
    } else if (peek == EOF) {
        t.type = EOF;
    }
    return t;
}

void list(){
    term();
    x();
}

void x(){
    if (lookahead.type == SUM) {
        match(SUM); term(); print("+"); x();
    } else if (lookahead.type == MIN){
        match(MIN); term(); print("-"); x();
    } else if (lookahead.type == EOF){
        printf("\nSuccess.\n");
    } else {
        printf("Syntax error on x\n");
        exit(1);
    }
}

void term(){
    if (lookahead.type == NUM) {
        print(lookahead.value);
        match(NUM);
    } else {
        printf("Syntax error on term\n");
        exit(1);
    }
}

void match(int t){
    if (lookahead.type == t){
        lookahead = nextToken();
    } else {
        printf("Match error");
    }
}

int main(int argc, char** argv){
    input = argv[1];
    lookahead = nextToken();
    list();
}
