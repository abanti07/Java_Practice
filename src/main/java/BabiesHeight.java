//Take input as height of 10 babies in cm. Now find out the 2 lowest height of babies.

import java.util.Scanner;
import java.util.logging.Handler;

public class BabiesHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_size = 10;
        int[] height = new int[10];
        for (int i = 0; i < height.length; i++) {
            System.out.print("Enter the height in cm: ");
            height[i] = sc.nextInt();
        }
        System.out.print("Babies height in cm are :");
        for (int i = 0; i < height.length; i++) {

            System.out.print(height[i] + " ");
        }
        System.out.println();
        LowestHeight(height);
    }
    public static void LowestHeight(int[] height) {
        int lowest_value = Integer.MAX_VALUE;
        int second_lowest = Integer.MAX_VALUE;

        for (int i = 0; i < height.length; i++) {
            if (height[i] < lowest_value) {
                second_lowest = lowest_value ;
                lowest_value = height[i];
            } else if (height[i] < second_lowest && second_lowest != lowest_value) {
                second_lowest = height[i];
            }
        }
        System.out.println("Lowest height:" + lowest_value);
        System.out.println("Second lowest height: " + second_lowest);
    }
}


