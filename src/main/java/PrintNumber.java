//Write a program that will give following output:
//1
//12
//123
//1234
//12345

public class PrintNumber {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
