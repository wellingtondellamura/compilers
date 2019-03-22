x=10;

function foo(y){
  x = y;
  function bar(y){
    x = y + 10;
    return x;
  }
  console.log(bar(y));
  return x;
}

console.log(x);
console.log(foo(40));
console.log(x);
