import java.util.Scanner;

public class que6 {
    public static void main (String[] args) {
        Scanner ob = new Scanner (System.in);
        int[] arr = {1, 2, 3, 4};
        System.out.print("Enter the index of the Array: ");
        int index = ob.nextInt();

        try {
            System.out.println("Number in index " + (index) + " is " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException ignored) {
            System.out.println("Array Index Out of Bound");
        }
    }
}
