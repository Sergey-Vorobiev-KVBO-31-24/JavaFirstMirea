package ru.mirea.task3;

public class Tester {
    static void main() {
        Address a1 = new Address("1,2,3,4,5,6,7,8,9,10,11,12,13");
        Address a2 = new Address("1,2,3,4,5");
        Address2 a3 = new Address2("1;2,3.4.5.2,3,1");
        Address2 a4 = new Address2("25;5");

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());
    }
}
