package session_5_flow_control.challenges;

import java.util.Scanner;

public class Challenge7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guess;
        int correctGuess = 17;

        do {
            System.out.println("Guess the number");
            guess = sc.nextInt();

            if (guess < correctGuess) {
                System.out.println("number too low");
            } else if (guess > correctGuess) {
                System.out.println("number too high");
            } else {
                System.out.println("number is correct");
            }
        } while (guess != correctGuess);
    }
}