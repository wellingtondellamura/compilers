#include <iostream>
#include <vector>
#include <cctype>

using namespace std;
#define EOF    -1
#define ERR    -2
#define EOL    256
#define PLUS   257
#define EQUALS 258
#define NUM    259
#define VAR    260
#define PRINT  261

string input;
int input_pos = -1;
Token lookahead;

struct Symbol{
    int token;
    int value;
    string lexem;
}
vector<Symbol> symbols;
int add_symbol(Symbol symbol){
  for (int i = 0; i<symbols.size; i++){
    Symbol s = symbols[i];
    if (s.lexem.compare(symbol.lexem)==0){
      symbols[i] = symbol;
      return i;
    }else{
      symbols.push_back(symbol);
      return symbols.size;
    }
  }
}

struct Token{
  int type;
  int value;
}

char next_char(){
  input_pos++;
  if (input_pos < input.length)
    return input[input_pos];
  return '\0';
}

Token next_token(){
  Token t;
  t.type = -1;
  char c = next_char();
  if (c == '\0')
    return t;
  if (c == ';'){
    t.type = EOL;
  }else  if (c=='+'){
    t.type = PLUS;
  }else if (c == '='){
    t.type = EQUALS;
  }else if (isdigit(c)){
    int x = atoi(c);
    c = next_char();
    while (isdigit(c)){
      x = 10*x + atoi(c);
    }
    t.type = NUM;
    t.value = x;
  } else if (c == '$'){
    string var = c;
    c = next_char();
    while (isalpha(c)){
      var += c;
    }
    t.type = VAR;
    Symbol s;
    s.token = VAR;
    s.value = 0;
    s.lexem = var;
    t.value = add_symbol(s);
  }else if (c == 'p'){
    string print = "print";
    for (int i = 0; i < print.length; i++){
        if (print[i] == c){
          c = next_char();
        }else{
          t.type = ERR;
          return t;
        }
    }
    t.type = PRINT;
  }
  return t;
}
