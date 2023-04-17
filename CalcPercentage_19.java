import java.util.Scanner;

public class CalcPercentage_19 {
    public static void main(String[] args) {
        double x = 0, y = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value  of x");
        x = scan.nextDouble();
        System.out.println("Enter the value of y");
        y = scan.nextDouble();
        System.out.println();
        System.out.println("Calculate percentage : (X of Y)");
        System.out.println(x + "% of " + y + "is " + (x * y)/100);
    }
}
