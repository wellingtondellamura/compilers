#include <stdio.h>

int soma(int x, int y){
    printf("Executando a soma de %d + %d\n", x, y);
    return x+y;
}

//entrypoint
int main() {
    printf("Olá mundo\n");
    int res = soma(7,3);
    printf("A soma de 7+3 é %d\n", res);
    return 0;
}