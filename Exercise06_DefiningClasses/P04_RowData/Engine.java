package Exercise06_DefiningClasses.P04_RowData;


public class Engine {
    private int engineSpeed;
    private int enginePower;

    public Engine(int engineSpeed, int enginePower) {
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;

    }

    public int getEnginePower() {
        return enginePower;
    }
}
