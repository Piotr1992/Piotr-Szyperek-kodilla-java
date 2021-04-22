package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaCarbonaraOrder extends AbstractPizzaOrderDecorator {
    public PizzaCarbonaraOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(37));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", sour cream sauce, bacon, onion, champignons and oregano";
    }
}
