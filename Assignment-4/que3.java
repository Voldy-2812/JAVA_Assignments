import java.util.Scanner;

public class que3 {
    public static void main (String[] args) {
        Scanner ob = new Scanner (System.in);
        System.out.print("Enter the dividend: ");
        float dividend = ob.nextFloat();

        System.out.print("Enter the divisor: ");
        float divisor = ob.nextFloat();
        float sol = 0;
        try {
            if (divisor == 0) {
                throw new Exception();
            }
            else{
                sol = dividend / divisor;
                System.out.println("Solution: " + sol);
            }
        } catch (Exception ignored) {
            System.out.println("\n```` INVALID DIVISOR ````\n");
        }
    }
}
