abstract class Airplane {}
 
class B747 extends Airplane {
    int capacity = 100;
    String sl_no = "s1746wq";
}
 
class B757 extends Airplane {
    int capacity = 110;
    String sl_no = "dq2389m";
}
 
class B767 extends Airplane {
    int capacity = 200;
    String sl_no = "gr319m4";
}
 
public class que10 {
    public static void main(String args[]) {
        B747 apln1 = new B747();
        B757 apln2 = new B757();
        B767 apln3 = new B767();
        System.out.println(apln1.toString() + "\tSerial No: " + apln1.sl_no + "\tCapacity: " + apln1.capacity);
        System.out.println(apln2.toString() + "\tSerial No: " + apln2.sl_no + "\tCapacity: " + apln2.capacity);
        System.out.println(apln3.toString() + "\tSerial No: " + apln3.sl_no + "\tCapacity: " + apln3.capacity);
    }
}
