package Exercise06_DefiningClasses.P03_SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCost;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCost, int distanceTraveled) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
        this.distanceTraveled = distanceTraveled;

    }

    public boolean drive(int distanceToDrive) {
        double neededAmount = distanceToDrive * this.fuelCost;
        if (neededAmount < this.fuelAmount) {
            this.distanceTraveled += distanceToDrive;
            this.fuelAmount -= neededAmount;
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distanceTraveled);
    }
}

