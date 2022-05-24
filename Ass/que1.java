class fibo {
    int fib[] = new int[15];
    void fibonacci() {
        fib[0] =  1;
        fib[1] = 1;
        for(int i = 2; i < 15; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        for(int i = 0; i < 15; i++) {
            System.out.print(fib[i]);
            System.out.print(" ");
        }
    }
}
 
public class que1 {
    public static void main(String[] args) {
        fibo compute = new fibo();
        compute.fibonacci();
    }
}
