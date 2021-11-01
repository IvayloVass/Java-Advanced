package Lab03_SetsAndMaps;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Set<String> vipGuests = new TreeSet<>();
        Set<String> regularGuests = new TreeSet<>();
        char firstChar;

        while (!input.equals("PARTY")) {
            firstChar = input.charAt(0);
            if (Character.isDigit(firstChar)) {
                vipGuests.add(input);
            } else {
                regularGuests.add(input);
            }
            input = sc.nextLine();
        }
        while (!input.equals("END")) {
            firstChar = input.charAt(0);
            if (Character.isDigit(firstChar)) {
                vipGuests.remove(input);
            } else {
                regularGuests.remove(input);
            }

            input = sc.nextLine();
        }

        System.out.println(vipGuests.size() + regularGuests.size());
        if (!vipGuests.isEmpty()) {
            System.out.println(String.join(System.lineSeparator(), vipGuests));
        }
        if (!regularGuests.isEmpty()) {
            System.out.println(String.join(System.lineSeparator(), regularGuests));
        }

    }
}
