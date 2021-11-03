package Lab07_Generics.P02_ArrayCreator;

public class Main {
    public static void main(String[] args) {


        Integer[] integers = ArrayCreator
                .<Integer>create(10, 0);

        String[] strings = ArrayCreator
                .<String>create(String.class, 10, "none");

    }
}
