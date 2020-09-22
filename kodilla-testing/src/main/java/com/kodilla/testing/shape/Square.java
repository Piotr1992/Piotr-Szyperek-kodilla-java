package com.kodilla.testing.shape;

import java.lang.*;

public class Square implements Shape {

    public String getShapeName() {
        return "Square";
    }

    public double getField() {

        double a = 2.3;

        return a*a;
    }

}
