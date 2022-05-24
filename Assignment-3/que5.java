interface K1 {
    void methodK();
    int intK = 1;
}

interface K2 extends K1 {
    void methodK();
}

interface K3 extends K2 {
    void methodK();
}

class U implements K3 {
    public void methodK() {
        System.out.println("Value of intK : " + intK);
    }
}

public class que5 {
    public static void main (String[] args) {
        U object = new U();
        object.methodK();
    }
}
