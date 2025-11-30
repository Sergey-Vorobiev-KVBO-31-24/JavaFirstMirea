package Task2;

public class MyGenericClass<T, V, K> {
    protected T type;
    protected V value;
    protected K key;

    public T getType() {
        return type;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    public void printTypes()
    {
        System.out.println("T: " + type.getClass());
        System.out.println("V: " + value.getClass());
        System.out.println("K: " + key.getClass());
    }
}