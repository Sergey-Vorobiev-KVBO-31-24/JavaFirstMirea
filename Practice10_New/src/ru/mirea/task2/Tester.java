package ru.mirea.task2;

import ru.mirea.task1.Student;

public class Tester {
    public static void main(String[] args) {
        SortingStudentsByGPA studentArray = new SortingStudentsByGPA(5);

        studentArray.addStudent(new Student("name", "lastname", "spec", 4, "group", 25));
        studentArray.addStudent(new Student("name", "lastname", "spec", 4, "group", 5));
        studentArray.addStudent(new Student("name", "lastname", "spec", 4, "group", 125));
        studentArray.addStudent(new Student("name", "lastname", "spec", 4, "group", 5));
        studentArray.addStudent(new Student("name", "lastname", "spec", 4, "group", 1));

        System.out.println("До сортировки:");
        studentArray.outArray();
        System.out.println();

        studentArray.quicksort(true);
        System.out.println("После quicksort:");
        studentArray.outArray();
        System.out.println();

        studentArray.clearArray();
        studentArray.addStudent(new Student("name", "lastname", "spec", 4, "group", 25));
        studentArray.addStudent(new Student("name", "lastname", "spec", 4, "group", 5));
        studentArray.addStudent(new Student("name", "lastname", "spec", 4, "group", 125));
        studentArray.addStudent(new Student("name", "lastname", "spec", 4, "group", 5));
        studentArray.addStudent(new Student("name", "lastname", "spec", 4, "group", 1));

        studentArray.mergesort(true);
        System.out.println("После mergesort:");
        studentArray.outArray();
        System.out.println();
    }
}
