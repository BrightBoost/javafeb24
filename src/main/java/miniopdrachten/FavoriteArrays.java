package miniopdrachten;

import java.util.Arrays;

public class FavoriteArrays {
    public static void main(String[] args) {
        String[] movies = {"The Matrix", "Inception", "Interstellar"};
        String[] friends = {"Alice", "Bob", "Charlie"};
        int[] numbers = {42, 7, 13, 99};

        System.out.println("Movies length: " + movies.length);
        System.out.println("Friends length: " + friends.length);
        System.out.println("Numbers length: " + numbers.length);

        Arrays.sort(movies);
        Arrays.sort(friends);
        Arrays.sort(numbers);

        System.out.println("Least favorite movie removed, new first: " + movies[1]);
        System.out.println("Least favorite friend removed, new first: " + friends[1]);
        System.out.println("Least favorite number removed, new first: " + numbers[1]);

        // Demonstrating adding, removing elements would require more complex array manipulation or using an ArrayList
    }
}
