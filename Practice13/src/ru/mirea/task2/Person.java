package ru.mirea.task2;

public class Person {
    protected String name, lastname, fathername;

    public Person(String name, String lastname, String fathername) {
        this.name = name;
        this.lastname = lastname;
        this.fathername = fathername;
    }

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.fathername = "";
    }

    public Person(String lastname) {
        this.name = "";
        this.lastname = lastname;
        this.fathername = "";
    }

    public String getFullName()
    {
        if (name.isEmpty()) return lastname;
        else if (fathername.isEmpty()) return lastname + " " + name.charAt(0) + ".";
        else return lastname + " " + name.charAt(0) + "." + fathername.charAt(0) + ".";
    }
}
