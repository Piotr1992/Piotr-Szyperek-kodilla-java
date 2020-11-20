package com.kodilla.sudoku;

public class SudokuGame {
    public boolean resolveSudoku(){
        return true;
    }
    public SudokuGame() {
    }
    public void playGame(String word, int x, int y, int value, SudokuBoard sB) {
        if( word.equals("SUDOKU") ) {
            sB.setValue(x, y, value);
            System.out.println(sB.toString());
        } else if( word.equals("VALUE") ) {
            sB.setValue(x, y, value);
            System.out.println(sB.toString());
        }
    }
}
