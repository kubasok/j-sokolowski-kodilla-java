package com.kodilla.patterns2.facade.decorator.pizza;

import java.math.BigDecimal;

public class BasePizza implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getToppings() {
        return "Pizza with cheese and tomato sauce";
    }
}
