x = 10

def foo(y):
  x = y
  def bar(y):
    x = y + 10
    return x
  print(bar(y))
  return x

print(x)
print(foo(40))
print(x)
