package ru.mirea.task6;

public class PrimalityCheck {
    public static void primCheck(int n)
    {
        if (n > 2) primCheck(n, 2, (int)(Math.sqrt(n)+1));
        else System.out.println("YES");
    }

    private static void primCheck(int n, int div, int stop)
    {
        if (div >= stop) System.out.println("YES");
        else if (n % div != 0) System.out.println("NO");
        else primCheck(n, div+1, stop);
    }
}
