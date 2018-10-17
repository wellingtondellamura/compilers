Em duplas criar um compilador e um interpretador para o mini-c.

Data de Entrega: 28 e 30 de novembro de 2018

-> Sintaxe idêntica ao ansi-c
	- Tipos de dados: int, double, char, string
	- Variáveis locais e globais
	- Comandos de entrada e saída: scanf e printf
	- Controle de fluxo: if, if/else e switch
	- Laços de Repetição: while, do/while e for
	- Funções com passagem de parâmetro por valor e referência.
	- Criação de bibliotecas externas e disponibilização de bibliotecas internas
	- Adicionais: ponteiros e vetores multidimensionais

## Front-End
	Criado com ANTLR/YACC e Java/C/C++

## Compilador
	Ler código em mini-c e gerar código binário executável
	- LLVM: Gerar IR-LLVM e usar os utilitários do LLVM para gerar o código de máquina.

## Interpretador
	Ler código em mini-c e executar na máquina

## RELATÓRIO: Decisões tomadas quanto semântica, estrutura e técnicas.