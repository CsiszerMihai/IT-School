package session_3_java_operators.third_session_challenges;

import java.util.Scanner;

public class ChallengeFourteen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer between 1-100: ");
        int numberInRange = scanner.nextInt();

        if (numberInRange >= 1 && numberInRange <= 100) {
            System.out.println("Number is within range!");}
        else {
            System.out.println("Number is not within range :( ");
        }
    }
}
