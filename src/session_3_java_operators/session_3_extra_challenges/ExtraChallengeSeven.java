package session_3_java_operators.session_3_extra_challenges;

import java.util.Scanner;
public class ExtraChallengeSeven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter loaned amount: ");
        int principalLoanAmount = scanner.nextInt();
        System.out.println("Enter annual interest rate: ");
        int interestRate = scanner.nextInt();
        System.out.println("Enter loan period (in years): ");
        int loanPeriod = scanner.nextInt();

        int interestAmount = (principalLoanAmount * interestRate * loanPeriod) / 100;
        System.out.println("Your total interest for this loan is: " + interestAmount);
    }
}