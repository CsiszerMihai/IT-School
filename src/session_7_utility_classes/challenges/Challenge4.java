package session_7_utility_classes.challenges;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {
        boolean result = areDatesEqual();
        System.out.println("Are the dates equal? " + result);
    }

    public static boolean areDatesEqual() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first date (YYYY-MM-DD): ");
        String firstDateStr = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateStr, DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String secondDateStr = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateStr, DateTimeFormatter.ISO_LOCAL_DATE);

        return firstDate.equals(secondDate);
    }
}