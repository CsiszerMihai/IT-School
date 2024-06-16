package session_4_java_operators_and_loops.challenges;

public class Challenge4 {

    public static void main(String[] args) {
        int heightOne = 175;
        int heightTwo = 181;

        int maximumHeight = (heightOne > heightTwo) ? heightOne : heightTwo;
        System.out.println("The greater height is: " + maximumHeight);
    }
}