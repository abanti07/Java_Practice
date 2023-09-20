//Here is the 10 students CGPA [3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75]
//Find out who achieved the 2nd highest score.

public class SecondHighest {
    public static void main(String[] args) {
        double marks[] = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double max = marks[0];
        double secondmax = marks[1];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
                marks[i] = max;
            } else if (marks[i] > secondmax && secondmax != max) {
                secondmax = marks[i];
                marks[i] = secondmax;
            }
        }
        System.out.println("Second highest score: " + secondmax);
    }
}


