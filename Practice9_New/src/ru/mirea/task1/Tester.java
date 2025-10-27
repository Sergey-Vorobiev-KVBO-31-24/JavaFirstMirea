package ru.mirea.task1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[25];
        for (int i=0; i < students.length; i++)
        {
            String name = "Кто-то";
            int iDNumber = sc.nextInt();
            students[i] = new Student(name, iDNumber);
        }

        SelectionSort.sort(students);

        for (Student student: students) System.out.printf("%d ", student.getIDNumber());
    }
}
