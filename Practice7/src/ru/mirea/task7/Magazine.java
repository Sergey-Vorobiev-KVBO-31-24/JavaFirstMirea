package ru.mirea.task7;

public class Magazine implements Printable {
    String title, author, country, genre, year;

    @Override
    public String toString()
    {
        return String.format("%s {страна: %s, год: %s}", title, country, year);
    }

    public Magazine(String title, String author, String country, String genre, String year) {
        this.title = title;
        this.author = author;
        this.country = country;
        this.genre = genre;
        this.year = year;
    }

    public static void printMagazines(Printable[] printables)
    {
        System.out.println("Названия только журналов:");
        for (Printable printable: printables)
        {
            if (printable instanceof Magazine) Printable.print(printable);
        }
    }
}
