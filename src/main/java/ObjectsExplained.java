public class ObjectsExplained {

    // maak een class person
    // geen person een naam en passies (array string type) en leeftijd
    // maak een methode die alle passies van de persoon print in de class person
    // in de volgende vorm:
    // ik ben henk
    // een van mijn passies is programmeren
    // een van mijn passies is zingen
    // een van mijn passies is timmeren

    public static void main(String[] args) {
        int x = 45;
        Dog dog = new Dog("Alfie", 2, 30);

        dog.bark();


        Dog dog2 = new Dog("Bobbie", 2, 25);

        Dog dog3 = dog;
        dog3.name = "Max";

        dog.bark();
        dog2.bark();

        Tafel t1 = new Tafel();
        t1.breedte = 180;
        t1.hoogte = 70;
        t1.lengte = 90;
        t1.kleur = "Grijs";
        t1.printTafelInfo();


    }

    public static void walkDog(Dog dog) {
        System.out.println("walking " + dog.name);
    }
}
