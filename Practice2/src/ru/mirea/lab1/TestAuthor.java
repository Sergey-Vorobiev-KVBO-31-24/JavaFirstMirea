package ru.mirea.lab1;

import java.util.Scanner;

public class TestAuthor {
    public static void test() {
        Scanner sc = new Scanner(System.in);
        Author ivan = new Author("Ivan", "ivanov@mail.ru", 'm');
        System.out.println("Имя: " + ivan.getName());
        System.out.println("Гендер: " + ivan.getGender());
        System.out.println("Почта: " + ivan.getEmail());
        System.out.println("Введите новую почту: ");
        ivan.setEmail(sc.nextLine());
        System.out.println(ivan.toString());
    }
}
