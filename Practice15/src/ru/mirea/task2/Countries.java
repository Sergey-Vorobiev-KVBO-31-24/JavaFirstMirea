package ru.mirea.task2;

public enum Countries {
    AUSTRALIA(7.66, 27.78, 1.79),
    CHINA(9.60, 1425, 18.74),
    ENGLAND(0.24, 70.25, 3.64),
    RUSSIA(17.10, 146.12, 2.05);

    private final double square, population, gdp;
    // Площадь - млн.кв.км^2
    // Население - млн.
    // ВВП - трлн.$

    Countries(double square, double population, double gdp) {
        this.square = square;
        this.population = population;
        this.gdp = gdp;
    }

    public double getSquare() {
        return square;
    }

    public double getPopulation() {
        return population;
    }

    public double getGdp() {
        return gdp;
    }
}
