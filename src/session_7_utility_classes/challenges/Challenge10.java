package session_7_utility_classes.challenges;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Challenge10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (YYYY-MM-DD): ");
        String dateStr = scanner.nextLine();

        boolean isValid = isValidDate(dateStr);

        if (isValid) {
            System.out.println("The date '" + dateStr + "' is valid.");
        } else {
            System.out.println("The date '" + dateStr + "' is not valid or does not conform to YYYY-MM-DD format.");
        }
        scanner.close();
    }

    public static boolean isValidDate(String dateStr) {
        try {
            LocalDate.parse(dateStr);

            if (dateStr.length() == 10) {
                int year = Integer.parseInt(dateStr.substring(0, 4));
                int month = Integer.parseInt(dateStr.substring(5, 7));
                int day = Integer.parseInt(dateStr.substring(8, 10));

                if (month == 2 && day > 28) {
                    boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
                    if (!isLeapYear || (isLeapYear && day > 29)) {
                        return false;
                    }
                }
            }

            return true;
        } catch (DateTimeParseException | NumberFormatException e) {
            return false;
        }
    }
}