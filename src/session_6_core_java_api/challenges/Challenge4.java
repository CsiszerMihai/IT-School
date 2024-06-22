package session_6_core_java_api.challenges;

import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word for vowel removal");
        String input = sc.nextLine();
        String result = vowelRemover(input);
        System.out.println("Result after removing vowels: " + result);
        sc.close();
    }

    public static String vowelRemover(String string) {
        StringBuilder sb = new StringBuilder();
        String lowCase = string.toLowerCase();
        for (int index = 0; index < string.length(); index++) {
            char ch = lowCase.charAt(index);

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                sb.append(string.charAt(index));
            }
        }
        return sb.toString();
    }
}
