package session_19_streams.practice;

import java.util.Arrays;
import java.util.List;

public class UserListExample {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("John", "Doe", 25),
                new User("Peter", "Parker", 23),
                new User("Jack", "Spice", 28)
        );

        users.stream()
                .forEach(System.out::println);

        users.forEach(System.out::println);
    }
}