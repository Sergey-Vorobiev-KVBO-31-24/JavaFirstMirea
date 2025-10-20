package ru.mirea.task5;

public class DigitSum {
    public static int digitSum(int num)
    {
        if (num < 10) return num;
        else return digitSum(num/10) + num%10;
    }
}
