package miniopdrachten;

public class SportPlayer {
    String name;
    String sport;
    int yearBorn;
    double height;
    double weight;

    public SportPlayer(String name, String sport, int yearBorn, double height, double weight) {
        this.name = name;
        this.sport = sport;
        this.yearBorn = yearBorn;
        this.height = height;
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Sport: " + sport + ", Year Born: " + yearBorn + ", Height: " + height + "m, Weight: " + weight + "kg");
    }

    // Additional method can be added here

    public static void main(String[] args) {
        SportPlayer player1 = new SportPlayer("John Doe", "Football", 1990, 1.8, 75);
        player1.printInfo();
        // Create more instances and call methods as needed
    }
}

