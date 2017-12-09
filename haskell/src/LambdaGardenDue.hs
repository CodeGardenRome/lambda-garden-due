module LambdaGardenDue(
  aggrega, vincitore

) where

aggrega :: Char -> Char -> Char
aggrega 'X' 'X' = 'X'
aggrega 'O' 'O' = 'O'
aggrega x y = ' '

vincitore xs = ' '
