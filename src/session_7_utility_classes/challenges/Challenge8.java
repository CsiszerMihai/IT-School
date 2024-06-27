package session_7_utility_classes.challenges;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Challenge8 {

    public static void main(String[] args) {
        String dateStr = "2024-06-27";
        String dayOfWeek = findDayOfWeek(dateStr);
        System.out.println("The day of the week for " + dateStr + " is " + dayOfWeek);
    }

    public static String findDayOfWeek(String dateString) {
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.toString();
    }
}