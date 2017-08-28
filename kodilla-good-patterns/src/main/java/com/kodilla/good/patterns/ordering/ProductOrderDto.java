package com.kodilla.good.patterns.ordering;

public class ProductOrderDto {
    public User user;
    public Product product;
    public boolean isOrdered;

    public ProductOrderDto(final User user, final Product product, final boolean isOrdered) {
        this.user = user;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean getIsOrdered() {
        return isOrdered;
    }
}
