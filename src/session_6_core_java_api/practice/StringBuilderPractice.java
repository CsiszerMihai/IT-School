package session_6_core_java_api.practice;

public class StringBuilderPractice {

    public static void main(String[] args) {
        String result = "";

        for (int index = 0; index < 10; index++) {
            result += "a";
        }
        System.out.println(result);

        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < 10; index++) {
            sb.append("a");
        }
        String result2 = sb.toString();
        System.out.println(result2);
    }
}
