package Lab01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        String currentUrl = "";

        while (!input.equals("Home")) {

            if (input.equals("back")) {

                if (!browserHistory.isEmpty()) {
                    currentUrl = browserHistory.pop();

                } else {

                    System.out.println("no previous URLs");

                    input = sc.nextLine();

                    continue;
                }

            } else {

                if (!currentUrl.equals("")) {
                    browserHistory.push(currentUrl);
                }

                currentUrl = input;
            }

            System.out.println(currentUrl);

            input = sc.nextLine();
        }

    }
}
