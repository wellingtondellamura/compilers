#include <iostream>
#include <vector>
#include <cctype>
#include <cstdlib>
#include "symbols.hpp"
#include "tokens.hpp"
#include "lexer.hpp"

using namespace std;

Token lookahead;

void match(int);
void prg();
void pr2();
void cmd();
int exp();
int rst();
void atr();
void out();
int val();

void error(string msg){
  cout << "syntax error on " << line << ":" << char_pos << endl;
  cout << msg << endl;
}

void match(int type){
  if (lookahead.type == type){
    lookahead = next_token();
  } else {
    error("not match");
  }
}

//PRG -> CMD PR2
void prg(){
  cmd(); pr2();
}
//PR2 -> eol PRG | vazio
void pr2(){
  //cout << "pr2" << endl;
  if (lookahead.type == EOL){
    match(EOL); prg();
  } else {
    error("EOL expected");
  }
}
//CMD -> EXP | ATR | OUT
void cmd(){
  //cout << "cmd" << endl;
  if (lookahead.type == NUM){
      exp();
  } else if (lookahead.type == VAR){
      atr();
  } else if (lookahead.type == PRINT){
      out();
  } else {
      error("Unrecongnized Command");
  }
}
//EXP -> num RST
int exp(){
  //cout << "exp" << endl;
  if (lookahead.type == NUM){
    int x = lookahead.value;
    match(NUM);
    int y = rst();
    return x + y;
  }
  return 0;
}
//RST ->  + EXP |
int rst(){
  //cout << "rst" << endl;
  if (lookahead.type == PLUS){
      match(PLUS);
      return exp();
  }
  return 0;
}
//ATR -> var = VAL
void atr(){
  //cout << "atr" << endl;
  if (lookahead.type == VAR){
      match(VAR); match(EQUALS); val();
  }
}
//OUT -> print VAL
void out(){
  //cout << "out" << endl;
  if (lookahead.type == PRINT){
      match(PRINT);
      int x = val();
      cout << x << endl;
  }
}
//VAL -> var | EXP
int val(){
  //cout << "val" << endl;
  if (lookahead.type == VAR){
    match(VAR);
    return 0;
  } else if (lookahead.type == NUM){
    return exp();
  } else {
      error("VAR or NUM expected");
      return -1;
  }
}

int main(int argc, char** argv){
  if (argc > 1){
    input = read_all_lines(argv[1]);
  } else {
    cout << "error on read source file" << endl;
    return 1;
  }
  lookahead = next_token();
  prg();
  // while (lookahead.type != -1){
  //   print_token(lookahead);
  //   cout << " ";
  //   lookahead = next_token();
  // }
  // cout << endl << endl;
  //
  // print_symbol_table();
  // cout << endl;
  return 0;
}
