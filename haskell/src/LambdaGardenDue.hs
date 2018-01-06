module LambdaGardenDue(
  aggrega, vincitoreRiga,
  cellaSuccessivaRighe, cellaSuccessivaColonne, cellaSuccessivaDiagonaleMaggiore, cellaSuccessivaDiagonaleMinore,
  generaVettore, vincitoreMatrice
) where

import Data.List --Serve per transpose

aggrega :: Char -> Char -> Char
aggrega x y = 'A'

vincitoreRiga :: [Char] -> Char
vincitoreRiga xs = 'A'

cellaSuccessivaRighe :: (Int, Int) -> (Int, Int)
cellaSuccessivaRighe (x,y) = (-1,-1)

cellaSuccessivaColonne :: (Int, Int) -> (Int, Int)
cellaSuccessivaColonne (x,y) = (-1,-1)

cellaSuccessivaDiagonaleMaggiore :: (Int, Int) -> (Int, Int)
cellaSuccessivaDiagonaleMaggiore (x,y) = (-1,-1)

cellaSuccessivaDiagonaleMinore :: (Int, Int) -> (Int, Int)
cellaSuccessivaDiagonaleMinore (x,y) = (-1,-1)

generaVettore :: [[Char]] -> (Int,Int) -> ((Int, Int) -> (Int, Int)) -> [Char]
generaVettore matrice (x,y) funSuccessore = []

aggregaVincitore :: Char -> Char -> Char
aggregaVincitore x y = 'A'

trovaVincitoreRighe :: [[Char]] -> Char
trovaVincitoreRighe matrice = 'A'

trovaVincitoreColonne :: [[Char]] -> Char
trovaVincitoreColonne matrice = 'A'

vincitoreMatrice :: [[Char]] -> Char
vincitoreMatrice matrice = 'A'
