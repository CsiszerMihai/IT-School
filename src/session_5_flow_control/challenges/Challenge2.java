package session_5_flow_control.challenges;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1-12");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("1st month is January");
                break;
            case 2:
                System.out.println("2nd month is February");
                break;
            case 3:
                System.out.println("3rd month is March");
                break;
            case 4:
                System.out.println("4thmonth is April");
                break;
            case 5:
                System.out.println("5th month is May");
                break;
            case 6:
                System.out.println("6th month is June");
                break;
            case 7:
                System.out.println("7th month is July");
                break;
            case 8:
                System.out.println("8th month is August");
                break;
            case 9:
                System.out.println("9th month is September");
                break;
            case 10:
                System.out.println("10th month is October");
                break;
            case 11:
                System.out.println("11th month is November");
                break;
            case 12:
                System.out.println("12th month is December");
                break;
            default:
                System.out.println("Invalid number!");
                break;
        }
    }
}
