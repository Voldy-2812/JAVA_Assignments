import java.util.Arrays;
import java.util.Scanner;

public class que4 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        float[] arr = { 10.5f, 20.5f, 30.5f, 40.5f, 50.5f };
        int index;
        float divisor = 0.0f, dividend = 0.0f;
        boolean exception = false;
        System.out.println("Numbers in the Array:: \n" + Arrays.toString(arr));
        try {
            try {
                System.out.print("Enter the index of the Array: ");
                index = ob.nextInt();
                dividend = arr[index];
            } catch (ArrayIndexOutOfBoundsException ignored) {
                exception = true;
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println("Dividend: " + dividend);
            System.out.print("Enter the divisor: ");
            divisor = ob.nextFloat();
            if (divisor == 0) {
                exception = true;
                throw new ArithmeticException();
            }
        } catch (ArithmeticException ignored) {
            System.out.println("Arithmetic Exception Occurred");
        } catch (ArrayIndexOutOfBoundsException ignored) {
            System.out.println("Array Index Out of Bound");
        } finally {
            if (!exception) {
                System.out.println(dividend + " divide " + divisor + " = " +
                        (dividend / divisor));
            }
        }
    }
}
