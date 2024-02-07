public class Tafel {
    public double hoogte;
    public double breedte;
    public double lengte;
    public String kleur;

    public void printTafelInfo() {
        System.out.println("Dit is een " + this.kleur + " tafel van " + this.breedte + " breed.");
    }
}
