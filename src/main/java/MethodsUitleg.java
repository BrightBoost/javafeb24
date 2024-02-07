public class MethodsUitleg {

    // maak een nieuwe class aan voor de methode opdrachten
    // maak een main methode

    // maak een methode sayHello die een boolean ochtend als parameter aanneemt
    // als ochtend true is, print dan goedemorgen, en anders goedendag

    // maak een methode sayHiPerson die twee strings als parameters neemt:
    // een name en greeting, print dan daarna de greeting + name (bijv hoi tom)

    // roep ze aan vanuit de main

    public static void main(String[] args) {
        sayHiName("Jamy");
        sayHi();
        double[] doubles = {3.0, 4.0};
        double gemiddelde = calcAverage(doubles);
        System.out.println(gemiddelde);
        double som = addTwoNumbers(4.0, 6.0);
        System.out.println(som);
    }

    public static void sayHiName(String name) {
        System.out.println("Hi " + name);
    }

    public static void sayHi() {
        System.out.println("Hi!");
    }

    public static double addTwoNumbers(double a, double b) {
        double result = a + b;
        return result;
    }

    public static double calcAverage(double[] arr) {
        double som = 0;
        for(int x = 0; x < arr.length; x++) {
            som = som + arr[x];
        }
        double avg = som / arr.length;
        return avg;
    }
}
