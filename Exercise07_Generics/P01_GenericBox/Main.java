package Exercise07_Generics.P01_GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            int line =Integer.parseInt(sc.nextLine());
            Box<Integer> box = new Box<>(line);
            System.out.println(box);
        }
    }
}
