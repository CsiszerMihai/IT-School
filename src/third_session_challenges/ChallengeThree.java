package third_session_challenges;
import java.util.Scanner;

public class ChallengeThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find out if it's positive or negative: ");
        double numInput = scanner.nextDouble();

        if (numInput >= 0){
            System.out.println("Number is positive.");}
        else {
            System.out.println("Number is negative.");
        }
    }
}