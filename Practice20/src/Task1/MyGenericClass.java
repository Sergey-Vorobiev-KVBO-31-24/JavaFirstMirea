package Task1;

import java.util.ArrayList;

public class MyGenericClass<T, V, K> {
    protected T type;
    protected V value;
    protected K key;

    public static void dontKnow()
    {
        System.out.println("Слишком абстрактно...");
    }
}
