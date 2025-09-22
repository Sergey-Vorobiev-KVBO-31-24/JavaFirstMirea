package ru.mirea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер задания (1,2,4) или 0 для последовательного запуска всех заданий: ");
        int task = sc.nextInt();

        if (task == 1 || task == 0) task1();
        if (task == 2 || task == 0) task2();
        if (task == 4 || task == 0) task4();
    }

    static void task1()
    {
        System.out.println("--- Задание 1 ---");
        ru.mirea.lab1.TestAuthor.test();
    }

    static void task2()
    {
        System.out.println("--- Задание 2 ---");
        ru.mirea.lab2.TestBall.test();
    }

    static void task4()
    {
        System.out.println("--- Задание 4 ---");
        ru.mirea.lab4.ShopTester.test();
    }
}