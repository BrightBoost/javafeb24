package inheritancevoorbeeldjes;

public abstract class Furniture {

    private String color;
    private Measurement measurement;

    public Furniture(String color, Measurement measurement) {
        this.color = color;
        this.measurement = measurement;
    }

    public Furniture() {

    }

    public abstract void collectDust();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }
}
