package ru.mirea.task3;

public class Street implements Nameable {
    String name;
    double square;
    boolean hasMetro;

    public Street(String name, double square, boolean hasMetro) {
        this.name = name;
        this.square = square;
        this.hasMetro = hasMetro;
    }

    public String getName() {
        return name;
    }

    public double getSquare() {
        return square;
    }

    public boolean isHasMetro() {
        return hasMetro;
    }
}
