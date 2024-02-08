package inheritancevoorbeeldjes;

public class Chair extends Furniture {
    public Chair() {
        super();
    }

    @Override
    public void collectDust() {
        System.out.println("Collecting dust on the chair...");
    }
}
