package ru.mirea.task4;

import java.util.regex.Pattern;

public class DigitWithPlusChecking {
    public static boolean check(String text)
    {
        Pattern pattern = Pattern.compile("\\+\\s[0-9]+");
        return pattern.matcher(text).matches();
    }

}
