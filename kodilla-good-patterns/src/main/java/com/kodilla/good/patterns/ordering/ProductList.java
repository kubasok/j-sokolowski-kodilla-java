package com.kodilla.good.patterns.ordering;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private final List<Product> productList = new ArrayList<>();

    public ProductList() {
        productList.add(new Product("dishwasher"));
        productList.add(new Product("washing machine"));
        productList.add(new Product("refrigerator"));
        productList.add(new Product("oven"));
    }
    public List<Product> getProductList(){
        return productList;
    }
}
