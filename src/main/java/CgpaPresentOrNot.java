//From the given array find if your input CGPA is present using binary search algorithm.

import java.util.Arrays;
import java.util.Scanner;

public class CgpaPresentOrNot {
    //binary search algorithm
    public static int findinput(double[] arr, double input) {
        int low = 0;
        int high = arr.length - 1;
        int middle = 0;
        while (low <= high) {
            middle = (low + high) / 2;
            if (input == arr[middle]) {
                return middle;
            } else if (input < arr[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        double[] arr = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a input: ");
        double input = sc.nextDouble();
        int output = findinput(arr, input);
        if (output != -1) {
            System.out.println("Input CGPA is present");
        } else {
            System.out.println("Input CGPA is not present");
        }
    }
}
