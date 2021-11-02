package Exercise06_DefiningClasses.P03_SpeedRacing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCars = Integer.parseInt(sc.nextLine());
        Map<String, Car> cars = new LinkedHashMap<>();

        while (numberOfCars-- > 0) {
            String[] tokens = sc.nextLine().split("\\s+");
            String model = tokens[0];
            double fuelAmount = Double.parseDouble(tokens[1]);
            double fuelCoast = Double.parseDouble(tokens[2]);
            Car car = new Car(model, fuelAmount, fuelCoast, 0);
            cars.put(model, car);
        }
        String driveCommand = sc.nextLine();
        while (!driveCommand.equals("End")) {
            String[] tokens = driveCommand.split("\\s+");
            String modelToDrive = tokens[1];
            int distanceToDrive = Integer.parseInt(tokens[2]);
            Car car = cars.get(modelToDrive);
            if (!car.drive(distanceToDrive)) {
                System.out.println("Insufficient fuel for the drive");
            }
            driveCommand = sc.nextLine();
        }
        cars.values().forEach(System.out::println);
    }
}
