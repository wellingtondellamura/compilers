Análise Sintática
- Universal: não é viável (custo é alto)
- Descendente: construção da árvore da raíz até as folhas (GLC LL1) Lookahead = 1
- Ascendente: construção da árvore das folhas até a raiz (GLC LRk) Lookahead = 0, 1, ...
Tamanho do Lookahead: quantidade informação adicional necessária para escolher a derivação
Análise Descendente: Backtracking

Desafio?                       Stack(Marker) = Um momento em que eu tive escolher
                                [1X| 3X| ]
  S ->  a  | [L]
  L -> S;L | S | a;L

Lookahead= $
 [a;a]$
      ^ 

    0      1       2        3        4            
 S => [L] => [S;L] => [a;L] => [a;S] => [a;a]

     0      1       2        3          4          
 S => [L] => [S;L] => [a;L] => [a;S;L] => [a;a;L]

   0      1      2
 S => [L] => [S] => [a]

