Desenvolver um analisador léxico para a linguagem SQL.
O analisador deve reconhecer os tokens apenas da DML.

1 - Gramática do SQL/DML <br/>
2 - Definição dos tokens <br/>
   token | lexema | descrição<br/>
    num  |  10    | qualquer sequência de números<br/>
3 - Descrição da técnica<br/>
   a) Implementação com Autômatos<br/>
      - diagramas de transição<br/>
      - definir a arquitetura<br/>
         * Diagramas individuais<br/>
         * Um diagrama único<br/>
    b) Implementar Tabela de Símbolos<br/>
4 - Implementação em qualquer linguagem<br/>
   - Executar em linha de comando<br/>
   - Ler o conteúdo de um arquivo usando buffers<br/>
