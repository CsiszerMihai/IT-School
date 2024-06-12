package session_3_java_operators.third_session_challenges;
import java.util.Scanner;

public class ChallengeThirteen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the original price of the discounted product: ");
        double priceOriginal = scanner.nextDouble();
        System.out.println("Enter the percentage you want to discount: ");
        double discountPercentage = scanner.nextDouble();

        double priceDiscounted = priceOriginal - priceOriginal*discountPercentage/100;
        System.out.println("The discounted price is: " + priceDiscounted);

        double moneySaved = priceOriginal - priceDiscounted;
        System.out.println("How much you saved: " + moneySaved);
    }
}