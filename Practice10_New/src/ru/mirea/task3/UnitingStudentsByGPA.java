package ru.mirea.task3;

import java.util.Comparator;
import ru.mirea.task1.Student;
import ru.mirea.task2.StudentGPAComparator;

import ru.mirea.task2.SortingStudentsByGPA;

public class UnitingStudentsByGPA {
    public static SortingStudentsByGPA unite(SortingStudentsByGPA ssbGPA1, SortingStudentsByGPA ssbGPA2)
    {
        return unite(ssbGPA1, ssbGPA2, false, false, true);
    }

    public static SortingStudentsByGPA unite(SortingStudentsByGPA ssbGPA1, SortingStudentsByGPA ssbGPA2, boolean reverse, boolean list1IsSorted, boolean list2IsSorted)
    {
        Comparator<Student> comp = SortingStudentsByGPA.getComp();

        if (!list1IsSorted) ssbGPA1.quicksort(true);
        if (!list2IsSorted) ssbGPA2.quicksort(true);

        SortingStudentsByGPA result = new SortingStudentsByGPA();
        for (int i=0, j=0; i < ssbGPA1.size() || j < ssbGPA2.size(); )
        {
            if (j == ssbGPA2.size())
            {
                result.addStudent(ssbGPA1.getStudent(i));
                i++;
            }
            else if (i == ssbGPA1.size())
            {
                result.addStudent(ssbGPA2.getStudent(j));
                j++;
            }
            else if (comp.compare(ssbGPA1.getStudent(i), ssbGPA2.getStudent(j)) < 0)
            {
                if (!reverse)
                {
                    result.addStudent(ssbGPA1.getStudent(i));
                    i++;
                }
                else
                {
                    result.addStudent(ssbGPA2.getStudent(j));
                    j++;
                }
            }
            else
            {
                if (!reverse)
                {
                    result.addStudent(ssbGPA2.getStudent(j));
                    j++;
                }
                else
                {
                    result.addStudent(ssbGPA1.getStudent(i));
                    i++;
                }
            }
        }
        return result;
    }
}
