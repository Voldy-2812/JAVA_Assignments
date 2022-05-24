interface P {
    String const1 = "Constant in P";
    void methodP();
}

interface P1 extends P {
    String const2 = "Constant in P1";
    void methodP1();
}

interface P2 extends P {
    String const3 = "Constant in P2";
    void methodP2();
}

interface P12 extends P1, P2 {
    String const4 = "Constant in P12";
    void methodP12();
}

class Q implements P12{
    public void methodP() {
        System.out.println(const1);
    }

    public void methodP1() {
        System.out.println(const2);
    }

    public void methodP2() {
        System.out.println(const3);
    }

    public void methodP12() {
        System.out.println(const4);
    }
}

public class que4 {
    public static void main (String[] args) {
        Q q_invoked = new Q();
        q_invoked.methodP();
        q_invoked.methodP1();
        q_invoked.methodP2();
        q_invoked.methodP12();
    }
}
