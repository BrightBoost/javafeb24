public class ArraysUitleg {
    public static void main(String[] args) {
        int[] nrs = {3, 5, 1, 8, 7, 3};
        System.out.println(nrs[4]);
        nrs[4] = 22;
        System.out.println(nrs[4]);
        System.out.println(nrs.length);
        System.out.println(nrs[5]);

        String[] namen = {"Jamy", "Alfie", "Maaike"};
        System.out.println(namen[1]);

        // handmatig gemiddelde berekenen zonder arrays
//        double gewicht1 = 34;
//        double gewicht2 = 123;
//        double gewicht3 = 34;
//        double gewicht4 = 25;
//
//        double som2 = gewicht1+ gewicht2 + gewicht3 + gewicht4;
//        double gemiddeld = som2 / 4;
//        System.out.println(gemiddeld);

        double[] gewichten = {34, 123, 34, 56, 87, 78, 89};

        double som = 0;
        for(int i = 0; i < gewichten.length; i++) {
            som = som + gewichten[i];
        }
        double gemiddeldeGewicht = som / gewichten.length;
        System.out.println(gemiddeldeGewicht);

        som = 0;
        for(double gewicht : gewichten) {
            som = som + gewicht;
        }
        System.out.println(som/gewichten.length);

        // maak een array van lievelingsgerechten
        // print alle gerechten

        // maak een array van cijfers
        // hoog alle cijfers op met 10 (gebruik een loop)
        // print alle cijfers

        // array gaat maken cijfers
        // als het een oneven getal is, maak je het even (gebruik een if in de loop)
        // print alle getallen (kan in dezelfde loop)


    }
}
