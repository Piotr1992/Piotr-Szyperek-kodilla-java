package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaHawayanaOrder extends AbstractPizzaOrderDecorator {
    public PizzaHawayanaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(30));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", ham, pineapple and oregano";
    }
}

