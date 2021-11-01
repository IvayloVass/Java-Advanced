package Lab05_FunctionalProgramming;

import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class demo {
    public static void main(String[] args) {

        Supplier<Integer> getRandomInt = () -> new Random().nextInt(69); // don't accept parameter, similar to void method, calls with .get()
        int rnd = getRandomInt.get();
        System.out.println(rnd);

        Predicate<Integer> isEven = num -> num % 2 == 0;  // evaluates an expression, returns boolean, calls with .test()
        System.out.println(isEven.test(69));

    }
}
