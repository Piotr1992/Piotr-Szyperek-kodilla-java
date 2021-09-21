package com.kodilla.sudoku;

public class SudokuBoard {
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
                tabBoard[i][j] = 0;
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