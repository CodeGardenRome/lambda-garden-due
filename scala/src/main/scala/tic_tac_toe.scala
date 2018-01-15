package org.lambdaroma

trait Data_Model {

  type Row = Vector[String]
  type Matrix = Vector[Row]
  type Winner = Option[String]
  type Position = (Int, Int)

  val X = "X"
  val O = "O"
  val symbols = List(X, O)
}

object Test_Matrix {
  
  val x_winner =
    Vector(
      Vector(" ", "O", "X"),
      Vector(" ", "X", "O"),
      Vector("X", " ", " ")
    )

  val o_winner =
    Vector(
      Vector("X", " ", "O"),
      Vector(" ", "X", "O"),
      Vector("X", " ", "O")
    )

  val stalemate =
    Vector(
      Vector("X", "O", "X"),
      Vector("O", "X", "O"),
      Vector("O", "X", "O")
    )

}

/** Esercizio 1
  *
  * Data una matrice 3x3 che rappresenta una partita a filetto conclusa, 
  * scrivere una funzione [[winner]] che determina se:
  * * ha vinto "X", 
  * * ha vinto "O" 
  * * o c'è stato il pareggio.
  * 
  * Ad esempio, data la matrice: 
  * 
  * [ [" ", "O", "X"],
  *   [" ", "X", "O"],
  *   ["X", " ", " "] ]
  * 
  * La funzione deve restituire l'esito corrispondente alla vittoria di "X".
  * 
  */
object Esercizio_1 extends Data_Model {

    def winner(matrix: Matrix): Winner = ???

}