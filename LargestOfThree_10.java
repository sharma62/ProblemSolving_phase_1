import java.util.Scanner;

public class LargestOfThree_10 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        if (x > y && x > z)
            System.out.println("1st number is max");
        else if (y > x && y > z)
            System.out.println("2nd number is max");
        else if (z > x && z > y)
            System.out.println("3nd number is max");
        else
            System.out.println("Enter number is not distinct");
    }
}
