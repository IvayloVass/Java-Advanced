package Exercise03_SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, String> emailBook = new LinkedHashMap<>();
        String name = "";
        String email = "";
        while (!input.equals("stop")) {
            if (!input.contains("@")) {
                name = input;
            } else {
                email = input.split("@")[1];
                if (!email.contains("us") && !email.contains("uk") && !email.contains("com")) {
                    emailBook.put(name, input);
                }
            }

            input = sc.nextLine();
        }
        for (Map.Entry<String, String> entry : emailBook.entrySet()) {
            System.out.printf("%s -> %s\n", entry.getKey(), entry.getValue());
        }

    }
}
