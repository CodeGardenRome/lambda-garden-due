import expect from 'expect';
import * as kata from './App';

let matriceA = [
  [' ', 'O', 'X'],
  [' ', 'X', 'O'],
  ['X', ' ', ' '] ];

let matriceB = [
  [' ', ' ', ' '],
  [' ', ' ', ' '],
  [' ', ' ', ' '] ];

let matriceC = [
  [' ', 'X', 'O'],
  [' ', 'O', 'X'],
  ['O', ' ', ' '] ];

let matriceD = [
  ['O', 'O', ' '],
  ['X', 'X', 'X'],
  [' ', ' ', ' '] ];

let matrice10x10 = [
  ['X',' ',' ',' ',' ',' ',' ',' ','O',' '],
  [' ','X',' ',' ',' ',' ',' ',' ','O',' '],
  [' ',' ','X',' ',' ',' ',' ',' ','O',' '],
  [' ',' ',' ','X',' ',' ',' ',' ','O',' '],
  [' ',' ',' ',' ','X',' ',' ',' ','O',' '],
  [' ',' ',' ',' ',' ','X',' ',' ','O',' '],
  [' ',' ',' ',' ',' ',' ','X',' ','O',' '],
  [' ',' ',' ',' ',' ',' ',' ','X','O',' '],
  [' ',' ',' ',' ',' ',' ',' ',' ','X','O'],
  [' ',' ',' ',' ',' ',' ',' ',' ','O','X']  ];

it('Funzione aggrega', () => {
    expect(kata.aggrega('X','X')).toEqual('X');
    expect(kata.aggrega('O','O')).toEqual('O');
    expect(kata.aggrega('O',' ')).toEqual(' ');
    expect(kata.aggrega(' ','X')).toEqual(' ');
});

it('Funzione vincitoreRiga', () => {
    expect(kata.vincitoreRiga(['X','X','X'])).toEqual('X');
    expect(kata.vincitoreRiga(['O','O','O'])).toEqual('O');
    expect(kata.vincitoreRiga(['O','O','X'])).toEqual(' ');
    expect(kata.vincitoreRiga(['O',' ','X'])).toEqual(' ');
});

it('Funzioni successore', () => {
    expect(kata.cellaSuccessivaRighe([2,1])).toEqual([2,2]);
    expect(kata.cellaSuccessivaColonne([1,1])).toEqual([2,1]);
    expect(kata.cellaSuccessivaDiagonaleMaggiore([1,1])).toEqual([2,2]);
    expect(kata.cellaSuccessivaDiagonaleMinore([2,0])).toEqual([1,1]);
});

it('Generazione di vettori', () => {
    expect(kata.generaVettore(matriceA,[0,0],cellaSuccessivaRighe)).toEqual([' ', 'O', 'X']);
    expect(kata.generaVettore(matriceA,[0,0],cellaSuccessivaColonne)).toEqual([' ', ' ', 'X']);
    expect(kata.generaVettore(matriceA,[0,0],cellaSuccessivaDiagonaleMaggiore)).toEqual([' ', 'X', ' ']);
    expect(kata.generaVettore(matriceA,[0,0],cellaSuccessivaDiagonaleMinore)).toEqual(['X', 'X', 'X']);
});

it('Determinazione del vincitore', () => {
  expect(kata.vincitoreMatrice(matriceA)).toEqual('X');
  expect(kata.vincitoreMatrice(matriceB)).toEqual(' ');
  expect(kata.vincitoreMatrice(matriceC)).toEqual('O');
  expect(kata.vincitoreMatrice(matriceD)).toEqual('X');
});

it('MAtrice 10 per 10', () => {
  expect(kata.vincitoreMatrice(matrice10x10)).toEqual('X');
});
