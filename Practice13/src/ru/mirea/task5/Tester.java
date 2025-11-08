package ru.mirea.task5;

public class Tester {
    public static void main(String[] args) throws InvalidPhoneException {
        System.out.println(PhoneNumber.phoneNumber("+78005553535"));
        System.out.println(PhoneNumber.phoneNumber("88005553535"));
        System.out.println(PhoneNumber.phoneNumber("+258005553535"));
        System.out.println(PhoneNumber.phoneNumber("+-78005553535"));
    }
}
