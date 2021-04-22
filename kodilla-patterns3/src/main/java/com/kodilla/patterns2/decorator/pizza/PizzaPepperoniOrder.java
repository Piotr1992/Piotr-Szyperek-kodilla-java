package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaPepperoniOrder extends AbstractPizzaOrderDecorator {
    public PizzaPepperoniOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(34));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", pepperoni sausage, onion, and oregano";
    }
}
