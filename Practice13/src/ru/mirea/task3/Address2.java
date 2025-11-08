package ru.mirea.task3;

import java.util.StringTokenizer;

public class Address2 {
    protected String country, region, city, street, house, flat;

    public Address2(String address) {
        StringTokenizer strTokenizer = new StringTokenizer(address, ",.;");
        country = strTokenizer.hasMoreTokens() ? strTokenizer.nextToken() : "[N/A]";
        region = strTokenizer.hasMoreTokens() ? strTokenizer.nextToken() : "[N/A]";
        city = strTokenizer.hasMoreTokens() ? strTokenizer.nextToken() : "[N/A]";
        street = strTokenizer.hasMoreTokens() ? strTokenizer.nextToken() : "[N/A]";
        house = strTokenizer.hasMoreTokens() ? strTokenizer.nextToken() : "[N/A]";
        flat = strTokenizer.hasMoreTokens() ? strTokenizer.nextToken() : "[N/A]";
    }

    @Override
    public String toString()
    {
        return String.format("%s/%s/%s/%s/%s/%s", country, region, city, street, house, flat);
    }
}
