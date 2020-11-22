package com.kodilla.sudoku;

public class SudokuGame {
    public static int curr[][];// = new int[9][9];
    public static SudokuBoard sB;
    public boolean resolveSudoku(){
        return true;
    }
    public static int sizeX;
    public static int sizeY;
    public SudokuGame(final SudokuBoard sB, int sizeX, int sizeY) {
        this.sB = sB;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        curr = new int[sizeX][sizeY];
    }

    public void playGame() {
/*        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                if( sB.tabBoard[i][j] == -1 ) {
                    sB.tabBoard[i][j] = 0;
                }
            }
        }                   */
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                curr[i][j] = sB.tabBoard[i][j];
            }
        }
        if (solve(0,0)) {
            for(int i = 0; i < sizeX; i++) {
                for(int j = 0; j < sizeY; j++) {
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
            for(int i = 1; i <= sizeX; i++) {
                if (can_insert(x, y, i)) {
                    curr[x][y] = i;
                    if (next(x, y)) return true;
                }
            } curr[x][y] = -1; return false;
        } return next(x, y);
    }

    public static boolean can_insert(int x, int y, int value) {
        for(int i = 0; i < sizeX; i++) {
            if (    value == curr[x][i] || value == curr[i][y] ||
                    value == curr[x/(int)Math.sqrt(sizeX)*(int)Math.sqrt(sizeX)+i%(int)Math.sqrt(sizeX)]
                                 [y/(int)Math.sqrt(sizeY)*(int)Math.sqrt(sizeY)+i/(int)Math.sqrt(sizeY)]    ) {
                return false;
            }
        }
        return true;
    }

    public static boolean next(int x, int y) {
        if (x == sizeX-1 && y == sizeY-1) return true;
        else if (x == sizeX-1) return solve(0, y + 1);
        else return solve(x + 1, y);
    }

    public void insertValueToBoard(int x, int y, int value) {
        if( !checkNumber(x, y, value) ){
            sB.setValue(x, y, value);
            System.out.println(sB.toString());
        } else {
            System.out.println("Please other number!");
        }
    }

    public boolean checkNumber(int row, int column, int value) {
        boolean check = false;
        int countOccurs = 0;
        for( int j = 0; j < column; j++ ) {
            if( sB.tabBoard[row][j] == value ) {
                countOccurs++;
            }
            if( countOccurs > 0 ) {
                check = true;
            }
        }
        for( int i = 0; i < row; i++ ) {
            if( sB.tabBoard[i][column] == value ) {
                countOccurs++;
            }
            if( countOccurs > 0 ) {
                check = true;
            }
        }

        for( int i = 0; i < row; i++ ) {
            for( int j = 0; j < column; j++ ) {
                if( sB.tabBoard[i][j] == value ) {
                    countOccurs++;
                }
                if( countOccurs > 0 ) {
                    check = true;
                }
            }
        }
        return check;
    }
}
