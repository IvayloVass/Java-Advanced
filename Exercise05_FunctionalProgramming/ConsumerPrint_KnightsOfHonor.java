package Exercise05_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint_KnightsOfHonor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        Consumer<String> names = name -> System.out.println("Sir " + name);
        Arrays.stream(input).forEach(names);

    }

}
