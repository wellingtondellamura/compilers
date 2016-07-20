#include <iostream>
#include <cstring>
#include <cstdio>
#include <stack>

using namespace std;

char token = EOF;
string input;
int token_pos = -1;
stack<int> markers;

char next_token();
bool S();
bool L();
void marker();
void backtrack();

int main(int argc, char** argv){
    if (argc >= 2){
        input = argv[1];
    }else{
        getline(cin, input);
    }
    token = next_token();
    if (S()){
        if (token == EOF){
            printf("success\n");
        } else {
            printf("error: there are still entries to process. %s \n", input.substr(token_pos).c_str());
        }
    } else {
        printf("error: it's impossible to derive S.\n");
    }
    return 0;
}

char next_token(){
    char t = EOF;
    token_pos++;
    if (token_pos <= (int) input.size()-1){
        t = input[token_pos];
    }
    printf("next_token() = %c\n", t);
    return t;
}

bool S(){
    if (token == 'a'){
        printf("S-> a\n");
        token = next_token();
        return true;
    } else if (token == '['){
        printf("S-> [L]\n");
        token = next_token();
        if (L()){
            if (token == ']'){
                token = next_token();
                return true;
            } else {

                return false;
            }
        } else {
            return false;
        }
    } else {
        return false;
    }
}

bool L(){
    marker();
    if (S()){
        printf("L-> S;L\n");
        if (token == ';'){
            token = next_token();
            return L();
        } else {
            backtrack();
            printf("L-> S\n");
            return S();
        }
    } else {
        return false;
    }
}

void marker(){
    printf("Marker in %d\n", token_pos);
    markers.push(token_pos);
}

void backtrack(){
    printf("Backtrack\n");
    if (markers.empty()){
        printf("Error -> no positions to return.");
    }else{
        token_pos = markers.top();
        markers.pop();
        token = input[token_pos];
        printf("returning to position %d\n", token_pos);
    }
}
