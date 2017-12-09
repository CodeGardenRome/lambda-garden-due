import Test.Hspec
import LambdaGardenDue

main :: IO ()
main = hspec spec

spec :: Spec
spec = do
  describe "KataZero" $ do
    it "stepA" $ do
      vincitore ['X','X','X'] `shouldBe` 'X'
      vincitore ['O','O','O'] `shouldBe` 'O'
      vincitore ['O','O','X'] `shouldBe` ' '
      vincitore ['O',' ','X'] `shouldBe` ' '
