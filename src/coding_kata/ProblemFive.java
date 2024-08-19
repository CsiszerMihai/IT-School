package coding_kata;

import java.util.Scanner;

public class ProblemFive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your sentence:");
        String sentence = sc.nextLine();

        String result = reverseSentence(sentence);
        System.out.println(result);

        //Method 2
        String[] words = sentence.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }


    // Method 1
    public static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }
        return reversedSentence.toString();
    }
}