package session_10_oop_concepts.practice.publlic_package;

import session_10_oop_concepts.practice.sensitive_logic_package.Animal;
import session_10_oop_concepts.practice.static_keyword.User;
import session_10_oop_concepts.practice.static_keyword.Validator;

public class Test {

    public static void main(String[] args) {
        Animal dog = new Animal("Rex", 15.2, 2);

        User user1 = new User();
        user1.setFirstName("Alice");
        user1.setLastName("Doe");
        user1.setAge(25);

        Validator.isValidUser(user1);
    }
}

class Human {

    static String name;

    public int sum(int number1, int number2) {
        return number1 + number2;
    }
}
