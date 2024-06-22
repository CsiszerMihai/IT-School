package session_6_core_java_api.challenges;

public class Challenge6 {

    public static void main(String[] args) {
        String sentence = "What did the fox say to the hedgehog?";
        String oldSubstring = "fox";
        String newSubstring = "bear";

        String replacedSentence = replaceWord(sentence, oldSubstring, newSubstring);

        System.out.println("Original sentence: " + sentence);
        System.out.println("Replaced sentence: " + replacedSentence);
    }

    //also this method has 3 parameters we want to keep in mind
    public static String replaceWord(String originalSentence, String oldWord, String newWord) {
        StringBuilder sb = new StringBuilder();
        // Start index to search for occurrences of oldSubstring
        int startIndex = 0;
        int lastIndex = 0;
        // Find each occurrence of fox and replace it
        while ((lastIndex = originalSentence.indexOf(oldWord, startIndex)) != -1) {
            // here we append the first part of the sentence up until the point where the old word has started
            sb.append(originalSentence, startIndex, lastIndex);
            // append the new word
            sb.append(newWord);
            // establish the index from which the last part of the sentence starts
            startIndex = lastIndex + oldWord.length();
        }
        // Append the last part of the sentence
        sb.append(originalSentence.substring(startIndex));

        // Convert StringBuilder to String and return the modified string
        return sb.toString();
    }
}
