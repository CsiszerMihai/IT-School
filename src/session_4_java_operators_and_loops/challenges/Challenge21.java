package session_4_java_operators_and_loops.challenges;

import java.util.Scanner;

public class Challenge21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's score: ");
        double score = scanner.nextDouble();

        char grade = (score >= 90) ? 'A' :
                     (score >= 80) ? 'B' :
                     (score >= 70) ? 'C' :
                     (score >= 60) ? 'D' :
                     'F';
        System.out.println("The student's grade is: " + grade);}
    }
}