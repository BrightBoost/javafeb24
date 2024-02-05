import java.util.Scanner;

public class ScannerVoorbeeld {
    public static void main(String[] args) {
        System.out.println("Wat is je naam? ");
        Scanner scanner = new Scanner(System.in);
        String naam = scanner.nextLine();
        System.out.println("Hoi " + naam);
        System.out.println("Wat is je leeftijd?");
        int leeftijd = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Oh dan ben je ongeveer geboren in " + (2024 - leeftijd));
        System.out.println("WAt is je lievelingskleur?");
        String lievelingsKleur = scanner.nextLine();
        System.out.println("Nice, " + lievelingsKleur);

    }
}
