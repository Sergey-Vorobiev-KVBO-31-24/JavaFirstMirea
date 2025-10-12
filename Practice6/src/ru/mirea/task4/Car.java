package ru.mirea.task4;

public class Car implements Priceable {
    String model;
    int price, power;

    public Car(String model, int price, int power) {
        this.model = model;
        this.price = price;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
