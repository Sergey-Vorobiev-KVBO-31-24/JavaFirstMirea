package ru.mirea.AbstractClass;

public class Tester {
    static void main() {
        Circle circle = new Circle(1);
        System.out.println(circle.toString());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Rectangle rect = new Rectangle(6, 7);
        System.out.println(rect.toString());
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());

        Square square = new Square(5);
        System.out.println(square.toString());
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}
