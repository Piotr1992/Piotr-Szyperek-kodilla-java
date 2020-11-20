package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    public static int EMPTY = -1;
    public int value;
    public List<Integer> listValue = new ArrayList<>();

    public SudokuElement() {
        for(int i = 1; i < 10; i++) {
            listValue.add(i);
        }
    }

    public List<Integer> getListValue() {
        return listValue;
    }
}
