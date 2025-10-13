package ru.mirea.task5;

public interface DigitSum {
    static int digitSum(int num)
    {
        if (num < 10) return num;
        else return digitSum(num/10) + num%10;
    }
}
