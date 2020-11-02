
package com.kodilla.good.patterns.challenges;

public class Product {

    private String name;
    private String code;
    private double price;
    private int quantity;
    private String unitOfMeasure;

    public Product(final String name, final String code, final double price, final int quantity, final String unitOfMeasure) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.quantity = quantity;
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() { return quantity; }
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }
}
