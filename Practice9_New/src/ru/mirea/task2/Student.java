package ru.mirea.task2;

public class Student implements Comparable<Student> {
    String name;
    int iDNumber;
    int score;

    public String getName() {
        return name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public int getScore() {
        return score;
    }

    public Student(String name, int iDNumber, int score) {
        this.name = name;
        this.iDNumber = iDNumber;
        this.score = score;
    }

    @Override
    public int compareTo(Student student) {
        return score - student.score;
    }
}
