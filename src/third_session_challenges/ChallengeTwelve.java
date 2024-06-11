package third_session_challenges;
import java.util.Scanner;

public class ChallengeTwelve {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int numberInteger = scanner.nextInt();

        numberInteger++;
        System.out.println("Your number incremented is: " + numberInteger);

        numberInteger--;
        numberInteger--;
        System.out.println("Your number decremented is: " + numberInteger);


    }
}
