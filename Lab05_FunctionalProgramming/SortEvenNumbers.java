package Lab05_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .filter(SortEvenNumbers::isEven)
                .toArray();

        System.out.println(formatArray(numbers));

        Arrays.sort(numbers);

        System.out.println(formatArray(numbers));

    }

    public static String formatArray(int[] arr) {
        return Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

    }

    public static boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }

    public static boolean isEven(int number) {
        return isDivisibleBy(number, 2);
    }
}

