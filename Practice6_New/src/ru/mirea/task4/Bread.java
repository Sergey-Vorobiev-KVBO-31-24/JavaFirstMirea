package ru.mirea.task4;

public class Bread implements Priceable {
    int price;

    public Bread(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
