package Exercise03_SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sizes = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        int firstSetSize = sizes[0];
        int secondSetSize = sizes[1];

        for (int i = 0; i < firstSetSize; i++) {
            firstSet.add(Integer.parseInt(sc.nextLine()));
        }
        for (int i = 0; i < secondSetSize; i++) {
            secondSet.add(Integer.parseInt(sc.nextLine()));
        }
        if (firstSetSize > secondSetSize) {
            for (Integer digit : secondSet) {
                if (firstSet.contains(digit)) {
                    System.out.print(digit + " ");
                }

            }
        } else {
            for (Integer digit : firstSet) {
                if (secondSet.contains(digit)) {
                    System.out.print(digit + " ");
                }
            }
        }
        firstSet.retainAll(secondSet);
    }
}
