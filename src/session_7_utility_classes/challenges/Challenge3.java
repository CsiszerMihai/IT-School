package session_7_utility_classes.challenges;

import java.time.LocalDate;

public class Challenge3 {

    public static void main(String[] args) {
        LocalDate date = createSpecificDate();
        System.out.println("Specific date: " + date);
    }

    public static LocalDate createSpecificDate() {
        LocalDate specificDate = LocalDate.of(2025, 8, 19);
        return specificDate;
    }
}