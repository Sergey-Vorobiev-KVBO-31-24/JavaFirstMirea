package ru.mirea.task4;

public interface MathCalculable {
    double PI = 3.1415926536;

    static double pow(double x, int n)
    {
        double result = 1;
        if (n < 0)
        {
            n = -n;
            x = 1/x;
        }

        for (int i=0; i < n; i++) result *= x;
        return result;
    }

    static double complexAbs(double x, double y)
    {
        return Math.sqrt(x*x + y*y);
    }
}
