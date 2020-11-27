
package com.kodilla.sudoku;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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
                                SudokuGame sG = new SudokuGame(sB, numberSizeRow, numberSizeCol);
                                sG.playGame();
                            } else if( inputWord.equals("VALUE") ) {
                                boolWord = true;
                                SudokuGame sG = new SudokuGame(sB, numberSizeRow, numberSizeCol);
                                sG.insertValueToBoard(0, 0, 2);
                                sG.insertValueToBoard(2, 2, 2);
/*                                sG.insertValueToBoard(2, 2, 3);
                                sG.insertValueToBoard(3, 3, 4);
                                sG.insertValueToBoard(4, 4, 5);
                                sG.insertValueToBoard(5, 5, 6);
                                sG.insertValueToBoard(6, 6, 7);
                                sG.insertValueToBoard(7, 7, 8);
                                sG.insertValueToBoard(8, 8, 9);                             */
                                sG.playGame();

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


