#include <stdio.h>

int somar(int a, int b){
  int r = a+ b;
  return r;
}

int main() {
   int x, y;
   printf("Informe os valores: ");
   scanf("%d%d", &x, &y);
   int s = somar(x,y);
   printf("%d\n", s);
   return 0;
}



