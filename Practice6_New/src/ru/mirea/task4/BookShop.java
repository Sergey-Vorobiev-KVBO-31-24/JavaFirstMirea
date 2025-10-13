package ru.mirea.task4;

import ru.mirea.task3.Nameable;

import java.util.ArrayList;

public class BookShop implements Priceable {
    String name;
    ArrayList<Book> books;
    int price, cash;

    public BookShop(String name, int price) {
        this.name = name;
        this.books = new ArrayList<Book>();
        this.price = price;
        this.cash = 0;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCash() {
        return cash;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void add(Book book)
    {
        books.add(book);
    }

    public Book sell(int index)
    {
        cash += books.get(index).getPrice();
        return books.remove(index);
    }

    public void show()
    {
        for (Book book: books) System.out.println(book.getName());
    }
}