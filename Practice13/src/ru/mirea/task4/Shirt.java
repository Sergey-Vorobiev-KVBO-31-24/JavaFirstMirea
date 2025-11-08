package ru.mirea.task4;

public class Shirt {
    protected String article, title, color, size;

    public Shirt(String description) {
        String[] splitting = description.split(",");
        article = splitting[0];
        title = splitting[1];
        color = splitting[2];
        size = splitting[3];
    }

    @Override
    public String toString()
    {
        return String.format("Артикул: %s, наименование: %s, цвет: %s, размер: %s", article, title, color, size);
    }
}
