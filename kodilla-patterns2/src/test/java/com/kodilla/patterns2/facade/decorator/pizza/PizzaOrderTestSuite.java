package com.kodilla.patterns2.facade.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testGetCostPizzaWithToppings() {
        //Given
        PizzaOrder nicePizza = new BasePizza();
        nicePizza = new ExtraCheeseDecorator(nicePizza);
        nicePizza = new ShrimpsDecorator(nicePizza);
        nicePizza = new OnionsDecorator(nicePizza);
        nicePizza = new SalamiDecorator(nicePizza);
        //When
        BigDecimal cost = nicePizza.getCost();
        //Then
        assertEquals(new BigDecimal(26), cost);
    }
    @Test
    public void testGetDesriptionPizzaWithToppings() {
        //Given
        PizzaOrder nicePizza = new BasePizza();
        nicePizza = new ExtraCheeseDecorator(nicePizza);
        nicePizza = new ShrimpsDecorator(nicePizza);
        nicePizza = new OnionsDecorator(nicePizza);
        nicePizza = new SalamiDecorator(nicePizza);
        //When
        String toppings = nicePizza.getToppings();
        //Then
        assertEquals("Pizza with cheese and tomato sauce & extra cheese & shrimps & onions & salami",toppings);
    }

}