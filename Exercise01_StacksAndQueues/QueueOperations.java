package Exercise01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class QueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        String[] sequence = sc.nextLine().split("\\s+");

        for (int i = 0; i < n; i++) {
            queue.offer(Integer.parseInt(sequence[i]));
        }
        for (int i = 1; i <= (s); i++) {
            queue.poll();
        }
        if (!queue.isEmpty()) {
            if (queue.contains(x)) {
                System.out.println(true);
            } else {
                System.out.println(Collections.min(queue));
            }

        } else {
            System.out.println(0);
        }

    }
}
