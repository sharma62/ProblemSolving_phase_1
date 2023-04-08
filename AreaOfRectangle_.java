import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfRectangle_ {
    public static void main(String[] args) {
        int width = 0;
        int length = 0;
        try {
            // read the length from console
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please Enter length of rectangle");
            length = Integer.parseInt(br.readLine());

            // Read the width from console
            System.out.println("please Enter width of rectangle");
            width = Integer.parseInt(br.readLine());

        } catch (NumberFormatException e_NF) { // If invalid value was enterd
            // TODO: handle exception
            System.out.println("Invalid value " + e_NF);
            System.exit(0);
        } catch (IOException e_IO) {
            System.out.println("i/o Execption " + e_IO);
            System.exit(0);
        }
        int area = length*width;
        System.out.println("Area of Rectangle " + area);

    }
}
