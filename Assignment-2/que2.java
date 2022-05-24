class prime {
    void primeNum() {
        for(int i = 101; i< 200; i+=2) {
            int fprm = 1;
            for(int j = 3; j < i; j++) {
                if(i%j == 0) {
                    fprm = 0;
                    break;
                }
            }
            if(fprm == 1) {
                System.out.print(i);
                System.out.print(" ");
                fprm = 1;
            }
        }
    }
}
 
public class que2 {
    public static void main (String[] args) {
        prime calculate = new prime();
        calculate.primeNum();
    }  
}
