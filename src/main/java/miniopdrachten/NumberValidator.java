package miniopdrachten;

import java.util.Scanner;

public class NumberValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a number between 1 and 10:");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("\"%s\" is not a valid number.\n", input);
            }
            number = scanner.nextInt();
        } while (number < 1 || number > 10);

        System.out.printf("You entered a valid number: %d\n", number);
    }
}
