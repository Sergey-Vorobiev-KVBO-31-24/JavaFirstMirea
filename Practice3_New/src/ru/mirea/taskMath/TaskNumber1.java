package ru.mirea.taskMath;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;

public class TaskNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Введите длину массива 1: ");
        n = sc.nextInt();

        ArrayList<Integer> list1 = new ArrayList<Integer>(n);
        for (int i=0; i < n; i++)
        {
            Integer num = (int)(Math.random() * 20 + 5);
            list1.add(num);
        }
        System.out.println(list1.toString());


        Random rnd = new Random();
        System.out.println("Введите длину массива 2: ");
        n = sc.nextInt();

        ArrayList<Integer> list2 = new ArrayList<Integer>(n);
        for (int i=0; i < n; i++)
        {
            Integer num = (rnd.nextInt(5,25));
            list2.add(num);
        }
        System.out.println(list2.toString());


        list1.sort(Comparator.naturalOrder());
        System.out.println("Отсортированный массив 1:");
        System.out.println(list1.toString());
        list2.sort(Comparator.naturalOrder());
        System.out.println("Отсортированный массив 2:");
        System.out.println(list2.toString());
    }
}
