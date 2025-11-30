package ru.mirea.task3;

public class Exception3 {
    public static void exceptionDemo() {
        try{
            System.out.println( 2/0 );
        }
        catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
        catch ( Exception e ) {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}