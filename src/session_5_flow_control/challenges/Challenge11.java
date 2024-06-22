package session_5_flow_control.challenges;

import java.util.Scanner;

public class Challenge11 {

    public static void main(String[] args) {
        int total = 0;
        int input = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        do {
            input = sc.nextInt();
            total += input;
            count++;
        } while (input != 0);
        sc.close();
        int average = total / (count - 1);
        System.out.println("average: " + average);
    }
}
