package ru.mirea.task3;

public class Planet implements Nameable {
    String name;
    double radius, g, mass;

    public Planet(String name, double radius, double g, double mass) {
        this.name = name;
        this.radius = radius;
        this.g = g;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public double getG() {
        return g;
    }

    public double getMass() {
        return mass;
    }
}
