package Lab05_FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = (sc.nextLine().split("\\s+"));

        Predicate<String> isStartWithUppercase = str -> str != null && !str.isEmpty()
                && Character.isUpperCase(str.charAt(0));

        List<String> uppercaseWords = Arrays.stream(words)
                .filter(isStartWithUppercase)
                .collect(Collectors.toList());

        System.out.println(uppercaseWords.size());
        System.out.println(uppercaseWords.stream().collect(Collectors.joining(System.lineSeparator())));
    }
}
