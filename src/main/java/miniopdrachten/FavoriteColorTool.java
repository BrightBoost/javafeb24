package miniopdrachten;

import java.util.Scanner;

public class FavoriteColorTool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your favorite color?");
        String color = scanner.nextLine();

        System.out.println("Name the first tool that comes to mind:");
        String tool = scanner.nextLine();

        System.out.println("Combining your input I’m getting a " + color + " " + tool + ".");
    }
}

