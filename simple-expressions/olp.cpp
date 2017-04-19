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
  if (argc > 1){
    input = read_all_lines(argv[1]);
  } else {
    cout << "error on read source file" << endl;
    return 1;
  }
  
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
