package session_3_java_operators.session_3_extra_challenges;

import java.util.Scanner;
public class ExtraChallengeOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter item price: ");
        double itemPrice = scanner.nextDouble();
        System.out.println("Enter item quantity: ");
        double itemQuantity = scanner.nextDouble();
        System.out.println("Enter amount you paid with: ");
        double paymentAmount = scanner.nextDouble();

        double totalCost = itemQuantity * itemPrice;
        double totalChange = paymentAmount - totalCost;

        if (paymentAmount >= totalCost){
        System.out.println("Your total is " + totalCost + ", and your change is " + totalChange );}
        else{System.out.println("You do not have enough money.");}
    }
}