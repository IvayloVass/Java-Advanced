package Exercise01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayDeque<Integer> fibonacci = new ArrayDeque<>();
        int n = Integer.parseInt(input.nextLine());
        System.out.println(getFibonacci(fibonacci, n));
    }

    private static int getFibonacci(ArrayDeque<Integer> fibonacci, int n) {
        if (n < 2) {
            return 1;
        } else {
            fibonacci.offer(0);
            fibonacci.offer(1);
            for (int i = 0; i < n; i++) {
                int sum = fibonacci.poll() + fibonacci.peek();
                fibonacci.offer(sum);
            }
        }
        fibonacci.poll();
        return fibonacci.peek();
    }
}


