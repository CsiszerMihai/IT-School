package session_19_streams.practice;

import java.util.Arrays;
import java.util.List;

public class StreamMapExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob", "John", "Jack");

        List<String> upperCaseNames = names.stream()
                .map(name -> name.toUpperCase())
                .toList();

        System.out.println(upperCaseNames);
    }
}