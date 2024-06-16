package session_4_java_operators_and_loops.challenges;

public class Challenge18 {

    public static void main(String[] args) {
        int[] array = new int[5];

        for (int x = 0; x < array.length; x++) {
            array[x] = x + 1;
        }

        System.out.println("Array before decrement:");
        for (int number : array) {
            System.out.print(number + " ");
        }

        for (int x = 0; x < array.length; x++) {
            array[x]--;
        }

        System.out.println("Array after decrement:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}