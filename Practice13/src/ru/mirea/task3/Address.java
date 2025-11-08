package ru.mirea.task3;

public class Address {
    protected String country, region, city, street, house, flat;

    public Address(String address) {
        String[] splitting = address.split(",");
        country = splitting.length >= 1 ? splitting[0] : "[N/A]";
        region = splitting.length >= 2 ? splitting[1] : "[N/A]";
        city = splitting.length >= 3 ? splitting[2] : "[N/A]";
        street = splitting.length >= 4 ? splitting[3] : "[N/A]";
        house = splitting.length >= 5 ? splitting[4] : "[N/A]";
        flat = splitting.length >= 6 ? splitting[5] : "[N/A]";
    }

    @Override
    public String toString()
    {
        return String.format("%s/%s/%s/%s/%s/%s", country, region, city, street, house, flat);
    }
}
