package Exercise07_Generics.P03_SwapMethods;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    public List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        this.list.add(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        T element = this.list.get(firstIndex);
        this.list.set(firstIndex, this.list.get(secondIndex));
        this.list.set(secondIndex, element);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (T element : list) {
            output.append(element.getClass().getName()).append(": ").append(element)
                    .append(System.lineSeparator());

        }
        return output.toString();
    }
}
