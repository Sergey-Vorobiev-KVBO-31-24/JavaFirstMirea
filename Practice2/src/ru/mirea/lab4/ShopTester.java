package ru.mirea.lab4;

import java.util.Scanner;

public class ShopTester {
    private static int commandCheck(int command)
    {
        if (command >= 0 && command <= 5) return command;
        else return -1;
    }

    public static void test() {
        Scanner sc = new Scanner(System.in);
        String model;
        int mfgYear, price, index;
        Shop shop = new Shop();

        int command = -1;
        do {
            if (command == 0)
            {
                shop.printComps();
            }
            else if (command == 1)
            {
                System.out.println("Введите название модели:");
                model = sc.next();
                System.out.println("Введите год изготовления компьютера:");
                mfgYear = sc.nextInt();
                System.out.println("Введите цену компьютера:");
                price = sc.nextInt();
                shop.add(model, mfgYear, price);
            }
            else if (command == 2)
            {
                System.out.println("Введите индекс компьютера:");
                index = sc.nextInt();
                shop.remove(index);
            }
            else if (command == 3)
            {
                System.out.println("Введите название модели:");
                model = sc.next();
                shop.find(model);
            }
            else if (command == 4)
            {
                shop.clear();
            }

            System.out.println("Введите номер желаемого действия:");
            System.out.println("0 = Получить полный список компьютеров в магазине");
            System.out.println("1 = Закупить компьютер в магазин");
            System.out.println("2 = Продать компьютер клиенту (по номеру в списке)");
            System.out.println("3 = Найти компьютеры по модели");
            System.out.println("4 = Очистить склад компьютеров");
            System.out.println("5 = Выйти");
            command = commandCheck(sc.nextInt());
        } while (command != 5);
    }
}
