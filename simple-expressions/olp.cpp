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
void exp();
void rst();
void atr();
void out();
void val();

void match(int type){
  if (lookahead.type == type){
    cout << "match " << type << endl;
    lookahead = next_token();
  } else {
    cout << "syntax error on " << line << ":" << char_pos << endl;
  }
}

//PRG -> CMD PR2
void prg(){
  cout << "prg" << endl;
  cmd();pr2();
}
//PR2 -> eol PRG | vazio
void pr2(){
  cout << "pr2" << endl;
  if (lookahead.type == EOL)
    match(EOL); prg();
}
//CMD -> EXP | ATR | OUT
void cmd(){
  cout << "cmd" << endl;
  if (lookahead.type == NUM)
      exp();
  if (lookahead.type == VAR)
      atr();
  if (lookahead.type == PRINT)
      out();
}
//EXP -> num RST
void exp(){
  cout << "exp" << endl;
  match(NUM); rst();
}
//RST ->  + EXP |
void rst(){
  cout << "rst" << endl;
  if (lookahead.type == PLUS){
      match(PLUS); exp();
  }
}
//ATR -> var = VAL
void atr(){
  cout << "atr" << endl;
  if (lookahead.type == VAR){
      match(VAR); match(EQUALS); val();
  }
}
//OUT -> print VAL
void out(){
  cout << "out" << endl;
  if (lookahead.type == PRINT){
      match(PRINT); val();
  }
}
//VAL -> var | EXP
void val(){
  cout << "val" << endl;
  if (lookahead.type == VAR){
    match(VAR);
  } else if (lookahead.type == NUM){
    exp();
  }
}

int main(int argc, char** argv){
  if (argc > 1){
    input = read_all_lines(argv[1]);
  } else {
    cout << "error on read source file" << endl;
    return 1;
  }
  cout  << input << endl;
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
