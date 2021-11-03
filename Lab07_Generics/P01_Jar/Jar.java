package Lab07_Generics.P01_Jar;

import java.util.ArrayDeque;

public class Jar<T> {

    public ArrayDeque<T> smartDeque;

    public Jar() {
        this.smartDeque = new ArrayDeque<>();
    }

    public void add(T element) {
        this.smartDeque.push(element);
    }

    public T remove() {
        return this.smartDeque.pop();
    }
}
