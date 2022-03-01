class mul {
    double num1, num2, num3;
    // THIS IS A DEFAULT CONSTRUCTOR
    mul() {
        num1 = 11;
        num2 = 15;
        num3 = 21;
    }
    mul(double n1) {
        num1 = n1;
        num2 = 10;
        num3 = 20;
    }
    mul(double n1, int n2) {
        num1 = n1;
        num2 = n2;
        num3 = 20;
    }
    mul(double n1, double n2, int n3) {
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }

    double value() {
        return num1 * num2 * num3;
    }
}

class que5 {
    public static void main(String args[]) {
        double multiply;
        mul mul1 = new mul();
        mul mul2 = new mul(10.31);
        mul mul3 = new mul(1.4, 28);
        mul mul4 = new mul(8, 9.7, 10);
       
        multiply = mul1.value();
        System.out.println("Multiply 1st value: " + multiply);
        multiply = mul2.value();
        System.out.println("Multiply 2nd value: " + multiply);
        multiply = mul3.value();
        System.out.println("Multiply 3rd value: " + multiply);
        multiply = mul4.value();
        System.out.println("Multiply 4th value: " + multiply);
    }
}
