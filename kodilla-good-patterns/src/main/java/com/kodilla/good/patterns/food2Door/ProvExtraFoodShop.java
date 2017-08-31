package com.kodilla.good.patterns.food2Door;

public class ProvExtraFoodShop implements Shop {
    public boolean process(Product orderedProduct, double quantity){

        System.out.println("E-mail sent to Extra Food Shop for your order: "
                + quantity + " " + orderedProduct.getName());
        return true;
    }
}
