public class IfStatements {
    public static void main(String[] args) {
        int age = 6;
        String message;
        if(age >= 18) {
            message = "Je bent oud genoeg om te stemmen";
        } else if(age >= 12) {
            message = "Nog even, je bent bijna oud genoeg om te stemmen";
        }
        else {
            message = "Je bent niet oud genoeg om te stemmen";
        }

        System.out.println(message);

        if(message.equals("Je bent niet oud genoeg om te stemmen")) {
            System.out.println("Dat is raar, maar oke.");
        } else {
            System.out.println("Gelukkig is message niet blabla.");
        }

    }
}
