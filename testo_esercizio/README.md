Questo esercizio è diviso in due percorsi.

Chi sta imparando la programmazione funzionale, può fare tutti gli esercizi in successione.

Chi già conosce la programmazione funzionale, può fare l'esercizio 1 e poi passare direttamente agli esercizi 7 ed 8.

# Esercizio 1

Data una matrice 3x3 tipo

    [ [" ", "O", "X"],
      [" ", "X", "O"],
      ["X", " ", " "] ]

che rappresenta una partita a filetto conclusa,
scrivere una funzione `vincitorePrimoTentativo` che determina se:
* ha vinto `"X"`,
* ha vinto `"O"`,
* o c'è stato il pareggio `" "`.

Ad esempio, data la matrice riportata sopra, la funzione deve restituire l'esito corrispondente alla vittoria di "X".

## Passo A

Scrivere una funzione `vincitore` che, data una lista  di 3 elementi, restitusce:
* `"X"` se contiene tutte `"X"`
* `"O"` se contiene tutte `"O"`
* `" "` altrimenti

Ad esempio:
* `vincitore(["X","X","X"])` deve restituire `"X"`
* `vincitore(["O","O","O"])` deve restituire `"O"`
* `vincitore(["O","O","X"])` deve restituire `" "`
* `vincitore(["O"," ","X"])` deve restituire `" "`

Usare la funzione reduce.

È possibile svolgere questo esercizio usando la funzione filter, con altre?

## Passo B

Scrivere delle funzioni che, data una cella di partenza, restituiscono la cella
successiva, per coprire una riga una colonna o una diagonale.

Ad esempio, la funzione
* `cellaSuccessivaRighe([0,0]) = [1,0]`
* `cellaSuccessivaColonne([0,0]) = [0,1]`
* `cellaSuccessivaDiagonaleMaggiore([0,0]) = [1,1]`
* `cellaSuccessivaDiagonaleMinore([0,2]) = [1,1]`

Queste funzioni sono dette funzioni successore.


## Passo C

Scrivere una funzione `generaVettore` che prende in ingresso:
* la matrice 3x3
* la cella di partenza
* la funzione successore

E restituisce un vettore di 3 elementi corrispondente alla riga.

Ad esempio, data la matrice:

    [ [" ", "O", "X"],
      [" ", "X", "O"],
      ["X", " ", " "] ]

Se la cella di partenza è `[1,0]` e la funzione successore è quella delle righe,
la funzione generaVettore dovrà restituire il vettore:

`[" ","X","O"]`

Se, invece, la cella di partenza è `[0,2]` e la funzione successore è quella delle colonne,
la funzione `generaVettore` dovrà restituire il vettore:

`["X","O"," "]`

## Passo D

Usare le funzioni create nell'esercizio precedente.
Data una matrice 3x3, restituire i vettori:
* delle righe,
* delle colonne,
* delle diagonali

Ad esempio, data la matrice:

    [ [" ", "O", "X"],
      [" ", "X", "O"],
      ["X", " ", " "] ]

I vettori delle righe sono:
* `[" ", "O", "X"]`
* `[" ", "X", "O"]`
* `["X", " ", " "]`

I vettori delle colonne sono:
* `[" "," ","X"]`
* `["O","X"," "]`
* `["X","O"," "]`

I vettori delle diagonali sono:
* `[" ","X"," "]`
* `["X","X","X"]`

## Passo E

Usare le funzioni create nei passi precedenti per risolvere l'esercizio 1

# Esercizio 2

Ripetere l'esercizio precedente con una matrice 10x10

Ad esempio, data la lista:

    [ ["X"," "," "," "," "," "," "," ","O"," "],
      [" ","X"," "," "," "," "," "," ","O"," "],
      [" "," ","X"," "," "," "," "," ","O"," "],
      [" "," "," ","X"," "," "," "," ","O"," "],
      [" "," "," "," ","X"," "," "," ","O"," "],
      [" "," "," "," "," ","X"," "," ","O"," "],
      [" "," "," "," "," "," ","X"," ","O"," "],
      [" "," "," "," "," "," "," ","X","O"," "],
      [" "," "," "," "," "," "," "," ","X","O"],
      [" "," "," "," "," "," "," "," ","O","X"]
       ]


La funzione deve restituire l'esito corrispondente alla vittoria di "X".

Se il programma dell'esercizio 1 è stato fatto seguendo una forma generica, cosa che viene più facile attraverso i principi del paradigma funzionale,
non dovresti fare molta fatica per renderlo operativo su una matrice più grande.

Se sei stato particolarmente abile funzionerà in entrambi gli esercizi.

# Esercizio 3

È possibile riscrivere la soluzione all'esercizio precedente con meno codice?

Spiegare il motivo.
