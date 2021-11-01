package Exercise03_SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, String> phonebook = new LinkedHashMap<>();
        while (!input.equals("search")) {
            String[] data = input.split("-");
            String name = data[0];
            String number = data[1];
            phonebook.put(name, number);

            input = sc.nextLine();
        }
        String nextInput = sc.nextLine();
        while (!nextInput.equals("stop")) {
            if (phonebook.containsKey(nextInput)) {
                System.out.println(nextInput + " -> " + phonebook.get(nextInput));
            } else {

                System.out.println("Contact " + nextInput + " does not exist.");
            }

            nextInput = sc.nextLine();
        }

    }
}
