package session_9_arrays.challenges;

import java.util.ArrayList;

public class Challenge7 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Pineapple");
        fruits.add("Cherry");
        fruits.add("Orange");
        fruits.add("Lemon");
        fruits.add("Banana");

        fruits.sort((fruit1, fruit2) -> {
            int lengthDifference = fruit2.length() - fruit1.length();

            if (lengthDifference == 0) {
                return fruit1.compareTo(fruit2);
            } else {
                return lengthDifference;
            }
        });

        System.out.println("Fruits sorted by length (descending) and alphabetically if equal length:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}