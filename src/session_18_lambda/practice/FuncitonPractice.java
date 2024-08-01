package session_18_lambda.practice;

import java.util.function.Function;

public class FuncitonPractice {

    public static void main(String[] args) {
        Function<String, Integer> strLengthCheck = str -> str.length();
        System.out.println(strLengthCheck.apply("Hello"));
    }
}