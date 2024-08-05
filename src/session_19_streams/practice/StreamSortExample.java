package session_19_streams.practice;

import java.util.Arrays;
import java.util.List;

public class StreamSortExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob", "John", "Jack", "Alice");

        names.stream()
                .sorted()
                .forEach(name -> System.out.println(name));
    }
}