package session_6_core_java_api.challenges;

import java.util.*;

public class Challenge3 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hollywood ", "is ", "a ", "weird ", "place.");
        String finalConcat = multipleConcat(words);
        System.out.println(finalConcat);
    }
    public static String multipleConcat(List<String> string){
        StringBuilder sb = new StringBuilder();

        for(String input : string){
            sb.append(input);
        }

        return sb.toString();
    }
}
