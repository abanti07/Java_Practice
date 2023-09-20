//Generate random 10 integer numbers in an array and print out all the numbers
//from the array and also print the max and min number from the array

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int array_size = 10;

        int[] arr = new int[array_size];
        System.out.println("Enter the value in array: ");
        for (int i = 0; i < array_size; i++) {
            arr[i] = random.nextInt(1000);
        }
        System.out.println("Random Numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int max_number = arr[0];
        int min_number = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_number) {
                max_number = arr[i];
            } else if (arr[i] < min_number) {
                min_number = arr[i];
            }
        }
        System.out.println("Max number: " + max_number);
        System.out.println("Min Number: " + min_number);
    }
}

