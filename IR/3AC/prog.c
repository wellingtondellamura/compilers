int main(){
    int x = 10;
    int y = 20;
    if (x > 5) {
        y = x + y - 10;
    } else {
        x++;
    }
}
//Código de Três Endereços   x = y + z
//capacidade de manipular no *máximo* três endereços de memória por instrução

SRC -- [Front-end]->IR->[Back-end] ---> BIN
                       |-->[Interpreter] --> EXEC

                        OPCODE --- [INT PHP] --> SO

    API REST ---> www.minhapi.com.br/endpoint1
      NGINX 80 ---> PHPFPM (CACHE) ---> EXECPHP