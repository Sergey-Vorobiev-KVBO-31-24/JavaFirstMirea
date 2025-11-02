package ru.mirea.task2;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите дату:");
        long time = sc.nextLong();

        Date date1 = new Date(time);
        Date date2 = new Date();

        if (date1.compareTo(date2) > 0) System.out.println("Введённая дата позже текущей.");
        else if (date1.compareTo(date2) < 0) System.out.println("Введённая дата раньше текущей.");
        else System.out.println("Введённая дата совпадает с текущей.");
    }
}
