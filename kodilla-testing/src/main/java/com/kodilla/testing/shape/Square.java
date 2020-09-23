package com.kodilla.testing.shape;

import java.lang.*;
import java.util.Objects;

public class Square implements Shape {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.a, a) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }

    public String getShapeName() {
        return "Square";
    }

    public double getField() {
        return a*a;
    }

}
