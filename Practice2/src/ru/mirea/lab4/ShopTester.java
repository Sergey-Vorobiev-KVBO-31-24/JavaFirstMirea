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
        Shop shop = new Shop();
        int command = -1;
        do {
            if (command == 0)
            {

            }
            else if (command == 1)
            {

            }
            else if (command == 2)
            {

            }
            else if (command == 3)
            {

            }
            else if (command == 4)
            {

            }

            System.out.println();
            command = sc.nextInt();
            command = commandCheck(command);
        } while (command != 5);
    }
}
