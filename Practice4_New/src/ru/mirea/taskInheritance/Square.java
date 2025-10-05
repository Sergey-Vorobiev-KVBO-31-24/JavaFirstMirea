package ru.mirea.taskInheritance;

public class Square extends Shape {
    final double a;

    public Square(double a) {
        super("Квадрат");
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public String toString()
    {
        return "Фигура: " + type + ", сторона: " + a;
    }

    public double getArea()
    {
        return a*a;
    }

    public double getPerimeter()
    {
        return 4*a;
    }
}
