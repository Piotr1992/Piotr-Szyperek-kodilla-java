
package com.kodilla.testing.shape;

import com.kodilla.testing.shape.*;

import java.util.*;

public class ShapeCollector {

    private List<Shape> listFigures = new ArrayList<>();

    public ShapeCollector(List<Shape> listFigures) {
        this.listFigures = listFigures;
    }

    public List<Shape> getListFigures() {
        return listFigures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShapeCollector that = (ShapeCollector) o;
        return Objects.equals(listFigures, that.listFigures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listFigures);
    }

    public void addFigure(Shape shape) {
        listFigures.add(shape);
    }

    public void removeFigure(Shape shape) {
        listFigures.remove(shape);
    }

    public Shape getFigure(int n) {
        return getListFigures().get(n);
    }

    public List<Shape> showFigures() {
        return listFigures;
    }

}
