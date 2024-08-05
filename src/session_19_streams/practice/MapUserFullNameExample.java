package session_19_streams.practice;

import java.util.Arrays;
import java.util.List;

public class MapUserFullNameExample {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("John", "Doe", 25),
                new User("Peter", "Parker", 23),
                new User("Jack", "Spice", 28)
        );

        List<String> fullNames = users.stream()
                .map(n -> n.getFirstName() + " " + n.getLastName())
                .toList();

        System.out.println(fullNames);
    }
}