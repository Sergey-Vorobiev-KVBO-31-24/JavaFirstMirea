package ru.mirea.task1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку:");
        String line = sc.nextLine();

        System.out.println("Введите регулярное выражение для разбиения:");
        Pattern pattern = Pattern.compile(sc.nextLine());

        String[] words = pattern.split(line);
        for (String word: words) System.out.println(word);
    }
}
