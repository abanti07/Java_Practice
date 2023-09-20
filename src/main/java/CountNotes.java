//Write a program that will break down the amount and count notes for any given amount.
// Here is the notes in the given array:
//notes=[1000,500,200,100,50,20,10,5,2,1]

import java.util.Scanner;

public class CountNotes {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        Scanner sc = new Scanner(System.in);
        System.out.println("Input :");
        int input = sc.nextInt();// input=546

        System.out.println("Output: ");
        for (int i = 0; i < notes.length; i++) {
            if (input >= notes[i])
            {
                int count = input / notes[i];
                System.out.println(notes[i] + " " + count);
                input %= notes[i];
            }
        }
    }
}
