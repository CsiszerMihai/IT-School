package session_19_streams.practice;

import java.util.Arrays;
import java.util.List;

public class ComplexStreamExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob", "John", "Jack");

        List<String> result = names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println(result);
    }
}