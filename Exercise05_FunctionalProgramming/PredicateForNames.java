package Exercise05_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wordSize = Integer.parseInt(sc.nextLine());
        String[] words = sc.nextLine().split("\\s+");

        Predicate<String> lengthChecker = w -> w.length() <= wordSize;
        Consumer<String> printPassedWords = System.out::println;

        Arrays.stream(words).filter(lengthChecker).forEach(printPassedWords);

    }
}
