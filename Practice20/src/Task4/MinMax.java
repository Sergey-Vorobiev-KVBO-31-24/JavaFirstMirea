package Task4;

import java.util.Collection;

public class MinMax<T extends Comparable> {
    public MinMax() {}

    public T min(Collection<T> collection)
    {
        T minimal = null;
        for (T item: collection)
        {
            if (minimal == null || item.compareTo(minimal) < 0) minimal = item;
        }
        return minimal;
    }

    public T max(Collection<T> collection)
    {
        T maximal = null;
        for (T item: collection)
        {
            if (maximal == null || item.compareTo(maximal) > 0) maximal = item;
        }
        return maximal;
    }
}
