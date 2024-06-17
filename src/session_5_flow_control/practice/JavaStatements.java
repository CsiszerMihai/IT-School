package session_5_flow_control.practice;

public class JavaStatements {

    public static final int MAX_VALUE = 10;
    public static final int MAX_STRING_VALUE = 5;

    public static void main(String[] args) {
        int number = 5;

        if (number > MAX_VALUE) {
            System.out.println("The number is greater than " + MAX_VALUE);
        } else {
            System.out.println("The number is smaller than " + MAX_VALUE);
        }

        String greeting = "Hello";
        if (greeting.length() > MAX_STRING_VALUE) {
            System.out.println("Greeting is too long.");
        } else if(greeting.equalsIgnoreCase("Hello")) {
            System.out.println("Greeting is Hello.");
        } else {
            System.out.println("Unknown input.");
        }
    }
}
