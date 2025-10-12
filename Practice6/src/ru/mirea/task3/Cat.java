package ru.mirea.task3;

public class Cat implements Nameable {
    String name, breed;
    int age;

    public Cat(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void agePlus()
    {
        age++;
    }
}
