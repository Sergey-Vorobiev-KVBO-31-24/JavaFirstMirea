package ru.mirea.task2;

import ru.mirea.task1.Student;
import java.util.ArrayList;

public class SortingStudentsByGPA {
    ArrayList<Student> students;

    public SortingStudentsByGPA() {
        students = new ArrayList<Student>();
    }

    public SortingStudentsByGPA(int initialCapacity) {
        students = new ArrayList<Student>(initialCapacity);
    }

    public SortingStudentsByGPA(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getArray() {
        return students;
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public void removeStudent(int index)
    {
        if (index >= 0 && index < students.size()) students.remove(index);
    }

    public void setArray(ArrayList<Student> students)
    {
        this.students = students;
    }

    public void clearArray()
    {
        students.clear();
    }

    public void outArray()
    {
        for (Student student: students) System.out.println(student.toString());
    }

    public void quicksort()
    {
        if (students.size() < 2) return;

        StudentGPAComparator comp = new StudentGPAComparator();

        Student mid = students.get(students.size()/2);
        SortingStudentsByGPA lessThan = new SortingStudentsByGPA(students.size());
        SortingStudentsByGPA equalTo = new SortingStudentsByGPA(students.size());
        SortingStudentsByGPA moreThan = new SortingStudentsByGPA(students.size());

        for (Student student: students)
        {
            if (comp.compare(student, mid) < 0) lessThan.addStudent(student);
            else if (comp.compare(student, mid) > 0) moreThan.addStudent(student);
            else equalTo.addStudent(student);
        }

        lessThan.quicksort();
        moreThan.quicksort();

        students = lessThan.getArray();
        students.addAll(equalTo.getArray());
        students.addAll(moreThan.getArray());
    }

    public void mergesort()
    {

    }
}
