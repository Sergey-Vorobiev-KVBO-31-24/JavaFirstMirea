package ru.mirea.task4;

import java.util.ArrayList;
import java.util.Collection;

public class PrintFirstFive {
    public static ArrayList<?> printFirstFive(Collection<?> collection) {
        ArrayList<Object> array = new ArrayList<>();
        array.addAll(collection);

        int i = 0;
        for (Object object: collection)
        {
            System.out.println(object.toString());
            i++;
            if (i == 5) break;
        }

        return array;
    }
}