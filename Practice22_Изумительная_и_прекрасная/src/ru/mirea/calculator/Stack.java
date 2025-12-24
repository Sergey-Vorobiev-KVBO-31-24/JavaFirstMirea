package ru.mirea.calculator;

import java.util.ArrayList;

public class Stack {
    protected ArrayList<Double> content;
    protected int size;

    public Stack() {
        content = new ArrayList<>();
        size = 0;
    }

    public boolean isEmpty()
    {
        return content.isEmpty();
    }

    public int getSize() {
        return size;
    }

    public double pop()
    {
        if (size == 0) throw new StackError("попытка обращения к пустому стэку.");
        size--;
        return content.removeLast();
    }

    public void push(double num)
    {
        content.add(num);
        size++;
    }

    public void printAll()
    {
        for (double num: content) System.out.print(num + ' ');
    }
}
