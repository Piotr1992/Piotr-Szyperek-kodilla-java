package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaMargheritaOrder extends AbstractPizzaOrderDecorator {
    public PizzaMargheritaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(25));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " and oregano";
    }
}
