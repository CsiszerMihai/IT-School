package session_9_arrays.challenges;

public class Challenge9 {

    public static void main(String[] args) {
        String binaryString = "10110110110101";
        int decimalValue = Integer.parseInt(binaryString, 2);

        System.out.println("The decimal representation of the binary number " + binaryString + " is: " + decimalValue);
    }
}