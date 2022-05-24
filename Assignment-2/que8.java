import java.util.Scanner;

class S1 {
    int s1;
    S1() {
        System.out.println("\nFor variable s1 Constructor S1 has started execution");
    }
}
class T1 extends S1 {
    int t1;
    T1() {
        System.out.println("For variable t1 Constructor T1 has started execution");
    }
}
class U1 extends T1 {
    int u1;
    U1(int s1, int t1, int u1) {
        System.out.println("For variable u1 Constructor U1 has started execution");
        this.s1 = s1;
        this.t1 = t1;
        this.u1 = u1;
    }
}
 
public class que8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter variable s1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter variable t1: ");
        int t1 = sc.nextInt();
        System.out.print("Enter variable u1: ");
        int u1 = sc.nextInt();
        U1 u = new U1(s1, t1, u1);
    }
}
