class Test {
    void str1() {
        System.out.println("\nThis is str1 function\n");
    }
    void str2() {
        System.out.println("\nThis is str2 function\n");
    }
    void display() {
        this.str2();
        System.out.println("\nThis is display function\n");
        this.str1();
    }
}  
   
public class que7 {
    public static void main(String args[]) {
        Test keyword = new Test();
        keyword.display();
    }
}
