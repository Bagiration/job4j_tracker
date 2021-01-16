package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int p = 0;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product == null) {
                p = i;
                break;
            } else {
                p = -1;
            }
        }
        return p;
    }
}
