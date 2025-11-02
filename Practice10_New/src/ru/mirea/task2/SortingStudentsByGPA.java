package ru.mirea.task2;

import ru.mirea.task1.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class SortingStudentsByGPA {
    ArrayList<Student> students;
    static Comparator<Student> comp = new StudentGPAComparator();

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

    public int size()
    {
        return students.size();
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public void addAll(Collection<Student> students)
    {
        this.students.addAll(students);
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

    public Student getStudent(int index)
    {
        return students.get(index);
    }

    public void quicksort(boolean reverse)
    {
        if (students.size() < 2) return;

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

        lessThan.quicksort(reverse);
        moreThan.quicksort(reverse);

        if (!reverse)
        {
            students = lessThan.getArray();
            students.addAll(equalTo.getArray());
            students.addAll(moreThan.getArray());
        }
        else
        {
            students = moreThan.getArray();
            students.addAll(equalTo.getArray());
            students.addAll(lessThan.getArray());
        }
    }

    public void mergesort(boolean reverse)
    {
        if (students.size() < 2) return;

        SortingStudentsByGPA firstHalf = new SortingStudentsByGPA(students.size()/2 + 1);
        SortingStudentsByGPA secondHalf = new SortingStudentsByGPA(students.size()/2 + 1);

        firstHalf.addAll(students.subList(0, students.size()/2));
        secondHalf.addAll(students.subList(students.size()/2, students.size()));

        firstHalf.mergesort(reverse);
        secondHalf.mergesort(reverse);

        students.clear();
        for (int i=0, j=0; i < firstHalf.size() || j < secondHalf.size(); )
        {
            if (j == secondHalf.size())
            {
                students.add(firstHalf.getStudent(i));
                i++;
            }
            else if (i == firstHalf.size())
            {
                students.add(secondHalf.getStudent(j));
                j++;
            }
            else if (comp.compare(firstHalf.getStudent(i), secondHalf.getStudent(j)) < 0)
            {
                if (!reverse)
                {
                    students.add(firstHalf.getStudent(i));
                    i++;
                }
                else
                {
                    students.add(secondHalf.getStudent(j));
                    j++;
                }
            }
            else
            {
                if (!reverse)
                {
                    students.add(secondHalf.getStudent(j));
                    j++;
                }
                else
                {
                    students.add(firstHalf.getStudent(i));
                    i++;
                }
            }
        }
    }

    public static void changeComp(Comparator<Student> comp)
    {
        SortingStudentsByGPA.comp = comp;
    }

    public static Comparator<Student> getComp()
    {
        return comp;
    }
}
