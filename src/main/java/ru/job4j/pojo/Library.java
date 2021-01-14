package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Кузнечик", 100);
        Book book2 = new Book("Иванушка", 120);
        Book book3 = new Book("Лодка и весло", 85);
        Book book4 = new Book("Clean code", 230);
        Book[] bookStore = new Book[4];
        bookStore[0] = book1;
        bookStore[1] = book2;
        bookStore[2] = book3;
        bookStore[3] = book4;

        for (int i = 0; i < bookStore.length; i++) {
            Book temp = bookStore[i];
            System.out.println(temp.getName() + " - " + temp.getNumber() + " страниц");
        }
        System.out.println("  ");

        System.out.println("Перестановка местами в массиве");
        Book t = bookStore[0];
        bookStore[0] = bookStore[3];
        bookStore[3] = t;
        for (int i = 0; i < bookStore.length; i++) {
            Book temp = bookStore[i];
            System.out.println(temp.getName() + " - " + temp.getNumber() + " страниц");
        }
        System.out.println("  ");

        System.out.println("Вывод только книг с названием Clean code ");
        for (int i = 0; i < bookStore.length; i++) {
            Book temp = bookStore[i];
            if (temp.getName().equals("Clean code")) {
                System.out.println(temp.getName() + " - " + temp.getNumber() + " страниц");
            }
        }
    }
}
