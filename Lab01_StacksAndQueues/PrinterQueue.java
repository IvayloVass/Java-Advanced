package Lab01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ArrayDeque<String> printerQueue = new ArrayDeque<>();
        while (!input.equals("print")) {
            String filenames = input;
            if (!filenames.equals("cancel")) {
                printerQueue.offer(filenames);
            } else {
                if (printerQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printerQueue.poll());
                }

            }
            input = sc.nextLine();
        }
        while (!printerQueue.isEmpty()) {
            System.out.println(printerQueue.poll());
        }
    }
}
