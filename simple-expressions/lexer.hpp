#ifndef LEXER_HPP
#define LEXER_HPP

#include <iostream>
#include <fstream>

using namespace std;

int line = 0;
char peek = ' ';
string input;
int input_pos = -1;
int char_pos = -1;

struct Token{
  int type;
  int value;
};

char next_char();
Token next_token();
void print_token(Token);
string read_all_lines(string);

char next_char(){
  input_pos++;
  char_pos++;
  char c = '\0';
  if (input_pos < input.length())
    c = input[input_pos];
  //cout << c << endl;
  return c;
}

Token next_token(){
  Token t;
  t.type = -1;
  peek = next_char();

  do {
    if (peek == ' ' || peek == '\t') continue;
    else if (peek == '\n') {
      line++;
      char_pos = -1;
    } else break;
  } while (peek = next_char());

  if (peek == '$'){
    string var = "$";
    peek = next_char();
    while (isalpha(peek)){
      var += peek;
      peek = next_char();
    }
    input_pos--;//retract
    t.type = VAR;
    Symbol s;
    s.token = VAR;
    s.value = 0;
    s.lexem = var;
    t.value = add_symbol(s);
    return t;
  }else if (isdigit(peek)){
    int x = 0;
    do {
      x = 10 * x + atoi(&peek);
      peek = next_char();
    } while (isdigit(peek));
    input_pos--;//retract
    t.type = NUM;
    t.value = x;
    return t;
  } else if (peek == 'p'){
    string print = "print";
    for (int i = 0; i < print.length(); i++){
        if (print[i] == peek){
          peek = next_char();
        }else{
          t.type = ERR;
          return t;
        }
    }
    t.type = PRINT;
    return t;
  } else if (peek == ';'){
    t.type = EOL;
    t.value = 0;
  } else  if (peek =='+'){
    t.type = PLUS;
    t.value = 0;
  } else if (peek == '='){
    t.type = EQUALS;
    t.value = 0;
  }
  return t;
}

void print_token(Token t){
  switch (t.type) {
    case ERR:{
      cout << "<ERR>";
      break;
    }
    case EOL: {
      cout << "<EOL>";
      break;
    }
    case PLUS: {
      cout << "<PLUS>";
      break;
    }
    case EQUALS: {
      cout << "<EQUALS>";
      break;
    }
    case NUM: {
      cout << "<NUM,"<< t.value << ">";
      break;
    }
    case VAR: {
      cout << "<VAR,#"<< t.value << ">";
      break;
    }
    case PRINT: {
      cout << "<PRINT>";
      break;
    }
  }
}

string read_all_lines(string filename){
  string all_lines = "";
  fstream file;
  string line;
  file.open(filename.c_str(), ios::in);
  while (file.good()) {
    getline(file, line);
    all_lines += line + '\n';
  }
  file.close();
  return all_lines;
}

#endif
