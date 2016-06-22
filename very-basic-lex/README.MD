Visão Geral
----------------------
Um compilador ou interpretador para uma linguagem de programação geralmente é decomposto em duas tarefas:
1 - Ler o código fonte e descobrir sua estrutura
2 - Processar esta estrutura, por exemplo, gerando o programa alvo.

As ferramentas Lex e Yacc geram fragmentos de programas para resolver a primeira tarefa.

A tarefa de descobrir a estrutura do código fonte também é decomposta em duas sub-tarefas:
1 - Análise Léxica - Separar o código fonte em tokens (Lex)
2 - Análise Sintática - Encontrar a estrutura hierárquica do programa por meio da sintaxe (Yacc)

Para mais informações, visite: http://dinosaur.compilertools.net/

Lex
----------------------
Lex é um gerador de analisadores léxicos.

Sua instalação em um ambiente linux (Ubuntu) consiste em:
1 - Instalar o compilador da linguagem C
sudo apt-get install build-essential
2 - Instalar a ferramenta Flex (Implementação atual do Lex)
sudo apt-get install flex

Como utilizar o Lex
----------------------
Todos os arquivos do Lex devem ter a extensão "l", por isso, um arquivo qualquer pode se chamar "file.l".
1 - Para converter o arquivo Lex para um código fonte em C, utilize:
lex -o file.c file.l

2 - Para compilar o código fonte gerado, utilize:
cc file.c -ll -o file

Para mais informações sobre o formato "l", acesse: http://epaperpress.com/lexandyacc/prl.html

