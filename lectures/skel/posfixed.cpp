#include <iostream>
#include <string>
using namespace std;

void error(string);
void print(char);
void expr();
void term();
void rest();
void match(char);
char nextToken();

string input; // = "9-5+2";
//<9> <-> <5> <+> <2>
// --- ANALISADOR LÉXICO
int count = 0;
char nextToken(){
  if (count == input.length())
    return EOF;
  return input[count++];
}
// --- ANALISADOR SINTÁTICO
char lookahead;

void expr(){
  term(); rest();
}

void rest(){
  if (lookahead == '-'){
     //-term rest
     match('-'); term(); print('-'); rest();
  } else if (lookahead == '+'){
    //+term rest
    match('+'); term(); print('+'); rest();
  } else if (lookahead == EOF) {
    //correto
  } else {
    //syntax 
  }
}

void term(){
  switch (lookahead) {
    case '0': match('0'); print('0'); break;
    case '1': match('1'); print('1'); break;
    case '2': match('2'); print('2'); break;
    case '3': match('3'); print('3'); break;
    case '4': match('4'); print('4'); break;
    case '5': match('5'); print('5'); break;
    case '6': match('6'); print('6'); break;
    case '7': match('7'); print('7'); break;
    case '8': match('8'); print('8'); break;
    case '9': match('9'); print('9'); break;
    default: error("Number expected."); return;
  }
}

void match(char c){
  if (lookahead == c) {
    lookahead = nextToken();
  } else {
    string s = "Found " + to_string(lookahead) + " but expected " + to_string(c);
    error(s);
  }
}

void error(string msg){
  cout << endl << "Syntax Error: "<< msg << endl;
  cout << input << endl;
  for (int i = 0 ; i < count-1; i++)
     cout << " ";
     cout << "^";
   cout << endl;

}

void print(char c){
  cout << c;
}
// --- ENTRYPOINT
int main(){
  cout << "$ ";
  getline(cin, input);
  while (!input.empty()){
    lookahead = nextToken();
    expr();
    cout << endl << "$ ";
    getline(cin, input);
    count = 0;
  }
}
