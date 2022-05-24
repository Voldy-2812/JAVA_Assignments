import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UnknownObjectException extends Exception {

    public String toString() {
        return "Unknown Object";
    }
}

class Students {
    String name;
    String branch;
    String class_c;
    String roll_number;

    Students (String name, String branch, String class_c, String roll_number) {
        this.name = name;
        this.branch = branch;
        this.class_c = class_c;
        this.roll_number = roll_number;
    }

    void displayInformation () {
        System.out.println("Name of the Student: " + name);
        System.out.println("Branch of the Student: " + branch);
        System.out.println("Class of the Student: " + class_c);
        System.out.println("Roll No. of the Student: " + roll_number);
    }

    boolean checkStudent (String nameStudent) {
        if (nameStudent.equals(name))
            return true;
        else
            return false;
    }
}

public class que7 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Students[] students = new Students[20];
        String name, branch, class_c, roll_number;
        System.out.println("Enter the details of 20 students:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Enter the name of Student " + (i+1)+ ": ");
            System.out.print("Name: ");
            name = br.readLine();
            System.out.print("Branch: ");
            branch = br.readLine();
            System.out.print("Class: ");
            class_c = br.readLine();
            System.out.print("Roll Number: ");
            roll_number = br.readLine();

            students[i] = new Students(name, branch, class_c, roll_number);
        }

        System.out.println("\nEnter the Name of the Student and index of the record");
        System.out.print("Name of the Student: ");
        name = br.readLine();
        System.out.print("Index of the Student: ");
        int index = Integer.parseInt(br.readLine());

        try {
            if (students[index].checkStudent(name)){
                students[index].displayInformation();
            }
            else {
                throw new UnknownObjectException();
            }
        } catch (UnknownObjectException e){
            System.out.println(e + "\nStudent Not Found in index " + index);
        } catch (ArrayIndexOutOfBoundsException ignored){
            System.out.println("Array Index Out of Bound");
        }
    }
}
