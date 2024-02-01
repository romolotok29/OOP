package Task5;

public class DoubleWord {

    public static String printDoubleWord (String word) {

        StringBuilder letters = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            letters.append(currentChar).append(currentChar);
        }
        return letters.toString();
    }
}
