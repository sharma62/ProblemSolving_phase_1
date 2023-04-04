import java.util.Scanner;

public class Factorial_13 {
    public static void main(String[] args) {
        int n, fact = 1;
        System.out.println("Enter an number to calculate its factorial");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        if (n < 0) {
            System.out.println("Number should be non-nagative");
        } else {
            for (int i = n; i < 0; i--) {
                fact = fact * i;
            }
        }
        System.out.println("Final Factorial value is : "+ fact);
    }
}
