package ru.mirea.task3;

import java.util.ArrayList;

public class BookShop implements Nameable {
    String name;
    ArrayList<Book> books;

    public BookShop(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(Book book)
    {
        books.add(book);
    }

    public Book sell(int index)
    {
        return books.remove(index);
    }

    public void show()
    {
        for (Book book: books) System.out.println(book.getName());
    }
}