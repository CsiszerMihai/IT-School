package session_3_java_operators.session_3_extra_challenges;

import java.util.Scanner;
public class ExtraChallengeTen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first ingredient's calorie amount: ");
        int firstCalorie = scanner.nextInt();
        System.out.println("Enter second ingridient's calorie amount: ");
        int secondCalorie = scanner.nextInt();
        System.out.println("Enter third ingridient's calorie amount: ");
        int thirdCalorie = scanner.nextInt();

        int totalCalories = firstCalorie + secondCalorie + thirdCalorie;
        System.out.println("Total amount of calories consumed is: " + totalCalories);
    }
}