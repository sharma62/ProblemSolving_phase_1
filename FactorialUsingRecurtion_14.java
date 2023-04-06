import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialUsingRecurtion_14 {
    public static void main(String[] args) throws NumberFormatException,IOException {
        System.out.println("Enter an integer to calculate its factrial ");
        //get input from the user
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        //call the recursive function to generate factorial
        int result = fact(a);
        System.out.println("Fatorial of " + a+  " is" +result);
    }

        static int fact(int b ){
            if(b<=1)
              return 1;
            else
              return(b* fact(b-1));
        }
}
