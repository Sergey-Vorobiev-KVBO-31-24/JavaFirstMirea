package ru.mirea.taskShell;

public class TaskNumber1 {
    public static void main(String[] args) {
        Double num1 = Double.valueOf("5.11");
        Double num2 = Double.valueOf("25.1222");
        Double num3 = Double.valueOf("125.345");

        double num4 = Double.parseDouble("625.55");
        System.out.println(num4);

        Double num5 = Double.valueOf("0.55555");
        System.out.println(num5.toString());
        System.out.println(num5.doubleValue());
        System.out.println(num5.floatValue());
        System.out.println(num5.intValue());
        System.out.println(num5.longValue());
        System.out.println(num5.shortValue());
        System.out.println(num5.byteValue());

        System.out.println(num5);

        String eNumString = Double.toString(Math.E);
        System.out.println(eNumString);
    }
}
