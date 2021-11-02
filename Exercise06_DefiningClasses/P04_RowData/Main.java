package Exercise06_DefiningClasses.P04_RowData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int carsCount = Integer.parseInt(sc.nextLine());
        Map<String, Car> vehiclesCargoType = new LinkedHashMap<>();
        Cargo cargo = null;
        Engine engine = null;

        while (carsCount-- > 0) {
            String[] carSpecifications = sc.nextLine().split("\\s+");
            String model = carSpecifications[0];
            int engineSpeed = Integer.parseInt(carSpecifications[1]);
            int enginePower = Integer.parseInt(carSpecifications[2]);
            engine = new Engine(engineSpeed, enginePower);
            int cargoWeight = Integer.parseInt(carSpecifications[3]);
            String cargoType = carSpecifications[4];
            cargo = new Cargo(cargoWeight, cargoType);
            Tire[] tires = new Tire[4];
            int count = 0;
            for (int index = 5; index < carSpecifications.length; index += 2) {
                double tirePressure = Double.parseDouble(carSpecifications[index]);
                int tireAge = Integer.parseInt(carSpecifications[index + 1]);
                tires[count] = new Tire(tirePressure, tireAge);
                count++;
            }
            Car car = new Car(model, engine, cargo, tires);
            vehiclesCargoType.putIfAbsent(model, car);

        }
        String cargoFilter = sc.nextLine();

        for (Car car : vehiclesCargoType.values()) {
            if (cargoFilter.equals("flamable") && cargoFilter.equals(car.getCargo().getCargoType())
                    && car.getEngine().getEnginePower() > 250) {
                System.out.println(car);

            } else if (cargoFilter.equals("fragile") && cargoFilter.equals(car.getCargo().getCargoType())
                    && car.hasTirePressureLessThanOne()) {
                System.out.println(car);

            }

        }

    }

}
