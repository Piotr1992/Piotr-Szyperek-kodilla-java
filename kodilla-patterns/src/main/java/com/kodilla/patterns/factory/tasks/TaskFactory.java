package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING = "Driving";
    public static final String PAINTING = "Painting";
    public static final String SHOPPING = "Shopping";

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Delivery of product", "New York", "truck");
            case PAINTING:
                return new PaintingTask("Draw a portrait", "green", "spring");
            case SHOPPING:
                return new ShoppingTask("Do a shopping", "fruits", 4.5);
            default:
                return null;
        }
    }
}