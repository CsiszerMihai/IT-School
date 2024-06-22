package session_5_flow_control.challenges;

import java.util.Scanner;

public class Challenge12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputCount = 10;
        double sum = 0;
        System.out.println("Enter 10 numbers");

        for (int i = 0; i < inputCount; i++) {
            double input = sc.nextDouble();

            if (input <= 5) {
                continue;
            }
            sum += input;
        }
        System.out.println("Sum of numbers greater than 5: " + sum);
    }
}