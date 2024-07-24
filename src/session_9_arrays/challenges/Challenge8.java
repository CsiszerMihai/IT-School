package session_9_arrays.challenges;

import java.util.ArrayList;

public class Challenge8 {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Shawshank Redemption");
        movies.add("Pulp Fiction");
        movies.add("Fight Club");
        movies.add("Dead Poets Society");
        movies.add("Good Will Hunting");

        String movieSearch = "Dead Poets Society";
        int position = linearSearch(movies, movieSearch);

        if (position != -1) {
            System.out.println("Movie: " + movieSearch + " was found at position: " + position);
        } else {
            System.out.println("Movie: " + movieSearch + " was not found in the list.");
        }
    }

    private static int linearSearch(ArrayList<String> movies, String movieSearch) {
        for (int index = 0; index < movies.size(); index++) {
            if (movies.get(index).equals(movieSearch)) {
                return index;
            }
        }
        return -1;
    }
}