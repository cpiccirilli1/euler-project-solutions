import math
def euler9 ():
  a = range(1,1001)
  b = range(1, 1001)
  c = math.sqrt(1000)
  for a1 in a:
    for b1 in b:
      
      solve = a1**2 + b1**2
      solvesqr = math.sqrt(solve)
      solve1 = a1+ b1 + solvesqr
      
      
      if solve1 == 1000:
        solve2 = a1*b1*solvesqr
        print("a: {} b: {} c: {}".format(a1, b1, solvesqr))
        print( f"{a1} x {b1} x {solvesqr} = {solve2}")
  
euler9()