package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product product = of("Oil", 100);
        System.out.println(product.label());
    }

    public static Product of(String name, int price) {
        if ("Oil".equals(name)) {
            return new Product(name, price);
        }
        return new Product(name, price);
    }

    public static int indexOfNull(Product[] products) {
        int rsl = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                return i;
            }
        }
        return rsl;
    }
}