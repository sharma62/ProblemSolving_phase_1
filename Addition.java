import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        int x ,y ,z;
        System.out.println("Enter two Integer to calculate their sum");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y= in.nextInt();
        z= (x+y);
        System.out.println("sum = " +z);
    }
}
