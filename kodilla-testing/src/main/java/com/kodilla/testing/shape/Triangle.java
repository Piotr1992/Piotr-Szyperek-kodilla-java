package com.kodilla.testing.shape;

import java.lang.*;

public class Triangle implements Shape{

    public String getShapeName() {
        return "Triangle";
    }

    public double getField() {

        double a = 2.3;
        double h = 4.6;

        return 0.5*a*h;
    }

}
