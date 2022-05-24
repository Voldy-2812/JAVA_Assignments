import java.util.Scanner;
 
class circle {
    double radius,x,y;
    circle(double radius) {
        this.radius = radius;
        x = 0;
        y = 0;
    }
 
    circle(double x,double y,double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
 
    void display() {
        System.out.println("The centre is ("+ x +", " + y +")");
        System.out.println("The radius is " + radius);
    }
}
 
public class que4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of Circle: ");
        double r = sc.nextDouble();
        circle c1=new circle(r);
        circle c2=new circle(5, 5, r);
        c1.display();
        c2.display();
    }
}
