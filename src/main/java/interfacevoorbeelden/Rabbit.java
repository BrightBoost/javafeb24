package interfacevoorbeelden;

public class Rabbit extends Animal implements Prey {
    @Override
    public void runAndHide() {
        System.out.println("Rabbit runs and goes down the rabbit hole");
    }

}
