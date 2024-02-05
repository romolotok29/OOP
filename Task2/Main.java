package Task2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static Task2.MyArrayList.*;

public class Main {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        int size = getSizeFromConsole(sc);

        ArrayList<Integer> numbers = randomNumbers(size);
        if (!numbers.isEmpty()) {
            double average = averageNumber(numbers);
            System.out.println("Average number is : " + average);
        }
    }
}
