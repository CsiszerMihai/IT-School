package session_3_java_operators.session_3_extra_challenges;

import java.util.Scanner;
public class ExtraChallengeEight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cost of first item: ");
        double priceOne = scanner.nextDouble();
        System.out.println("Enter the cost of the second item: ");
        double priceTwo = scanner.nextDouble();

        if (priceTwo > priceOne){
            System.out.println("The first item is cheaper.");}
        else if (priceTwo< priceOne){
            System.out.println("The second item is cheaper");}
        else {
            System.out.println("They are the same price.");}
    }
}
