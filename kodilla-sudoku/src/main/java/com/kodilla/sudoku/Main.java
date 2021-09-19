
package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> partLists = new ArrayList<>();
        ArrayList<Integer> helpList = new ArrayList<>();
        boolean checkListXY = false;
        int countNumberPartLists = 0;

        int numberSizeRow = 0;
        int numberSizeCol = 0;
        Scanner scannerSizeRow = new Scanner(System.in);
        boolean boolRow = false;
        boolean boolColumn = false;
        String inputWord = "";
        Scanner scannerInputWord = new Scanner(System.in);
        boolean boolWord = false;

        System.out.println("Remember - size must be a number whose square root will return an integer and contain at least 4!");

        SudokuBoard sB = null;

        Scanner scannerCordinateX = new Scanner(System.in);
        Scanner scannerCordinateY = new Scanner(System.in);
        Scanner scannerCordinateValue = new Scanner(System.in);
        int intCordinateX = 0;
        int intCordinateY = 0;
        int intCordinateValue = 0;
        int checkCurrentCountNativeOne = 0;
        int checkNumberRowColumnBlock = 0;
        int[][] tabPreviousState;

        System.out.println("Input size rows and columns: ");
        numberSizeRow = scannerSizeRow.nextInt();
        numberSizeCol = numberSizeRow;

        int sqrtRow = (int)Math.sqrt(numberSizeRow);

//        int[][][] partTabs = new int[numberSizeRow][(int)Math.sqrt(numberSizeRow)][(int)Math.sqrt(numberSizeRow)];

        while( !boolRow ) {

            if ( (numberSizeRow % (Math.sqrt(numberSizeRow)) == 0) && (numberSizeRow >= 4) ) boolRow = true;

            if ( boolRow ) {
                while( !boolColumn ) {

                    if ( (numberSizeCol % (Math.sqrt(numberSizeCol)) == 0) && (numberSizeCol >= 4) ) boolColumn = true;
                    if ( boolColumn ) {
                        sB = new SudokuBoard(numberSizeRow, numberSizeCol);
                        tabPreviousState = new int[numberSizeRow][numberSizeCol];
                        System.out.println(sB.toString());

                        while( !boolWord ) {
                            System.out.println("Choose one from below options:");
                            System.out.println("Input the word \"SUDOKU\" and press key \"ENTER\" - program to solve sudoku and display solution!");
                            System.out.println("Input the word \"VALUE\" and press key \"ENTER\" - you set the value to a board cell!");
                            inputWord = scannerInputWord.next();
                            SudokuGame sG = new SudokuGame(sB, numberSizeRow, numberSizeCol);
                            if( inputWord.equals("SUDOKU") ) {
                                boolWord = true;
                                sG.playGame();
                                System.out.println(sB.toString());
                            } else if( inputWord.equals("VALUE") ) {
                                System.out.println("Input coordinate X: ");
                                intCordinateX = scannerCordinateX.nextInt();
                                System.out.println("Input coordinate Y: ");
                                intCordinateY = scannerCordinateY.nextInt();
                                System.out.println("Input value: ");
                                intCordinateValue = scannerCordinateValue.nextInt();

                                //checkListXY = false;
                                checkNumberRowColumnBlock = 0;
                                countNumberPartLists = 0;

                                if( sB.tabBoard[intCordinateX][intCordinateY] == intCordinateValue ) {
                                    System.out.println("This number already appears in this cell. Please input other number!");
                                } else {
                                    for(int i=0; i<numberSizeRow; i++) {
                                        for(int j=0; j<numberSizeCol; j++) {
                                            if ( sB.tabBoard[intCordinateX][j] == intCordinateValue ||
                                                 sB.tabBoard[i][intCordinateY] == intCordinateValue ) {
                                                    checkNumberRowColumnBlock = 1;
                                            } else if ( sB.tabBoard[intCordinateX][j] != intCordinateValue &&
                                                        sB.tabBoard[i][intCordinateY] != intCordinateValue ) {
                                                checkNumberRowColumnBlock = 0;
                                            }
                                        }
                                    }
                                }

                                //sB.setValue(intCordinateX, intCordinateY, intCordinateValue);

                                //sB.tabBoard[intCordinateX][intCordinateY] = intCordinateValue;

                                for(int u = 0; u < numberSizeRow; u += sqrtRow) {
                                    for (int z = 0; z < numberSizeRow; z += sqrtRow) {
                                        for (int x = 0 + u; x < sqrtRow + u; x++) {
                                            for (int y = 0 + z; y < sqrtRow + z; y++) {
                                                partLists.add(sB.tabBoard[x][y]);
                                                //partLists.add(sG.returnArray()[x][y]);
                                                if ( x == intCordinateX && y == intCordinateY ) {
                                                    checkListXY = true;
                                                    /*for(int number : partLists) {
                                                        helpList.add(number);
                                                    }*/
                                                }
                                            }
                                        }
                                        if ( checkListXY == true ) {
                                            helpList.clear();
                                            for (int number : partLists) {
                                                helpList.add(number);
                                            }
                                            checkListXY = false;
                                            countNumberPartLists = Collections.frequency(helpList, intCordinateValue);
                                        }
                                        partLists.clear();
                                    }
                                }

                            /*    System.out.println("Begin!");
                                for(int number : partLists) {
                                    System.out.print(number);
                                }
                                System.out.println("End!");     */

                                System.out.println("Begin!");
                                for(int number : helpList) {
                                    System.out.print(number);
                                }
                                System.out.println("End!");

/*                                if (checkListXY == true) {
                                    //helpList = partLists;
                                    //partLists.clear();
                                    countNumberPartLists = Collections.frequency(helpList, intCordinateValue);
                                    //checkListXY = false;
                                    //helpList.clear();
                                }               */

                                if( countNumberPartLists > 0 ) {
                                    checkNumberRowColumnBlock = 1;
                                    //break;
                                }

                                if( checkNumberRowColumnBlock == 1 ) {
                                    sB.tabBoard[intCordinateX][intCordinateY] = tabPreviousState[intCordinateX][intCordinateY];
                                    System.out.println("This number already appears across the row or column or block on this board!");
                                } else if( checkNumberRowColumnBlock == 0 ) {
                                    sG.insertValueToBoard(intCordinateX, intCordinateY, intCordinateValue, sB.tabBoard);
                                    tabPreviousState = sB.returnArray();
                                }

                                System.out.println(sB.toString());

                                checkCurrentCountNativeOne = (int) Stream.of(sB.tabBoard)
                                        .flatMapToInt(cells-> IntStream.range(0, cells.length)
                                        .filter(i2 -> cells[i2] == -1))
                                        .count();

                                if( checkCurrentCountNativeOne == 0 ) boolWord = true;

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



/*        int[][][] partTab = new int[numberSizeRow][sqrtRow][sqrtRow];

        int r = 0;
        int a = 0;
        int b = 0;

        for(int u = 0; u < numberSizeRow; u+=sqrtRow) {
            for (int z = 0; z < numberSizeRow; z += sqrtRow) {
                System.out.print(r + "\t");
                r++;
                for (int x = 0 + u; x < sqrtRow + u; x++) {
                    for (int y = 0 + z; y < sqrtRow + z; y++) {
                        partLists.add(sB.tabBoard[x][y]);
                        //partTab[r][a][b] = sB.tabBoard[x][y];
                        b++;
                        //System.out.print(sB.tabBoard[x][y] + "\t");
                    }
                    b = 0;
                    a++;
                    //System.out.println();
                }
                a = 0;
            }
        }



        System.out.println("Begin part array!");
            for (int z = 0; z < numberSizeRow; z++) {
                for (int x = 0; x < sqrtRow; x++) {
                    for (int y = 0; y < sqrtRow; y++) {
                        System.out.print(partTab[z][x][y] + "\t");
                    }
                    System.out.println();
                }
            }
        System.out.println("End part array!");                  */



    }

}


