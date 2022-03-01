import java.util.Scanner;

class Add {
    double dist1, dist2;
    void sum () {
        System.out.println("Sum of both Distance : " + (dist1 + dist2));
    }
}

public class que4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Add nums = new Add();
            System.out.println("Enter distance 1: ");
            double dist1 = sc.nextDouble();
            System.out.println("Enter distance 2: ");
            double dist2 = sc.nextDouble();
            nums.dist1 = dist1;
            nums.dist2 = dist2;
            nums.sum();
        }
    }
}
