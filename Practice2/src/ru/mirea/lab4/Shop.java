package ru.mirea.lab4;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> catalog;

    public Shop() {
        catalog = new ArrayList<Computer>();
    }

    public void printComps()
    {
        if (catalog.isEmpty()) System.out.println("Магазин пуст!");
        else
        {
            for (int i=0; i < catalog.size(); i++) System.out.println(i + " = " + catalog.get(i).toString());
        }
    }

    public void clear()
    {
        catalog.clear();
    }

    private boolean indexCheck(int index)
    {
        return index >= 0 && index < catalog.size();
    }

    public void add(String model, int mfgYear, int price)
    {
        catalog.add(new Computer(model, mfgYear, price));
    }

    public void remove(int index)
    {
        if (indexCheck(index)) catalog.remove(index);
    }

    public void find(String model)
    {
        if (catalog.isEmpty()) System.out.println("Магазин пуст!");
        else
        {
            System.out.println("По запросу были найдены следующие компьютеры: ");
            for (int i=0; i < catalog.size(); i++)
            {
                if (catalog.get(i).getModel().equals(model)) System.out.println(i + " = " + catalog.get(i).toString());
            }
        }
    }
}
