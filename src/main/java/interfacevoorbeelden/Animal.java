package interfacevoorbeelden;

public class Animal {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Eating...");
    }
}
