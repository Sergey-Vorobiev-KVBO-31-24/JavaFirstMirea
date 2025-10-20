package ru.mirea.task7;

import java.util.ArrayList;

public class PrimeFactors {
    public static void primeFactors(int n) {
        boolean[] arrIsPrime = new boolean[n + 1];
        arrIsPrime[0] = false;
        arrIsPrime[1] = false;
        for (int i = 2; i < n + 1; i++) arrIsPrime[i] = true;

        if (n > 2) {
            primeFactors(n, arrIsPrime, 2);
        }
    }

    private static void primeFactors(int n, boolean[] arrIsPrime, int prime) {
        if (arrIsPrime[prime])
        {
            if (n % prime == 0) System.out.println(prime);
            primeFactors(n, arrIsPrime, prime, 2*prime);
        }
        if (prime < n) primeFactors(n, arrIsPrime, prime+1);
    }

    private static void primeFactors(int n, boolean[] arrIsPrime, int prime, int div)
    {
        if (div <= n)
        {
            arrIsPrime[div] = false;
            primeFactors(n, arrIsPrime, prime, div + prime);
        }
    }
}
