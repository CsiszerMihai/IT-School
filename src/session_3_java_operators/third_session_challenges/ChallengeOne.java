package session_3_java_operators.third_session_challenges;
import java.util.Scanner;

public class ChallengeOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Please enter another number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double multiply = num1 * num2;
        double divide = num1 / num2;
        double rest = num1%num2;

        System.out.println("Suma celor doua numere: " + sum);
        System.out.println("Diferenta celor doua numere: " + difference);
        System.out.println("Produsul celor doua numere: " + multiply);
        System.out.println("Catul impartirii celor doua numere: " + divide);
        System.out.println("Restul impartirii celor doua numere: " + rest);
    }
}
