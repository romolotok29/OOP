package Task2;

import static Task2.Words.findLongestWord;
import static Task2.Words.findShortestWord;

public class Main {
    public static void main (String [] args) {

        String sentence = "Предложение состоит из слов разной длинны";

        System.out.println("Самое короткое слово : " + findShortestWord(sentence));
        System.out.println("Самое длинное слово : " + findLongestWord(sentence));

    }
}
