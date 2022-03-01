class Roots {
    int a = 3, b = 2, c = 5;
    double root1, root2;
   
    int Discriminant() {
        return (int)(b * b - 4 * a * c);
    }
    void roots() {
        if(Discriminant() == 0.0) {
            root1 = (double)(-b) / (2 * a);
            System.out.println("Root1 = Root2 = " + root1);
        }
        else if(Discriminant() > 0.0) {
            root1 = (double)((-b) + Math.pow(Discriminant(), 0.5)) / (2 * a);
            root2 = (double)((-b) - Math.pow(Discriminant(), 0.5)) / (2 * a);
            System.out.println("Roots are " + root1 + " and " + root2);
        }
        else {
            double img = (Math.pow(Math.abs(Discriminant()), 0.5)) / (2 * a);
            root1 = (double)(-b) / (2 * a);
            System.out.println("Root1 = " + root1 + " + " + img + "*i");
            System.out.println("Root2 = " + root1 + " - " + img + "*i");
        }
    }
}

public class que6 {
    public static void main(String[] Strings) {
        Roots val = new Roots();
        val.roots();
    }
}
