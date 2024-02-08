package miniopdrachten;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        double side1 = 3.0;
        double side2 = 4.0;
        double hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));
        System.out.println("The hypotenuse is: " + hypotenuse);
    }
}
