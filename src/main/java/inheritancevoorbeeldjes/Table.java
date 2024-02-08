package inheritancevoorbeeldjes;

public class Table extends Furniture {
    private boolean standingDesk;

    public boolean isStandingDesk() {
        return standingDesk;
    }

    public void setStandingDesk(boolean standingDesk) {
        this.standingDesk = standingDesk;
    }
}
