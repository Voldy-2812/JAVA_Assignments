class G {
    static int x = 100;
}
 
class H extends G {
    int x = 1000;
 
    void display() {
        System.out.println("x in class G: " + super.x);
        System.out.println("x in class H: " + x);
    }
}
 
public class que7 {
    public static void main(String args[]) {
        H var = new H();
        var.display();
    }
}
