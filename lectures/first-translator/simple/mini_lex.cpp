#include "cstdio"
#include "string"
#include "iostream"
#include "cstdlib"
#define NUM     256
#define PLUS    257
#define MINUS   258
#define ERR     1000

using namespace std;

struct token {
    int type;
    int value;
};

string input;
int pos = 0;
char c = EOF;

string token_name(int t){
    switch (t)
    {
        case NUM: return "NUM";
        case PLUS: return "PLUS";
        case MINUS: return "MINUS";
    }
    return "HEISENBERG";
}

char get_char(){
    if (pos < input.length()){
        return input[pos++];
    } else {
        return EOF;
    }
}

token next_token(){
    token t;
    char peek;
    if (c == EOF){
        peek = get_char();
    }
    else {
        peek = c;
        c = EOF;
    }
    //tratar espaços
    if (isdigit(peek)){ //tratar inteiros e reais
        int v = 0;
        do {
            v = v * 10 + atoi(&peek);
            peek = get_char();
        } while (isdigit(peek));
        t.type = NUM;
        t.value = v;
        c = peek;
    } else if (peek == '+'){
        t.type = PLUS;
    } else if (peek == '-'){
        t.type = MINUS;
    } else if (peek == EOF) {
        t.type = EOF;
    } else {
        t.type = ERR;
    }
    return t;
}

// int main() {
//     input = "123+321-12+2";
//     token lookahead = next_token();
//     while (lookahead.type!=EOF){
//         cout << "<"<< token_name(lookahead.type);
//         if (lookahead.type == NUM)
//             cout << "," << lookahead.value;
//         cout <<">"<< endl;
//         lookahead = next_token();
//     }
// }
