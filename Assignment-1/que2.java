import java.util.Scanner;
class Property {
        String carType, color, mnfctrDate;
        int cost;
        String gearType;
        int mileage;
        Property (String carType, String color, String mnfctrDate, int cost, String gearType, int mileage){
        this.carType = carType;
        this.color = color;
        this.mnfctrDate = mnfctrDate;
        this.cost = cost;
        this.gearType = gearType;
        this.mileage = mileage;
    }
    void displayProperty() {
        System.out.println("\nCar Name: " + carType + "\n" + "Color: " + color + "\n" + "Manufacturing Date: " +  mnfctrDate + "\n" + "Cost: " + cost + " $\n" + "Gear Type Model: " + gearType + "\n" + "Mileage: " + mileage + "kmph");
    }
}
public class que2 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the name of car: ");
            String carType = sc.next();
            System.out.println("Enter the color of car: ");
            String color = sc.next();
            System.out.println("Enter the manufacturing date of car: ");
            String mnfctrDate = sc.next();
            System.out.println("Enter the price of car: ");
            int cost = sc.nextInt();
            System.out.println("Enter the Gear Type of car: ");
            String gearType = sc.next();
            System.out.println("Enter the mileage of car: ");
            int mileage = sc.nextInt();
            Property  p1 = new Property (carType, color, mnfctrDate, cost, gearType, mileage);
            p1.displayProperty();
        }
    }
}
