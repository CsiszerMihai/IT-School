package session_4_java_operators_and_loops.challenges;

public class Challenge16 {

    public static void main(String[] args) {
        int number = 50;

        int negatedNumber = -number;
        System.out.println("Negated number: " + negatedNumber);

        int absoluteValue = Math.abs(negatedNumber);
        System.out.println("Absolute value: " + absoluteValue);

        int incrementedValue = ++absoluteValue ;
        System.out.println("Incremented value: " + incrementedValue);
    }
}