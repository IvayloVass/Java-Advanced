package Exercise01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] input = sc.nextLine().split("\\s+");

        for (String s : input) {
            int num = Integer.parseInt(s);
            stack.push(num);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.poll() + " ");
        }
    }
}