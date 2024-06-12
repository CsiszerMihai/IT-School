package session_3_java_operators.session_3_extra_challenges;

import java.util.Scanner;
public class ExtraChallengeThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your account's balance? ");
        double balance = scanner.nextDouble();
        System.out.println("What's the amount that you would like to deposit? ");
        double deposit = scanner.nextDouble();

        double newBalance = balance + deposit;
        System.out.println("Your balance was " + balance + ", you deposited " + deposit + " . New balance is: " + newBalance);
    }
}