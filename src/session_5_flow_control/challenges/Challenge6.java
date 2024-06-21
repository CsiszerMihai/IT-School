package session_5_flow_control.challenges;

import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        System.out.println("Enter numbers to find sum, finish request by typing -1");
        number = sc.nextInt();

        while (number != -1) {
            sum += number;
            number = sc.nextInt();
        }
        sc.close();
        System.out.println(sum);
    }
}