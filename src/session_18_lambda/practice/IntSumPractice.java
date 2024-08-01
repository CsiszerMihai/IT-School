package session_18_lambda.practice;

public class IntSumPractice {

    public static void main(String[] args) {
        IntSum result = (a, b) -> a + b;
        System.out.println(result.sum(23, 25));
    }
}