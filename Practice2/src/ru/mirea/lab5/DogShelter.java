package ru.mirea.lab5;

import java.util.ArrayList;

public class DogShelter {
    public ArrayList<Dog> shelter;

    public DogShelter() {
        shelter = new ArrayList<Dog>();
    }

    public void mainMethod(ArrayList<Dog> dogs)
    {
        for (Dog dog: dogs) add(dog);
    }

    private boolean indexCheck(int index)
    {
        return index >= 0 && index < shelter.size();
    }

    public void add(Dog dog)
    {
        shelter.add(dog);
    }

    public void remove(int index)
    {
        if (indexCheck(index)) shelter.remove(index);
    }

    public void clear()
    {
        shelter.clear();
    }

    public void watchDogs()
    {
        if (shelter.isEmpty()) System.out.println("Приют пуст!");
        else
        {
            for (int i=0; i < shelter.size(); i++) System.out.println(i + " = " + shelter.get(i).toString());
        }
    }
}
