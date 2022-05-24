abstract class Fruit {}
 
class Apple extends Fruit {
    String colour = "Reddish";
}
 
class Banana extends Fruit {
    String colour = "Light Yellow";
}
 
class Orange extends Fruit {
    String colour = "Orange";
}
 
class Strawberry extends Fruit {
    String colour = "Dark Red";
}
 
public class que9 {
    public static void main(String args[]) {
        Apple a = new Apple();
        Banana b = new Banana();
        Orange o = new Orange();
        Strawberry s = new Strawberry();
        System.out.println("Name of fruit with string: " + a.toString() + "\tColor: " + a.colour);
        System.out.println("Name of fruit with string: " + b.toString() + "\tColor: " + b.colour);
        System.out.println("Name of fruit with string: " + o.toString() + "\tColor: " + o.colour);
        System.out.println("Name of fruit with string: " + s.toString() + "\tColor: " + s.colour);
    }
}
