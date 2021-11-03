package Exercise07_Generics.P01_GenericBox;

public class Box<T> {
    public T strings;

    public Box(T strings) {
        this.strings = strings;
    }

    @Override
    public String toString() {
        return (strings.getClass()).getName() + ": " + strings;
    }
}
