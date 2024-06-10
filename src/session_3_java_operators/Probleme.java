package session_3_java_operators;

import java.util.Scanner;

public class Probleme {

    public static void main(String[] args) {

        /*
        Write a Java program to fing the remainder of two integers x and y using the modulus operator.
        Also, compute the result of x raised to the power of y using the Math.pow function.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter your numbers:");
        int x = sc.nextInt(), y = sc.nextInt();
        int remainder = x % y;

        double power = Math.pow(x, y);
        System.out.println("Remainder: " + remainder);
        System.out.println("Power: " + power);



    }
}
