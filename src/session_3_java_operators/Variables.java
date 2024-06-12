package session_3_java_operators;

public class Variables {

    public static void main(String[] args) {
        int age = 27;
        int value = 10;
        int outerVariable = 100;

        if (outerVariable > 50) {
            int innerVariable = 200;
            System.out.println((innerVariable + outerVariable));
        }
    }
}
