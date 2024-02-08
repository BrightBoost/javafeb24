package miniopdrachten;

public class ConditionalStatements {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;

        if (x / y == 5) {
            x = 100;
        }
        if (x * y == 5) {
            x = 1;
        }
        if (x < y) {
            x *= 2;
        }
        if (x > y) {
            x += 1;
        }

        System.out.println("Final value of x is: " + x);
    }
}

