package Exercise03_SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Set<String> usernames = new LinkedHashSet<>();
        while (n-- > 0) {
            usernames.add(sc.nextLine());
        }
        usernames.forEach(System.out::println);
    }
}
