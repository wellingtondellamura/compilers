grammar Teste;

lang : expr N
     ;
expr : expr '+' term
     | term
     ;
term : term '*' factor
     | factor
     ;
factor : '(' expr ')'
     | DIGIT
     ;

DIGIT : [0-9]+ ;
N : '\n';