package session_3_java_operators.session_3_extra_challenges;

import java.util.Scanner;
public class ExtraChallengeSix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age? ");
        int age = scanner.nextInt();

        if (age >= 0 && age < 18){
            System.out.println("Not eligible to vote.");}
        else if(age >= 18 && age <=100){
            System.out.println("Eligible to vote.");}
        else{
            System.out.println("Please enter real age.");}
    }
}