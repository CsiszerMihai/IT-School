package session_18_lambda.practice;

public class IntMultiplyPractice {

    public static void main(String[] args) {
        IntMultiply result = (a, b) -> a * b;
        System.out.println(result.multiply(15, 23));
    }
}