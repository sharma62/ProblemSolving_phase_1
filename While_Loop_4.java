import java.util.Scanner;

public class While_Loop_4 {
    public static void main(String[] args) {
        int n ;
        Scanner in = new Scanner(System.in);
        System.out.println("Input an Integer value");
        while(( n = in.nextInt())!=0){
            System.out.println("you entered " + n);    
            System.out.println("Input an Integer value");
        }
        System.out.println("Bye Bye Bye . . .. . . . . . . ");
    }
}
