package session_4_java_operators_and_loops.challenges;

public class Challenge6 {

    public static void main(String[] args) {
        int temperature = 27;

        if (temperature > 30) {
            System.out.println("Hot");
        } else if (20 <= temperature && temperature<= 30) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }
    }
}