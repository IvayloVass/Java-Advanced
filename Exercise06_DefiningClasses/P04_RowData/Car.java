package Exercise06_DefiningClasses.P04_RowData;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire[] tire;

    public Car(String model, Engine engine, Cargo cargo, Tire[] tire) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tire = tire;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tire[] getTire() {
        return tire;
    }

    public boolean hasTirePressureLessThanOne() {
        for (Tire t : tire) {
            if (t.getTirePressure() < 1) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return this.model;
    }
}
