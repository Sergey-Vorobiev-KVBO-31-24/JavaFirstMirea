package ru.mirea.task3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        FeedbackCycle cycle = new FeedbackCycle();

        int command;
        boolean isWorking = true;

        while (isWorking) {
            System.out.println("Введите код команды (возможные команды представлены ниже)");
            System.out.println("0 = Завершить работу фабрики");
            System.out.println("1 = Подключить станок (в конец)");
            System.out.println("2 = Отключить станок");
            System.out.println("3 = Получить информацию о станке");
            System.out.println("4 = Отключение фабрики");
            System.out.println("5 = Проверить фабрику на отсутствие станков");
            System.out.println("6 = Получить информацию о количестве станков");
            System.out.println("7 = Подключить станок (по индексу)");
            command = scanInt();

            switch (command) {
                case 0: {
                    isWorking = false;
                    break;
                }
                case 1: {
                    cycle.add();
                    break;
                }
                case 2: {
                    System.out.print("Введите индекс: ");
                    cycle.remove(scanInt());
                    break;
                }
                case 3: {
                    System.out.print("Введите индекс: ");
                    cycle.print(scanInt());
                    break;
                }
                case 4: {
                    cycle.clear();
                    break;
                }
                case 5: {
                    System.out.println(cycle.isEmpty());
                    break;
                }
                case 6: {
                    System.out.println(cycle.getSize());
                    break;
                }
                case 7: {
                    System.out.print("Введите индекс: ");
                    cycle.add(scanInt());
                    break;
                }
            }
        }
    }

    protected static int scanInt()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.next());
            return number;
        }
        catch (Exception exc)
        {
            System.out.println("ОШИБКА: введите целое число.");
            return scanInt();
        }
    }
}