package ru.job4j.oop.Inheritance;

import ru.job4j.pojo.Product;

public final class LiquidationProduct {

    private Product product;

    public LiquidationProduct(String name, int price) {
        this.product = new Product(name, price);
    }

    public String label() {
        return product.label();
    }
}