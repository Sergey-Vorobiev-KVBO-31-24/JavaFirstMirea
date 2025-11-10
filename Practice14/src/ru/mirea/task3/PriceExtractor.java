package ru.mirea.task3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceExtractor {
    protected static Pattern pattern1 = Pattern.compile("[0-9]+\\sUSD");
    protected static Pattern pattern2 = Pattern.compile("[0-9]+\\sRUB");
    protected static Pattern pattern3 = Pattern.compile("[0-9]+\\sEU");

    public static ArrayList<String> getValidPrices(String text)
    {
        ArrayList<String> prices = getByPattern(pattern1, text);
        prices.addAll(getByPattern(pattern2, text));
        prices.addAll(getByPattern(pattern3, text));

        return prices;
    }

    private static ArrayList<String> getByPattern(Pattern pattern, String text)
    {
        ArrayList<String> result = new ArrayList<>();

        Matcher matcher =  pattern.matcher(text);
        while (matcher.find()) result.add(matcher.group());

        return result;
    }
}
