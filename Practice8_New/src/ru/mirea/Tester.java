package ru.mirea;

import static ru.mirea.task5.DigitSum.digitSum;
import static ru.mirea.task6.PrimalityCheck.primCheck;
import static ru.mirea.task7.PrimeFactors.primeFactors;

public class Tester {
    public static void main(String[] args) {
        System.out.println(digitSum(1234));
        primCheck(1234);
        primeFactors(1234);
    }
}
