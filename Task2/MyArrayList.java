package Task2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MyArrayList {

    protected static int getSizeFromConsole(Scanner sc) {
        int size = 0;
        boolean correctInput = false;

        while (!correctInput) {
            try {
                System.out.print("Enter a size of collection : ");
                size = sc.nextInt();

                if (size > 0) {
                    correctInput = true;
                } else {
                    System.out.println("The size must be a positive number");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please, enter a correct number");
                sc.next();
            }
        }
        return size;
    }

    protected static ArrayList<Integer> randomNumbers (int size) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(20));
        }
        System.out.println("Generated collection : " + numbers);
        return numbers;
    }

    protected static double averageNumber (ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }
}






