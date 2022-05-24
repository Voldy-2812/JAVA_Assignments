import java.util.Scanner;

interface Shape2D {
    float getArea();
}

interface Shape3D {
    float getVolume();
}

class Point3D {
    class pointCircle {}
    float x1, x2;
    float y1, y2;
    float z1, z2;
}

abstract class Shape {
    abstract void display();

    public static void main (String[] args) {
        Scanner ob = new Scanner (System.in);

        Point3D circlePoints = new Point3D();
        System.out.println("Enter the Coordinates of the Circle: ");
        System.out.print("Enter the First Point of the Circle: ");
        circlePoints.x1 = ob.nextFloat();
        circlePoints.y1 = ob.nextFloat();;

        System.out.print("Enter the Second Point of the Circle: ");
        circlePoints.x2 = ob.nextFloat();
        circlePoints.y2 = ob.nextFloat();

        float radiusCircle = (float) Math.sqrt(Math.pow(circlePoints.x2 - circlePoints.x1, 2) +
                Math.pow(circlePoints.y2 - circlePoints.y1, 2));
        Circle circle = new Circle(radiusCircle);

        circle.display();

        System.out.println("\n");

        Point3D spherePoints = new Point3D();
        System.out.println("Enter the Coordinates of the Sphere: ");
        System.out.print("Enter the First Point of the Sphere: ");
        spherePoints.x1 = ob.nextFloat();
        spherePoints.y1 = ob.nextFloat();
        spherePoints.z1 = ob.nextFloat();

        System.out.print("Enter the Second Point of the Sphere: ");
        spherePoints.x2 = ob.nextFloat();
        spherePoints.y2 = ob.nextFloat();
        spherePoints.z2 = ob.nextFloat();

        float radiusSphere = (float) Math.sqrt(Math.pow(spherePoints.x2 - spherePoints.x1, 2) +
                Math.pow(spherePoints.y2 - spherePoints.y1, 2) +
                Math.pow(spherePoints.z2 - spherePoints.z1, 2));
        Sphere sphere = new Sphere(radiusSphere);
        sphere.display();
    }
}

class Circle extends Shape implements Shape2D{
    float radius;
    Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * Math.pow (radius, 2));
    }

    @Override
    void display() {
        System.out.println("\nArea of the Circle: " + getArea() + " sq. units");
    }
}

class Sphere extends Shape implements Shape3D{
    float radius;
    Sphere(float radius) {
        this.radius = radius;
    }

    @Override
    public float getVolume() {
        return (float) (Math.PI * Math.pow(radius, 3));
    }

    @Override
    void display() {
        System.out.println("\nVolume of the Sphere: " + getVolume() + " cubic units");
    }
}
