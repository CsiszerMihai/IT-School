package session_6_core_java_api.challenges;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check if a word is a palindrome");
        String input = sc.nextLine();

        if (palindromeChecker(input)) {
            System.out.println("Input is a palindrome");
        } else {
            System.out.println("Input isn't a palindrome");
        }
    }
    public static boolean palindromeChecker(String string) {
        StringBuilder sb = new StringBuilder(string);
        String invert = sb.reverse().toString();
        return string.equals(invert);
    }
}
