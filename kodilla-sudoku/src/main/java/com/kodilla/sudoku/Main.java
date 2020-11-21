
package com.kodilla.sudoku;

import java.util.Scanner;

public class Main {



/*

    public static int[][] sudoku = {
            {0,1,0,0,5,6,2,7,0},
            {0,0,0,0,8,0,0,0,9},
            {0,7,8,0,0,3,6,0,5},
            {0,0,0,0,0,4,5,0,1},
            {8,5,2,0,0,0,7,3,4},
            {6,0,1,7,0,0,0,0,0},
            {1,0,6,4,0,0,9,5,0},
            {3,0,0,0,6,0,0,0,0},
            {0,2,7,3,9,0,0,8,0}
    };

    public static int[][] sudoku = {
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0}
    };

    public static int curr[][] = new int[9][9];

    public static boolean solve(int x, int y) {
        if (sudoku[x][y] == 0) {
            for(int i = 1; i <= 9; i++) {
                if (can_insert(x, y, i)) {
                    curr[x][y] = i;
                    if (next(x, y)) return true;
                }
            } curr[x][y] = 0; return false;
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

                    */



    public static void main(String[] args) {



/*        for(int i=0; i<9; i++)
            for(int j=0; j<9; j++)
                curr[i][j] = sudoku[i][j];
        if (solve(0,0)) {
            for(int i=0; i<9; i++) {
                for(int j=0; j<9; j++) {
                    System.out.print(sudoku[i][j] + "\t");
                } System.out.println();
            }
            System.out.println();
            System.out.println();
            System.out.println();
            for(int i=0; i<9; i++) {
                for(int j=0; j<9; j++) {
                    System.out.print(curr[i][j] + "\t");
                } System.out.println();
            }
        } else {
            System.out.println("impossible");
        }                   */



/*        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
        }               */

        int numberSizeRow = 0;
        int numberSizeCol = 0;
        Scanner scannerSizeRow = new Scanner(System.in);
        Scanner scannerSizeCol = new Scanner(System.in);
        boolean boolRow = false;
        boolean boolColumn = false;
        String inputWord = "";
        Scanner scannerInputWord = new Scanner(System.in);
        boolean boolWord = false;

        System.out.println("Remember - size must be a number whose square root will return an integer and contain at least 4!");

        while( !boolRow ) {
            System.out.println("Input size rows: ");

            numberSizeRow = scannerSizeRow.nextInt();

            if ( (numberSizeRow % (Math.sqrt(numberSizeRow)) == 0) && (numberSizeRow >= 4) ) {
                boolRow = true;
            }

            if (boolRow) {
                while( !boolColumn ) {
                    System.out.println("Input size columns: ");
                    numberSizeCol = scannerSizeCol.nextInt();
                    if ( (numberSizeCol % (Math.sqrt(numberSizeCol)) == 0) && (numberSizeCol >= 4) ) {
                        boolColumn = true;
                    }
                    if (boolColumn) {
                        SudokuBoard sB = new SudokuBoard(numberSizeRow, numberSizeCol);
                        System.out.println(sB.toString());
                        System.out.println("Choose one from below options:");
                        System.out.println("Input the word \"SUDOKU\" and press key \"ENTER\" - program to solve sudoku and display solution!");
                        System.out.println("Input the word \"VALUE\" and press key \"ENTER\" - you set the value to a board cell!");
                        while( !boolWord ) {
                            inputWord = scannerInputWord.next();
                            if( inputWord.equals("SUDOKU") ) {
                                boolWord = true;
                                SudokuGame sG = new SudokuGame(sB);
                                sG.playGame(numberSizeRow, numberSizeCol);
                            } else if( inputWord.equals("VALUE") ) {
                                boolWord = true;
                                SudokuGame sG = new SudokuGame(sB);
                                sG.insertValueToBoard(0, 0, 1);
                                sG.insertValueToBoard(1, 1, 2);
                                sG.insertValueToBoard(2, 2, 3);
                                sG.insertValueToBoard(3, 3, 4);
                                sG.insertValueToBoard(4, 4, 5);
                                sG.insertValueToBoard(5, 5, 6);
                                sG.insertValueToBoard(6, 6, 7);
                                sG.insertValueToBoard(7, 7, 8);
                                sG.insertValueToBoard(8, 8, 9);
                                sG.playGame(numberSizeRow, numberSizeCol);
                                //System.out.println(sB.toString());
/*                                SudokuGame sG = new SudokuGame();
                                sG.playGame(inputWord, 0, 0, -1);                       */
                            } else {
                                System.out.println("Please input the word \"SUDOKU\" or \"VALUE\" and press key \"ENTER\"!");
                            }
                        }
                    } else {
                        System.out.println("Please enter a size for column whose square root will return an integer and contain at least 4!");
                    }
                }
            } else {
                System.out.println("Please enter a size for row whose square root will return an integer and contain at least 4!");
            }
        }



    }

}


