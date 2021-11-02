package Exercise06_DefiningClasses.P05_CarSalesMan;

public class Car {
    private String model;
    private Engine engine;

    private int weight;
    private String color;

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine, weight, "n/a");
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine, 0, color);
    }

    public Car(String model, Engine engine) {
        this(model, engine, 0, "n/a");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.model);
        builder.append(":").append(System.lineSeparator());
        builder.append(this.engine).append(System.lineSeparator());
        builder.append("Weight: ").append(this.weight == 0 ? "n/a" : this.weight)
                .append(System.lineSeparator());
        builder.append("Color: ").append(this.color).append(System.lineSeparator());

        return builder.toString().toString();
    }

}
