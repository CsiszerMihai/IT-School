package third_session_challenges;

import java.util.Scanner;

public class ChallengeEleven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a boolean to be negated: ");
        boolean a = scanner.nextBoolean();

        System.out.println("Enter a second boolean to be negated: ");
        boolean b = scanner.nextBoolean();

        boolean aNegativ = !a;
        boolean bNegativ = !b;

        System.out.println("Your negated booleans are: " + aNegativ + "," + " respectively " + bNegativ);
    }
}