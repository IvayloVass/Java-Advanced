package Exercise07_Generics.P07_CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {

    public List<T> customList;

    public CustomList() {
        this.customList = new ArrayList<>();
    }

    public void add(T element) {
        this.customList.add(element);
    }

    public T remove(int index) {
        return this.customList.remove(index);
    }

    public boolean contains(T element) {
        return this.customList.contains(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        T element = this.customList.get(firstIndex);
        this.customList.set(firstIndex, this.customList.get(secondIndex));
        this.customList.set(secondIndex, element);
    }

    public int countGraterThan(T element) {
        return ((int) this.customList.stream().filter(e -> e.compareTo(element) > 0).count());
    }

    public T getMax() {
        return Collections.max(this.customList);
    }

    public T getMin() {
        return Collections.min(this.customList);
    }

    public void sort() {
        Collections.sort(customList);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T str : customList) {
            builder.append(str).append(System.lineSeparator());
        }
        return builder.toString();
    }


}
