package Exercise01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operationsNum = Integer.parseInt(sc.nextLine());
        String text = "";
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 1; i <= operationsNum; i++) {
            String[] input = sc.nextLine().split("\\s+");
            String command = input[0];
            if ("1".equals(command)) {
                String textToAppend = input[1];
                stack.push(text);
                text += textToAppend;

            } else if ("2".equals(command)) {
                int lastElementsToEars = Integer.parseInt(input[1]);
                stack.push(text);
                text = text.substring(0, text.length() - lastElementsToEars);

            } else if ("3".equals(command)) {
                int elementIndex = Integer.parseInt(input[1]);
                char element = text.charAt(elementIndex - 1);
                System.out.println(element);

            } else if ("4".equals(command)) {
                text = stack.pop();
            }

        }
    }
}
