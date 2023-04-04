import java.util.Scanner;

public class PlalinedromeNumber_12 {
    public static void main(String[] args) {
        System.out.println("Enter number to check number is palindrome or not");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int n = num; 

        // reverse number
        int rev = 0, rmd;
        while (num > 0) {
            rmd = num % 10;
            rev = rev * 10 + rmd;
            num = num / 10;
        }
        if(n==rev){
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }
    }
}
