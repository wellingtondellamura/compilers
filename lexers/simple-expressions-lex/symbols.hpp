#ifndef SYMBOLS_HPP
#define SYMBOLS_HPP

#include <vector>
#include <iostream>
#include "tokens.hpp"

using namespace std;

struct Symbol{
    int token;
    int value;
    string lexem;
};
std::vector<Symbol> symbols;

int add_symbol(Symbol);
void print_symbol_table();
bool update_symbol(int, int);

int add_symbol(Symbol symbol){
  for (int i = 0; i<symbols.size(); i++){
    Symbol s = symbols[i];
    if (s.lexem.compare(symbol.lexem)==0){
      symbols[i] = symbol;
      return i;
    }
  }
}

Symbol get_symbol(int id){
  if (id < symbols.size())
    return symbols[id];
  Symbol s;
  s.token = ERR;
  return s;
}

bool update_symbol(int index, int value){
    if (index > symbols.size()){
        return false;
    }
    symbols[index].value = value;
    return true;
}

void print_symbol_table(){
  for (int i = 0; i < symbols.size(); i++){
    Symbol s = symbols[i];
    cout << "#" << i << " : " << s.token << " : " << s.value << " : " << s.lexem << endl;
  }
}

#endif
