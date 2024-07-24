package session_9_arrays.challenges;

import java.util.ArrayList;

public class Challenge4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }
        System.out.println("Even numbers count: " + evenNumbers.size());
        System.out.println("Odd numbers count: " + oddNumbers.size());
    }
}