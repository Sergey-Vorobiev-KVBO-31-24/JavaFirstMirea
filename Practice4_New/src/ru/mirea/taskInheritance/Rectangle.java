package ru.mirea.taskInheritance;

public class Rectangle extends Shape {
    final double a;
    final double b;

    public Rectangle(double a, double b) {
        super("Прямоугольник");
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public String toString()
    {
        return "Фигура: " + type + ", a: " + a + ", b: " + b;
    }

    public double getArea()
    {
        return a*b;
    }

    public double getPerimeter()
    {
        return 2*(a+b);
    }
}
