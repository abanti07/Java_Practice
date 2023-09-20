//A program that will take integer numbers as user input continuously and print the sum of numbers
// until user input q from the keyboard. When user input q, the program will be quit.
// If the user inputs another character, then the program will ask to input the number again.

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Input a number: press q for quit");
            String input = sc.next();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                sum = sum + number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number.Please enter an integer number.");
            }

        }
        System.out.println("Total Sum :" + sum);

    }
}
