package session_7_utility_classes.challenges;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Challenge6 {

    public static void main(String[] args) {
        displayCurrentTime();
    }

    public static void displayCurrentTime() {
        LocalTime currentTime = LocalTime.now();
        String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(formattedTime);
    }
}