package ru.mirea.task1;

public class SelectionSort {
    public static void sort(Comparable[] objs)
    {
        if (objs.length < 2) return;

        for (int i=0; i < objs.length; i++)
        {
            for (int j=i; j > 0 && objs[j-1].compareTo(objs[j]) > 0; j--)
            {
                Comparable buffer = objs[j-1];
                objs[j-1] = objs[j];
                objs[j] = buffer;
            }
        }
    }
}
