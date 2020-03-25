#include <stdio.h>
#include "mylib.h"

int main( int argc, char *argv[] ) {
  int a = 100;
  int b = 50;
  int c = calc(a, b);
  printf("%d\n", c);
  return 0;
}
