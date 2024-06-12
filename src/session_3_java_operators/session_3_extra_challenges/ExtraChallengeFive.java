package session_3_java_operators.session_3_extra_challenges;

import java.util.Scanner;
public class ExtraChallengeFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much is the bill? ");
        double originalBill = scanner.nextDouble();
        System.out.println("How much would you like to discount from this bill? ");
        double discountedAmount = scanner.nextDouble();

        double finalBill = originalBill - (originalBill * discountedAmount / 100);
        System.out.println("The discounted bill amount is: " + finalBill);
    }
}