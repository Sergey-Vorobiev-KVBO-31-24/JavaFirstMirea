package ru.mirea.task8;

public class Book implements Printable {
    String title, author, country, genre, year;

    @Override
    public String toString()
    {
        return String.format("%s {автор, %s, страна: %s, жанр: %s, год: %s}", title, author, country, genre, year);
    }

    public Book(String title, String author, String country, String genre, String year) {
        this.title = title;
        this.author = author;
        this.country = country;
        this.genre = genre;
        this.year = year;
    }

    public static void printBooks(Printable[] printables)
    {
        System.out.println("Названия только книг:");
        for (Printable printable: printables)
        {
            if (printable instanceof Book) Printable.print(printable);
        }
    }
}
