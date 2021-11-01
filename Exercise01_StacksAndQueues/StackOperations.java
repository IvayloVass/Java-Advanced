package Exercise01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class StackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        int pushes = Integer.parseInt(input[0]);
        int popes = Integer.parseInt(input[1]);
        int contains = Integer.parseInt(input[2]);

        String[] numbers = sc.nextLine().split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int minElement = Integer.MAX_VALUE;
        for (int i = 0; i < pushes; i++) {
            stack.push(Integer.parseInt(numbers[i]));
        }
        for (int i = 1; i <= popes; i++) {
            stack.pop();
        }
        for (Integer integer : stack) {
            if (integer < minElement) {
                minElement = integer;
            }
        }
        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(contains)) {
            System.out.println("true");

        } else {
            System.out.println(minElement);
        }
    }
}
