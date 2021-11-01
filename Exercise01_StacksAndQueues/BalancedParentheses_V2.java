package Exercise01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ArrayDeque<Character> openBracket = new ArrayDeque<>();
        boolean areBalanced = false;
        for (int index = 0; index < input.length(); index++) {
            char currentBracket = input.charAt(index);
            if (currentBracket == '(' || currentBracket == '[' || currentBracket == '{') {
                openBracket.push(currentBracket);
            } else {
                if (openBracket.size() > 0) {
                    char lastBracket = openBracket.peek();
                    if (currentBracket == ')' && lastBracket == '(') {
                        openBracket.pop();
                        areBalanced = true;
                    } else if (currentBracket == ']' && lastBracket == '[') {
                        openBracket.pop();
                        areBalanced = true;

                    } else if (currentBracket == '}' && lastBracket == '{') {
                        openBracket.pop();
                        areBalanced = true;
                    } else {
                        break;
                    }

                } else {
                    break;
                }
            }
        }
        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


