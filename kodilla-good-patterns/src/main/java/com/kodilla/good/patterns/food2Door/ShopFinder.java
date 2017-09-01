package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;

public class ShopFinder {
    private final Map<Product, Shop> productShopMap = new HashMap<>();

    public ShopFinder() {
        ProvGlutenFreeShop provGlutenFreeShop = new ProvGlutenFreeShop();
        ProvExtraFoodShop provExtraFoodShop = new ProvExtraFoodShop();
        ProvHealthyShop provHealthyShop = new ProvHealthyShop();
        productShopMap.put(new Product("apple"), provExtraFoodShop);
        productShopMap.put(new Product("beetroot"), provGlutenFreeShop);
        productShopMap.put(new Product("cucumber"), provHealthyShop);
        productShopMap.put(new Product("garlic"), provExtraFoodShop);
        productShopMap.put(new Product("nuts"), provGlutenFreeShop);
        productShopMap.put(new Product("soy sauce"), provHealthyShop);
        productShopMap.put(new Product("gluten free snack"), provGlutenFreeShop);
    }

    public Shop findProvider(Product product){
        return productShopMap.get(product);
    }
}

