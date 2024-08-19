package coding_kata;

import java.util.Scanner;

public class ProblemSeven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Check if number is prime");
        int number = sc.nextInt();
        boolean isPrime = false;

        for (int i =  2; i <= number / 2; i++) {
            if (number % i != 0) {
                isPrime = true;
                break;
            } else {

            }
        }
    }
}