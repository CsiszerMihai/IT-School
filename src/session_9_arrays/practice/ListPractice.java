package session_9_arrays.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Charlie");
        names.add("John");

        boolean isListEmpty = names.isEmpty();
        System.out.println("Is list empty? " + isListEmpty);

        for (String name : names) {
            System.out.print(name + " ");
        }

        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println(fruits.contains("Apple"));

        String cherryValue = fruits.get(2);
        System.out.println("Cherry value: " + cherryValue);

        for (int index = 0; index < fruits.size(); index++) {
            System.out.print(fruits.get(index) + " ");
        }
    }
}