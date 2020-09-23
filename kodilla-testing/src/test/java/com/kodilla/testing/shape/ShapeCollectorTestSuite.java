package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
import java.util.*;

@Nested
@DisplayName("TDD: Shape Test Suite \uD83D\uDE31")
public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        //Given
        List<Shape> listFigures = new ArrayList<>();
        ShapeCollector sc = new ShapeCollector(listFigures);

        //When
        sc.addFigure(new Triangle(1.2, 5.6));
        sc.addFigure(new Circle(3.14, 7.8));
        sc.addFigure(new Square(9.0));

        //Then
        Assertions.assertEquals(3, sc.getListFigures().size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        List<Shape> listFigures = new ArrayList<>();
        ShapeCollector sc = new ShapeCollector(listFigures);
        sc.addFigure(new Triangle(1.2, 5.6));
        sc.addFigure(new Circle(3.14, 7.8));
        sc.addFigure(new Square(9.0));

        //When
        boolean result = sc.getListFigures().removeAll(listFigures);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, sc.getListFigures().size());
    }

    @Test
    public void testGetFigure() {
        //Given
        List<Shape> listFigures = new ArrayList<>();
        ShapeCollector sc = new ShapeCollector(listFigures);
        sc.addFigure(new Triangle(1.2, 5.6));
        sc.addFigure(new Circle(3.14, 7.8));
        sc.addFigure(new Square(9.0));

        //When
        ShapeCollector retrievedSC = new ShapeCollector(listFigures);
        retrievedSC.addFigure(listFigures.get(0));
        retrievedSC.addFigure(listFigures.get(1));
        retrievedSC.addFigure(listFigures.get(2));

        //Then
        Assertions.assertEquals(sc, retrievedSC);
    }

    @Test
    public void testShowFigures() {
        //Given
        List<Shape> listFigures = new ArrayList<>();
        ShapeCollector sc = new ShapeCollector(listFigures);
        sc.addFigure(new Triangle(1.2, 5.6));
        sc.addFigure(new Circle(3.14, 7.8));
        sc.addFigure(new Square(9.0));

        //When
        boolean result = sc.getListFigures().containsAll(listFigures);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(3, sc.getListFigures().size());
    }



}
