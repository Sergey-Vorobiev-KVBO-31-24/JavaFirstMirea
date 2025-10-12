package ru.mirea.task4;

public class Tester {
    static void main() {
        Coin coin = new Coin();
        System.out.println(coin.getPrice());

        Bread bread = new Bread(50);
        bread.setPrice(1000);
        System.out.println(bread.getPrice());

        Car car = new Car("XYZ", 1000, 500);
        System.out.println(car.getPrice());

        BookShop shop = new BookShop("These Books", 10000);
        shop.add(new Book("Computer Science", "Somebody", 150));
        System.out.println(shop.getPrice());

        Book boughtBook = shop.sell(0);
        System.out.println(boughtBook.getPrice());
    }
}
