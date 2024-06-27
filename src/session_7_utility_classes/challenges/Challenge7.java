package session_7_utility_classes.challenges;

import java.time.LocalDate;

public class Challenge7 {

    public static void main(String[] args) {
        int weeksToAdd = 4;
        LocalDate newDate = addWeeksToToday(weeksToAdd);
        System.out.println("Date after adding " + weeksToAdd + " weeks: " + newDate);
    }

    public static LocalDate addWeeksToToday(int weeks) {
        LocalDate today = LocalDate.now();
        LocalDate resultDate = today.plusWeeks(weeks);
        return resultDate;
    }
}