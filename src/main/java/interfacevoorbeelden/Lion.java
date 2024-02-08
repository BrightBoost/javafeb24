package interfacevoorbeelden;

public class Lion extends Animal implements Predator {

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
