package Lab03_SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Set<String> parkingLot = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String[] tokens = input.split(",\\s+");
            String direction = tokens[0];
            String carNumber = tokens[1];
            if (direction.equals("IN")) {
                parkingLot.add(carNumber);
            } else if (direction.equals("OUT")) {
                parkingLot.remove(carNumber);
            }

            input = sc.nextLine();
        }
        if (!parkingLot.isEmpty()) {
            for (String carNumber : parkingLot) {
                System.out.println(carNumber);
            }
        } else {
            System.out.println("Parking Lot is Empty");
        }
    }
}
