package session_6_core_java_api.challenges;

public class Challenge5 {

    public static void main(String[] args) {
        String sentence = "sample text lorem ipsum lorem ipsum";
        String capitalSentence = wordCapital(sentence);
        System.out.println(capitalSentence);
    }

    public static String wordCapital(String string) {
        StringBuilder sb = new StringBuilder();
        //String arrays can be created after splitting the string by its whitespaces -> \\s+ finds single or multiple whitespaces
        String[] words = string.split("\\s+");

        for (String word : words) {
            //conditional statement that is true while string.length = 0
            if (!word.isEmpty()) {
                //variable which I made to hold the first letter of a word and make it big
                char firstChar = Character.toUpperCase(word.charAt(0));
                //here we did the concatenation of first letter upper case
                // + the rest of the word by making it start from index 1 which means the second letter
                //and then a blank space was added for the next word to be added
                sb.append(firstChar).append(word.substring(1)).append(" ");
                //if the word was empty (was a space) then we just append a space
            } else {
                sb.append(" ");
            }
        }
        //we finally took out extra spaces and give back the sentence
        return sb.toString().trim();
    }
}