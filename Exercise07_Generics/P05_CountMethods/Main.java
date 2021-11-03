package Exercise07_Generics.P05_CountMethods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Box<Double> box = new Box<>();

        while (n-- > 0) {
            double str =Double.parseDouble(sc.nextLine());
            box.add(str);
        }
        double comparableElement =Double.parseDouble(sc.nextLine());
        int greaterElements = box.countGraterElements(comparableElement);
        System.out.println(greaterElements);


    }
}
