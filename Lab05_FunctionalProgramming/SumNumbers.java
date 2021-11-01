package Lab05_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;


public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();


        Function<String, Long> getCount = str -> {
            return Arrays.stream(str.split(",\\s+"))
                    .mapToInt(Integer::parseInt)
                    .count();
        };

        Function<String, Integer> getSum = str -> {
            return Arrays.stream(str.split(",\\s+"))
                    .mapToInt(Integer::parseInt)
                    .sum();
        };


        System.out.println("Count = " + getCount.apply(line));
        System.out.println("Sum = " + getSum.apply(line));


    }
}
