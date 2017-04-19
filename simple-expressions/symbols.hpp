#ifndef SYMBOLS_HPP
#define SYMBOLS_HPP

#include <vector>
#include <iostream>

using namespace std;

struct Symbol{
    int token;
    int value;
    string lexem;
};
Symbol symbol_null;

vector<Symbol> symbols;

int add_symbol(Symbol);
void print_symbol_table();


int add_symbol(Symbol symbol){
  for (int i = 0; i<symbols.size(); i++){
    Symbol s = symbols[i];
    if (s.lexem.compare(symbol.lexem)==0){
      symbols[i] = symbol;
      return i;
    }
  }
  symbols.push_back(symbol);
  return symbols.size()-1;
}

Symbol get_symbol(int id){
  if (id < symbols.size())
    return symbols[id];
  return symbol_null;
}

void print_symbol_table(){
  for (int i = 0; i < symbols.size(); i++){
    Symbol s = symbols[i];
    cout << "#" << i << " : " << s.token << " : " << s.value << " : " << s.lexem << endl;
  }
}

#endif
