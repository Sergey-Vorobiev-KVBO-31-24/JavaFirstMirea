package ru.mirea.AbstractClass;

abstract public class Shape {
    String type;

    public String getType() {
        return type;
    }

    abstract public double getArea();

    abstract public double getPerimeter();
}
