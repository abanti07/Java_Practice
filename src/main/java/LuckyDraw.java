//Here is the array of lucky draw numbers:
//[100,150,140,180,170,200,250,230,220,300]
//Now, input any number from this array.
// The program will randomly generate any one number of this array.
// If your input number and generated number matches,
// it will print you are lucky! Continue it max 3 times until you are lucky.
// If at the 1st or 2nd time you are lucky,
// then the program will quit instead of giving you a chance 3 times.

import java.util.Random;
import java.util.Scanner;

public class LuckyDraw {
    public static void main(String[] args) {
        int[] luckynumbers = {100, 150, 140, 180, 170, 200, 250, 230, 220, 300};
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int tries = 3;

        for (int i = 0; i < tries; i++) {
            System.out.println("Enter your lucky number:");
            int usernumber = sc.nextInt();

            boolean validnumber = false;
            for (int num:luckynumbers) {
                if (num==usernumber) {
                    validnumber = true;
                    break;
                }
            }
            if (!validnumber) {
                System.out.println("Invalid number. Enter lucky draw numbers from luckynumbers.");
                continue;
            }

            int randomnumber = luckynumbers[random.nextInt(luckynumbers.length)];
            System.out.println("Generated lucky number is : " + randomnumber);
            if (usernumber == randomnumber) {
                System.out.println("You are lucky");
                break;
            } else {
                System.out.println("Try again");
            }
        }
    }
}
