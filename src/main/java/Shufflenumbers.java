// Write a program that will shuffle from the given array=[1,2,3,4,5,6,7,8,9,0].

import java.util.Random;

public class Shufflenumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        shuffle(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    public static void shuffle(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int randomIndex = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}

