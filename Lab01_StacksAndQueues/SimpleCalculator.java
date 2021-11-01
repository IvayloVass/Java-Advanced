package Lab01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> numbers = new ArrayDeque<>();
        String[] input = sc.nextLine().split("\\s+");
        for (int i = input.length - 1; i >= 0; i--) {
            numbers.push(input[i]);
        }
        while (numbers.size() > 1) {
            int leftOperand = Integer.parseInt(numbers.pop());
            String operator = numbers.pop();
            int rightOperand = Integer.parseInt(numbers.pop());
            int result;
            if (operator.equals("+")) {
                result = leftOperand + rightOperand;
            } else {
                result = leftOperand - rightOperand;
            }
            numbers.push(String.valueOf(result));

        }
        System.out.println(numbers.pop());

    }
}

