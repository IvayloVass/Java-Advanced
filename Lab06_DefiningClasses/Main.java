package Lab06_DefiningClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int carsNum = Integer.parseInt(sc.nextLine());
        while (carsNum-- > 0) {
            String input = sc.nextLine();
            String[] carsData = input.split("\\s+");
            if (carsData.length > 1) {
                Car car = new Car(carsData[0], carsData[1], Integer.parseInt(carsData[2]));
                String s = car.toString();
                System.out.println(s);

            } else {
                Car car = new Car(carsData[0]);
                String s = car.toString();
                System.out.println(s);
            }


        }
    }
}
