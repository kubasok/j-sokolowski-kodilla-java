package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;


@Entity
@Table(name = "ITEMS")
public class Item {
    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;

    public Item() {
    }

    public Item(BigDecimal price, int quantity, BigDecimal value) {
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ITEM_ID", unique = true)
    public int getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "ITEM_PRODUCT")
    public Product getProduct() {
        return product;
    }

    @NotNull
    @Column(name = "ITEM_PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @NotNull
    @Column(name = "ITEM_QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    @NotNull
    @Column(name = "ITEM_VALUE")
    public BigDecimal getValue() {
        return value;
    }

    @ManyToOne
    @JoinColumn(name = "ITEM_INVOICE")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
