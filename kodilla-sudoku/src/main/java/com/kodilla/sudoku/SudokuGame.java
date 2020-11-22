package com.kodilla.sudoku;

public class SudokuGame {
    public static int curr[][] = new int[9][9];
    public static SudokuBoard sB;
    public boolean resolveSudoku(){
        return true;
    }
    public SudokuGame(final SudokuBoard sB) {
        this.sB = sB;
    }

    public void playGame(int x, int y) {
/*        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                if( sB.tabBoard[i][j] == -1 ) {
                    sB.tabBoard[i][j] = 0;
                }
            }
        }                   */
        if (solve(0,0)) {
            for(int i=0; i<x; i++) {
                for(int j=0; j<y; j++) {
                    sB.tabBoard[i][j] = curr[i][j];
                    //System.out.print(curr[i][j] + "\t");
                } //System.out.println();
            }
            System.out.println(sB.toString()+"\n\n\n");
        } else {
            System.out.println("impossible");
        }
    }

    public static boolean solve(int x, int y) {
        if (sB.tabBoard[x][y] == -1) {
            for(int i = 1; i <= 9; i++) {
                if (can_insert(x, y, i)) {
                    curr[x][y] = i;
                    if (next(x, y)) return true;
                }
            } curr[x][y] = -1; return false;
        } return next(x, y);
    }

    public static boolean can_insert(int x, int y, int value) {
        for(int i = 0; i < 9; i++) {
            if (value == curr[x][i] || value == curr[i][y] ||
                    value == curr[x/3*3+i%3][y/3*3+i/3]) return false;
        } return true;
    }

    public static boolean next(int x, int y) {
        if (x == 8 && y == 8) return true;
        else if (x == 8) return solve(0, y + 1);
        else return solve(x + 1, y);
    }

    public void insertValueToBoard(int x, int y, int value) {
        sB.setValue(x, y, value);
        System.out.println(sB.toString());
    }
}

