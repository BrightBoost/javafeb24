package inheritancevoorbeeldjes;

public class Table extends Furniture {

    public Table() {
//        super("blue", new Measurement());
    }
    private boolean standingDesk;

    @Override
    public void collectDust() {
        System.out.println("Collecting dust on the table...");
    }
    public boolean isStandingDesk() {
        return standingDesk;
    }

    public void setStandingDesk(boolean standingDesk) {
        this.standingDesk = standingDesk;
    }
}
