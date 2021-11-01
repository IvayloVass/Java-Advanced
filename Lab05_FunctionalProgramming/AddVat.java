package Lab05_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UnaryOperator<Double> addVat = val -> val * 1.20;

        System.out.println("Prices with VAT:");
        String values = Arrays.stream(sc.nextLine().split(",\\s+"))
                .map(e -> String.format("%.2f", addVat.apply(Double.parseDouble(e))))
                .collect(Collectors.joining(System.lineSeparator()));

        System.out.println(values);
    }
}
