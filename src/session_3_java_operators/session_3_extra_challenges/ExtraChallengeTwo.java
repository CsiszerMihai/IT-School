package session_3_java_operators.session_3_extra_challenges;

import java.util.Scanner;
public class ExtraChallengeTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        double temperatureCelsius = scanner.nextDouble();

        double temperatureFahrenheit = (temperatureCelsius * 1.8) + 32;
        System.out.println("The conversion to Fahrenheit is equal to: " + temperatureFahrenheit);
    }
}