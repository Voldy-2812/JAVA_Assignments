interface L1 {}
interface L2 {}
interface L3 extends L1, L2 {}
interface L4 {}
class X implements L3 {}
class W extends X implements L4 {}

public class que6 {
    public static void main (String[] args) {
       
        L4 objW = new W();
        System.out.println("Object objW instance of L4 of type W is [" + (objW instanceof W) + "]");

        L1 obj1 = new X();
        System.out.println ("Object obj1 instance of L1 of type X is [" + (obj1 instanceof X) + "]");

        L2 obj2 = new X();
        System.out.println ("Object obj2 instance of L2 of type X is [" + (obj2 instanceof X)+ "]");

        L3 obj3 = new X();
        System.out.println("Object obj3 instance of L3 of type X is [" + (obj3 instanceof X) + "]");
    }
}
