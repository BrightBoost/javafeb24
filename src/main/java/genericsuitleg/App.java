package genericsuitleg;

public class App {
    public static void main(String[] args) {
        Bag<Laptop> laptopBag = new Bag<>();
        Bag<Chihuahua> chihuahuaBag = new Bag<>();
        Bag<String> stringBag = new Bag<>();
        stringBag.setInhoud("blablabla");

        Laptop laptop = new Laptop("Asus");
        Chihuahua chihuahua = new Chihuahua("Rocky");

        laptopBag.setInhoud(laptop);
        chihuahuaBag.setInhoud(chihuahua);


    }
}
