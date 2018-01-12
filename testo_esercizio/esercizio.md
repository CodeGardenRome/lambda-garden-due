# Tic-Tac-Toe

Data una struttura dati che rappresenta una partita di tic-tac-toe (tris o filetto) 3x3 come quella che segue:
```
    [ [" ", "O", "X"],
      [" ", "X", "O"],
      ["X", " ", " "] ]
```
1. Scrivere una funzione (o a vostra scelta una composizione di funzioni) che **restituisca** una funzione, la quale una volta eseguita restituisca il vincitore (_X_ o _O_)
2. Scrivere meno linee di codice possibile
3. Il codice non deve avere side effects
4. Ogni funzione deve poter essere testata unitariamente
5. Se avete scelto di _comporre_ potete scegliere se far ritornare ad ogni funzione della vostra composition una funzione o un risultato, a vostra scelta
6. Il vostro programma deve funzionare per la matrice di esempio 3x3 di cui sopra come per quella che segue e teoricamente per matrici di qualuqnue dimensione:

```
    [ ["X"," "," "," "," "," "," "," ","O"," "],
      [" ","X"," "," "," "," "," "," ","O"," "],
      [" "," ","X"," "," "," "," "," ","O"," "],
      [" "," "," ","X"," "," "," "," ","O"," "],
      [" "," "," "," ","X"," "," "," ","O"," "],
      [" "," "," "," "," ","X"," "," ","O"," "],
      [" "," "," "," "," "," ","X"," ","O"," "],
      [" "," "," "," "," "," "," ","X","O"," "],
      [" "," "," "," "," "," "," "," ","X","O"],
      [" "," "," "," "," "," "," "," ","O","X"] ]
```

7. Il vostro programma deve poter risolvere matrici il cui esito sia diverso il vincitore sia anche _O_ o non ci sia nessun vincitore (stallo)
8. Il vostro programma deve poter risolvere matrici in cui la vittoria sia stata conseguita su entrambe le diagonali, una qualunque tra linee o colonne che sia
