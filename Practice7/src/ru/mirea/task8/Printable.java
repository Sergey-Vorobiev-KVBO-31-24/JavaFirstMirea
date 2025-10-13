package ru.mirea.task8;

public interface Printable {
    static void print(Printable printable)
    {
        System.out.println(printable.toString());
    }
}
