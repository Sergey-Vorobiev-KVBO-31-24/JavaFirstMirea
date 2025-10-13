package ru.mirea.task7;

import java.util.ArrayList;

public interface PrimeFactors {
    static void primeFactors(int n)
    {
        boolean[] arrIsPrime = new boolean[n+1];
        for (int i=1; i < n+1; i++) arrIsPrime[i] = true;

        if (n > 2) primeFactors(n, 2);

        for (int i=0; i < n+1; i++) if (arrIsPrime[i]) System.out.println(arrIsPrime[i]);
    }

    private static void primeFactors(int n, int div)
    {

    }

    private static void primeFactors
}
