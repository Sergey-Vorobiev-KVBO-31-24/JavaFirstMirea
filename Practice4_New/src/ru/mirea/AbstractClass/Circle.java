package ru.mirea.AbstractClass;

public class Circle extends Shape {
    final double radius;

    public Circle(double radius) {
        this.type = "Окружность";
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString()
    {
        return "Фигура: " + type + ", радиус: " + radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
}
