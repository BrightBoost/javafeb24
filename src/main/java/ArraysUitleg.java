import java.util.Arrays;

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
        // als het een oneven getal is (%2!=0), maak je het even (gebruik een if in de loop)
        // print alle getallen (kan in dezelfde loop)

        // multidimensional arrays
        int[][] arrayOfIntArrays = {
                {2, 3, 23, 56, 876, 23},
                {1, 3, 67},
                {8}
        };

        arrayOfIntArrays[1][2] = 22;

        System.out.println(arrayOfIntArrays[2][0]);
        System.out.println(arrayOfIntArrays[1][2]);

        for(int i = 0; i < arrayOfIntArrays.length; i++) {
            for(int j = 0; j < arrayOfIntArrays[i].length; j++) {
                System.out.println(arrayOfIntArrays[i][j]);
            }
        }

        // ik wil graag dat je een array met array van ints maakt
        // en vervolgens de som van alle elementen uit die array uitrekent
        // bonus challenge: bereken ook het gemiddelde van de ints in de array met arrays

        // aanloop opdrachtjes naar de hoofdstuk opdrachten
        // tostring en equals uitleggen op arrays

        String[] strs = {"honden", "katten", "hamsters", "schildpadden", "vissen", "salamanders" , "konijnen", "vogels"};

        String leesbareArray = Arrays.toString(strs);

        String diyLeesbareArray = "[";
        for(int i = 0; i < strs.length; i++) {
            diyLeesbareArray = diyLeesbareArray + strs[i];
            if(i != strs.length - 1) {
                diyLeesbareArray = diyLeesbareArray + ", ";
            }
        }
        diyLeesbareArray = diyLeesbareArray + "]";
        System.out.println(diyLeesbareArray);
        System.out.println();

        // zijn twee arrays hetzelfde?
        int[] ints1 = {3, 4, 5};
        int[] ints2 = {3, 4, 5};

        if(Arrays.equals(ints1, ints2)) { // met ints1 == ints2 kijkt ie naar memory locatie ipv inhoud
            System.out.println("Ze zijn hetzelfde!");
        } else {
            System.out.println("Nee, niet hetzelfde.");
        }

        // ARRAYS
        // - maak 2 arrays aan: een van booleans {true, false, etc} en een van boeken

        // LOOPS
        // - print met behulp van een loop, de getallen tussen de 0 en de 100

        // IF STATEMENTS
        // - maak een getal x aan, en als x groter is dan 500 print dan dat het groter is dan 500
        // - en als het groter is dan 250 maar kleiner dan 500 print dat dan
        // - anders print dat het kleiner is dan 250

        // LOOPS AND IF
        // - print alle getallen onder de 100 die deelbaar zijn door 3 (en dat er een heel getal over blijft)


        // LOOPS AND ARRAYS
        // - loop over de arrays van booleans en print alle waardes
        // - loop over de arrays van boeken en print alle waarden

        // IF AND ARRAYS
        // - als de array van booleans een lengte groter dan 5 heeft, print de lengte. Anders print: dat zijn er niet veel

        // IF AND ARRAYS AND LOOPS
        // - loop over de arrays van boeken, als de naam van een boek gelijk is aan "Harry potter deel 1" print dan "gevonden!"
    }
}
