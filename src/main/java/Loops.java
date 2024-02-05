public class Loops {
    public static void main(String[] args) {
        int nr1 = 1;
        int nr2 = 2;
        int nr3 = 3;
        int nr4 = 4;
        int nr5 = 5;

        System.out.println(nr1);
        System.out.println(nr2);
        System.out.println(nr3);
        System.out.println(nr4);
        System.out.println(nr5);

        System.out.println("----for----");
        for(int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("----while----");
        int teller = 0;
        while(teller >= 5) {
            System.out.println(teller);
            teller++;
        }

        System.out.println("--do-while--");
        int counter = 0;
        do {
            System.out.println(counter);
            counter++;
        } while(counter >= 5);

    }
}
