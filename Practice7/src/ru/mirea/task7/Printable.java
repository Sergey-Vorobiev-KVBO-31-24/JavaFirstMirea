package ru.mirea.task7;

public interface Printable {
    static void print(Printable printable)
    {
        System.out.println(printable.toString());
    }
}
