package session_4_java_operators_and_loops.challenges;

public class Challenge1 {

    public static void main(String[] args) {
        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";

        if (stringOne == stringTwo) {
            System.out.println("stringOne and stringTwo refer to the same object.");
        } else {
            System.out.println("stringOne and stringTwo do not refer to the same object.");
        }

        String stringThree = new String("OpenAI");
        String stringFour = new String("OpenAI");

        if (stringThree == stringFour) {
            System.out.println("stringThree and stringFour refer to the same object.");
        } else {
            System.out.println("stringThree and stringFour do not refer to the same object.");
        }
    }
}