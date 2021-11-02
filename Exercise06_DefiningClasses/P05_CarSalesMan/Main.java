package Exercise06_DefiningClasses.P05_CarSalesMan;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int engineCount = Integer.parseInt(sc.nextLine());

        Engine engine = null;
        Map<String, Engine> engineMap = new HashMap<>();

        while (engineCount-- > 0) {
            String[] engineTokens = sc.nextLine().split("\\s+");
            String engineModel = engineTokens[0];
            String enginePower = engineTokens[1];
            if (engineTokens.length == 3) {
                if (Character.isDigit(engineTokens[2].charAt(0))) {
                    int engineDisplacement = Integer.parseInt(engineTokens[2]);
                    engine = new Engine(engineModel, enginePower, engineDisplacement);

                } else {
                    String efficiency = engineTokens[2];
                    engine = new Engine(engineModel, enginePower, efficiency);

                }

            } else if (engineTokens.length == 2) {
                engine = new Engine(engineModel, enginePower);


            } else if (engineTokens.length == 4) {
                int engineDisplacement = Integer.parseInt(engineTokens[2]);
                String efficiency = engineTokens[3];
                engine = new Engine(engineModel, enginePower, engineDisplacement, efficiency);

            }

            engineMap.putIfAbsent(engineModel, engine);
        }

        int carsCount = Integer.parseInt(sc.nextLine());
        String carModel = "";
        String carEngine = "";
        Car car = null;
        List<Car> cars = new LinkedList<>();

        while (carsCount-- > 0) {
            String[] carsTokens = sc.nextLine().split("\\s+");
            carModel = carsTokens[0];
            carEngine = carsTokens[1];
            engine = engineMap.get(carEngine);
            if (carsTokens.length == 2) {
                car = new Car(carModel, engine);
            } else if (carsTokens.length == 4) {
                int weight = Integer.parseInt(carsTokens[2]);
                String color = carsTokens[3];
                car = new Car(carModel, engine, weight, color);
            } else if (carsTokens.length == 3) {
                if (Character.isDigit(carsTokens[2].charAt(0))) {
                    int carWeight = Integer.parseInt(carsTokens[2]);
                    car = new Car(carModel, engine, carWeight);
                } else {
                    String color = carsTokens[2];
                    car = new Car(carModel, engine, color);

                }

            }

            cars.add(car);
        }
        cars.forEach(System.out::print);
    }
}
