package ru.mirea.task1;

public class Student {
    String name;
    String lastname;
    String spec;
    int year;
    String group;
    int gPA;

    public Student(String name, String lastname, String spec, int year, String group, int gPA) {
        this.name = name;
        this.lastname = lastname;
        this.spec = spec;
        this.year = year;
        this.group = group;
        this.gPA = gPA;
    }

    @Override
    public String toString()
    {
        return String.format("%s %s, балл: %s", name, lastname, gPA);
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSpec() {
        return spec;
    }

    public int getYear() {
        return year;
    }

    public String getGroup() {
        return group;
    }

    public int getGPA() {
        return gPA;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setGPA(int gPA) {
        this.gPA = gPA;
    }
}
