package Task5;

import static Task5.DoubleWord.printDoubleWord;

public class Main {
    public static void main (String [] args) {

        String word = "Hello";
        String duplicatedWord = printDoubleWord(word);
        System.out.println("New string with duplicated letters : " + duplicatedWord);

    }
}
