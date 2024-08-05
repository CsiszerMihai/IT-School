package session_19_streams.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingBy {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob", "John", "Jack", "Alice", "Brad");

        Map<Character, List<String>> groupedByFirstLetter = names.stream()
                .collect(Collectors.groupingBy(n -> n.charAt(0)));

        System.out.println(groupedByFirstLetter);
    }
}