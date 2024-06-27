package session_7_utility_classes.challenges;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Challenge2 {

    public static void main(String[] args) {
        displayDateComponents("2024-06-27");
    }

    public static void displayDateComponents(String dateStr) {
        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ISO_LOCAL_DATE);

        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}