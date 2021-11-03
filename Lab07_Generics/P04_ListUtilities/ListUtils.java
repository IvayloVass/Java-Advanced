package Lab07_Generics.P04_ListUtilities;

import java.util.Collections;
import java.util.List;

public class ListUtils<T> {
    public T list;


    public static <T extends Comparable<T>> T getMin(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("This is an empty list!");
        }

        return Collections.min(list);
    }

    public static <T extends Comparable<T>> T getMax(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("This is an empty list!");
        }

        return Collections.max(list);
    }
}
