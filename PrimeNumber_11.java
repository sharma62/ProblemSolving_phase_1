import java.util.Scanner;

/**
 * PrimeNumber_11
 */
public class PrimeNumber_11 {

    public static void main(String[] args) {
        int n, status = 1, num = 3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers you want");
        n = input.nextInt();
        if (n >= 1) {
            System.out.println("first" + n + "Prime number are :");
            System.out.println(2);
        }

        for (int count = 0; count <= n;) {
            for (int i = 0; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num);
                count++;
            }
            status = 1;
            num++;
        }
    }
}