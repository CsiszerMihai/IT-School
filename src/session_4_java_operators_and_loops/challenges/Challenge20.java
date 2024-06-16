package session_4_java_operators_and_loops.challenges;

import java.util.Scanner;

public class Challenge20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer (b): ");
        int b = scanner.nextInt();
        System.out.print("Enter third integer (c): ");
        int c = scanner.nextInt();

        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("The largest number is: " + largest);
        int smallest = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        System.out.println("The smallest number is: " + smallest);
    }
}