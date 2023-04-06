import java.util.Scanner;

/**
 * AeaOfCircle_15
 */
public class AeaOfCircle_15 {

    public static void main(String[] args) {
        int radius= 0;
        System.out.println("Please enter radius of circle in integer value");
       
        Scanner input = new Scanner(System.in);
        radius = input.nextInt();

        double area = Math.PI * radius*radius;
        System.out.println(" area of circle is  " + area);
    }
}