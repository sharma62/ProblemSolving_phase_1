public class Continue_8 {
    public static void main(String[] args) {
        // continue statement is used to skip a perticular iteration of the loop.
        int intArray[] = new int[] { 1, 2, 3, 4, 5 };
        System.out.println("All nembers except 3 are ");
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 3)
                continue;
            else
                System.out.println(intArray[i]);

        }

    }
}
