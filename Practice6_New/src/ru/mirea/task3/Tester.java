package ru.mirea.task3;

public class Tester {
    public static void main(String[] args) {
        Planet planetX = new Planet("X", 125, 625, 3125);
        System.out.println(planetX.getName());

        Cat cat = new Cat("Snezhok", "Manul", 5);
        cat.agePlus();
        System.out.println(cat.getName());

        Street street = new Street("Street Y", 100, false);
        System.out.println(street.getName());

        BookShop shop = new BookShop("These Books");
        shop.add(new Book("Book 5", "Anonymous"));
        System.out.println(shop.getName());

        Book boughtBook = shop.sell(0);
        System.out.println(boughtBook.getName());
    }
}
