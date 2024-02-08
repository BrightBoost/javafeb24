package interfacevoorbeelden;

public class App {
    public static void main(String[] args) {
        Lion l = new Lion();
        Hyena h = new Hyena();
        Rabbit r = new Rabbit();

        h.catchAndEat(r);
        l.catchAndEat(h);
    }
}
