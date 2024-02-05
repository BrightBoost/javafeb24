public class SwitchStatement {
    public static void main(String[] args) {
        String fruit = "grapefruit";

        if(fruit.equals("grapefruit")) {
            System.out.println("oh lekker grapefruit");
        } else if(fruit.equals("druiven")) {
            System.out.println("oh lekker druiven");
        } else if(fruit.equals("granaatappel")) {
            System.out.println("oh lekker granaatappel");
        } else if(fruit.equals("mango")) {
            System.out.println("oh lekker mango!");
        } else {
            System.out.println("Dat ken ik niet. Is dat lekker: " + fruit);
        }

        switch(fruit) {
            case "grapefruit":
                System.out.println("oh lekker grapefruit");
                break;
            case "druiven":
                System.out.println("oh lekker druiven");
                break;
            case "granaatappel":
                System.out.println("oh lekker granaatappel");
                break;
            case "MANGO":
            case "mango":
                System.out.println("oh lekker mango!");
                break;
            default:
                System.out.println("Dat ken ik niet. Is dat lekker: " + fruit);
                break;
        }
    }
}
