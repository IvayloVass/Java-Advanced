package Exercise01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Character> queue = new ArrayDeque<>();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        String input = sc.nextLine();
        for (int index = 0; index < input.length(); index++) {
            char bracket = input.charAt(index);
            queue.offer(bracket);
            stack.push(bracket);
        }
        boolean isBalanced = false;
        int halfSize = queue.size() / 2;
        while (queue.size() != halfSize) {
            char currentCharQueue = queue.poll();
            char currentCharStack = stack.pop();
            if (currentCharQueue != '(' || currentCharStack != ')') {
                if (currentCharQueue + 2 != currentCharStack) {
                    System.out.println("NO");
                    isBalanced = false;
                    break;
                } else {
                    isBalanced = true;
                }
            } else {
                isBalanced = true;
            }
        }
        if (isBalanced) {
            System.out.println("YES");
        }

    }
}
