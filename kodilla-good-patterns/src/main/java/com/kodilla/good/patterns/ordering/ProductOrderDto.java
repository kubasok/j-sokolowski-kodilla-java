package com.kodilla.good.patterns.ordering;

public class ProductOrderDto {
    public User user;
    public Product product;
    public boolean ordered;
    public int quantity;

    public ProductOrderDto(final User user, final Product product, final boolean ordered, final int quantity) {
        this.user = user;
        this.product = product;
        this.ordered = ordered;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean getOrdered() {
        return ordered;
    }

    public int getQuantity() {
        return quantity;
    }
}
