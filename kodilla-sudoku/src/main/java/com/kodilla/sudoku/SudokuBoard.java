package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    public List<SudokuRow> listCell = new ArrayList<>();
    public int[][] tabBoard;
    public int row;
    public int column;

    public SudokuBoard(int row, int column) {
        this.row = row;
        this.column = column;
        tabBoard = new int[row][column];
        createBoard(row, column);
    }

    public void createBoard(int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                tabBoard[i][j] = -1;
            }
        }
    }

    public void setValue(int coordinateX, int coordinateY, int value) {
        tabBoard[coordinateX][coordinateY] = value;
    }

    public String toString() {
        String board =  "";
        double blockRow = Math.sqrt(row);
        double blockColumn = Math.sqrt(column);

        for(int i = 0; i <row; i++) {
            if( i % blockRow == 0 ) {
                for (int z = 0; z < row; z++) {
                    board += "---";
                }
            }
            board += "\n";
            for (int j = 0; j < column; j++) {
                if( j % blockColumn == 0 ) {
                        board += "| ";
                }
                board += tabBoard[i][j] + " ";
            }
            board += "\n";
        }
        return board;
    }

    public int[][] returnArray() {
        return tabBoard;
    }
}









/*
*
*
*
*
*         for (int i = 0; i < row; i++) {
            board += "----";
        }
        for(int i = 0; i <halfRow; i++) {
            board += "\n";
            for (int j = 0; j < halfColumn; j++) {
                board += tabBoard[i][j] + " ";
            }
            board += "| ";
            for (int j = halfColumn; j < column; j++) {
                board += tabBoard[i][j] + " ";
            }
            board += "\n";
        }
        for (int i = 0; i < row; i++) {
            board += "----";
        }
        for(int i = halfRow; i <row; i++) {
            board += "\n";
            for (int j = 0; j < halfColumn; j++) {
                board += tabBoard[i][j] + " ";
            }
            board += "| ";
            for (int j = halfColumn; j < column; j++) {
                board += tabBoard[i][j] + " ";
            }
            board += "\n";
        }

*
*
*
*
*
* */








/*



        for(int z = 0; z < halfRow; z++) {
            board += "\n";
            for (int i = 0; i < halfColumn; i++) {
                board += "| ";
                for (int j = 0; j < halfColumn; j++) {
                    board += tabBoard[i][j] + " ";
                }
                board += "| ";
                for (int j = halfColumn; j < column; j++) {
                    board += tabBoard[i][j] + " ";
                }
                board += "|\n";
            }
            for (int i = 0; i < row; i++) {
                board += "----";
            }
        }



*/











/*



        for (int i = 0; i < 11; i++) {
            board += "---";
        }
        for(int z=0; z<3; z++) {
            board += "\n";
            for (int i = (z*3); i < 3+(z*3); i++) {
                board += "| ";
                for (int j = 0; j < 3; j++) {
                    board += tabBoard[i][j] + " ";
                }
                board += "| ";
                for (int j = 3; j < 6; j++) {
                    board += tabBoard[i][j] + " ";
                }
                board += "| ";
                for (int j = 6; j < 9; j++) {
                    board += tabBoard[i][j] + " ";
                }
                board += "|\n";
            }
            for (int i = 0; i < 11; i++) {
                board += "---";
            }
        }



 */