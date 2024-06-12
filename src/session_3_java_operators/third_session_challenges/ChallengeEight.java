package session_3_java_operators.third_session_challenges;

import java.util.Scanner;

public class ChallengeEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first byte value: ");
        byte byte1 = scanner.nextByte();

        System.out.print("Enter the second byte value: ");
        byte byte2 = scanner.nextByte();

        byte bytesum = (byte) (byte1 + byte2);
        System.out.println("The result of adding " + byte1 + " and " + byte2 + " is: " + bytesum);
    }
}