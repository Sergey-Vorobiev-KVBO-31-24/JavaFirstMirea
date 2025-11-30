package ru.mirea.task4;

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
        finally {
            System.out.println("Finally");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}