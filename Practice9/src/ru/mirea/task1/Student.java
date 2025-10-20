package ru.mirea.task1;

public class Student implements Comparable<Student> {
    String name;
    int iDNumber;

    @Override
    public int compareTo(Student student) {
        return iDNumber - student.iDNumber;
    }
}
