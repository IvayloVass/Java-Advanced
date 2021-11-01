package Exercise05_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        Function<int[], int[]> addOne = arr -> Arrays.stream(arr).map(num -> num + 1).toArray();
        Function<int[], int[]> multiplyByTwo = arr -> Arrays.stream(arr).map(num -> num * 2).toArray();
        String command = sc.nextLine();

        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    numbers = addOne.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtractByOne(numbers);
                    break;
                case "multiply":
                    numbers = multiplyByTwo.apply(numbers);
                    break;
                case "print":
                    printArr(numbers);
                    System.out.println();
                    break;

            }
            command = sc.nextLine();
        }
    }

    public static int[] subtractByOne(int[] numbers) {
        return Arrays.stream(numbers).map(num -> num - 1).toArray();
    }

    public static void printArr(int[] numbers) {
        Arrays.stream(numbers).forEach(value -> System.out.print(value + " "));
    }
}
