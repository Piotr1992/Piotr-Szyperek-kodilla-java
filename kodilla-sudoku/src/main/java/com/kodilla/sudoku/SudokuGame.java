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



/*        int equalPart = (int)Math.sqrt(sizeX);
        int ind = 0;
        int equalPartRow = 0;
        int equalPartCol = 0;

        int marks[][][] = new int[sizeX][equalPart][equalPart];

        int ii = 0;
        int jj = 0;                 */

        if (solve(0,0)) {
            for(int i = 0; i < sizeX; i++) {
                for(int j = 0; j < sizeY; j++) {
                    sB.tabBoard[i][j] = curr[i][j];
                    System.out.print(curr[i][j] + "\t");
                } System.out.println();
            }
            //System.out.println(sB.toString()+"\n\n\n");
        } else {
            System.out.println("impossible");
        }



/*        for (int z = 0; z < sizeX; z+=equalPart) {
            do {
                for (int i = sizeX; i < equalPart; i++) {
                    for (int j = sizeY - sizeX + z; j < equalPart - sizeX + z; j++) {
                        //System.out.print(sB.tabBoard[i][j] + "\t");
                        marks[ind][ii][jj] = sB.tabBoard[i][j];
                        jj++;
                    }
                    jj = 0;
                    ii++;
                }
                ii = 0;
                ind++;
                equalPartRow = equalPart;
                equalPartCol = equalPart;
                equalPart += (int)Math.sqrt(sizeX);
            } while (sizeX >= equalPart);
            equalPartRow = 0;
            equalPartCol = 0;
            equalPart = (int)Math.sqrt(sizeX);

        }



        for(int i=0; i<sizeX; i++) {

            System.out.println("[" + i + "] = ");

            for (int j = 0; j < equalPart; j++) {
                for (int k = 0; k < equalPart; k++) {

                    System.out.print(marks[i][j][k] + "\t");

                }
                System.out.println();
            }
            System.out.println("\n");
        }                               */



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

    public void insertValueToBoard(int x, int y, int value, int tab[][]) {
        if( !checkNumber(x, y, value, tab) ) {
            sB.setValue(x, y, value);
            checkNumber(x, y, value, tab);
            System.out.println(sB.toString());

/*            System.out.println("CHECK START!");

            for (int i = 0; i < sizeX; i++) {
                for (int j = 0; j < sizeY; j++) {
                    System.out.print(sB.tabBoard[i][j]);
                }
                System.out.println();
            }

            System.out.println("CHECK END!");               */

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
        int equalPartRow = 0;
        int equalPartCol = 0;

        int tab3[][][] = new int[sizeX][equalPart][equalPart];

        int ii = 0;
        int jj = 0;



        System.out.println("CHECK START111!");

        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                System.out.print(sB.tabBoard[i][j]);
            }
            System.out.println();
        }

        System.out.println("CHECK END111!");



        for (int z = 0; z < sizeX; z+=equalPart) {
            do {
                for (int i = sizeX; i < equalPart; i++) {
                    for (int j = sizeY - sizeX + z; j < equalPart - sizeX + z; j++) {
                        //System.out.print(curr[i][j] + "\t");
                        tab3[ind][ii][jj] = tab[i][j];
                        jj++;
                    }
                    jj = 0;
                    ii++;
                }
                System.out.println();
                ii = 0;
                ind++;
                equalPartRow = equalPart;
                equalPartCol = equalPart;
                equalPart += (int)Math.sqrt(sizeX);
            } while (sizeX >= equalPart);
            equalPartRow = 0;
            equalPartCol = 0;
            equalPart = (int)Math.sqrt(sizeX);

        }


        System.out.println("CHECK START222!");

        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                System.out.print(sB.tabBoard[i][j]);
            }
            System.out.println();
        }

        System.out.println("CHECK END222!");



        for(int i=0; i<sizeX; i++) {

            System.out.println("[" + i + "] = ");

            for (int j = 0; j < equalPart; j++) {
                for (int k = 0; k < equalPart; k++) {

                    System.out.print(tab3[i][j][k] + "\t");

                }
                System.out.println();
            }
            System.out.println("\n");
        }



        System.out.println("CHECK START333!");

        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                System.out.print(sB.tabBoard[i][j]);
            }
            System.out.println();
        }

        System.out.println("CHECK END333!");



/*        for( int i = 0; i < sizeX; i++ ) {
            for( int j = 0; j < sizeY; j++ ) {
                System.out.print(sB.tabBoard[i][j]);
            }
            System.out.println();
        }                       */




/*        int equalPart = (int)Math.sqrt(row);
        int ind = 0;
        int equalPartRow = 0;
        int equalPartCol = 0;

        int marks[][][] = new int[row][equalPart][equalPart];

        int ii = 0;
        int jj = 0;

        for (int z = 0; z < row; z+=equalPart) {
            do {
                for (int i = row; i < equalPart; i++) {
                    for (int j = column - row + z; j < equalPart - row + z; j++) {
                        System.out.print(sB.tabBoard[i][j] + "\t");
                        //marks[ind][ii][jj] = sB.tabBoard[i][j];
                        jj++;
                    }
                    jj = 0;
                    ii++;
                }
                ii = 0;
                ind++;
                equalPartRow = equalPart;
                equalPartCol = equalPart;
                equalPart += (int)Math.sqrt(row);
            } while (row >= equalPart);
            equalPartRow = 0;
            equalPartCol = 0;
            equalPart = (int)Math.sqrt(row);
        }                                   */

/*        for(int i=0; i<row; i++) {

            System.out.println("[" + i + "] = ");

            for (int j = 0; j < equalPart; j++) {
                for (int k = 0; k < equalPart; k++) {

                    System.out.print(marks[i][j][k] + "\t");

                }
                System.out.println();
            }
            System.out.println("\n");
        }                   */





/*        int[][][] board = new int[sizeX][sizeX][sizeX];
        double blockRow = Math.sqrt(row);
        double blockColumn = Math.sqrt(column);

        for(int z = 0; z < (int)blockRow; z++) {
            for (int i = z*(int)blockRow; i < (int)blockRow; i++) {
                for (int j = z*(int)blockColumn; j < (int)blockColumn; j++) {
                    board[z][i][j] = sB.tabBoard[i][j];
                }
            }
        }

        for(int z = 0; z < (int)blockRow; z++) {
            for (int i = z*(int)blockRow; i < (int)blockRow; i++) {
                for (int j = z*(int)blockColumn; j < (int)blockColumn; j++) {
                    System.out.print(board[z][i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("\n\n\n");
        }                       */

        return check;
    }

    int[][] returnArray() {
        return curr;
    }

}
