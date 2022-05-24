class mass {
    int m1;
    mass() {
        m1 = (int)(10 * Math.random());
    }
    void display(int i) {
        System.out.println("Mass of rock " + i + " : " + m1);
    }
}
 
public class que5 {
    public static void main(String args[]) {
        int sum = 0;
        mass[] rocks = new mass[10];
        for (int i = 0; i < 10; i++) {
            rocks[i] = new mass();
            rocks[i].display(i);
            sum += rocks[i].m1;
        }
        System.out.println("Total mass : " + sum);
    }
}
