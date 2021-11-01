package Lab01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        while (num > 0) {
           int binary = num % 2;
            stack.push(binary);
            num/=2;
        }
        for (Integer digit : stack) {
            System.out.print(digit);
        }


    }
}
