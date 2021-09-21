package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SudokuGame {
    public static int curr[][];
    public static SudokuBoard sB;
    public static int sizeX;
    public static int sizeY;
    public SudokuGame(final SudokuBoard sB, int sizeX, int sizeY) {
        this.sB = sB;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        curr = new int[sizeX][sizeY];
    }

    public void playGame() {
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                curr[i][j] = sB.tabBoard[i][j];
            }
        }

        if (solve(0,0)) {
            for(int i = 0; i < sizeX; i++) {
                for(int j = 0; j < sizeY; j++) {
                    sB.tabBoard[i][j] = curr[i][j];
                }
            }
        } else {
            System.out.println("impossible");
        }

    }

    public static boolean solve(int x, int y) {
        if (sB.tabBoard[x][y] == 0) {
            for(int i = 1; i <= sizeX; i++) {
                if (can_insert(x, y, i)) {
                    curr[x][y] = i;
                    if (next(x, y)) return true;
                }
            } curr[x][y] = 0; return false;
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

    public void insertValueToBoard(int x, int y, int value, int tab[][]) {
        if( !checkNumber(x, y, value, tab) ) {
            sB.setValue(x, y, value);
            checkNumber(x, y, value, tab);
        } else {
            System.out.println("Please give other number because this number is already in this column or row or block!\n\n");
        }
    }

    public boolean checkNumber(int row, int column, int value, int tab[][]) {
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

        int equalPart = (int)Math.sqrt(sizeX);
        int ind = 0;

        int tab3[][][] = new int[sizeX][equalPart][equalPart];

        int ii = 0;
        int jj = 0;

        for (int z = 0; z < sizeX; z+=equalPart) {
            do {
                for (int i = sizeX; i < equalPart; i++) {
                    for (int j = sizeY - sizeX + z; j < equalPart - sizeX + z; j++) {
                        tab3[ind][ii][jj] = tab[i][j];
                        jj++;
                    }
                    jj = 0;
                    ii++;
                }
                ii = 0;
                ind++;
                equalPart += (int)Math.sqrt(sizeX);
            } while (sizeX >= equalPart);
            equalPart = (int)Math.sqrt(sizeX);

        }

        return check;

    }

    public static void play() {

        ArrayList<Integer> partLists = new ArrayList<>();
        ArrayList<Integer> helpList = new ArrayList<>();
        boolean checkListXY = false;
        int countNumberPartLists = 0;
        int numberSizeRow = 0;
        int numberSizeCol = 0;
        Scanner scannerSizeRow = new Scanner(System.in);
        char inputSign = 0;
        Scanner scannerInputChar = new Scanner(System.in);
        Scanner scannerInputCharYN = new Scanner(System.in);
        boolean boolWord = false;

        System.out.println("Remember - size must be a number whose square root will return an integer and contain at least 4!");
        System.out.println("Example size of board: ");
        System.out.println("size of board: 4\t->\tsize of block: 2 X 2");
        System.out.println("size of board: 9\t->\tsize of block: 3 X 3");
        System.out.println("size of board: 16\t->\tsize of block: 4 X 4");

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
        boolean helpBool = false;
        int sqrtRow = 0;

        System.out.println("Input size rows, columns and blocks in board: ");
        numberSizeRow = scannerSizeRow.nextInt();
        sqrtRow = (int)Math.sqrt(numberSizeRow);
        if ( (sqrtRow * sqrtRow) == numberSizeRow ) {
            numberSizeCol = numberSizeRow;
            helpBool = false;
        } else helpBool = true;
        while ( helpBool ) {
            System.out.println("Please input size rows, columns and blocks in board: ");
            numberSizeRow = scannerSizeRow.nextInt();
            sqrtRow = (int)Math.sqrt(numberSizeRow);
            if ( (sqrtRow * sqrtRow) == numberSizeRow ) {
                numberSizeCol = numberSizeRow;
                helpBool = false;
            }
        }

        sB = new SudokuBoard(numberSizeRow, numberSizeCol);
        tabPreviousState = new int[numberSizeRow][numberSizeCol];

        while( !boolWord ) {
            System.out.println("Choose one from below options:");
            System.out.println("Input the char \"e\" and press key \"ENTER\" - if you want to exit game!");
            System.out.println("Input the char \"s\" and press key \"ENTER\" - program to solve sudoku and display solution!");
            System.out.println("Input the char \"v\" and press key \"ENTER\" - you set the value to a board cell!");
            inputSign = scannerInputChar.next().charAt(0);
            SudokuGame sG = new SudokuGame(sB, numberSizeRow, numberSizeCol);
            if( inputSign == 115 ) {
                boolWord = true;
                sG.playGame();
                System.out.println(sB.toString());
                System.out.println("GAME HAS END!!!");
            } else if( inputSign == 101 ) {
                System.out.println("If you want exit the game?");
                System.out.println("Input the char y or n!");
                inputSign = scannerInputCharYN.next().charAt(0);
                if ( inputSign != 110 && inputSign != 121 ) helpBool = true;
                if( inputSign == 121 ) {
                    boolWord = true;
                    System.out.println("YOU ARE OUT OF THE GAME!!!");
                } else if( inputSign == 110 ) boolWord = false;
                else {
                    while ( helpBool ) {
                        System.out.println("Please input the char y or n!");
                        inputSign = scannerInputCharYN.next().charAt(0);
                        if ( inputSign == 110 || inputSign == 121 ) {
                            if( inputSign == 121 ) {
                                boolWord = true;
                                System.out.println("YOU ARE OUT OF THE GAME!!!");
                            } else if( inputSign == 110 ) boolWord = false;
                            helpBool = false;
                        }
                    }
                }
            } else if( inputSign == 118 ) {
                System.out.println("Input coordinate X: ");
                intCordinateX = scannerCordinateX.nextInt();
                if ( intCordinateX < 0 || intCordinateX >= numberSizeRow ) helpBool = true;
                while ( helpBool ) {
                    System.out.println("Please correct input coordinate X from range [0, " + (numberSizeRow - 1) + "] !");
                    System.out.println("Input coordinate X: ");
                    intCordinateX = scannerCordinateX.nextInt();
                    if ( intCordinateX >= 0 && intCordinateX < numberSizeRow ) helpBool = false;
                }
                System.out.println("Input coordinate Y: ");
                intCordinateY = scannerCordinateY.nextInt();
                if ( intCordinateY < 0 || intCordinateY >= numberSizeRow ) helpBool = true;
                while ( helpBool ) {
                    System.out.println("Please correct input coordinate Y from range [0, " + (numberSizeCol - 1) + "] !");
                    System.out.println("Input coordinate Y: ");
                    intCordinateY = scannerCordinateY.nextInt();
                    if ( intCordinateY >= 0 && intCordinateY < numberSizeCol ) helpBool = false;
                }
                System.out.println("Input value: ");
                intCordinateValue = scannerCordinateValue.nextInt();
                if ( intCordinateValue < 1 || intCordinateValue > numberSizeRow ) helpBool = true;
                while ( helpBool ) {
                    System.out.println("Please correct input value from range [0, " + numberSizeRow + "] !");
                    System.out.println("Input value: ");
                    intCordinateValue = scannerCordinateValue.nextInt();
                    if ( intCordinateValue >= 1 && intCordinateValue <= numberSizeRow ) helpBool = false;
                }
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

                for(int u = 0; u < numberSizeRow; u += sqrtRow) {
                    for (int z = 0; z < numberSizeRow; z += sqrtRow) {
                        for (int x = 0 + u; x < sqrtRow + u; x++) {
                            for (int y = 0 + z; y < sqrtRow + z; y++) {
                                partLists.add(sB.tabBoard[x][y]);
                                if ( x == intCordinateX && y == intCordinateY ) {
                                    checkListXY = true;
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

                if( countNumberPartLists > 0 ) {
                    checkNumberRowColumnBlock = 1;
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
                                .filter(i2 -> cells[i2] == 0))
                        .count();

                if( checkCurrentCountNativeOne == 0 ) {
                    boolWord = true;
                    System.out.println("GAME HAS END!!!");
                }
            }
        }

    }

}
