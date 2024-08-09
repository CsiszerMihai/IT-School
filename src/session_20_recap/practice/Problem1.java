package session_20_recap.practice;

public class Problem1 {

    public static void main(String[] args) {
        String sentence = new String("This is the sentence we will be using for this problem.");
        String[] splitSentece = sentence.split(" ");

        int count = 0;

        for (String word : splitSentece) {
            if (word.length() > 3) {
                ++count;
            }
        }

        System.out.println(count);
    }
}