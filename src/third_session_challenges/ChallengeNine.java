package third_session_challenges;

import java.util.Scanner;

public class ChallengeNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lungime: ");
        int lungime = scanner.nextInt();
        System.out.print("Latime: ");
        int latime = scanner.nextInt();

        int arie = lungime * latime;
        System.out.println("Aria dreptunghiului este: " + arie);
    }
}