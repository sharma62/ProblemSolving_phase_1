import java.util.Scanner;;
public class PrintTable_21 {
    public static void main(String[] args) {
        int n , c;
        System.out.println("Enter integer to print table ");
        Scanner input = new Scanner(System.in);
        n= input.nextInt();
        System.out.println("Respactive table");
        for(int i= 0 ; i<=n ;i++){
            System.out.println(n +" * " +i +  " = "+ (n*i));
        }
    }
}
