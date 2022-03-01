import java.util.Scanner;

class compute {
    double radius;
   
    void Area() {
        System.out.println("Area of Circle of Radius " + radius + ": " + 3.14 * radius * radius);
    }
    void Peri() {
        System.out.println("Perimeter of Circle of Radius " + radius + ": " + 2 * 3.14 * radius);
    }
}

public class que3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the radius of Circle: ");
        compute val = new compute();
        double r = sc.nextDouble();
        val.radius = r;
        val.Area();
        val.Peri();
        }
    }
}
