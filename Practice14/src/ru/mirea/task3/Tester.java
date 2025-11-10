package ru.mirea.task3;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<String> prices = PriceExtractor.getValidPrices("I love when 22 RUB and 1029 EU and 18USD and 19 RU and blablabla");
        for (String price: prices) System.out.println(price);
    }
}
