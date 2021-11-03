package Exercise07_Generics.P05_CountMethods;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {

    public List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        this.list.add(element);
    }

    public int countGraterElements(T element) {
//        int counter = 0;
//        for (T article : list) {
//            if (article.compareTo(element) > 0) {
//                counter++;
//            }
//        }
        return (int) this.list.stream().filter(e -> e.compareTo(element) > 0).count();
    }
}
