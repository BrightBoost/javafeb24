package miniopdrachten;

import java.util.Scanner;

public class SimpleShop {
    public static void main(String[] args) {
        String[] articles = {"Cheese", "Bread", "Coffee", "Wine"};
        double[] prices = {8, 2, 4, 3};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Our products:");
        for (int i = 0; i < articles.length; i++) {
            System.out.println((i + 1) + ". " + articles[i] + " - $" + prices[i]);
        }

        System.out.println("Please choose a product by number:");
        int choice = scanner.nextInt() - 1;

        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();

        double total = prices[choice] * quantity;
        System.out.println("Total price for your order: $" + total);
    }
}
