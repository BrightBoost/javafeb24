package interfacevoorbeelden;

public class Hyena extends Animal implements Prey, Predator {

    @Override
    public void runAndHide() {
        System.out.println("Hyene running back to the group");
    }

    @Override
    public void catchAndEat(Prey p) {
        p.runAndHide();
        if(Math.random() > 0.5) {
            System.out.println("Jummie " + p.getClass().getSimpleName());
        } else {
            System.out.println(p.getClass().getSimpleName() + " got away!");
        }
    }
}
