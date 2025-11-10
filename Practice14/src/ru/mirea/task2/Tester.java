package ru.mirea.task2;

public class Tester {
    public static void main(String[] args) {
        System.out.println(EqualToPatternChecking.check("abcdefghijklmnopqrstuv18340"));
        System.out.println(EqualToPatternChecking.check("0abcdefghijklmnopqrstuv18340"));
        System.out.println(EqualToPatternChecking.check("abcdefghijklmnopqrstuv183400"));
        System.out.println(EqualToPatternChecking.check("abcdefghijklmnopqrstuv1834"));
        System.out.println(EqualToPatternChecking.check("42"));
    }
}
