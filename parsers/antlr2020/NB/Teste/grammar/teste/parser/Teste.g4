grammar Teste;

@header{
package teste.parser;

}

//productions
lang : expr EOL;
expr : expr '+' term | term ;
term : term '*' factor | factor;
factor : '(' expr ')' | DIGIT;

//tokens
DIGIT : [0-9]+ ;
EOL : '\n';
ADD : '+';
MULT: '*';
OPEN: '(';
CLOSE:')';