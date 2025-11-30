package Task3;

import java.io.Serializable;

public class MyGenericClass<T extends Comparable, V extends Animal, K extends Serializable> {
    protected T rating;
    protected V animal;
    protected K mark;

    public MyGenericClass(T rating, V animal, K mark) {
        this.rating = rating;
        this.animal = animal;
        this.mark = mark;
    }

    public T getRating() {
        return rating;
    }

    public void setRating(T rating) {
        this.rating = rating;
    }

    public V getAnimal() {
        return animal;
    }

    public void setAnimal(V animal) {
        this.animal = animal;
    }

    public K getMark() {
        return mark;
    }

    public void setMark(K mark) {
        this.mark = mark;
    }

    public void printTypes()
    {
        System.out.println("Сравнимый тип: " + rating.getClass());
        System.out.println("Тип животного: " + animal.getClass());
        System.out.println("Serializable тип: " + mark.getClass());
    }

    public V checkRating(T lower)
    {
        if (lower.compareTo(rating) > 0) return animal;
        else return null;
    }
}
