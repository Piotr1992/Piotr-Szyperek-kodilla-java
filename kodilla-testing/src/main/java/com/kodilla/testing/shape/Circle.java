package com.kodilla.testing.shape;

import java.lang.*;
import java.util.Objects;

public class Circle implements Shape {

    private double pi;
    private double r;

    public Circle(double pi, double r) {
        this.pi = pi;
        this.r = r;
    }

    public double getPi() {
        return pi;
    }

    public double getR() {
        return r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.pi, pi) == 0 &&
                Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pi, r);
    }

    public String getShapeName() {
        return "Circle";
    }

    public double getField() {
        return pi*r*r;
    }

}
