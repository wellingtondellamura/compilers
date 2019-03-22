<?php

$x=10;

function foo($y){
  $x = $y;
  function bar($y){
    $x = $y + 10;
    return $x;
  }
  echo(bar($y)."\n");
  return $x;
}

echo($x."\n");
echo(foo(40)."\n");
echo($x."\n");
