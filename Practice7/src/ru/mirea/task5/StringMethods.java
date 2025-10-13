package ru.mirea.task5;

import java.lang.StringBuilder;

public interface StringMethods {
    static int countChar(String str, char c)
    {
        int result = 0;
        for (int i=0; i < str.length(); i++) if (str.charAt(i) == c) result++;
        return result;
    }

    static String oddSubStr(String str)
    {
        StringBuilder result = new StringBuilder(str.length()/2+1);
        for (int i=1; i < str.length(); i += 2) result.append(str.charAt(i));
        return result.toString();
    }

    static String invStr(String str)
    {
        StringBuilder result = new StringBuilder(str.length());
        for (int i=str.length()-1; i >= 0; i--) result.append(str.charAt(i));
        return result.toString();
    }
}
