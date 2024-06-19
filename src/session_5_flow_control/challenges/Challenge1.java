package session_5_flow_control.challenges;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nextNumber = sc.nextInt();

        if (nextNumber % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
    }
}