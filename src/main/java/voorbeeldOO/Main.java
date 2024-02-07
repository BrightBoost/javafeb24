package voorbeeldOO;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Roxy");
        cat.setEvil(false);

        Cat cat2 = new Cat();
        cat2.setName("Daisy");

        Owner owner = new Owner();
        owner.setName("Maaike");
        owner.setCats(new Cat[]{cat, cat2});

        System.out.println(owner.getCats()[1].getName());
    }
}
