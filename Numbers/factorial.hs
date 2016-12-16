main = print (factorial 10)

-- Haskell is purely function so can only implement this recursively ;)
factorial :: (Integral n) => n -> n
factorial 0 = 1
factorial n = n * factorial(n-1);
