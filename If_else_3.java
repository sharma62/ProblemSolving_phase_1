import java.util.Scanner;

public class If_else_3 {
    public static void main(String[] args) {
        int pass_marks,total_marks;
        Scanner in = new Scanner(System.in);
        total_marks = in.nextInt();
        pass_marks= in.nextInt();

        if(pass_marks>=total_marks){
            System.out.println("Pass");
        }else{
            System.out.println("fail");
        }
    }
}
