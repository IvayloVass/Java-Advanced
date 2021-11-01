package Exercise03_SetsAndMaps;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linesNum = Integer.parseInt(sc.nextLine());
        Set<String> periodicTable = new TreeSet<>();
        while (linesNum-- > 0) {
            String[] components = sc.nextLine().split("\\s+");
            periodicTable.addAll(Arrays.asList(components));
        }
        periodicTable.forEach(e -> System.out.print(e + " "));
    }
}
