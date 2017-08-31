package com.kodilla.good.patterns.food2Door;

public class Product {
    private final String name;
    private final Shop provider;
    public Product(final String name, final Shop provider) {
        this.name = name;
        this.provider = provider;
    }

    public String getName() {
        return name;
    }

    public Shop getProvider() {
        return provider;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!name.equals(product.name)) return false;
        return provider.equals(product.provider);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + provider.hashCode();
        return result;
    }
}
