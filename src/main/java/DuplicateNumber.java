//Print the duplicate numbers in the given array.
//numbers=[1, 2, 3,1, 2, 4, 5, 6, 4]

import java.lang.reflect.Array;

public class DuplicateNumber {
    public static void main(String[] args) {
       int[] numbers={1, 2, 3,1, 2, 4, 5, 6, 4};
       for (int i=0;i<numbers.length;i++){
           for(int j=i+1;j<numbers.length;j++) {
               if (numbers[j] == numbers[i]) {
                   System.out.print(numbers[i] + " ");
               }
           }
       }
    }
}
