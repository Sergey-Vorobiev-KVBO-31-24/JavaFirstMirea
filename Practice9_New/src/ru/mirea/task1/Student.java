package ru.mirea.task1;

public class Student implements Comparable<Student> {
    String name;
    int iDNumber;

    public String getName() {
        return name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public Student(String name, int iDNumber) {
        this.name = name;
        this.iDNumber = iDNumber;
    }

    @Override
    public int compareTo(Student student) {
        return iDNumber - student.iDNumber;
    }
}
