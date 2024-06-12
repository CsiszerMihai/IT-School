package session_3_java_operators.session_3_extra_challenges;

import java.util.Scanner;
public class ExtraChallengeNine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you wish to convert.(USD amount)");
        double dollarAmount = scanner.nextDouble();
        System.out.println("Enter today's conversion rate from USD to EUR:");
        double conversionRate = scanner.nextDouble();

        double conversionAmount = dollarAmount * conversionRate;
        System.out.println("The exchanged amount is: " +conversionAmount);
    }
}