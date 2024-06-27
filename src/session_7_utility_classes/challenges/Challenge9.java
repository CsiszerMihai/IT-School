package session_7_utility_classes.challenges;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Challenge9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first date (YYYY-MM-DD): ");
        String dateStr1 = scanner.nextLine();

        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String dateStr2 = scanner.nextLine();

        long differenceInDays = daysBetween(dateStr1, dateStr2);
        System.out.println("Difference in days: " + differenceInDays);

        scanner.close();
    }

    public static long daysBetween(String dateStr1, String dateStr2) {
        LocalDate date1 = LocalDate.parse(dateStr1, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate date2 = LocalDate.parse(dateStr2, DateTimeFormatter.ISO_LOCAL_DATE);

        long daysDifference = ChronoUnit.DAYS.between(date1, date2);
        return Math.abs(daysDifference);
    }
}