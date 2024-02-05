public class Main {
    public static void main(String[] args) {
        String blabla = "5";
        int rondGetal = 5;
        long grootRondGetal = 123123123;
        byte kleinRondGetal = 100;
        short positiefNietTeGrootRondGetal = (short) 65000;
        double kommaGetal = 5.5;
        boolean jaOfNee = true; // alleen true en false mogelijk
        char letter = '5'; // 'c'
        float kleinerKommaGetal = 5.5f;
        System.out.println(kleinerKommaGetal);

        // maak variabelen aan voor:
        // naam, leeftijd, hobby, huisnummer, fanVanCarnaval, lievelingsLetter
        // "print" de variabelen

        System.out.println(blabla);

        // operatoren
        String blabla2 = blabla + blabla; // 55
        int rondGetal2 = rondGetal + rondGetal; // 10
        int nieuwGetal = 10 - 1;
        int nr1 = 10 * 3;
        double nr2 = 11.0 / 3;
        System.out.println(nr2);
        int modulo = 13 % 4;
        nr1++; // nr1 = nr1 + 1;
        nr1--; //nr1 = nr1 - 1;
        ++nr1;

        int z = nr1++;

        boolean greaterThan = nr1 >= rondGetal2;
        boolean equalTo = nr1 == rondGetal2;
        boolean notEqualTo = nr1 != rondGetal2;

        boolean greaterThanAndEqualTo = nr1 >= rondGetal2 && nr1 == rondGetal;
        boolean greaterThanOrEqualTo = nr1 >= rondGetal2 || nr1 == rondGetal;

    }
}
