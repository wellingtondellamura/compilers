#include <stdio.h>
#define ERR     260
#define INSERT  256
#define INTO    257
#define VALUES  258
#define ID      259

struct token {
    int type;
    int atribute;
};

int delta(int q, char s){
    if (q == 0){
        if (s == 'i' || s == 'I') return 1;
        if (s == 'v' || s == 'V') return 9;
    }
    if (q == 1){
        if (s == 'n' || s == 'N') return 2;
    }
    if (q == 2){
        if (s == 's' || s == 'S') return 3;
        if (s == 't' || s == 'T') return 7;
    }
    if (q == 3){
        if (s == 'e' || s == 'E') return 4;
    }
    if (q == 4){
        if (s == 'r' || s == 'R') return 5;
    }
    if (q == 5){
        if (s == 't' || s == 'T') return 6;
    }
    if (q == 7){
        if (s == 'o' || s == 'O') return 8;
    }
    if (q == 9){
        if (s == 'a' || s == 'A') return 10;
    }
    if (q == 10){
        if (s == 'l' || s == 'L') return 11;
    }
    if (q == 11){
        if (s == 'u' || s == 'U') return 12;
    }
    if (q == 12){
        if (s == 'e' || s == 'E') return 13;
    }
    if (q == 13){
        if (s == 's' || s == 'S') return 14;
    }
    return -1;
}

token final(int q){
    token t;
    if (q == 6)
        t.type = INSERT;
    else if (q == 8)
        t.type = INTO;
    else if (q == 14)
        t.type = VALUES;
    else
        t.type = ERR;
    return t;
}

int main(int argc, char* argv[]){
    int initial = 0;
    int atual = initial;
    char* w = argv[1];
    int i = 0;
    while (w[i] != '\0'){
        char c = w[i];
        atual = delta(atual, c);
        if (atual == -1) break;
        i++;
    }
    token t = final(atual);
    if (t.type == ERR){
        printf("Rejeitado \n");
    } else {
        printf("<%d> \n", t.type);
    }
    return 0;
}
