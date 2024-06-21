package session_5_flow_control.challenges;

import java.util.Scanner;

public class Challenge10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1: Print Hello World");
            System.out.println("2: Print user's name");
            System.out.println("3: Exit menu");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello World");
                    break;
                case 2:
                    System.out.print("Mihai");
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 3.");
                    continue;
            }
            scanner.nextLine();
            System.out.println();
        }
    }
}