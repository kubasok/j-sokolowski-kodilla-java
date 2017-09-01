package com.kodilla.good.patterns.food2Door;

public class ProvGlutenFreeShop implements Shop {
    Product glutenFreeSnack = new Product("gluten free snack");
    public boolean process(Product orderedProduct, double quantity){

        System.out.println(glutenFreeSnack.getName() + " added extra to your order : "
                + quantity + " " + orderedProduct.getName());
        return true;
    }

}
