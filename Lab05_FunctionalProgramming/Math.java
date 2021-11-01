package Lab05_FunctionalProgramming;

public class Math {
    public static boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }

    public static boolean isEven(int number) {
        return isDivisibleBy(number, 2);
    }
}
