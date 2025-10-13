package ru.mirea.task8;

public class Magazine implements Printable {
    String title, country, year;

    @Override
    public String toString()
    {
        return String.format("%s {страна: %s, год: %s}", title, country, year);
    }

    public Magazine(String title, String country, String year) {
        this.title = title;
        this.country = country;
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
