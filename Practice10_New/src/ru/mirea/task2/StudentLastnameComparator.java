package ru.mirea.task2;

import ru.mirea.task1.Student;
import java.util.Comparator;

public class StudentLastnameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2)
    {
        return o1.getLastname().compareTo(o2.getLastname());
    }
}
