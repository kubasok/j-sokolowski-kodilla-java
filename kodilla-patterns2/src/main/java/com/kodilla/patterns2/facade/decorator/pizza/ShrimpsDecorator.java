package com.kodilla.patterns2.facade.decorator.pizza;

import java.math.BigDecimal;

public class ShrimpsDecorator extends AbstractPizzaDecorator {
    public ShrimpsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getToppings() {
        return super.getToppings() + " & shrimps";
    }
}
