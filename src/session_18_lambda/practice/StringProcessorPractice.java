package session_18_lambda.practice;

public class StringProcessorPractice {

    public static void main(String[] args) {
        StringProcessor removeWhiteSpaces = str -> str.replace("", "");
        StringProcessor toUpperCase = str -> str.toUpperCase();

        StringProcessor combined = removeWhiteSpaces.andThen(toUpperCase);
        System.out.println(combined.processor("Hello World!"));
    }
}