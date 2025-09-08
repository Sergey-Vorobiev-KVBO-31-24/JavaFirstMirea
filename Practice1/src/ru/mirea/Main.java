package ru.mirea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер задания (3,4,5,6,7) или 0 для последовательного запуска всех заданий: ");
        int task = sc.nextInt();

        if (task == 3 || task == 0) task3(sc);
        if (task == 4 || task == 0) task4(sc);
        if (task == 5 || task == 0) task5(sc, args);
        if (task == 6 || task == 0) task6(sc);
        if (task == 7 || task == 0) task7(sc);
    }

    static void task3(Scanner sc)
    {
        System.out.println("--- Задание 3 ---");
        int[] numbers = {5,25,125,625,3125};
        System.out.println("Собственно массив: ");
        for (int number: numbers) System.out.println(number);

        int sum = 0;
        for (int number : numbers) sum += number;

        System.out.println("Сумма элементов массива: ");
        System.out.println(sum);
        System.out.println("Среднее арифметическое чисел массива: ");
        System.out.println(sum/numbers.length);
    }

    static void task4(Scanner sc)
    {
        System.out.println("--- Задание 4 ---");
        System.out.println("Введите длину массива: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        if (n == 0) return;

        System.out.println("Введите каждое число массива: ");
        int i = 0;
        while (i < n)
        {
            numbers[i] = sc.nextInt();
            i++;
        }

        int sum = 0, max = numbers[0], min = numbers[0];
        i = 0;
        do
        {
            sum += numbers[i];
            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] < min) min = numbers[i];
            i++;
        }
        while (i < n);

        System.out.println("Сумма элементов массива: ");
        System.out.println(sum);
        System.out.println("Максимальный элемент массива: ");
        System.out.println(max);
        System.out.println("Минимальный элемент массива: ");
        System.out.println(min);
    }

    static void task5(Scanner sc, String[] args)
    {
        System.out.println("--- Задание 5 ---");
        System.out.println("Аргументы командной строки: ");
        for (String arg : args) System.out.println(arg);
    }

    static void task6(Scanner sc)
    {
        System.out.println("--- Задание 6 ---");
        System.out.println("Первые 10 чисел гармонического ряда: ");
        for (int n=1; n <= 10; n++) System.out.println(1.0/n);
    }

    static void task7(Scanner sc)
    {
        System.out.println("--- Задание 7 ---");
        System.out.println("Введите неотрицательное целое число: ");
        int n = sc.nextInt();
        System.out.println("Факториал числа: ");
        System.out.println(MyMath.factorial(n));
    }
}
