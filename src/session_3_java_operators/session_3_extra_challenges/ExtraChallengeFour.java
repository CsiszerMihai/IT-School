package session_3_java_operators.session_3_extra_challenges;

import java.util.Scanner;
public class ExtraChallengeFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        double grade = scanner.nextDouble();

        if (50 <= grade && grade <= 100){
            System.out.println("You passed!!!");}
        else if (0 <= grade && grade < 50) {
            System.out.println("You failed, study harder for next time and you will pass.");}
        else{
            System.out.println("Error: You have entered your grade wrong!");}
    }
}