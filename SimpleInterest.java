import java.util.Scanner;

import javax.swing.text.PasswordView;

public class SimpleInterest {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculate simple interest ");
        
        System.err.println("Please Enter principle amount: ");
        float amount = scan.nextFloat();
        
        System.err.println("enter time in years: ");
        float time = scan.nextFloat();
        
        System.err.println("enter rate annually: ");
        float rate = scan.nextFloat();
        float interest = SimpleInterest(amount,rate,time);
        System.out.println("simple interest : " + interest);

    }
    public static float SimpleInterest(float amount, float rate,float time){
         return ((amount*rate*time)/100);
    }
}
