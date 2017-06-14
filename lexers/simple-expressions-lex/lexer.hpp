#ifndef LEXER_HPP
#define LEXER_HPP

#include "tokens.h"
#include "lex.yy.c"
#include <stdlib.h>

using namespace std;


struct Token{
  int type;
  int value;
};

Token next_token();
void print_token(Token);
//string read_all_lines(string);

// char next_char(){
//   input_pos++;
//   char_pos++;
//   char c = '\0';
//   if (input_pos < input.length())
//     c = input[input_pos];
//   //cout << c << endl;
//   return c;
// }

Token next_token(){
  Token t;
  t.type = -1;
  int tk = yylex();
  switch tk {
      case VAR: {
          t.type = VAR;
          Symbol s;
          s.token = VAR;
          s.value = 0;
          s.lexem = yytext;
          t.value = add_symbol(s);
          return t;
      }
      case NUM:{
          t.type = NUM;
          t.value = atoi(yytext);
          return t;
      }
      case PRINT:{
          t.type = PRINT;
          return t;
      }

  }

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

// string read_all_lines(string filename){
//   string all_lines = "";
//   fstream file;
//   string line;
//   file.open(filename.c_str(), ios::in);
//   while (file.good()) {
//     getline(file, line);
//     all_lines += line + '\n';
//   }
//   file.close();
//   return all_lines;
// }

#endif
