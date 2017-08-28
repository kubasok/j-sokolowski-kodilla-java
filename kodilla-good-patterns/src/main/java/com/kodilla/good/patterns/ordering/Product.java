package com.kodilla.good.patterns.ordering;

public class Product {
    private final String productName;

    public Product(final String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return productName.hashCode();
    }
}
