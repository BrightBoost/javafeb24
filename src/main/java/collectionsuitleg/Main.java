package collectionsuitleg;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lijstje = new ArrayList<>();
        lijstje.add("Alfie");
        lijstje.add("Mini");

        System.out.println(lijstje.get(0));
        // lengte lijst
        System.out.println(lijstje.size());

        if(lijstje.contains("blabla")) {
            System.out.println("Blabla staat op de lijst!");
        } else {
            System.out.println("blabla staat niet op de lijst");
        }

        lijstje.add("gooiweg");
        lijstje.remove("gooiweg"); //of lijstje.remove(2);

        for(int i = 0; i < lijstje.size(); i++) {
            System.out.println(lijstje.get(i));
        }

        for(String s : lijstje) {
            System.out.println(s);
        }
    }
}
