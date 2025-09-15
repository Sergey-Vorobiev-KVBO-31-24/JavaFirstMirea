package ru.mirea.lab4;

public class Computer {
    private final String model;
    private final int mfgYear;
    public int price;

    public Computer(String model, int mfgYear, int price) {
        this.model = model;
        this.mfgYear = mfgYear;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getMfgYear() {
        return mfgYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return String.format("Компьютер %s (%sг.изг.) по цене %s", model, mfgYear, price);
    }
}
