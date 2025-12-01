package ru.mirea.task3;

import ru.mirea.task2.UniArray;
import java.util.ArrayList;

public class ExtendedUniArray extends UniArray {
    ArrayList<Object> content;

    public ExtendedUniArray()
    {
        content = new ArrayList<>();
    }

    public ExtendedUniArray(int capacity)
    {
        content = new ArrayList<>(capacity);
    }

    public ExtendedUniArray(ExtendedUniArray uniArray) {
        content = new ArrayList<>();
        content.addAll(uniArray.content);
    }

    public int size()
    {
        return content.size();
    }

    public void clear()
    {
        content = new ArrayList<>();
    }

    public void add(Object object)
    {
        content.add(object);
    }

    public void add(byte number)
    {
        Byte object = number;
        content.add(object);
    }

    public void add(int number)
    {
        Integer object = number;
        content.add(object);
    }

    public void add(short number)
    {
        Short object = number;
        content.add(object);
    }

    public void add(long number)
    {
        Long object = number;
        content.add(object);
    }

    public void add(float number)
    {
        Float object = number;
        content.add(object);
    }

    public void add(double number)
    {
        Double object = number;
        content.add(object);
    }

    public void add(boolean bool)
    {
        Boolean object = bool;
        content.add(object);
    }

    public void add(char character)
    {
        Character object = character;
        content.add(object);
    }

    public Object get(int index)
    {
        if (index < 0 || index >= content.size()) throw new IndexOutOfBoundsException();
        return content.get(index);
    }
}