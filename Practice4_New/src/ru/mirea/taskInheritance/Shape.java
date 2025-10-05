package ru.mirea.taskInheritance;

public class Shape {
    final String type;

    public Shape(String type)
    {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString()
    {
        return "Фигура: " + type;
    }
}
