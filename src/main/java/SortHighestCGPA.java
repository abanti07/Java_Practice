//Sort the scores from according to the order of highest CGPA.

public class SortHighestCGPA {
    public static void main(String[] args) {

        double cgpa[] = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        Arrayprint(cgpa);
    }

    public static void Arrayprint(double cgpa[]) {
        //bubble sort
        for (int i = 0; i < cgpa.length - 1; i++) {
            for (int j = 0; j < cgpa.length - i - 1; j++) {
                if (cgpa[j] < cgpa[j + 1]) {

                    double temp = cgpa[j];
                    cgpa[j] = cgpa[j + 1];
                    cgpa[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < cgpa.length; i++) {
            System.out.print(cgpa[i] + " ");
        }
    }
}


