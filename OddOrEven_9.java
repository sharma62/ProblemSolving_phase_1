import java.util.Scanner;

public class OddOrEven_9 {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter an integer to check number is odd or even");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        if (x % 2 == 0) 
            System.out.println("Numberis even");
         else
            System.out.println("Numberis odd");
    }
}
