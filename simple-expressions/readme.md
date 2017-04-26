# Simple-Expressions

## Tokens
* eol ;        
* plus +       
* equals =     
* print
* var (atributo índice)
* num (atributo valor)

## Gramática
Veja grammar.txt para entender melhor como as regras foram obtidas.

- PRG ::= CMD PR2
- PR2 ::= eol PRG | ε
- CMD ::= EXP | ATR | OUT
- EXP ::= num RST
- RST ::= + EXP | ε
- ATR ::= var = VAL
- OUT ::= print VAL
- VAL ::= var | EXP
