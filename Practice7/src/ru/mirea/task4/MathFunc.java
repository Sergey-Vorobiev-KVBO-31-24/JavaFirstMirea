package ru.mirea.task4;

public class MathFunc implements MathCalculable {
    public static double circleLen(double radius)
    {
        return 2 * MathCalculable.PI * radius;
    }

    public static double circleSquare(double radius)
    {
        return MathCalculable.PI * MathCalculable.pow(radius, 2);
    }

    public static String complexExpForm(double x, double y)
    {
        double r = MathCalculable.complexAbs(x, y);
        double phi;
        if (x == 0) phi = 90;
        else
        {
            phi = 180 * Math.atan(y/x) / MathCalculable.PI;
            if (x < 0) phi += 180;
        }
        return String.format("Комплексное число представимо в показательной форме: z = r ^ (i * phi), где\nr=%f - модуль комплескного числа,\nphi=%f - аргумент комплексного числа (в градусах)", r, phi);
    }
}
