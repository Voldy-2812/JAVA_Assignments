class Object {}
 
class M extends Object {
    float f;
    String str;
}
 
class N extends M {
    double d;
 
    N(double d, float f, String str) {
        this.f = f;
        this.str = str;
        this.d = d;
    }
 
    void display() {
        System.out.println("M variables " + "Float: " + f + " "+ "String: " + str);
        System.out.println("N variable Double: " + d);
    }
}
 
public class que6 {
    public static void main(String args[]) {
        N var = new N(10.001, 100, "organic");
        var.display();
    }
}
