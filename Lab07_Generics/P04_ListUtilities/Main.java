package Lab07_Generics.P04_ListUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 2, 18, 2, -1);

        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "a", "b", "c");

        List<Double>doubles = new ArrayList<>();

        System.out.println(ListUtils.getMin(integers));
        System.out.println(ListUtils.getMax(strings));
        System.out.println(ListUtils.getMax(doubles));

    }
}
