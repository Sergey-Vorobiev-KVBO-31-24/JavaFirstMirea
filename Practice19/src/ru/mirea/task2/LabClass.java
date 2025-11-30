package ru.mirea.task2;

import java.util.ArrayList;

public class LabClass {
    protected ArrayList<Student> students = new ArrayList<>();

    public void add(Student student)
    {
        students.add(student);
    }

    public void clear()
    {
        students.clear();
    }

    public Student get(int index)
    {
        return students.get(index);
    }

    public Student find(String name)
    {
        if (name.isEmpty()) throw new EmptyStringException("поиск по пустому имени");

        for (Student student: students)
        {
            if (student.getName().equals(name)) return student;
        }
        throw new StudentNotFoundException("студентов с данным именем нет");
    }
}