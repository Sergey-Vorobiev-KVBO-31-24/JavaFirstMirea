package ru.mirea.task1;

public class MyStringBuilder {
    public static void stringManipulate(String str)
    {
        System.out.printf("Последний символ: %c\n", str.charAt(str.length()-1));
        System.out.printf("Заканчивается ли подстрокой \"!!!\": %b\n", str.endsWith("!!!"));
        System.out.printf("Начинается ли с подстроки \"I like\": %b\n", str.startsWith("I like"));
        System.out.printf("Содержит ли подстроку \"Java\": %b\n", str.contains("Java"));
        System.out.printf("Позиция подстроки \"Jaba\" в строке: %d\n", str.indexOf("Jaba"));
        System.out.printf("После замены всех символов 'a' на 'o': %s\n", str.replace('a','o'));
        System.out.printf("Преобразование к верхнему регистру: %s\n", str.toUpperCase());
        System.out.printf("Преобразование к нижнему регистру: %s\n", str.toLowerCase());
        if (str.length() >= 11) System.out.printf("Подстрока длины 4, начиная 7-го символа: %s\n", str.substring(7, 11));
    }
}
