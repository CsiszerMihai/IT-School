package session_5_flow_control.challenges;

public class Challenge3 {

    public static void main(String[] args) {
        int[] array = {1, -3, -17, 12, 3};

        int count = 0;
        for (int number : array) {
            if (number < 0) {
                System.out.println("Negative number detected: " + number);
                count++;
            }
        }

        System.out.println("Number of negative integers: " + count);
    }
}