package Task2;

public class Words {

    public static String findShortestWord(String sentence) {

        String [] words = sentence.split("\\s+");
        String shortestWord = words[0];

        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }
        return shortestWord;
    }

    public static String findLongestWord(String sentence) {

        String [] words = sentence.split("\\s+");
        String longestWord = words[0];

        for (String word : words) {
            if(word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
