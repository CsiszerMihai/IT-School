package session_5_flow_control.challenges;

import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("Enter a string to be reversed: ");
        String input = sc.nextLine();

        stringBuilder.append(input);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
