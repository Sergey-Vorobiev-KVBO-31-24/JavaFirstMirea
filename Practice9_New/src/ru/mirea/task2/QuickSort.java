package ru.mirea.task2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class QuickSort {
    public static ArrayList<Comparable> sorted(ArrayList<Comparable> objs)
    {
        return sorted(objs, false);
    }

    public static ArrayList<Comparable> sorted(ArrayList<Comparable> objs, boolean reverse)
    {
        if (objs.size() < 2) return objs;

        Comparable mid = objs.get(objs.size()/2);
        ArrayList<Comparable> lessThan = new ArrayList<Comparable>(objs.size());
        ArrayList<Comparable> equalTo = new ArrayList<Comparable>(objs.size());
        ArrayList<Comparable> moreThan = new ArrayList<Comparable>(objs.size());

        for (Comparable obj: objs)
        {
            if (!reverse)
            {
                if (obj.compareTo(mid) < 0) lessThan.add(obj);
                else if (obj.compareTo(mid) > 0) moreThan.add(obj);
                else equalTo.add(obj);
            }
            else
            {
                if (obj.compareTo(mid) > 0) lessThan.add(obj);
                else if (obj.compareTo(mid) < 0) moreThan.add(obj);
                else equalTo.add(obj);
            }
        }

        lessThan = sorted(lessThan, reverse);
        moreThan = sorted(moreThan, reverse);

        objs = lessThan;
        objs.addAll(equalTo);
        objs.addAll(moreThan);

        return objs;
    }
}
