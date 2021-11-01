package Exercise05_FunctionalProgramming;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TPRFModule {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> guests = Arrays.stream(sc.nextLine().split("\\s+")).collect(Collectors.toList());
        Map<String, Predicate<String>> predicates = new HashMap<>();
        String input = sc.nextLine();

        while (!input.equals("Print")) {
            String[] tokens = input.split(";");
            String predicateName = tokens[1] + tokens[2];
            switch (tokens[0]) {
                case "Remove filter":
                    predicates.remove(predicateName);
                    break;

                case "Add filter":
                    Predicate<String> predicate = getPredicate(tokens);
                    predicates.put(predicateName, predicate);
                    break;
            }

            input = sc.nextLine();
        }
        guests.stream().filter(guest -> {
            for (Predicate<String> predicate : predicates.values()) {
                if (predicate.test(guest)) {
                    return false;
                }
            }
            return true;
        }).forEach(e -> System.out.print(e + " "));
    }

    private static Predicate<String> getPredicate(String[] tokens) {
        Predicate<String> predicate = null;
        switch (tokens[1]) {
            case "Starts With":
                predicate = name -> name.startsWith(tokens[2]);
                break;
            case "Ends With":
                predicate = name -> name.endsWith(tokens[2]);
                break;
            case "Length":
                predicate = name -> name.length() == Integer.parseInt(tokens[2]);
                break;
            default:
                //contains
                predicate = name -> name.contains(tokens[2]);
                break;
        }

        return predicate;
    }

}
