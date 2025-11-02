package ru.mirea.task1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Воробьёв");

        System.out.println("Дата и время получения задания:");
        System.out.println("Sun Nov 02 16:29:49 MSK 2025");

        System.out.println("Дата и время сдачи задания:");
        Date date = new Date();
        System.out.println(date.toString());
    }
}
