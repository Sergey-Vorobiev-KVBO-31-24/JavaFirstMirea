package ru.mirea.task1;

import java.util.ArrayList;
import java.util.Collection;

public class MyConverter {
    public static ArrayList<?> convert(Collection<?> array)
    {
        ArrayList<Object> converted = new ArrayList<>(array);
        return converted;
    }
}
