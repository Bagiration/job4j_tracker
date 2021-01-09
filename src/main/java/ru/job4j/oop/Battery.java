package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }


    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(40);
        Battery second = new Battery(60);
        System.out.println("first load is " + first.load + ", second load is " + second.load);
        first.exchange(second);
        System.out.println("first load is " + first.load + ", second load is " + second.load);
    }
}
