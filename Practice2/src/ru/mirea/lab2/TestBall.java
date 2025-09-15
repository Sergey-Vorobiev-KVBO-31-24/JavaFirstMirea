package ru.mirea.lab2;

import java.util.Scanner;

public class TestBall {
    public static void test() {
        Scanner sc = new Scanner(System.in);
        Ball ball1 = new Ball();
        System.out.println("Мячик номер 1: ");
        System.out.println(ball1.toString());

        System.out.println("Мячик номер 2: ");
        System.out.println("Введите координаты x,y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Ball ball2 = new Ball(x, y);
        System.out.println(ball2.toString());

        System.out.println("Введите новые координаты x,y: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        ball2.setXY(x, y);
        System.out.println(ball2.toString());

        System.out.println("Введите перемещения по x и по y: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        ball2.move(x, y);
        System.out.println(ball2.toString());
    }
}
