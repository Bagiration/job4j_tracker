package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int p = -1;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product == null) {
                p = i;
                break;
            }
        }
        return p;
    }
}