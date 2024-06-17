package session_5_flow_control.practice;

import java.util.Scanner;

public class SwitchStatements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.nextInt();

        switch (grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            default:
                System.out.println("Grade not recognized.");
        }
    }
}
