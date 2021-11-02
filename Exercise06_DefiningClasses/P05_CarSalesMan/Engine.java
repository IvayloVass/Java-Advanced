package Exercise06_DefiningClasses.P05_CarSalesMan;

public class Engine {

    private String engineModel;
    private String enginePower;

    private int engineDisplacement;
    private String efficiency;


    public Engine(String engineModel, String enginePower, int engineDisplacement, String efficiency) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
        this.engineDisplacement = engineDisplacement;
        this.efficiency = efficiency;
    }

    public Engine(String engineModel, String enginePower, int engineDisplacement) {
        this(engineModel, enginePower, engineDisplacement, "n/a");
    }

    public Engine(String engineModel, String enginePower, String efficiency) {
        this(engineModel, enginePower, 0, efficiency);
    }

    public Engine(String engineModel, String enginePower) {
        this(engineModel, enginePower, 0, "n/a");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.engineModel);
        builder.append(":").append(System.lineSeparator());
        builder.append("Power: ").append(this.enginePower).append(System.lineSeparator());
        builder.append("Displacement: ").append(this.engineDisplacement == 0 ? "n/a" : this.engineDisplacement)
                .append(System.lineSeparator());
        builder.append("Efficiency: ").append(this.efficiency);

        return builder.toString().trim();
    }
}
