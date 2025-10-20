package ru.mirea.task1;

public class SelectionSort {
    public static void sort(Comparable[] objs)
    {
        if (objs.length < 2) return;

        for (int i=0; i < objs.length; i++)
        {
            for (int j=i+1; j < objs.length; j++)
            {
                if (objs[i].compareTo(objs[j]) > 0)
                {
                    objs[i] = objs[j];
                    break;
                }
            }
        }
    }
}
