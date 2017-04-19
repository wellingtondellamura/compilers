#include <iostream>
#include <vector>
#include <cctype>
#include <cstdlib>
#include "symbols.hpp"
#include "tokens.hpp"
#include "lexer.hpp"

using namespace std;

Token lookahead;

int main(int argc, char** argv){
  //if (argc > 1){
  //  input = argv[1];
  //}
  input = "$x = 10; $y = 20 + $x";
  lookahead = next_token();
  while (lookahead.type != -1){
    print_token(lookahead);
    cout << " ";
    lookahead = next_token();
  }
  cout << endl << endl;

  print_symbol_table();
  cout << endl;
  return 0;
}
