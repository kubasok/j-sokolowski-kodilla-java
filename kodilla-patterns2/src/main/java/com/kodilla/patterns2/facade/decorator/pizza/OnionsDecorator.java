package com.kodilla.patterns2.facade.decorator.pizza;

import java.math.BigDecimal;

public class OnionsDecorator extends AbstractPizzaDecorator {
    public OnionsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1));
    }

    @Override
    public String getToppings() {
        return super.getToppings() + " & onions";
    }
}
