package web.model;

public class Car {
    private String model;
    private int series;
    private int enginePower;

    public Car(String model, int series, int enginePower) {
        this.model = model;
        this.series = series;
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return model + ";" + series + ";" + enginePower;
    }
}
