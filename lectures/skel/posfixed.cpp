char lookahead;
string input = "9-5+2";
int count = 0;

char nextToken(){
  if (count == input.length())
    return EOF;
  return input[count++];
}

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
  } else {
    //vazio
    //syntax error?
  }
}

void term(){
  char x = lookahead;
  switch (lookahead) {
    case '0': match('0'); print('0'); /*alt1*/ break;
    case '1': match('1'); break;
    case '2': match('2'); break;
    case '3': match('3'); break;
    case '4': match('4'); break;
    case '5': match('5'); break;
    case '6': match('6'); break;
    case '7': match('7'); break;
    case '8': match('8'); break;
    case '9': match('9'); break;
    default: return; //syntax error;
  }
  print(x); //alt 2
}

void match(char c){
  if (if (lookahead == c)){
    lookahead = nextToken();
  } else {
    //syntax error
  }
}

void print(char c){
  std::cout << c;
}

int main(){
  //ler a entrada e atribuir a input
  lookahead = nextToken();
  expr();
}
