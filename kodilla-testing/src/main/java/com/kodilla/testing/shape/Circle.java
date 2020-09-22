package com.kodilla.testing.shape;

import java.lang.*;

public class Circle implements Shape {

    public String getShapeName() {
        return "Circle";
    }

    public double getField() {

        double pi = 3.14;
        double r = 2;

        return pi*r*r;
    }

}
