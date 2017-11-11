package com.kodilla.patterns2.facade.decorator.pizza;

import java.math.BigDecimal;

public class SalamiDecorator extends AbstractPizzaDecorator {
    public SalamiDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getToppings() {
        return super.getToppings() + " & salami";
    }
}
