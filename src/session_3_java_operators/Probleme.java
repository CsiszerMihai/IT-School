package session_3_java_operators;

import java.util.Scanner;

public class Probleme {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your numbers:");
        int x = sc.nextInt(), y = sc.nextInt();
        int remainder = x % y;

        double power = Math.pow(x, y);
        System.out.println("Remainder: " + remainder);
        System.out.println("Power: " + power);
    }
}