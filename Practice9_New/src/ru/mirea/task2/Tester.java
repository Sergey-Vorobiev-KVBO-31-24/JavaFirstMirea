package ru.mirea.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Comparable> students = new ArrayList<Comparable>(25);
        for (int i=0; i < 25; i++)
        {
            String name = "Кто-то";
            int iDNumber = 5;
            int score = sc.nextInt();
            students.add(new Student(name, iDNumber, score));
        }

        students = QuickSort.sorted(students, true);

        for (Comparable student: students)
        {
            System.out.printf("%d ", ((Student) student).getScore());
        }
    }
}
