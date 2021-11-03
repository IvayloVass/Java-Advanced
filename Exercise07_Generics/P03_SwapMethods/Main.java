package Exercise07_Generics.P03_SwapMethods;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box<Integer> box = new Box<>();

        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            int line =Integer.parseInt(sc.nextLine());
            box.add(line);
        }
        int[] indexes = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int firstIndex = indexes[0];
        int secondIndex = indexes[1];
        box.swap(firstIndex, secondIndex);
        System.out.println(box);

    }
}
