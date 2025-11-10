package ru.mirea.task2;

import java.util.regex.Pattern;

public class EqualToPatternChecking {
    public static boolean check(String str)
    {
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        return pattern.matcher(str).matches();
    }
}
