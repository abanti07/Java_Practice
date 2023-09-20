//Calculate and Print the MEDIAN of the CGPA

public class CalculateMedian {
    public static void sortedarray(double cgpa[]) {
        //bubble sort
        for (int i = 0; i < cgpa.length - 1; i++) {
            for (int j = 0; j < cgpa.length - i - 1; j++) {
                if (cgpa[j] > cgpa[j + 1]) {
                    double temp = cgpa[j];
                    cgpa[j] = cgpa[j + 1];
                    cgpa[j + 1] = temp;
                }
            }
        }
    }
    public static double calculatemedian(double sorted[]) {
        int length = sorted.length;
        if (length % 2 != 0) {
            // odd number
            return sorted[length / 2];
        } else {
            //even number
            int median1 = length / 2 - 1;
            int median2 = length / 2;
            return (sorted[median1] + sorted[median2]) / 2;
        }
    }
    public static void main(String[] args) {
        double cgpa[] = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
       sortedarray(cgpa);
        for (int i = 0; i < cgpa.length; i++) {
            double sorted = cgpa[i];
           // System.out.println(sorted);
        }
        double median = calculatemedian(cgpa);
        System.out.println("Median :" + median);
    }
}
