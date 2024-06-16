package session_4_java_operators_and_loops.challenges;

public class Challenge8 {

    public static void main(String[] args) {
        int factorial = 1;

        for(int x = 1; x <= 5; x++){
            factorial *= x;
        }

        System.out.println("Factorial is: " + factorial);
    }
}