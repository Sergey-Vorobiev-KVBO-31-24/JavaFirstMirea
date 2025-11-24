package ru.mirea.task2;

import java.util.Scanner;

public class IOTMachine {
    protected String model;
    protected double power;
    protected boolean isGoodCond;
    protected IOTMachine next = null;
    protected IOTMachine prev = null;

    public IOTMachine() {
        this.model = "Безымянка";
        this.power = 0;
        this.isGoodCond = false;
    }

    public IOTMachine(String model, double power, boolean isGoodCond) {
        this.model = model;
        this.power = power;
        this.isGoodCond = isGoodCond;
    }

    public IOTMachine getNext() {
        return next;
    }

    public IOTMachine getPrev() {
        return prev;
    }

    public void setNext(IOTMachine next) {
        this.next = next;
    }

    public void setPrev(IOTMachine prev) {
        this.prev = prev;
    }

    public void printModel()
    {
        System.out.println("Модель: " + model);
    }

    public void printPower()
    {
        System.out.println("Мощность (Вт): " + power);
    }

    public void printIsGoodCond()
    {
        System.out.println("Хорошее состояние: " + (isGoodCond ? "ДА" : "НЕТ"));
    }

    public void scanModel()
    {
        System.out.print("Введите модель станка (слово): ");
        Scanner sc = new Scanner(System.in);
        model = sc.next();
    }

    public void scanPower()
    {
        System.out.print("Введите мощность станка (действительное число, в Вт): ");
        Scanner sc = new Scanner(System.in);
        try {
            power = Double.parseDouble(sc.next());
        }
        catch (Exception exc)
        {
            System.out.println("ОШИБКА: предоставлено не число");
            scanPower();
        }
    }

    public void scanIsGoodCond()
    {
        System.out.print("Укажите, хорошее ли состояние у станка (0 или 1): ");
        Scanner sc = new Scanner(System.in);
        try {
            isGoodCond = Boolean.parseBoolean(sc.next());
        }
        catch (Exception exc)
        {
            System.out.println("ОШИБКА: предоставлено не число.");
            scanIsGoodCond();
        }
    }
}