package session_3_java_operators.third_session_challenges;
import java.util.Scanner;

public class ChallengeTen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer to be inverted: ");
        int number = scanner.nextInt();

        int invers = -number;
        System.out.println("The reversed sign of " + number + " is: " + invers);
    }
}